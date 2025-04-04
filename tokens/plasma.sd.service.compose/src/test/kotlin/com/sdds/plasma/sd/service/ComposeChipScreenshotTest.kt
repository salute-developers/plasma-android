package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.plasma.sd.service.styles.chip.Accent
import com.sdds.plasma.sd.service.styles.chip.Chip
import com.sdds.plasma.sd.service.styles.chip.Default
import com.sdds.plasma.sd.service.styles.chip.L
import com.sdds.plasma.sd.service.styles.chip.M
import com.sdds.plasma.sd.service.styles.chip.Pilled
import com.sdds.plasma.sd.service.styles.chip.S
import com.sdds.plasma.sd.service.styles.chip.Secondary
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.chip.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.chip.ChipDisabled
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
}
