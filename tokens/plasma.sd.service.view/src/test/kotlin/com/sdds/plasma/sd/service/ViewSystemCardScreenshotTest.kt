package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.card.CardTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemCardScreenshotTest(
    theme: String,
) : CardTestCases(theme) {

    @Test
    override fun testCardSizeLSolidHorizontal() {
        themedComponent {
            cardHorizontal(R.style.Plasma_SdService_ComponentOverlays_CardSolidL)
        }
    }

    @Test
    override fun testCardSizeMSolidVertical() {
        themedComponent {
            cardVertical(R.style.Plasma_SdService_ComponentOverlays_CardSolidM)
        }
    }

    @Test
    override fun testCardSizeSSolidHorizontal() {
        themedComponent {
            cardHorizontal(R.style.Plasma_SdService_ComponentOverlays_CardSolidS)
        }
    }

    @Test
    override fun testCardSizeLClearVertical() {
        themedComponent {
            cardVertical(R.style.Plasma_SdService_ComponentOverlays_CardClearL)
        }
    }

    @Test
    override fun testCardSizeMClearHorizontal() {
        themedComponent {
            cardHorizontal(R.style.Plasma_SdService_ComponentOverlays_CardClearM)
        }
    }

    @Test
    override fun testCardSizeSClearVertical() {
        themedComponent {
            cardVertical(R.style.Plasma_SdService_ComponentOverlays_CardClearS)
        }
    }
}
