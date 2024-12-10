package com.sdds.playground.sandbox

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.chip.CheckedState
import com.sdds.playground.sandbox.chip.ChipUiState
import com.sdds.playground.sandbox.chip.ChipVariant
import com.sdds.playground.sandbox.chip.GapMode
import com.sdds.playground.sandbox.chip.GravityMode
import com.sdds.uikit.ChipGroup
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
                contentLeft = false,
                hasClose = true,
                enabled = true,
            ),
        )
        onView(withId(R.id.chip))
            .captureRoboImage()
    }

    @Test
    fun testChipMSecondary() {
        launchScreen(
            R.id.nav_chip,
            ChipUiState(
                variant = ChipVariant.ChipMPilledSecondary,
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
                variant = ChipVariant.ChipSAccent,
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = false,
            ),
        )
        onView(withId(R.id.chip))
            .captureRoboImage()
    }

    @Test
    fun testChipXsDefault() {
        launchScreen(
            R.id.nav_chip,
            ChipUiState(
                variant = ChipVariant.ChipXSDefault,
                label = "Label",
                contentLeft = true,
                hasClose = false,
                enabled = true,
            ),
        )
        onView(withId(R.id.chip))
            .captureRoboImage()
    }

    @Test
    fun testChipGroupLDefault() {
        launchScreen(
            R.id.nav_chip_group,
            ChipUiState(
                variant = ChipVariant.ChipLDefault,
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = true,
                gapMode = GapMode.Dense,
                isWrapped = false,
                quantity = 5,
                gravityMode = GravityMode.Start,
                checkedState = CheckedState.Accent,
                selectionMode = ChipGroup.SelectionMode.Single,
            ),
        )
        onView(withId(R.id.chip_group))
            .captureRoboImage()
    }

    @Test
    fun testChipGroupMSecondary() {
        launchScreen(
            R.id.nav_chip_group,
            ChipUiState(
                variant = ChipVariant.ChipMSecondary,
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = true,
                gapMode = GapMode.Wide,
                isWrapped = true,
                quantity = 20,
                gravityMode = GravityMode.Start,
                checkedState = CheckedState.Accent,
                selectionMode = ChipGroup.SelectionMode.Single,
            ),
        )
        onView(withId(R.id.chip_group))
            .captureRoboImage()
    }

    @Test
    fun testChipGroupSAccent() {
        launchScreen(
            R.id.nav_chip_group,
            ChipUiState(
                variant = ChipVariant.ChipSAccent,
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = true,
                gapMode = GapMode.Dense,
                isWrapped = false,
                quantity = 5,
                gravityMode = GravityMode.Start,
                checkedState = CheckedState.Accent,
                selectionMode = ChipGroup.SelectionMode.Single,
            ),
        )
        onView(withId(R.id.chip_group))
            .captureRoboImage()
    }

    @Test
    fun testChipGroupXSDefault() {
        launchScreen(
            R.id.nav_chip_group,
            ChipUiState(
                variant = ChipVariant.ChipXSDefault,
                label = "Label",
                contentLeft = false,
                hasClose = false,
                enabled = true,
                gapMode = GapMode.Dense,
                isWrapped = false,
                quantity = 5,
                gravityMode = GravityMode.Start,
                checkedState = CheckedState.Accent,
                selectionMode = ChipGroup.SelectionMode.Single,
            ),
        )
        onView(withId(R.id.chip_group))
            .captureRoboImage()
    }

    @Test
    fun testChipGroupLPilledSecondaryCheckedStateAccent() {
        launchScreen(
            R.id.nav_chip_group,
            ChipUiState(
                variant = ChipVariant.ChipLPilledSecondary,
                label = "Label",
                contentLeft = true,
                hasClose = true,
                enabled = true,
                gapMode = GapMode.Dense,
                isWrapped = false,
                quantity = 5,
                gravityMode = GravityMode.Start,
                checkedState = CheckedState.Accent,
                selectionMode = ChipGroup.SelectionMode.Single,
            ),
        )
        onView(withId(0))
            .perform(click())
        onView(withId(R.id.chip_group))
            .captureRoboImage()
    }

    @Test
    fun testChipGroupMAccentCheckedStateSecondary() {
        launchScreen(
            R.id.nav_chip_group,
            ChipUiState(
                variant = ChipVariant.ChipMAccent,
                label = "Label",
                contentLeft = false,
                hasClose = true,
                enabled = true,
                gapMode = GapMode.Wide,
                isWrapped = false,
                quantity = 5,
                gravityMode = GravityMode.Start,
                checkedState = CheckedState.Secondary,
                selectionMode = ChipGroup.SelectionMode.Single,
            ),
        )
        onView(withId(0))
            .perform(click())
        onView(withId(R.id.chip_group))
            .captureRoboImage()
    }

    @Test
    fun testChipGroupLSecondaryCheckedStateDefaultMultiple() {
        launchScreen(
            R.id.nav_chip_group,
            ChipUiState(
                variant = ChipVariant.ChipLSecondary,
                label = "Label",
                contentLeft = true,
                hasClose = true,
                enabled = true,
                gapMode = GapMode.Dense,
                isWrapped = true,
                quantity = 5,
                gravityMode = GravityMode.End,
                checkedState = CheckedState.Default,
                selectionMode = ChipGroup.SelectionMode.Multiple,
            ),
        )
        onView(withId(0))
            .perform(click())
        onView(withId(1))
            .perform(click())
        onView(withId(R.id.chip_group))
            .captureRoboImage()
    }
}
