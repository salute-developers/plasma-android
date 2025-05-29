package com.sdds.serv

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
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            tooltipMStrictBottomEndStartTop(R.style.Serv_Sdds_ComponentOverlays_TooltipM)
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
            tooltipMStrictTopCenterStartCenter(R.style.Serv_Sdds_ComponentOverlays_TooltipM)
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
            tooltipSLooseEndStartBottom(R.style.Serv_Sdds_ComponentOverlays_TooltipS)
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
            tooltipSStrictBottomStartCenterTop(R.style.Serv_Sdds_ComponentOverlays_TooltipS)
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
            tooltipMLooseStartCenter(R.style.Serv_Sdds_ComponentOverlays_TooltipS)
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
            tooltipMLooseStartCenterBottom(R.style.Serv_Sdds_ComponentOverlays_TooltipM)
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
            tooltipMLooseTopEndEndTop(R.style.Serv_Sdds_ComponentOverlays_TooltipM)
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
            tooltipMLooseStartEndCenter(R.style.Serv_Sdds_ComponentOverlays_TooltipM)
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
            tooltipMLooseStartCenterEndBottom(R.style.Serv_Sdds_ComponentOverlays_TooltipM)
        }
        captureScreenRoboImage()
    }
}
