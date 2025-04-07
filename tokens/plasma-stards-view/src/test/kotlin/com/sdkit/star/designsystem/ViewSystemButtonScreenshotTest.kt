package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.button.ButtonTestCases
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemButtonScreenshotTest : ButtonTestCases("+night") {

    @Test
    override fun testButtonSizeLDefault() {
        themedComponent {
            buttonSizeLDefault(R.style.Sdkit_StarDs_ComponentOverlays_BasicButtonL)
        }
    }

    @Test
    fun testButtonSizeM() {
        themedComponent {
            buttonSizeMAccent(R.style.Sdkit_StarDs_ComponentOverlays_BasicButtonM)
        }
    }

    @Test
    fun testButtonSizeS() {
        themedComponent {
            buttonSizeSWarning(R.style.Sdkit_StarDs_ComponentOverlays_BasicButtonS)
        }
    }

    @Test
    fun testButtonSizeXS() {
        themedComponent {
            buttonSizeXSDark(R.style.Sdkit_StarDs_ComponentOverlays_BasicButtonXS)
        }
    }

    @Test
    override fun testButtonSizeLIsLoading() {
        themedComponent {
            buttonSizeLIsLoading(R.style.Sdkit_StarDs_ComponentOverlays_BasicButtonL)
        }
    }

    @Test
    override fun testButtonSizeLDisabled() {
        themedComponent {
            buttonSizeLDisabled(R.style.Sdkit_StarDs_ComponentOverlays_BasicButtonL)
        }
    }

    @Test
    override fun testButtonSizeMSpaceBetween() {
        themedComponent {
            buttonSizeMSpaceBetween(R.style.Sdkit_StarDs_ComponentOverlays_BasicButtonM)
        }
    }

    @Test
    override fun testButtonSizeSLongText() {
        themedComponent {
            buttonSizeSLongText(R.style.Sdkit_StarDs_ComponentOverlays_BasicButtonS)
        }
    }

    @Test
    override fun testIconButtonLDefault() {
        themedComponent {
            iconButtonLDefault(R.style.Sdkit_StarDs_ComponentOverlays_IconButtonL)
        }
    }

    @Test
    fun testIconButtonM() {
        themedComponent {
            iconButtonMAccent(R.style.Sdkit_StarDs_ComponentOverlays_IconButtonM)
        }
    }

    @Test
    fun testIconButtonS() {
        themedComponent {
            iconButtonSWarning(R.style.Sdkit_StarDs_ComponentOverlays_IconButtonS)
        }
    }

    @Test
    fun testIconButtonXS() {
        themedComponent {
            iconButtonXSDark(R.style.Sdkit_StarDs_ComponentOverlays_IconButtonXS)
        }
    }

    @Test
    override fun testIconButtonLIsLoading() {
        themedComponent {
            iconButtonLIsLoading(R.style.Sdkit_StarDs_ComponentOverlays_IconButtonL)
        }
    }

    @Test
    override fun testIconButtonDisabled() {
        themedComponent {
            iconButtonDisabled(R.style.Sdkit_StarDs_ComponentOverlays_IconButtonL)
        }
    }

    override fun testIconButtonLPilledSecondary() {
        TODO("Not yet implemented")
    }

    @Test
    fun testIconButtonLPilled() {
        themedComponent {
            iconButtonLPilledSecondary(R.style.Sdkit_StarDs_ComponentOverlays_IconButtonLPilled)
        }
    }

    @Ignore("Not yet implemented")
    override fun testButtonSizeMAccent() {
    }

    @Ignore("Not yet implemented")
    override fun testButtonSizeSWarning() {
    }

    @Ignore("Not yet implemented")
    override fun testButtonSizeXSDark() {
    }

    @Ignore("Not yet implemented")
    override fun testButtonSizeLSecondary() {
    }

    @Ignore("Not yet implemented")
    override fun testButtonXSNegative() {
    }

    @Ignore("Not yet implemented")
    override fun testButtonLWhite() {
    }

    @Ignore("Not yet implemented")
    override fun testIconButtonMClear() {
    }

    @Ignore("Not yet implemented")
    override fun testIconButtonSPositive() {
    }

    @Ignore("Not yet implemented")
    override fun testIconButtonMAccent() {
    }

    @Ignore("Not yet implemented")
    override fun testIconButtonSWarning() {
    }

    @Ignore("Not yet implemented")
    override fun testIconButtonXSDark() {
    }

    @Ignore("Not yet implemented")
    override fun testIconButtonXSNegative() {
    }

    @Ignore("Not yet implemented")
    override fun testIconButtonLWhite() {
    }

    @Ignore("Not yet implemented")
    override fun testLinkButtonLDefault() {
    }

    @Ignore("Not yet implemented")
    override fun testLinkButtonIsLoading() {
    }

    @Ignore("Not yet implemented")
    override fun testLinkButtonLSecondary() {
    }

    @Ignore("Not yet implemented")
    override fun testLinkButtonMAccent() {
    }

    @Ignore("Not yet implemented")
    override fun testLinkButtonDisabled() {
    }

    @Ignore("Not yet implemented")
    override fun testLinkButtonSWarning() {
    }

    @Ignore("Not yet implemented")
    override fun testLinkButtonXsNegative() {
    }
}
