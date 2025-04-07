package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.card.CardTestCases
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemCardScreenshotTest : CardTestCases("+night") {

    @Test
    fun testCardHorizontalXs() {
        themedComponent {
            margins {
                cardHorizontal(R.style.Sdkit_StarDs_ComponentOverlays_CardHorizontal)
            }
        }
    }

    @Test
    fun testCardSHorizontalSVertical() {
        themedComponent {
            margins {
                cardVertical(R.style.Sdkit_StarDs_ComponentOverlays_CardHorizontalS)
            }
        }
    }

    @Test
    fun testCardSquareXsHorizontal() {
        themedComponent {
            margins {
                cardHorizontal(R.style.Sdkit_StarDs_ComponentOverlays_CardSquareXs)
            }
        }
    }

    @Test
    fun testCardSquareLVertical() {
        themedComponent {
            margins {
                cardVertical(R.style.Sdkit_StarDs_ComponentOverlays_CardSquareL)
            }
        }
    }

    @Test
    fun testCardSVerticalHorizontal() {
        themedComponent {
            margins {
                cardHorizontal(R.style.Sdkit_StarDs_ComponentOverlays_CardVerticalS)
            }
        }
    }

    @Test
    fun testCardMVertical() {
        themedComponent {
            margins {
                cardVertical(R.style.Sdkit_StarDs_ComponentOverlays_CardVerticalM)
            }
        }
    }

    @Ignore("Not yet implemented")
    override fun testCardSizeLSolidHorizontal() {
    }

    @Ignore("Not yet implemented")
    override fun testCardSizeMSolidVertical() {
    }

    @Ignore("Not yet implemented")
    override fun testCardSizeSSolidHorizontal() {
    }

    @Ignore("Not yet implemented")
    override fun testCardSizeLClearVertical() {
    }

    @Ignore("Not yet implemented")
    override fun testCardSizeMClearHorizontal() {
    }

    @Ignore("Not yet implemented")
    override fun testCardSizeSClearVertical() {
    }
}
