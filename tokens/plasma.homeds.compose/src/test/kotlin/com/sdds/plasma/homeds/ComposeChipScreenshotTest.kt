package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chip.Chip
import com.sdds.plasma.homeds.styles.chip.Default
import com.sdds.plasma.homeds.styles.chip.L
import com.sdds.plasma.homeds.styles.chip.M
import com.sdds.plasma.homeds.styles.chip.Pilled
import com.sdds.plasma.homeds.styles.chip.S
import com.sdds.plasma.homeds.styles.chip.Secondary
import com.sdds.plasma.homeds.styles.chip.Xs
import com.sdds.plasma.homeds.styles.chip.Xxs
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupWide
import com.sdds.plasma.homeds.styles.chipgroup.Default
import com.sdds.plasma.homeds.styles.chipgroup.L
import com.sdds.plasma.homeds.styles.chipgroup.M
import com.sdds.plasma.homeds.styles.chipgroup.S
import com.sdds.plasma.homeds.styles.chipgroup.Secondary
import com.sdds.plasma.homeds.styles.chipgroup.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.chip.ChipDisabled
import com.sdds.testing.compose.chip.ChipGroupSizeLDense
import com.sdds.testing.compose.chip.ChipGroupSizeMSecondaryWideWrapped
import com.sdds.testing.compose.chip.ChipGroupSizeSAccentDense
import com.sdds.testing.compose.chip.ChipGroupSizeXsDefault
import com.sdds.testing.compose.chip.ChipSizeLDefault
import com.sdds.testing.compose.chip.ChipSizeMSecondaryPilled
import com.sdds.testing.compose.chip.ChipSizeSAccent
import com.sdds.testing.compose.chip.ChipSizeXSContentLeft
import com.sdds.testing.vs.SDK_NUMBER
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
    fun testChipSizeXSContentLeft() {
        composeTestRule.content {
            ChipSizeXSContentLeft(style = Chip.Xs.Default.style())
        }
    }

    @Test
    fun testChipSizeXxsAccent() {
        composeTestRule.content {
            ChipSizeSAccent(style = Chip.Xxs.Default.style())
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
    fun testChipGroupSizeSDefaultDense() {
        composeTestRule.content {
            ChipGroupSizeSAccentDense(style = ChipGroupDense.S.Default.style())
        }
    }

    @Test
    fun testChipGroupSizeXsDefault() {
        composeTestRule.content {
            ChipGroupSizeXsDefault(style = ChipGroupDense.Xs.Default.style())
        }
    }
}
