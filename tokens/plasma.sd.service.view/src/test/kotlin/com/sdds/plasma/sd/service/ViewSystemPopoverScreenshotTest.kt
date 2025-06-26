package com.sdds.plasma.sd.service

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.popover.PopoverTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemPopoverScreenshotTest(
    theme: String,
) : PopoverTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultStrictBottomEndStartTop() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultStrictBottomEndStartTop(R.style.Plasma_SdService_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMAccentStrictTopCenterStartCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMAccentStrictTopCenterStartCenter(R.style.Plasma_SdService_ComponentOverlays_PopoverMAccent)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverSDefaultLooseEndStartBottom() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverSDefaultLooseEndStartBottom(R.style.Plasma_SdService_ComponentOverlays_PopoverSDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverSAccentStrictBottomStartCenterTop() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverSAccentStrictBottomStartCenterTop(R.style.Plasma_SdService_ComponentOverlays_PopoverSAccent)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseStartCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseStartCenter(R.style.Plasma_SdService_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseStartCenterBottom() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseStartCenterBottom(R.style.Plasma_SdService_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseTopEndEndTop() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseTopEndEndTop(R.style.Plasma_SdService_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseStartEndCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseStartEndCenter(R.style.Plasma_SdService_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseStartCenterEndBottom() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseStartCenterEndBottom(R.style.Plasma_SdService_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }
}
