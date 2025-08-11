package com.sdds.plasma.sd.service

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.scrollbar.ScrollBarTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemScrollBarScreenshotTest(
    theme: String,
) : ScrollBarTestCases(theme) {

    @Test
    override fun testScrollBarMHasTrackHoverExpand() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(swipeUp())
            },
        ) {
            scrollBarTest(R.style.Plasma_SdService_ComponentOverlays_ScrollBarM)
        }
    }

    @Test
    override fun testScrollBarSNoTrackHoverExpand() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(swipeUp())
            },
        ) {
            scrollBarTestNoTrack(R.style.Plasma_SdService_ComponentOverlays_ScrollBarS)
        }
    }

    @Test
    override fun testScrollBarManyItems() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(swipeUp())
            },
        ) {
            scrollBarTestManyItems(R.style.Plasma_SdService_ComponentOverlays_ScrollBarM)
        }
    }
}
