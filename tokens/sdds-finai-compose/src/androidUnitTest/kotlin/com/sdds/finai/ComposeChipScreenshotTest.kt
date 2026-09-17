package com.sdds.finai

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
import com.sdds.finai.styles.chip.Accent
import com.sdds.finai.styles.chip.ChipSolid
import com.sdds.finai.styles.chip.ChipTransparent
import com.sdds.finai.styles.chip.Default
import com.sdds.finai.styles.chip.M
import com.sdds.finai.styles.chip.Pilled
import com.sdds.finai.styles.chip.S
import com.sdds.finai.styles.chip.Xs
import com.sdds.finai.styles.chipgroup.Accent
import com.sdds.finai.styles.chipgroup.Default
import com.sdds.finai.styles.chipgroup.EmbeddedChipGroup
import com.sdds.finai.styles.chipgroup.S
import com.sdds.finai.styles.chipgroup.Secondary
import com.sdds.finai.styles.chipgroup.Xs
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
    fun testChipSizeMDefault() {
        composeTestRule.content {
            ChipSizeLDefault(style = ChipSolid.M.Default.style())
        }
    }

    @Test
    fun testChipSizeMTransparentPilled() {
        composeTestRule.content {
            ChipSizeMSecondaryPilled(style = ChipTransparent.M.Pilled.Default.style())
        }
    }

    @Test
    fun testChipSizeSAccent() {
        composeTestRule.content {
            ChipSizeSAccent(style = ChipSolid.S.Accent.style())
        }
    }

    @Test
    fun testChipSizeXSContentLeft() {
        composeTestRule.content {
            ChipSizeXSContentLeft(style = ChipTransparent.Xs.Default.style())
        }
    }

    @Test
    fun testChipDisabled() {
        composeTestRule.content {
            ChipDisabled(style = ChipSolid.M.Default.style())
        }
    }

    @Test
    fun testChipGroupSizeLDense() {
        composeTestRule.content {
            ChipGroupSizeLDense(style = EmbeddedChipGroup.S.Default.style())
        }
    }

    @Test
    fun testChipGroupSizeMSecondaryWideWrapped() {
        composeTestRule.content {
            ChipGroupSizeMSecondaryWideWrapped(style = EmbeddedChipGroup.S.Secondary.style())
        }
    }

    @Test
    fun testChipGroupSizeSAccentDense() {
        composeTestRule.content {
            ChipGroupSizeSAccentDense(style = EmbeddedChipGroup.S.Accent.style())
        }
    }

    @Test
    fun testChipGroupSizeXsDefault() {
        composeTestRule.content {
            ChipGroupSizeXsDefault(style = EmbeddedChipGroup.Xs.Default.style())
        }
    }
}
