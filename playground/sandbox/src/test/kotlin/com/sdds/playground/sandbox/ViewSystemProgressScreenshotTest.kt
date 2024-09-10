package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.progress.ProgressUiState
import com.sdds.playground.sandbox.progress.ProgressVariant
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemProgressScreenshotTest : RoborazziConfig() {

    @Test
    fun testProgressDefault() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Default,
                progress = 0.5f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }

    @Test
    fun testProgressNegative() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Negative,
                progress = 0.5f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }

    @Test
    fun testProgressWarning() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Warning,
                progress = 0.8f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }

    @Test
    fun testProgressPositive() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Positive,
                progress = 0.5f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }

    @Config(qualifiers = "+night")
    @Test
    fun testProgressDefaultDark() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Default,
                progress = 0.2f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }
}
