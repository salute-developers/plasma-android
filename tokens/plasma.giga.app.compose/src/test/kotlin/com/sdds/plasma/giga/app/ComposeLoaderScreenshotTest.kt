package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.LoaderForSandbox
import com.sdds.compose.uikit.fixtures.testcases.LoaderProgress
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.loader.Default
import com.sdds.plasma.giga.app.styles.loader.Loader
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
