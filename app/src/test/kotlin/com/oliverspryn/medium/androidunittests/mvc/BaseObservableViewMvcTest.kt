package com.oliverspryn.medium.androidunittests.mvc

import android.view.View
import com.nhaarman.mockito_kotlin.mock
import com.winterbe.expekt.expect
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object BaseObservableViewMvcTest : Spek({

    describe("The BaseObservableViewMvc") {

        class MockListener

        var uut: BaseObservableViewMvc<MockListener>? = null

        beforeEachTest {
             uut = object : BaseObservableViewMvc<MockListener>() {
                override val rootView: View
                    get() = mock()
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

        describe("when registerListener") {

            beforeEachTest {
                uut?.registerListener(MockListener())
            }

            it("adds the new listener to the list of registered listeners") {
                val result = uut?.getListeners()
                expect(result?.count()).to.equal(1)
            }
        }

        describe("when unregisterListener") {

            beforeEachTest {
                val registeredListener = MockListener()

                uut?.registerListener(MockListener())
                uut?.registerListener(MockListener())
                uut?.registerListener(MockListener())
                uut?.registerListener(registeredListener)
                uut?.unregisterListener(registeredListener)
            }

            it("removes the given listener from the list of registered listeners") {
                val result = uut?.getListeners()
                expect(result?.count()).to.equal(3)
            }
        }
    }
})
