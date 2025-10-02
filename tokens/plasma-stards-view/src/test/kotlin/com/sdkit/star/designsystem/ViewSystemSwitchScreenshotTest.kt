package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.switcher.SwitchTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemSwitchScreenshotTest : SwitchTestCases("+night") {

    @Test
    override fun testSwitchSizeL() {
        themedComponent {
            switchSizeL(R.style.Sdkit_StarDs_ComponentOverlays_SwitchL)
        }
    }

    @Test
    override fun testSwitchSizeM() {
        themedComponent {
            switchSizeM(R.style.Sdkit_StarDs_ComponentOverlays_SwitchM)
        }
    }

    @Test
    override fun testSwitchSizeS() {
        themedComponent {
            switchSizeS(R.style.Sdkit_StarDs_ComponentOverlays_SwitchS)
        }
    }

    @Test
    override fun testSwitchDisabled() {
        themedComponent {
            switchDisabled(R.style.Sdkit_StarDs_ComponentOverlays_SwitchM)
        }
    }

    override fun testSwitchSizeLToggleS() {
        TODO("Not yet implemented")
    }

    override fun testSwitchSizeSToggleS() {
        TODO("Not yet implemented")
    }
}
