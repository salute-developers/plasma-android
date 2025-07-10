package com.sdds.plasma.sd.service

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.plasma.sd.service.colorstate.ListItemViewColorState
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.dropdownmenu.DropDownMenuTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemDropDownMenuScreenshotTest(
    theme: String,
) : DropDownMenuTestCases(theme) {

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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXl,
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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalL,
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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalM,
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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalS,
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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXs,
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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXl,
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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXl,
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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXl,
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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXl,
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
                style = R.style.Plasma_SdService_ComponentOverlays_DropdownMenuTightXs,
                colorState = ListItemViewColorState.DEFAULT,
            )
        }
        captureScreenRoboImage()
    }
}
