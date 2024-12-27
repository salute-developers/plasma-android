package com.sdds.playground.sandbox.vs

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.buttons.vs.BasicButtonVariant
import com.sdds.playground.sandbox.buttons.vs.ButtonIcon
import com.sdds.playground.sandbox.buttons.vs.ButtonUiState
import com.sdds.playground.sandbox.buttons.vs.IconButtonVariant
import com.sdds.uikit.Button
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemButtonScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    @Test
    fun testButtonSizeLDefault() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonLDefault,
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeMAccent() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonMAccent,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
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
                icon = ButtonIcon.End,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeXSDark() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonXSDark,
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                buttonValue = "Value",
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeLIsLoading() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonLDefault,
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = true,
                loading = true,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeLDisabled() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonLDefault,
                icon = ButtonIcon.No,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = false,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeLSecondary() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonLSecondary,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "",
                spacing = Button.Spacing.Packed,
                enabled = true,
                loading = false,
                fixedSize = true,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeMSpaceBetween() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonMClear,
                icon = ButtonIcon.Start,
                buttonLabel = "Label",
                buttonValue = "Value",
                spacing = Button.Spacing.SpaceBetween,
                enabled = true,
                loading = false,
                fixedSize = true,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonSizeSLongText() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonSPositive,
                icon = ButtonIcon.End,
                buttonLabel = "LabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabel",
                buttonValue = "",
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testButtonXSNegative() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonXSNegative,
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

    @Test
    fun testButtonLWhite() {
        launchScreen(
            R.id.nav_basic_button,
            ButtonUiState(
                variant = BasicButtonVariant.BasicButtonLWhite,
                icon = ButtonIcon.End,
                spacing = Button.Spacing.Packed,
                buttonLabel = "Label",
                buttonValue = "",
                enabled = true,
                loading = false,
                fixedSize = false,
            ),
        )
        onView(withId(R.id.basic_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonLDefault() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonLDefault,
                loading = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonMAccent() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonMAccent,
                loading = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonSWarning() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonSWarning,
                loading = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonXSDark() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonXSDark,
                loading = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonLIsLoading() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonLDefault,
                loading = true,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonDisabled() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonMDefault,
                loading = false,
                enabled = false,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonLPilledSecondary() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonLPilledSecondary,
                loading = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonMClear() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonMClear,
                loading = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonSPositive() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonSPositive,
                loading = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonXSNegative() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonXSPilledNegative,
                loading = true,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }

    @Test
    fun testIconButtonLWhite() {
        launchScreen(
            R.id.nav_icon_button,
            ButtonUiState(
                variant = IconButtonVariant.IconButtonLWhite,
                loading = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.icon_button))
            .captureRoboImage()
    }
}
