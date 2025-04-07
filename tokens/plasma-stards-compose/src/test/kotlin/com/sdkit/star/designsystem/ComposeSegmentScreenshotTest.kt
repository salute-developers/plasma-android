package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
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
import com.sdkit.star.designsystem.styles.segment.L
import com.sdkit.star.designsystem.styles.segment.M
import com.sdkit.star.designsystem.styles.segment.Pilled
import com.sdkit.star.designsystem.styles.segment.Primary
import com.sdkit.star.designsystem.styles.segment.S
import com.sdkit.star.designsystem.styles.segment.Secondary
import com.sdkit.star.designsystem.styles.segment.Segment
import com.sdkit.star.designsystem.styles.segment.Xs
import com.sdkit.star.designsystem.styles.segmentitem.L
import com.sdkit.star.designsystem.styles.segmentitem.M
import com.sdkit.star.designsystem.styles.segmentitem.Pilled
import com.sdkit.star.designsystem.styles.segmentitem.Primary
import com.sdkit.star.designsystem.styles.segmentitem.S
import com.sdkit.star.designsystem.styles.segmentitem.Secondary
import com.sdkit.star.designsystem.styles.segmentitem.SegmentItem
import com.sdkit.star.designsystem.styles.segmentitem.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeSegmentScreenshotTest : RoborazziConfigCompose("+night") {

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
