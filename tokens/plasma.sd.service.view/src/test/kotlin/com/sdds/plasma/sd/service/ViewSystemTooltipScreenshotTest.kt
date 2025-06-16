package com.sdds.plasma.sd.service

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.tooltip.TooltipTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemTooltipScreenshotTest(
    theme: String,
) : TooltipTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMStrictBottomEndStartTop() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMStrictBottomEndStartTop(R.style.Plasma_SdService_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMStrictTopCenterStartCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMStrictTopCenterStartCenter(R.style.Plasma_SdService_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipSLooseEndStartBottom() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipSLooseEndStartBottom(R.style.Plasma_SdService_ComponentOverlays_TooltipS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipSStrictBottomStartCenterTop() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipSStrictBottomStartCenterTop(R.style.Plasma_SdService_ComponentOverlays_TooltipS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseStartCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseStartCenter(R.style.Plasma_SdService_ComponentOverlays_TooltipS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseStartCenterBottom() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseStartCenterBottom(R.style.Plasma_SdService_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseTopEndEndTop() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseTopEndEndTop(R.style.Plasma_SdService_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseStartEndCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseStartEndCenter(R.style.Plasma_SdService_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseStartCenterEndBottom() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseStartCenterEndBottom(R.style.Plasma_SdService_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }
}
