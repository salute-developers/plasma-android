package com.sdkit.star.designsystem

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
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemDrawerScreenshotTest : DrawerTestCases("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDrawerNoBackgroundStartHeaderHasOverlay() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show Drawer")).perform(click())
            },
        ) {
            drawerCloseInnerMStartHeader(
                R.style.Sdkit_StarDs_ComponentOverlays_DrawerNoBackground,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDrawerHasBackgroundTopFooterHasOverlay() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show Drawer")).perform(click())
            },
        ) {
            drawerCloseOuterMTopFooterHasOverlay(
                R.style.Sdkit_StarDs_ComponentOverlays_DrawerHasBackground,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDrawerNoBackgroundEndHeaderFooter() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show Drawer")).perform(click())
            },
        ) {
            drawerCloseNoneEndHeaderFooter(
                R.style.Sdkit_StarDs_ComponentOverlays_DrawerNoBackground,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    fun testDrawerNoBackgroundBottomEnd() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show Drawer")).perform(click())
                onView(withId(com.sdds.testing.R.id.drawer_layout)).perform(swipeDown())
            },
        ) {
            drawerCloseInnerMBottomEnd(
                R.style.Sdkit_StarDs_ComponentOverlays_DrawerNoBackground,
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
                R.style.Sdkit_StarDs_ComponentOverlays_DrawerHasBackground,
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
                R.style.Sdkit_StarDs_ComponentOverlays_DrawerNoBackground,
            )
        }
        captureScreenRoboImage()
    }

    override fun testDrawerCloseInnerMStartHeader() {
        TODO("Not yet implemented")
    }

    override fun testDrawerCloseOuterMHasShadowTopFooterHasOverlay() {
        TODO("Not yet implemented")
    }

    override fun testDrawerCloseNoneEndHeaderFooter() {
        TODO("Not yet implemented")
    }

    override fun testDrawerCloseInnerMBottomEnd() {
        TODO("Not yet implemented")
    }
}
