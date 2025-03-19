package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.button.ButtonTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemButtonScreenshotTest(
    theme: String,
) : ButtonTestCases(theme) {

    @Test
    override fun testButtonSizeLDefault() {
        themedComponent {
            buttonSizeLDefault(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDefault)
        }
    }

    @Test
    override fun testButtonSizeMAccent() {
        themedComponent {
            buttonSizeMAccent(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMAccent)
        }
    }

    @Test
    override fun testButtonSizeSWarning() {
        themedComponent {
            buttonSizeSWarning(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSWarning)
        }
    }

    @Test
    override fun testButtonSizeXSDark() {
        themedComponent {
            buttonSizeXSDark(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXsDark)
        }
    }

    @Test
    override fun testButtonSizeLIsLoading() {
        themedComponent {
            buttonSizeLIsLoading(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDefault)
        }
    }

    @Test
    override fun testButtonSizeLDisabled() {
        themedComponent {
            buttonSizeLDisabled(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDefault)
        }
    }

    @Test
    override fun testButtonSizeLSecondary() {
        themedComponent {
            buttonSizeLSecondary(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLSecondary)
        }
    }

    @Test
    override fun testButtonSizeMSpaceBetween() {
        themedComponent {
            buttonSizeMSpaceBetween(R.style.Serv_Sdds_ComponentOverlays_BasicButtonMClear)
        }
    }

    @Test
    override fun testButtonSizeSLongText() {
        themedComponent {
            buttonSizeSLongText(R.style.Serv_Sdds_ComponentOverlays_BasicButtonSPositive)
        }
    }

    @Test
    override fun testButtonXSNegative() {
        themedComponent {
            buttonXSNegative(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXsNegative)
        }
    }

    @Test
    override fun testButtonLWhite() {
        themedComponent {
            buttonLWhite(R.style.Serv_Sdds_ComponentOverlays_BasicButtonLWhite)
        }
    }

    @Test
    fun testButtonSizeXlDefault() {
        themedComponent {
            buttonSizeLDefault(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXlDefault)
        }
    }

    @Test
    fun testButtonSizeXxsDefault() {
        themedComponent {
            buttonSizeXxsDefault(R.style.Serv_Sdds_ComponentOverlays_BasicButtonXxsDefault)
        }
    }

    @Test
    override fun testIconButtonLDefault() {
        themedComponent {
            iconButtonLDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonLDefault)
        }
    }

    @Test
    override fun testIconButtonMAccent() {
        themedComponent {
            iconButtonMAccent(R.style.Serv_Sdds_ComponentOverlays_IconButtonMAccent)
        }
    }

    @Test
    override fun testIconButtonSWarning() {
        themedComponent {
            iconButtonSWarning(R.style.Serv_Sdds_ComponentOverlays_IconButtonSWarning)
        }
    }

    @Test
    override fun testIconButtonXSDark() {
        themedComponent {
            iconButtonXSDark(R.style.Serv_Sdds_ComponentOverlays_IconButtonXsDark)
        }
    }

    @Test
    override fun testIconButtonLIsLoading() {
        themedComponent {
            iconButtonLIsLoading(R.style.Serv_Sdds_ComponentOverlays_IconButtonLDefault)
        }
    }

    @Test
    override fun testIconButtonDisabled() {
        themedComponent {
            iconButtonDisabled(R.style.Serv_Sdds_ComponentOverlays_IconButtonMDefault)
        }
    }

    @Test
    override fun testIconButtonLPilledSecondary() {
        themedComponent {
            iconButtonLPilledSecondary(R.style.Serv_Sdds_ComponentOverlays_IconButtonLPilledSecondary)
        }
    }

    @Test
    override fun testIconButtonMClear() {
        themedComponent {
            iconButtonMClear(R.style.Serv_Sdds_ComponentOverlays_IconButtonMClear)
        }
    }

    @Test
    override fun testIconButtonSPositive() {
        themedComponent {
            iconButtonSPositive(R.style.Serv_Sdds_ComponentOverlays_IconButtonSPositive)
        }
    }

    @Test
    override fun testIconButtonXSNegative() {
        themedComponent {
            iconButtonXSNegative(R.style.Serv_Sdds_ComponentOverlays_IconButtonXsPilledNegative)
        }
    }

    @Test
    override fun testIconButtonLWhite() {
        themedComponent {
            iconButtonLWhite(R.style.Serv_Sdds_ComponentOverlays_IconButtonLWhite)
        }
    }

    @Test
    fun testIconButtonXlDefault() {
        themedComponent {
            iconButtonLDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonXlDefault)
        }
    }

    @Test
    fun testIconButtonXxsDefault() {
        themedComponent {
            iconButtonLDefault(R.style.Serv_Sdds_ComponentOverlays_IconButtonXxsDefault)
        }
    }

    @Test
    override fun testLinkButtonLDefault() {
        themedComponent {
            linkButtonLDefault(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLDefault)
        }
    }

    @Test
    override fun testLinkButtonIsLoading() {
        themedComponent {
            linkButtonIsLoading(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLDefault)
        }
    }

    @Test
    override fun testLinkButtonLSecondary() {
        themedComponent {
            linkButtonLSecondary(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLSecondary)
        }
    }

    @Test
    override fun testLinkButtonMAccent() {
        themedComponent {
            linkButtonMAccent(R.style.Serv_Sdds_ComponentOverlays_LinkButtonMAccent)
        }
    }

    @Test
    override fun testLinkButtonDisabled() {
        themedComponent {
            linkButtonDisabled(R.style.Serv_Sdds_ComponentOverlays_LinkButtonLDefault)
        }
    }

    @Test
    override fun testLinkButtonSWarning() {
        themedComponent {
            linkButtonSWarning(R.style.Serv_Sdds_ComponentOverlays_LinkButtonSWarning)
        }
    }

    @Test
    override fun testLinkButtonXsNegative() {
        themedComponent {
            linkButtonXsNegative(R.style.Serv_Sdds_ComponentOverlays_LinkButtonXsNegative)
        }
    }

    @Test
    fun testLinkButtonXlDefault() {
        themedComponent {
            linkButtonLDefault(R.style.Serv_Sdds_ComponentOverlays_LinkButtonXlDefault)
        }
    }

    @Test
    fun testLinkButtonXxsDefault() {
        themedComponent {
            linkButtonLDefault(R.style.Serv_Sdds_ComponentOverlays_LinkButtonXxsDefault)
        }
    }
}
