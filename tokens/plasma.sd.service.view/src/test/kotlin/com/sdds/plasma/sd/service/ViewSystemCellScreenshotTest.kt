package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.cell.CellTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemCellScreenshotTest(
    theme: String,
) : CellTestCases(theme) {

    @Test
    override fun testCellSizeLAvatarHasDisclosure() {
        themedComponent {
            cellSizeLAvatarHasDisclosure(R.style.Plasma_SdService_ComponentOverlays_CellL)
        }
    }

    @Test
    override fun testCellSizeMTitleAvatar() {
        themedComponent {
            cellSizeMTitleAvatar(R.style.Plasma_SdService_ComponentOverlays_CellM)
        }
    }

    @Test
    override fun testCellSizeSSubtitleHasDisclosure() {
        themedComponent {
            cellSizeSSubtitleHasDisclosure(R.style.Plasma_SdService_ComponentOverlays_CellS)
        }
    }

    @Test
    override fun testCellSizeXSLabelAvatar() {
        themedComponent {
            cellSizeXSLabelAvatar(R.style.Plasma_SdService_ComponentOverlays_CellXS)
        }
    }

    @Test
    override fun testCellSizeLHasDisclosureDisclosureText() {
        themedComponent {
            cellSizeLHasDisclosureDisclosureText(R.style.Plasma_SdService_ComponentOverlays_CellL)
        }
    }

    @Test
    override fun testCellSizeMAvatarIcon() {
        themedComponent {
            cellSizeMAvatarIcon(R.style.Plasma_SdService_ComponentOverlays_CellM)
        }
    }

    @Test
    override fun testCellSizeSIconHasDisclosureDisclosureText() {
        themedComponent {
            cellSizeSIconHasDisclosureDisclosureText(R.style.Plasma_SdService_ComponentOverlays_CellS)
        }
    }

    @Test
    override fun testCellSizeXSRadioBoxAvatar() {
        themedComponent {
            cellSizeXSRadioBoxAvatar(R.style.Plasma_SdService_ComponentOverlays_CellXS)
        }
    }

    @Test
    override fun testCellSizeLSwitchCheckBox() {
        themedComponent {
            cellSizeLSwitchCheckBox(R.style.Plasma_SdService_ComponentOverlays_CellL)
        }
    }

    @Test
    override fun testCellSizeMCheckBoxHasDisclosure() {
        themedComponent {
            cellSizeMCheckBoxHasDisclosure(R.style.Plasma_SdService_ComponentOverlays_CellM)
        }
    }
}
