package com.oliverspryn.medium.myapplication.mvc

import android.view.View
import com.nhaarman.mockito_kotlin.mock
import com.winterbe.expekt.expect
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object BaseObservableViewMvcTest : Spek({

    describe("The BaseObservableViewMvc") {

        class MockListener

        var mockView: View? = null
        var uut: BaseObservableViewMvc<MockListener>? = null

        beforeEachTest {
            mockView = mock()

            uut = object : BaseObservableViewMvc<MockListener>() {
                override val rootView: View
                    get() = mockView!!
            }
        }

        describe("when getListeners") {

            var result: List<MockListener>? = null

            beforeEachTest {
                uut?.registerListener(MockListener())
                uut?.registerListener(MockListener())
                uut?.registerListener(MockListener())

                result = uut?.getListeners()
            }

            it("returns a list of all registered listeners") {
                expect(result?.count()).to.equal(3)
            }
        }
    }
})
