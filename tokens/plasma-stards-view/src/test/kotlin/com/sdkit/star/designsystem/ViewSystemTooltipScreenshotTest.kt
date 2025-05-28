package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.tooltip.TooltipTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemTooltipScreenshotTest : TooltipTestCases("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMStrictBottomEndStartTop() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMStrictBottomEndStartTop(R.style.Sdkit_StarDs_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMStrictTopCenterStartCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMStrictTopCenterStartCenter(R.style.Sdkit_StarDs_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipSLooseEndStartBottom() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipSLooseEndStartBottom(R.style.Sdkit_StarDs_ComponentOverlays_TooltipS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipSStrictBottomStartCenterTop() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipSStrictBottomStartCenterTop(R.style.Sdkit_StarDs_ComponentOverlays_TooltipS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseStartCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseStartCenter(R.style.Sdkit_StarDs_ComponentOverlays_TooltipS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseStartCenterBottom() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseStartCenterBottom(R.style.Sdkit_StarDs_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseTopEndEndTop() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseTopEndEndTop(R.style.Sdkit_StarDs_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseStartEndCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseStartEndCenter(R.style.Sdkit_StarDs_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTooltipMLooseStartCenterEndBottom() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMLooseStartCenterEndBottom(R.style.Sdkit_StarDs_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }
}
