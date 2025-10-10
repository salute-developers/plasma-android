package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.loader.Default
import com.sdds.plasma.homeds.styles.loader.Loader
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.loader.LoaderForSandbox
import com.sdds.testing.compose.loader.LoaderProgress
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeLoaderScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

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
