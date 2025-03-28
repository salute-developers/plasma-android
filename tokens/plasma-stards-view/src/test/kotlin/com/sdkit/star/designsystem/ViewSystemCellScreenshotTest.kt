package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.cell.CellTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemCellScreenshotTest : CellTestCases("+night") {

    @Test
    override fun testCellSizeLAvatarHasDisclosure() {
        themedComponent {
            cellSizeLAvatarHasDisclosure(R.style.Sdkit_StarDs_ComponentOverlays_CellL)
        }
    }

    @Test
    override fun testCellSizeMTitleAvatar() {
        themedComponent {
            cellSizeMTitleAvatar(R.style.Sdkit_StarDs_ComponentOverlays_CellM)
        }
    }

    @Test
    override fun testCellSizeSSubtitleHasDisclosure() {
        themedComponent {
            cellSizeSSubtitleHasDisclosure(R.style.Sdkit_StarDs_ComponentOverlays_CellS)
        }
    }

    @Test
    override fun testCellSizeXSLabelAvatar() {
        themedComponent {
            cellSizeXSLabelAvatar(R.style.Sdkit_StarDs_ComponentOverlays_CellXS)
        }
    }

    @Test
    override fun testCellSizeLHasDisclosureDisclosureText() {
        themedComponent {
            cellSizeLHasDisclosureDisclosureText(R.style.Sdkit_StarDs_ComponentOverlays_CellL)
        }
    }

    @Test
    override fun testCellSizeMAvatarIcon() {
        themedComponent {
            cellSizeMAvatarIcon(R.style.Sdkit_StarDs_ComponentOverlays_CellM)
        }
    }

    @Test
    override fun testCellSizeSIconHasDisclosureDisclosureText() {
        themedComponent {
            cellSizeSIconHasDisclosureDisclosureText(R.style.Sdkit_StarDs_ComponentOverlays_CellS)
        }
    }

    @Test
    override fun testCellSizeXSRadioBoxAvatar() {
        themedComponent {
            cellSizeXSRadioBoxAvatar(R.style.Sdkit_StarDs_ComponentOverlays_CellXS)
        }
    }

    @Test
    override fun testCellSizeLSwitchCheckBox() {
        themedComponent {
            cellSizeLSwitchCheckBox(R.style.Sdkit_StarDs_ComponentOverlays_CellL)
        }
    }

    @Test
    override fun testCellSizeMCheckBoxHasDisclosure() {
        themedComponent {
            cellSizeMCheckBoxHasDisclosure(R.style.Sdkit_StarDs_ComponentOverlays_CellM)
        }
    }
}
