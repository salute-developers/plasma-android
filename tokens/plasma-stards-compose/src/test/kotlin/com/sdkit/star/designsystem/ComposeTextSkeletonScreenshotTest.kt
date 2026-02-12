package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.textskeleton.TextSkeletonDefaultNoText
import com.sdds.testing.compose.textskeleton.TextSkeletonDefaultTextRandom
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.textskeleton.H1
import com.sdkit.star.designsystem.styles.textskeleton.H2
import com.sdkit.star.designsystem.styles.textskeleton.H3
import com.sdkit.star.designsystem.styles.textskeleton.H4
import com.sdkit.star.designsystem.styles.textskeleton.H5
import com.sdkit.star.designsystem.styles.textskeleton.L
import com.sdkit.star.designsystem.styles.textskeleton.M
import com.sdkit.star.designsystem.styles.textskeleton.S
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonBody
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonDisplay
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonHeader
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonText
import com.sdkit.star.designsystem.styles.textskeleton.Xs
import com.sdkit.star.designsystem.styles.textskeleton.Xxs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeTextSkeletonScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testTextSkeletonBodyL() {
        composeTestRule.content {
            TextSkeletonDefaultTextRandom(TextSkeletonBody.L.style())
        }
    }

    @Test
    fun testTextSkeletonBodyM() {
        composeTestRule.content {
            TextSkeletonDefaultNoText(TextSkeletonBody.Xxs.style())
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
