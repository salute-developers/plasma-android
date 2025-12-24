package com.sdds.serv

import android.widget.EditText
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.autocomplete.AutocompleteTestCases
import com.sdds.uikit.ListItemView
import org.hamcrest.core.AllOf.allOf
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemAutocompleteScreenshotTest(
    theme: String,
) : AutocompleteTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testAutocompleteTightXlShowLoadingCenter() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(click()).perform(replaceText("и"))
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            autocompleteShowLoadingCenter(R.style.Serv_Sdds_ComponentOverlays_AutocompleteTightXl)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testAutocompleteTightLEmptyStateStartCenter() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            autocompleteEmptyStateStartCenter(R.style.Serv_Sdds_ComponentOverlays_AutocompleteTightL)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testAutocompleteTightMStartBottom() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(click()).perform(replaceText("иван"))
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            autocompleteStartBottom(R.style.Serv_Sdds_ComponentOverlays_AutocompleteTightM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testAutocompleteTightSCenterTop() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(click()).perform(replaceText("Иван"))
                onView(
                    allOf(
                        isAssignableFrom(ListItemView::class.java),
                        hasDescendant(withText("Иван Иванов")),
                    ),
                ).inRoot(RootMatchers.isPlatformPopup()).perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            autocompleteCenterTop(R.style.Serv_Sdds_ComponentOverlays_AutocompleteTightS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testAutocompleteTightXsCenter() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(click()).perform(replaceText("а"))
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            autocompleteCenter(R.style.Serv_Sdds_ComponentOverlays_AutocompleteTightXs)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testAutocompleteTightXlCenterBottom() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(click()).perform(replaceText("123!@#%&"))
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            autocompleteCenterBottom(R.style.Serv_Sdds_ComponentOverlays_AutocompleteTightXl)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testAutocompleteNormalXlEndTop() {
        themedComponent(
            action = {
                onView(
                    allOf(
                        isDescendantOfA(withId(it.id)),
                        isAssignableFrom(EditText::class.java),
                    ),
                ).perform(click()).perform(replaceText("а"))
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            autocompleteEndTop(R.style.Serv_Sdds_ComponentOverlays_AutocompleteNormalXl)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testAutocompleteNormalXlEndCenter() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            autocompleteEndCenter(R.style.Serv_Sdds_ComponentOverlays_AutocompleteNormalXl)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testAutocompleteNormalEndBottom() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
        ) {
            autocompleteEndBottom(R.style.Serv_Sdds_ComponentOverlays_AutocompleteNormalXl)
        }
        captureScreenRoboImage()
    }
}
