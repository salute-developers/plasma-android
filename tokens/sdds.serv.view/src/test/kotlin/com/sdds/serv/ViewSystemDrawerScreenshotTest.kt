package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeDown
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.drawer.DrawerTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemDrawerScreenshotTest(
    theme: String,
) : DrawerTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDrawerCloseInnerMStartHeader() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show Drawer")).perform(click())
            },
        ) {
            drawerCloseInnerMStartHeader(
                R.style.Serv_Sdds_ComponentOverlays_DrawerCloseInnerM,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDrawerCloseOuterMHasShadowTopFooterHasOverlay() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show Drawer")).perform(click())
            },
        ) {
            drawerCloseOuterMTopFooterHasOverlay(
                R.style.Serv_Sdds_ComponentOverlays_DrawerCloseOuterMHasShadow,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDrawerCloseNoneEndHeaderFooter() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show Drawer")).perform(click())
            },
        ) {
            drawerCloseNoneEndHeaderFooter(
                R.style.Serv_Sdds_ComponentOverlays_DrawerCloseNoneM,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDrawerCloseInnerMBottomEnd() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show Drawer")).perform(click())
                onView(withId(com.sdds.testing.R.id.drawer_layout)).perform(swipeDown())
            },
        ) {
            drawerCloseInnerMBottomEnd(
                R.style.Serv_Sdds_ComponentOverlays_DrawerCloseInnerM,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDrawerPeakOffSet() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            drawerPeakOffSet(
                R.style.Serv_Sdds_ComponentOverlays_DrawerCloseInnerMHasShadow,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDrawerCloseInnerMStartCloseIconAbsolute() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show Drawer")).perform(click())
            },
        ) {
            drawerCloseInnerMStartCloseIconAbsolute(
                R.style.Serv_Sdds_ComponentOverlays_DrawerCloseInnerM,
            )
        }
        captureScreenRoboImage()
    }
}
