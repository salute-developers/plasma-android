package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
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
import com.sdkit.star.designsystem.styles.chip.Accent
import com.sdkit.star.designsystem.styles.chip.Chip
import com.sdkit.star.designsystem.styles.chip.Default
import com.sdkit.star.designsystem.styles.chip.L
import com.sdkit.star.designsystem.styles.chip.M
import com.sdkit.star.designsystem.styles.chip.Pilled
import com.sdkit.star.designsystem.styles.chip.S
import com.sdkit.star.designsystem.styles.chip.Secondary
import com.sdkit.star.designsystem.styles.chip.Xs
import com.sdkit.star.designsystem.styles.chipgroup.Accent
import com.sdkit.star.designsystem.styles.chipgroup.ChipGroupDense
import com.sdkit.star.designsystem.styles.chipgroup.ChipGroupWide
import com.sdkit.star.designsystem.styles.chipgroup.Default
import com.sdkit.star.designsystem.styles.chipgroup.L
import com.sdkit.star.designsystem.styles.chipgroup.M
import com.sdkit.star.designsystem.styles.chipgroup.S
import com.sdkit.star.designsystem.styles.chipgroup.Secondary
import com.sdkit.star.designsystem.styles.chipgroup.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeChipScreenshotTest : RoborazziConfigCompose("+night") {

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
