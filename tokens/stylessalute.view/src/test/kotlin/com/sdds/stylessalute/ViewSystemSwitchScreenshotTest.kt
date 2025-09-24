package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.switcher.SwitchTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemSwitchScreenshotTest(
    theme: String,
) : SwitchTestCases(theme) {

    @Test
    override fun testSwitchSizeL() {
        themedComponent {
            switchSizeL(R.style.Salute_StylesSalute_ComponentOverlays_SwitchL)
        }
    }

    @Test
    override fun testSwitchSizeM() {
        themedComponent {
            switchSizeM(R.style.Salute_StylesSalute_ComponentOverlays_SwitchM)
        }
    }

    @Test
    override fun testSwitchSizeS() {
        themedComponent {
            switchSizeS(R.style.Salute_StylesSalute_ComponentOverlays_SwitchS)
        }
    }

    @Test
    override fun testSwitchDisabled() {
        themedComponent {
            switchDisabled(R.style.Salute_StylesSalute_ComponentOverlays_SwitchM)
        }
    }

    @Test
    override fun testSwitchSizeLToggleS() {
        themedComponent {
            switchSizeL(R.style.Salute_StylesSalute_ComponentOverlays_SwitchLToggleS)
        }
    }

    @Test
    override fun testSwitchSizeSToggleS() {
        themedComponent {
            switchToggleOff(R.style.Salute_StylesSalute_ComponentOverlays_SwitchSToggleS)
        }
    }
}
