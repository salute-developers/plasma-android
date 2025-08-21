package com.sdkit.star.designsystem

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.scrollbar.ScrollBarTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemScrollBarScreenshotTest : ScrollBarTestCases("+night") {

    @Test
    override fun testScrollBarMHasTrackHoverExpand() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(swipeUp())
            },
        ) {
            scrollBarTest(R.style.Sdkit_StarDs_ComponentOverlays_ScrollBarM)
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
            scrollBarTestNoTrack(R.style.Sdkit_StarDs_ComponentOverlays_ScrollBarS)
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
            scrollBarTestManyItems(R.style.Sdkit_StarDs_ComponentOverlays_ScrollBarM)
        }
    }
}
