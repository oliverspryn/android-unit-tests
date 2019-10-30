package com.oliverspryn.medium.androidunittests.mvc

import android.content.Context
import android.view.View
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import com.winterbe.expekt.expect
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object BaseViewMvcTest : Spek({

    describe("The BaseViewMvc") {

        abstract class MockBaseViewMvc : BaseViewMvc() {
            abstract fun <T : View> testFindViewById(id: Int): T
            abstract fun testGetContext(): Context
        }

        var mockContext: Context? = null
        var mockView: View? = null

        var uut: MockBaseViewMvc? = null

        beforeEachTest {

            mockContext = mock()
            mockView = mock {
                on { context } doReturn mockContext
            }

            uut = object : MockBaseViewMvc()  {
                override val rootView: View
                    get() = mockView!!

                override fun <T : View> testFindViewById(id: Int) = findViewById<T>(id)
                override fun testGetContext() = context
            }
        }

        describe("when context") {

            var result: Context? = null

            beforeEachTest {
                result = uut?.testGetContext()
            }

            it("returns the context from the root view") {
                expect(result).to.equal(mockContext)
            }
        }

        describe("when findViewById") {

            var mockSubView: View? = null
            var result: View? = null

            beforeEachTest {
                mockSubView = mock()
                whenever(mockView?.findViewById<View>(42)).thenReturn(mockSubView)

                result = uut?.testFindViewById(42)
            }

            it("calls findViewById on the underlying root view") {
                verify(mockView)?.findViewById<View>(42)
            }

            it("locates the requested subview") {
                expect(result).to.equal(mockSubView)
            }
        }
    }
})
