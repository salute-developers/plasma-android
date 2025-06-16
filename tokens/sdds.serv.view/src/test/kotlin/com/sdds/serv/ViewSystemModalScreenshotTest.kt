package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.modal.ModalTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import org.robolectric.shadows.ShadowLooper

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemModalScreenshotTest(
    theme: String,
) : ModalTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalUseNativeBlackoutHasClose() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalUseNativeBlackoutHasClose(R.style.Serv_Sdds_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalNoCloseNoBlackout() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalNoValues(R.style.Serv_Sdds_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }
}
