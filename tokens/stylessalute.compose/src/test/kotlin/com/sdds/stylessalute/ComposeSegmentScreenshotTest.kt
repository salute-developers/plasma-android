package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.SegmentItem
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.segment.item.L
import com.sdds.stylessalute.styles.segment.item.M
import com.sdds.stylessalute.styles.segment.item.Pilled
import com.sdds.stylessalute.styles.segment.item.Primary
import com.sdds.stylessalute.styles.segment.item.S
import com.sdds.stylessalute.styles.segment.item.Secondary
import com.sdds.stylessalute.styles.segment.item.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.segment.SegmentItemSizeLPrimary
import com.sdds.testing.compose.segment.SegmentItemSizeMSecondaryPilled
import com.sdds.testing.compose.segment.SegmentItemSizeS
import com.sdds.testing.compose.segment.SegmentItemSizeXs
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
}
