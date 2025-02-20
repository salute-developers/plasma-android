package com.sdds.plasma.sd.service

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
            buttonSizeLDefault(R.style.Plasma_SdService_ComponentOverlays_BasicButtonLDefault)
        }
    }

    @Test
    override fun testButtonSizeMAccent() {
        themedComponent {
            buttonSizeMAccent(R.style.Plasma_SdService_ComponentOverlays_BasicButtonMAccent)
        }
    }

    @Test
    override fun testButtonSizeSWarning() {
        themedComponent {
            buttonSizeSWarning(R.style.Plasma_SdService_ComponentOverlays_BasicButtonSWarning)
        }
    }

    @Test
    override fun testButtonSizeXSDark() {
        themedComponent {
            buttonSizeXSDark(R.style.Plasma_SdService_ComponentOverlays_BasicButtonXsDark)
        }
    }

    @Test
    override fun testButtonSizeLIsLoading() {
        themedComponent {
            buttonSizeLIsLoading(R.style.Plasma_SdService_ComponentOverlays_BasicButtonLDefault)
        }
    }

    @Test
    override fun testButtonSizeLDisabled() {
        themedComponent {
            buttonSizeLDisabled(R.style.Plasma_SdService_ComponentOverlays_BasicButtonLDefault)
        }
    }

    @Test
    override fun testButtonSizeLSecondary() {
        themedComponent {
            buttonSizeLSecondary(R.style.Plasma_SdService_ComponentOverlays_BasicButtonLSecondary)
        }
    }

    @Test
    override fun testButtonSizeMSpaceBetween() {
        themedComponent {
            buttonSizeMSpaceBetween(R.style.Plasma_SdService_ComponentOverlays_BasicButtonMClear)
        }
    }

    @Test
    override fun testButtonSizeSLongText() {
        themedComponent {
            buttonSizeSLongText(R.style.Plasma_SdService_ComponentOverlays_BasicButtonSPositive)
        }
    }

    @Test
    override fun testButtonXSNegative() {
        themedComponent {
            buttonXSNegative(R.style.Plasma_SdService_ComponentOverlays_BasicButtonXsNegative)
        }
    }

    @Test
    override fun testButtonLWhite() {
        themedComponent {
            buttonLWhite(R.style.Plasma_SdService_ComponentOverlays_BasicButtonLWhite)
        }
    }

    @Test
    override fun testIconButtonLDefault() {
        themedComponent {
            iconButtonLDefault(R.style.Plasma_SdService_ComponentOverlays_IconButtonLDefault)
        }
    }

    @Test
    override fun testIconButtonMAccent() {
        themedComponent {
            iconButtonMAccent(R.style.Plasma_SdService_ComponentOverlays_IconButtonMAccent)
        }
    }

    @Test
    override fun testIconButtonSWarning() {
        themedComponent {
            iconButtonSWarning(R.style.Plasma_SdService_ComponentOverlays_IconButtonSWarning)
        }
    }

    @Test
    override fun testIconButtonXSDark() {
        themedComponent {
            iconButtonXSDark(R.style.Plasma_SdService_ComponentOverlays_IconButtonXsDark)
        }
    }

    @Test
    override fun testIconButtonLIsLoading() {
        themedComponent {
            iconButtonLIsLoading(R.style.Plasma_SdService_ComponentOverlays_IconButtonLDefault)
        }
    }

    @Test
    override fun testIconButtonDisabled() {
        themedComponent {
            iconButtonDisabled(R.style.Plasma_SdService_ComponentOverlays_IconButtonMDefault)
        }
    }

    @Test
    override fun testIconButtonLPilledSecondary() {
        themedComponent {
            iconButtonLPilledSecondary(R.style.Plasma_SdService_ComponentOverlays_IconButtonLPilledSecondary)
        }
    }

    @Test
    override fun testIconButtonMClear() {
        themedComponent {
            iconButtonMClear(R.style.Plasma_SdService_ComponentOverlays_IconButtonMClear)
        }
    }

    @Test
    override fun testIconButtonSPositive() {
        themedComponent {
            iconButtonSPositive(R.style.Plasma_SdService_ComponentOverlays_IconButtonSPositive)
        }
    }

    @Test
    override fun testIconButtonXSNegative() {
        themedComponent {
            iconButtonXSNegative(R.style.Plasma_SdService_ComponentOverlays_IconButtonXsPilledNegative)
        }
    }

    @Test
    override fun testIconButtonLWhite() {
        themedComponent {
            iconButtonLWhite(R.style.Plasma_SdService_ComponentOverlays_IconButtonLWhite)
        }
    }

    @Test
    override fun testLinkButtonLAccent() {
        themedComponent {
            linkButtonLAccent(R.style.Plasma_SdService_ComponentOverlays_LinkButtonLAccent)
        }
    }
}
