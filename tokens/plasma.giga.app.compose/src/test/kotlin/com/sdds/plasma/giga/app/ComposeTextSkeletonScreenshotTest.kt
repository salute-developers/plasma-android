package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.textskeleton.Default
import com.sdds.plasma.giga.app.styles.textskeleton.Lighter
import com.sdds.plasma.giga.app.styles.textskeleton.TextSkeleton
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.textskeleton.TextSkeletonDefaultFullWidth
import com.sdds.testing.compose.textskeleton.TextSkeletonDefaultNoTextRandom
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
    fun testTextSkeletonDefaultNoTextRandom() {
        composeTestRule.content {
            TextSkeletonDefaultNoTextRandom(style = TextSkeleton.Default.style())
        }
    }

    @Test
    fun testTextSkeletonDefaultFullWidth() {
        composeTestRule.content {
            TextSkeletonDefaultFullWidth(style = TextSkeleton.Default.style())
        }
    }

    @Test
    fun testTextSkeletonLighterNoTextRandom() {
        composeTestRule.content {
            TextSkeletonDefaultNoTextRandom(style = TextSkeleton.Lighter.style())
        }
    }
}
