package com.sdkit.star.designsystem

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.dropdownmenu.DropDownMenuTestCases
import com.sdkit.star.designsystem.colorstate.ListItemViewColorState
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemDropDownMenuScreenshotTest : DropDownMenuTestCases("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuXlHasLooseStartTop() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuXlHasLooseStartTop(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuL,
                colorState = ListItemViewColorState.DEFAULT,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuLPositiveStrictStartCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuLPositiveStrictStartCenter(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuL,
                colorState = ListItemViewColorState.POSITIVE,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuMNegativeStrictStartBottom() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuMNegativeStrictStartBottom(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuM,
                colorState = ListItemViewColorState.NEGATIVE,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuSNoTextNoDisclosureStrictCenterTop() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuSNoTextNoDisclosureStrictCenterTop(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuS,
                colorState = ListItemViewColorState.DEFAULT,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuXsStrictCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuXsStrictCenter(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuXs,
                colorState = ListItemViewColorState.DEFAULT,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuXlAmountTwentyLooseCenterBottom() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuXlAmountTwentyLooseCenterBottom(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuXl,
                colorState = ListItemViewColorState.DEFAULT,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuXlLooseEndTop() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuXlLooseEndTop(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuXl,
                colorState = ListItemViewColorState.DEFAULT,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuXlStrictEndCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuXlStrictEndCenter(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuXl,
                colorState = ListItemViewColorState.DEFAULT,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuXlLooseEndBottom() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuXlLooseEndBottom(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuXl,
                colorState = ListItemViewColorState.DEFAULT,
            )
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testDropDownMenuTightXsStrictCenter() {
        themedComponent(
            action = {
                onView(withId(it.id))
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            dropDownMenuTightXsStrictCenter(
                style = R.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuXs,
                colorState = ListItemViewColorState.DEFAULT,
            )
        }
        captureScreenRoboImage()
    }
}
