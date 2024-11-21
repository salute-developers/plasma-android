package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.chip.ChipUiState
import com.sdds.playground.sandbox.chip.ChipVariant
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemChipScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    @Test
    fun testChipLDefault() {
        launchScreen(
            R.id.nav_chip,
            ChipUiState(
                variant = ChipVariant.ChipLDefault,
                label = "Label",
                contentLeft = true,
                hasClose = true,
                enabled = true,
            ),
        )
        onView(withId(R.id.chip))
            .captureRoboImage()
    }

    @Test
    fun testChipXsSecondary() {
        launchScreen(
            R.id.nav_chip,
            ChipUiState(
                variant = ChipVariant.ChipXSSecondary,
                label = "Label",
                contentLeft = true,
                hasClose = true,
                enabled = true,
            ),
        )
        onView(withId(R.id.chip))
            .captureRoboImage()
    }

    @Test
    fun testChipMAccent() {
        launchScreen(
            R.id.nav_chip,
            ChipUiState(
                variant = ChipVariant.ChipMPilledAccent,
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.chip))
            .captureRoboImage()
    }

    @Test
    fun testChipSDisabled() {
        launchScreen(
            R.id.nav_chip,
            ChipUiState(
                variant = ChipVariant.ChipSDefault,
                label = "Label",
                contentLeft = true,
                hasClose = true,
                enabled = false,
            ),
        )
        onView(withId(R.id.chip))
            .captureRoboImage()
    }
}
