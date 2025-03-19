package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.cell.Cell
import com.sdds.plasma.sd.service.styles.cell.L
import com.sdds.plasma.sd.service.styles.cell.M
import com.sdds.plasma.sd.service.styles.cell.S
import com.sdds.plasma.sd.service.styles.cell.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.cell.CellMAvatarIcon
import com.sdds.testing.compose.cell.CellSizeLAvatarHasDisclosure
import com.sdds.testing.compose.cell.CellSizeLHasDisclosureDisclosureText
import com.sdds.testing.compose.cell.CellSizeLSwitchCheckBox
import com.sdds.testing.compose.cell.CellSizeMCheckBoxHasDisclosure
import com.sdds.testing.compose.cell.CellSizeMTitleAvatar
import com.sdds.testing.compose.cell.CellSizeSIconHasDisclosureDisclosureText
import com.sdds.testing.compose.cell.CellSizeSSubtitleHasDisclosure
import com.sdds.testing.compose.cell.CellSizeXsLabelAvatar
import com.sdds.testing.compose.cell.CellSizeXsRadioBoxAvatar
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCellScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testCellLAvatarHasDisclosure() {
        composeTestRule.content {
            CellSizeLAvatarHasDisclosure(cellStyle = Cell.L.style())
        }
    }

    @Test
    fun testCellSizeMTitleAvatar() {
        composeTestRule.content {
            CellSizeMTitleAvatar(cellStyle = Cell.M.style())
        }
    }

    @Test
    fun testCellSizeSSubtitleHasDisclosure() {
        composeTestRule.content {
            CellSizeSSubtitleHasDisclosure(cellStyle = Cell.S.style())
        }
    }

    @Test
    fun testCellSizeXsLabelAvatar() {
        composeTestRule.content {
            CellSizeXsLabelAvatar(cellStyle = Cell.Xs.style())
        }
    }

    @Test
    fun testCellSizeLHasDisclosureDisclosureText() {
        composeTestRule.content {
            CellSizeLHasDisclosureDisclosureText(cellStyle = Cell.L.style())
        }
    }

    @Test
    fun testCellMAvatarIcon() {
        composeTestRule.content {
            CellMAvatarIcon(cellStyle = Cell.M.style())
        }
    }

    @Test
    fun testCellSizeSIconHasDisclosureDisclosureText() {
        composeTestRule.content {
            CellSizeSIconHasDisclosureDisclosureText(cellStyle = Cell.S.style())
        }
    }

    @Test
    fun testCellSizeXsRadioBoxAvatar() {
        composeTestRule.content {
            CellSizeXsRadioBoxAvatar(cellStyle = Cell.Xs.style())
        }
    }

    @Test
    fun testCellSizeLSwitchCheckBox() {
        composeTestRule.content {
            CellSizeLSwitchCheckBox(cellStyle = Cell.L.style())
        }
    }

    @Test
    fun testCellSizeMCheckBoxHasDisclosure() {
        composeTestRule.content {
            CellSizeMCheckBoxHasDisclosure(cellStyle = Cell.M.style())
        }
    }
}
