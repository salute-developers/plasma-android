package com.sdkit.star.designsystem

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.uikit.fixtures.SDK_NUMBER
import com.sdds.uikit.fixtures.testcases.ModalTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import org.robolectric.shadows.ShadowLooper

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemModalScreenshotTest : ModalTestCases("+night") {

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
            modalUseNativeBlackoutHasClose(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
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
            modalNoValues(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalTopStart() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalTopStart(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalTopCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalTopCenter(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalTopEnd() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalTopEnd(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalCenterStart() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalCenterStart(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalCenter(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalCenterEnd() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalCenterEnd(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalBottomStart() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalBottomStart(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalBottomCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalBottomCenter(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testModalBottomEnd() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            modalBottomEnd(R.style.Sdkit_StarDs_ComponentOverlays_Modal)
        }
        ShadowLooper.runUiThreadTasksIncludingDelayedTasks()
        captureScreenRoboImage()
    }
}
