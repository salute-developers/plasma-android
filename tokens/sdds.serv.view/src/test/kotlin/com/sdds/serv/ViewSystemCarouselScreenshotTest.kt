package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.carousel.CarouselTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemCarouselScreenshotTest(
    theme: String,
) : CarouselTestCases(theme) {

    @Test
    override fun testCarouselStartInnerControlsIndicatorWithGap() {
        themedComponent {
            fillSize {
                carouselStartControlsIndicatorWithGap(R.style.Serv_Sdds_ComponentOverlays_CarouselButtonsPlacementInner)
            }
        }
    }

    @Test
    override fun testCarouselOuterCenterControls() {
        themedComponent(
            action = {
                onView(withId(com.sdds.uikit.R.id.sd_carouselNextButtonId)).perform(click())
            },
        ) {
            fillSize {
                carouselCenterControls(R.style.Serv_Sdds_ComponentOverlays_CarouselButtonsPlacementOuter)
            }
        }
    }

    @Test
    override fun testCarouselInnerEndControlsIndicatorWithGap() {
        themedComponent(
            action = {
                onView(withId(com.sdds.uikit.R.id.sd_carouselNextButtonId)).perform(click())
            },
        ) {
            fillSize {
                carouselEndControlsIndicatorWithGap(R.style.Serv_Sdds_ComponentOverlays_CarouselButtonsPlacementInner)
            }
        }
    }

    @Test
    override fun testCarouselInnerCenterWithGap() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(swipeLeft())
            },
        ) {
            fillSize {
                carouselCenter(R.style.Serv_Sdds_ComponentOverlays_CarouselButtonsPlacementInner)
            }
        }
    }
}
