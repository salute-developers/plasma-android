package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.segment.L
import com.sdds.plasma.giga.app.styles.segment.M
import com.sdds.plasma.giga.app.styles.segment.Pilled
import com.sdds.plasma.giga.app.styles.segment.Primary
import com.sdds.plasma.giga.app.styles.segment.S
import com.sdds.plasma.giga.app.styles.segment.Secondary
import com.sdds.plasma.giga.app.styles.segment.Segment
import com.sdds.plasma.giga.app.styles.segment.Xs
import com.sdds.plasma.giga.app.styles.segmentitem.L
import com.sdds.plasma.giga.app.styles.segmentitem.M
import com.sdds.plasma.giga.app.styles.segmentitem.Pilled
import com.sdds.plasma.giga.app.styles.segmentitem.Primary
import com.sdds.plasma.giga.app.styles.segmentitem.S
import com.sdds.plasma.giga.app.styles.segmentitem.Secondary
import com.sdds.plasma.giga.app.styles.segmentitem.SegmentItem
import com.sdds.plasma.giga.app.styles.segmentitem.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.segment.SegmentDisabled
import com.sdds.testing.compose.segment.SegmentItemDisabled
import com.sdds.testing.compose.segment.SegmentItemSizeLPrimary
import com.sdds.testing.compose.segment.SegmentItemSizeMSecondaryPilled
import com.sdds.testing.compose.segment.SegmentItemSizeS
import com.sdds.testing.compose.segment.SegmentItemSizeXs
import com.sdds.testing.compose.segment.SegmentSizeL
import com.sdds.testing.compose.segment.SegmentSizeLCounter
import com.sdds.testing.compose.segment.SegmentSizeMPilled
import com.sdds.testing.compose.segment.SegmentSizeOrientationVertical
import com.sdds.testing.compose.segment.SegmentSizeS
import com.sdds.testing.compose.segment.SegmentSizeSStretch
import com.sdds.testing.compose.segment.SegmentSizeXs
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeSegmentScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testSegmentItemSizeLPrimary() {
        composeTestRule.content {
            SegmentItemSizeLPrimary(style = SegmentItem.L.Primary.style())
        }
    }

    @Test
    fun testSegmentItemSizeMSecondary() {
        composeTestRule.content {
            SegmentItemSizeMSecondaryPilled(style = SegmentItem.M.Pilled.Secondary.style())
        }
    }

    @Test
    fun testSegmentItemSizeS() {
        composeTestRule.content {
            SegmentItemSizeS(style = SegmentItem.S.Primary.style())
        }
    }

    @Test
    fun testSegmentItemSizeXs() {
        composeTestRule.content {
            SegmentItemSizeXs(style = SegmentItem.Xs.Primary.style())
        }
    }

    @Test
    fun testSegmentItemDisabled() {
        composeTestRule.content {
            SegmentItemDisabled(style = SegmentItem.L.Primary.style())
        }
    }

    @Test
    fun testSegmentSizeL() {
        composeTestRule.content {
            SegmentSizeL(style = Segment.L.Primary.style())
        }
    }

    @Test
    fun testSegmentSizeM() {
        composeTestRule.content {
            SegmentSizeMPilled(style = Segment.M.Pilled.Secondary.style())
        }
    }

    @Test
    fun testSegmentSizeS() {
        composeTestRule.content {
            SegmentSizeS(style = Segment.S.Primary.style())
        }
    }

    @Test
    fun testSegmentSizeXs() {
        composeTestRule.content {
            SegmentSizeXs(style = Segment.Xs.Primary.style())
        }
    }

    @Test
    fun testSegmentOrientationVertical() {
        composeTestRule.content {
            SegmentSizeOrientationVertical(style = Segment.L.Primary.style())
        }
    }

    @Test
    fun testSegmentDisabled() {
        composeTestRule.content {
            SegmentDisabled(style = Segment.L.Primary.style())
        }
    }

    @Test
    fun testSegmentSizeSStretch() {
        composeTestRule.content {
            SegmentSizeSStretch(style = Segment.S.Primary.style())
        }
    }

    @Test
    fun testSegmentSizeLCounter() {
        composeTestRule.content {
            SegmentSizeLCounter(style = Segment.L.Primary.style())
        }
    }
}
