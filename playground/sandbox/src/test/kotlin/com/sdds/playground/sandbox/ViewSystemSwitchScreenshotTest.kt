package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.switcher.SwitchUiState
import com.sdds.playground.sandbox.switcher.SwitchVariant
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemSwitchScreenshotTest : RoborazziConfig() {

    @Test
    fun testSwitchSizeM() {
        launchScreen(
            R.id.nav_switch,
            SwitchUiState(
                variant = SwitchVariant.SwitchM,
                active = true,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(withId(R.id.switcher))
            .captureRoboImage()
    }

    @Test
    fun testSwitchDisabled() {
        launchScreen(
            R.id.nav_switch,
            SwitchUiState(
                variant = SwitchVariant.SwitchS,
                active = false,
                label = "Label",
                description = "Description",
                enabled = false,
            ),
        )
        onView(withId(R.id.switcher))
            .captureRoboImage()
    }

    @Test
    fun testSwitchOff() {
        launchScreen(
            R.id.nav_switch,
            SwitchUiState(
                variant = SwitchVariant.SwitchL,
                active = false,
                label = "Label",
                description = "Description",
                enabled = true,
            ),
        )
        onView(withId(R.id.switcher))
            .captureRoboImage()
    }
}
