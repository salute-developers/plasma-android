package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.loader.LoaderForSandbox
import com.sdds.testing.compose.loader.LoaderProgress
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.loader.Default
import com.sdkit.star.designsystem.styles.loader.Loader
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeLoaderScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testLoaderSpinner() {
        composeTestRule.content {
            LoaderForSandbox(Loader.Default.style())
        }
    }

    @Test
    fun testLoaderProgress() {
        composeTestRule.content {
            LoaderProgress(Loader.Default.style())
        }
    }
}
