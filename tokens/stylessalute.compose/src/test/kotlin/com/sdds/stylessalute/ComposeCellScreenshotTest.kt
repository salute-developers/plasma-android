package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CellMAvatarIcon
import com.sdds.compose.uikit.fixtures.testcases.CellSizeLAvatarHasDisclosure
import com.sdds.compose.uikit.fixtures.testcases.CellSizeLHasDisclosureDisclosureText
import com.sdds.compose.uikit.fixtures.testcases.CellSizeLSwitchCheckBox
import com.sdds.compose.uikit.fixtures.testcases.CellSizeMCheckBoxHasDisclosure
import com.sdds.compose.uikit.fixtures.testcases.CellSizeMTitleAvatar
import com.sdds.compose.uikit.fixtures.testcases.CellSizeSIconHasDisclosureDisclosureText
import com.sdds.compose.uikit.fixtures.testcases.CellSizeSSubtitleHasDisclosure
import com.sdds.compose.uikit.fixtures.testcases.CellSizeXsLabelAvatar
import com.sdds.compose.uikit.fixtures.testcases.CellSizeXsRadioBoxAvatar
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.cell.Cell
import com.sdds.stylessalute.styles.cell.L
import com.sdds.stylessalute.styles.cell.M
import com.sdds.stylessalute.styles.cell.S
import com.sdds.stylessalute.styles.cell.Xs
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
