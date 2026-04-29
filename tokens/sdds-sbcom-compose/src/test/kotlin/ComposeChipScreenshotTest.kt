package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ChipDisabled
import com.sdds.compose.uikit.fixtures.testcases.ChipGroupSizeLDense
import com.sdds.compose.uikit.fixtures.testcases.ChipGroupSizeMSecondaryWideWrapped
import com.sdds.compose.uikit.fixtures.testcases.ChipSizeLDefault
import com.sdds.compose.uikit.fixtures.testcases.ChipSizeMSecondaryPilled
import com.sdds.compose.uikit.fixtures.testcases.ChipSizeSAccent
import com.sdds.compose.uikit.fixtures.testcases.ChipSizeXSContentLeft
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.chip.Chip
import com.sdds.sbcom.styles.chip.ChipSlotAvatar
import com.sdds.sbcom.styles.chip.ChipSlotPadding
import com.sdds.sbcom.styles.chipgroup.ChipGroup
import com.sdds.sbcom.styles.chipgroup.ChipSlotPadding
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeChipScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testChipSlotPaddingIconRight() {
        composeTestRule.content {
            ChipSizeLDefault(style = Chip.ChipSlotPadding.style())
        }
    }

    @Test
    fun testChipSlotAvatar() {
        composeTestRule.content {
            ChipSizeMSecondaryPilled(style = Chip.ChipSlotAvatar.style())
        }
    }

    @Test
    fun testChipSlotPadding() {
        composeTestRule.content {
            ChipSizeSAccent(style = Chip.ChipSlotPadding.style())
        }
    }

    @Test
    fun testChipSlotAvatarContentLeft() {
        composeTestRule.content {
            ChipSizeXSContentLeft(style = Chip.ChipSlotAvatar.style())
        }
    }

    @Test
    fun testChipDisabled() {
        composeTestRule.content {
            ChipDisabled(style = Chip.ChipSlotPadding.style())
        }
    }

    @Test
    fun testChipGroupSlotPadding() {
        composeTestRule.content {
            ChipGroupSizeLDense(style = ChipGroup.ChipSlotPadding.style())
        }
    }

    @Test
    fun testChipGroupWrap() {
        composeTestRule.content {
            ChipGroupSizeMSecondaryWideWrapped(style = ChipGroup.ChipSlotPadding.style())
        }
    }
}
