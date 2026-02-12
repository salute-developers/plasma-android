package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.textskeleton.H1
import com.sdds.plasma.homeds.styles.textskeleton.H2
import com.sdds.plasma.homeds.styles.textskeleton.H3
import com.sdds.plasma.homeds.styles.textskeleton.H4
import com.sdds.plasma.homeds.styles.textskeleton.H5
import com.sdds.plasma.homeds.styles.textskeleton.H6
import com.sdds.plasma.homeds.styles.textskeleton.L
import com.sdds.plasma.homeds.styles.textskeleton.M
import com.sdds.plasma.homeds.styles.textskeleton.S
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonBody
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonDisplay
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonHeader
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonText
import com.sdds.plasma.homeds.styles.textskeleton.Xs
import com.sdds.plasma.homeds.styles.textskeleton.Xxs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.textskeleton.TextSkeletonDefaultNoText
import com.sdds.testing.compose.textskeleton.TextSkeletonDefaultTextRandom
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeTextSkeletonScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testTextSkeletonBodyL() {
        composeTestRule.content {
            TextSkeletonDefaultTextRandom(TextSkeletonBody.L.style())
        }
    }

    @Test
    fun testTextSkeletonBodyM() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonBody.M.style())
        }
    }

    @Test
    fun testTextSkeletonBodyS() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonBody.S.style())
        }
    }

    @Test
    fun testTextSkeletonBodyXs() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonBody.Xs.style())
        }
    }

    @Test
    fun testTextSkeletonBodyXxs() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonBody.Xxs.style())
        }
    }

    @Test
    fun testTextSkeletonDisplayL() {
        composeTestRule.content {
            TextSkeletonDefaultTextRandom(TextSkeletonDisplay.L.style())
        }
    }

    @Test
    fun testTextSkeletonDisplayM() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonDisplay.M.style())
        }
    }

    @Test
    fun testTextSkeletonDisplayS() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonDisplay.S.style())
        }
    }

    @Test
    fun testTextSkeletonH1() {
        composeTestRule.content {
            TextSkeletonDefaultTextRandom(TextSkeletonHeader.H1.style())
        }
    }

    @Test
    fun testTextSkeletonH2() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonHeader.H2.style())
        }
    }

    @Test
    fun testTextSkeletonH3() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonHeader.H3.style())
        }
    }

    @Test
    fun testTextSkeletonH4() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonHeader.H4.style())
        }
    }

    @Test
    fun testTextSkeletonH5() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonHeader.H5.style())
        }
    }

    @Test
    fun testTextSkeletonH6() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonHeader.H6.style())
        }
    }

    @Test
    fun testTextSkeletonTextL() {
        composeTestRule.content {
            TextSkeletonDefaultTextRandom(TextSkeletonText.L.style())
        }
    }

    @Test
    fun testTextSkeletonTextM() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonText.M.style())
        }
    }

    @Test
    fun testTextSkeletonTextS() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonText.S.style())
        }
    }

    @Test
    fun testTextSkeletonTextXs() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonText.Xs.style())
        }
    }
}
