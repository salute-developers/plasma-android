package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ChipDisabled
import com.sdds.compose.uikit.fixtures.testcases.ChipGroupSizeLDense
import com.sdds.compose.uikit.fixtures.testcases.ChipGroupSizeMSecondaryWideWrapped
import com.sdds.compose.uikit.fixtures.testcases.ChipGroupSizeSAccentDense
import com.sdds.compose.uikit.fixtures.testcases.ChipGroupSizeXsDefault
import com.sdds.compose.uikit.fixtures.testcases.ChipSizeLDefault
import com.sdds.compose.uikit.fixtures.testcases.ChipSizeMSecondaryPilled
import com.sdds.compose.uikit.fixtures.testcases.ChipSizeSAccent
import com.sdds.compose.uikit.fixtures.testcases.ChipSizeXSContentLeft
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.chip.Accent
import com.sdds.plasma.sd.service.styles.chip.Chip
import com.sdds.plasma.sd.service.styles.chip.Default
import com.sdds.plasma.sd.service.styles.chip.L
import com.sdds.plasma.sd.service.styles.chip.M
import com.sdds.plasma.sd.service.styles.chip.Pilled
import com.sdds.plasma.sd.service.styles.chip.S
import com.sdds.plasma.sd.service.styles.chip.Secondary
import com.sdds.plasma.sd.service.styles.chip.Xs
import com.sdds.plasma.sd.service.styles.chipgroup.Accent
import com.sdds.plasma.sd.service.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.sd.service.styles.chipgroup.ChipGroupWide
import com.sdds.plasma.sd.service.styles.chipgroup.Default
import com.sdds.plasma.sd.service.styles.chipgroup.L
import com.sdds.plasma.sd.service.styles.chipgroup.M
import com.sdds.plasma.sd.service.styles.chipgroup.S
import com.sdds.plasma.sd.service.styles.chipgroup.Secondary
import com.sdds.plasma.sd.service.styles.chipgroup.Xs
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
    fun testChipSizeLDefault() {
        composeTestRule.content {
            ChipSizeLDefault(style = Chip.L.Default.style())
        }
    }

    @Test
    fun testChipSizeMSecondaryPilled() {
        composeTestRule.content {
            ChipSizeMSecondaryPilled(style = Chip.M.Pilled.Secondary.style())
        }
    }

    @Test
    fun testChipSizeSAccent() {
        composeTestRule.content {
            ChipSizeSAccent(style = Chip.S.Accent.style())
        }
    }

    @Test
    fun testChipSizeXSContentLeft() {
        composeTestRule.content {
            ChipSizeXSContentLeft(style = Chip.Xs.Default.style())
        }
    }

    @Test
    fun testChipDisabled() {
        composeTestRule.content {
            ChipDisabled(style = Chip.L.Default.style())
        }
    }

    @Test
    fun testChipGroupSizeLDense() {
        composeTestRule.content {
            ChipGroupSizeLDense(style = ChipGroupDense.L.Default.style())
        }
    }

    @Test
    fun testChipGroupSizeMSecondaryWideWrapped() {
        composeTestRule.content {
            ChipGroupSizeMSecondaryWideWrapped(style = ChipGroupWide.M.Secondary.style())
        }
    }

    @Test
    fun testChipGroupSizeSAccentDense() {
        composeTestRule.content {
            ChipGroupSizeSAccentDense(style = ChipGroupDense.S.Accent.style())
        }
    }

    @Test
    fun testChipGroupSizeXsDefault() {
        composeTestRule.content {
            ChipGroupSizeXsDefault(style = ChipGroupDense.Xs.Default.style())
        }
    }
}
