package com.sdds.playground.sandbox.vs

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.progress.vs.ProgressUiState
import com.sdds.playground.sandbox.progress.vs.ProgressVariant
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemProgressScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    @Test
    fun testProgressDefault() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Default,
                progress = 0.25f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }

    @Test
    fun testProgressSecondary() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Secondary,
                progress = 0.25f,
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
                progress = 0.25f,
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

    @Test
    fun testProgressNegative() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Negative,
                progress = 0.99f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }

    @Test
    fun testProgressAccent() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Accent,
                progress = 1f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }

    @Test
    fun testProgressGradientAccent() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.GradientAccent,
                progress = 0.5f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }

    @Test
    fun testProgressDefaultValueOne() {
        launchScreen(
            R.id.nav_progressbar,
            ProgressUiState(
                variant = ProgressVariant.Default,
                progress = 0.01f,
            ),
        )
        onView(withId(R.id.progressBar))
            .captureRoboImage()
    }
}
