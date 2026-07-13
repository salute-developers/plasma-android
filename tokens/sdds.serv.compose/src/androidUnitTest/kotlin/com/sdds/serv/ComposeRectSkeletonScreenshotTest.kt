package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.RectSkeletonTest
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.rectskeleton.Default
import com.sdds.serv.styles.rectskeleton.Lighter
import com.sdds.serv.styles.rectskeleton.RectSkeleton
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeRectSkeletonScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testRectSkeleton() {
        composeTestRule.content {
            RectSkeletonTest(style = RectSkeleton.Default.style())
        }
    }

    @Test
    fun testRectSkeletonLighter() {
        composeTestRule.content {
            RectSkeletonTest(style = RectSkeleton.Lighter.style())
        }
    }
}
