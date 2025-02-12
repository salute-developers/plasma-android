package com.sdds.playground.sandbox.vs

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.cell.vs.CellContent
import com.sdds.playground.sandbox.cell.vs.CellUiState
import com.sdds.playground.sandbox.cell.vs.CellVariant
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemCellScreenshotTest(
    theme: String,
) : RoborazziConfig(theme) {

    @Test
    fun testCellSizeLAvatarHasDisclosure() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellL,
                title = "Title",
                subtitle = "Subtitle",
                label = "Label",
                hasDisclosure = true,
                disclosureText = "",
                startContent = CellContent.AVATAR,
                endContent = CellContent.NONE,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }

    @Test
    fun testCellSizeMTitleAvatar() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellM,
                title = "Title",
                subtitle = "",
                label = "",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.AVATAR,
                endContent = CellContent.NONE,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }

    @Test
    fun testCellSizeSSubtitleHasDisclosure() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellS,
                title = "",
                subtitle = "Subtitle",
                label = "",
                hasDisclosure = true,
                disclosureText = "",
                startContent = CellContent.NONE,
                endContent = CellContent.NONE,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }

    @Test
    fun testCellSizeXSLabelAvatar() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellXS,
                title = "",
                subtitle = "",
                label = "Label",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.AVATAR,
                endContent = CellContent.NONE,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }

    @Test
    fun testCellSizeLHasDisclosureDisclosureText() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellL,
                title = "Title",
                subtitle = "Subtitle",
                label = "Label",
                hasDisclosure = true,
                disclosureText = "text",
                startContent = CellContent.NONE,
                endContent = CellContent.NONE,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }

    @Test
    fun testCellSizeMAvatarIcon() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellM,
                title = "Title",
                subtitle = "",
                label = "Label",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.AVATAR,
                endContent = CellContent.ICON,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }

    @Test
    fun testCellSizeSIconHasDisclosureDisclosureText() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellS,
                title = "Title",
                subtitle = "Subtitle",
                label = "",
                hasDisclosure = true,
                disclosureText = "text",
                startContent = CellContent.ICON,
                endContent = CellContent.NONE,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }

    @Test
    fun testCellSizeXSRadioBoxAvatar() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellXS,
                title = "Title",
                subtitle = "Subtitle",
                label = "Label",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.RADIOBOX,
                endContent = CellContent.AVATAR,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }

    @Test
    fun testCellSizeLSwitchCheckBox() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellL,
                title = "Title",
                subtitle = "",
                label = "",
                hasDisclosure = false,
                disclosureText = "",
                startContent = CellContent.SWITCH,
                endContent = CellContent.CHECKBOX,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }

    @Test
    fun testCellSizeMCheckBoxHasDisclosure() {
        launchScreen(
            R.id.nav_cell,
            CellUiState(
                variant = CellVariant.CellM,
                title = "",
                subtitle = "",
                label = "Label",
                hasDisclosure = true,
                disclosureText = "",
                startContent = CellContent.CHECKBOX,
                endContent = CellContent.NONE,
            ),
        )
        onView(withId(R.id.cell))
            .captureRoboImage()
    }
}
