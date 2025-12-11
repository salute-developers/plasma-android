package com.sdds.serv

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
    theme: String
) : CarouselTestCases(theme) {

    @Test
    override fun testCarouselStartInnerControlsIndicatorWithGap() {
        themedComponent {
            carouselTest(R.style.Serv_Sdds_ComponentOverlays_CarouselButtonsPlacementInner)
        }
    }
}