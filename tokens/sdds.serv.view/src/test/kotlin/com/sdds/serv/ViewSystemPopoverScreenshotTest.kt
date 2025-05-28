package com.sdds.serv
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
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultStrictBottomEndStartTop(R.style.Serv_Sdds_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMAccentStrictTopCenterStartCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMAccentStrictTopCenterStartCenter(R.style.Serv_Sdds_ComponentOverlays_PopoverMAccent)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverSDefaultLooseEndStartBottom() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverSDefaultLooseEndStartBottom(R.style.Serv_Sdds_ComponentOverlays_PopoverSDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverSAccentStrictBottomStartCenterTop() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverSAccentStrictBottomStartCenterTop(R.style.Serv_Sdds_ComponentOverlays_PopoverSAccent)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseStartCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseStartCenter(R.style.Serv_Sdds_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseStartCenterBottom() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseStartCenterBottom(R.style.Serv_Sdds_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseTopEndEndTop() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseTopEndEndTop(R.style.Serv_Sdds_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseStartEndCenter() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseStartEndCenter(R.style.Serv_Sdds_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testPopoverMDefaultLooseStartCenterEndBottom() {
        themedComponent(
            action = { it.performClick() },
            skipDefaultCaptureRoboImage = true,
        ) {
            popoverMDefaultLooseStartCenterEndBottom(R.style.Serv_Sdds_ComponentOverlays_PopoverMDefault)
        }
        captureScreenRoboImage()
    }
}
