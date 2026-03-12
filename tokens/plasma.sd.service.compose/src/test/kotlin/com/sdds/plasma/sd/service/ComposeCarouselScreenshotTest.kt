package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.carousel.ButtonsPlacementInner
import com.sdds.plasma.sd.service.styles.carousel.ButtonsPlacementOuter
import com.sdds.plasma.sd.service.styles.carousel.Carousel
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.carousel.CarouselAlignmentCenterOuterControls
import com.sdds.testing.compose.carousel.CarouselAlignmentEndInnerControlsIndicator
import com.sdds.testing.compose.carousel.CarouselAlignmentStartControlsInner
import com.sdds.testing.compose.carousel.CarouselCenterInnerGapNoIndicatorNoControls
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCarouselScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testCarouselAlignmentStartControlsInner() {
        composeTestRule.content {
            CarouselAlignmentStartControlsInner(
                style = Carousel.ButtonsPlacementInner.style(),
                color = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentInfo,
                shape = PlasmaSdServiceTheme.shapes.roundM,
                textStyle = PlasmaSdServiceTheme.typography.displayMBold,
            )
        }
    }

    @Test
    fun testCarouselAlignmentCenterOuterControls() {
        composeTestRule.content {
            CarouselAlignmentCenterOuterControls(
                style = Carousel.ButtonsPlacementOuter.style(),
                color = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentInfo,
                shape = PlasmaSdServiceTheme.shapes.roundM,
                textStyle = PlasmaSdServiceTheme.typography.displayMBold,
            )
        }
    }

    @Test
    fun testCarouselAlignmentEndInnerControlsIndicator() {
        composeTestRule.content {
            CarouselAlignmentEndInnerControlsIndicator(
                style = Carousel.ButtonsPlacementInner.style(),
                color = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentInfo,
                shape = PlasmaSdServiceTheme.shapes.roundM,
                textStyle = PlasmaSdServiceTheme.typography.displayMBold,
            )
        }
    }

    @Test
    fun testCarouselCenterInnerGapNoIndicatorNoControls() {
        composeTestRule.content {
            CarouselCenterInnerGapNoIndicatorNoControls(
                style = Carousel.ButtonsPlacementInner.style(),
                color = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentInfo,
                shape = PlasmaSdServiceTheme.shapes.roundM,
                textStyle = PlasmaSdServiceTheme.typography.displayMBold,
            )
        }
    }
}
