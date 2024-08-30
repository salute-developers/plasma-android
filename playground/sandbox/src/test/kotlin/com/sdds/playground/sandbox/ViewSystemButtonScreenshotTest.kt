package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.buttons.BasicButtonVariant
import com.sdds.playground.sandbox.buttons.ButtonIcon
import com.sdds.playground.sandbox.buttons.ButtonUiState
import com.sdds.uikit.Button
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemButtonScreenshotTest : RoborazziConfig() {

    @Test
    fun testButtonSizeLDefault() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonLDefault,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeXSDefault() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonXSDefault,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeMSecondary() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonMSecondary,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeSClear() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonSClear,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeLPositive() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonLPositive,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeMNegative() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonMNegative,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "Value",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeSWarning() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonSWarning,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeXSBlack() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonXSBlack,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "Value",
                spacing = Button.Spacing.SpaceBetween,
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeLWhite() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonLWhite,
                icon = ButtonIcon.End,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }
}
