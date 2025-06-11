package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.rectskeleton.Default
import com.sdds.plasma.sd.service.styles.rectskeleton.RectSkeleton
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.rectskeleton.RectSkeletonTest
import com.sdds.testing.vs.SDK_NUMBER
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
}
