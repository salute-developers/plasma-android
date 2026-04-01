package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.uikit.fixtures.SDK_NUMBER
import com.sdds.uikit.fixtures.testcases.SelectTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemSelectScreenshotTest(
    theme: String,
) : SelectTestCases(theme) {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testSelectSingleNormalXlTextFieldTopStartSingle() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            selectTextFieldTopStartSingle(R.style.Serv_Sdds_ComponentOverlays_SelectSingleNormalXl)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testSelectSingleTightLButtonTopEnd() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
                onView(
                    withText("Иван Иванов"),
                ).inRoot(RootMatchers.isPlatformPopup()).perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            selectButtonTopEnd(R.style.Serv_Sdds_ComponentOverlays_SelectSingleTightL)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testSelectMultipleNormalMTextFieldTopCenterEmptyState() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            selectTextFieldTopCenterEmptyState(R.style.Serv_Sdds_ComponentOverlays_SelectMultipleNormalM)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testSelectMultipleTightSButtonCenterTopStrict() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
                onView(withText("Иван Иванов")).inRoot(RootMatchers.isPlatformPopup())
                    .perform(click())
                onView(withText("Пётр Петров")).inRoot(RootMatchers.isPlatformPopup())
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            selectMultipleTightButtonCenterStrict(R.style.Serv_Sdds_ComponentOverlays_SelectMultipleTightS)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testSelectSingleNormalXsTextFieldCenterStartStrict() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
                onView(withText("Иван Иванов"))
                    .inRoot(RootMatchers.isPlatformPopup())
                    .perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            selectSingleNormalTextFieldCenterStartStrict(R.style.Serv_Sdds_ComponentOverlays_SelectSingleNormalXs)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testSelectSingleTightLButtonCenterEndEmptyState() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
                pressBack()
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            selectSingleTightButtonCenterEndEmptyState(R.style.Serv_Sdds_ComponentOverlays_SelectSingleTightL)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testSelectMultipleNormalLTextFieldLoadingBottomStart() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            selectMultipleNormalTextFieldLoadingBottomStart(R.style.Serv_Sdds_ComponentOverlays_SelectMultipleNormalL)
        }
        captureScreenRoboImage()
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testSelectMultipleTightLTextFieldBottomEnd() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
                onView(withText("Иван Иванов")).inRoot(RootMatchers.isPlatformPopup())
                    .perform(click())
                onView(withText("Сергей Сергеев")).inRoot(RootMatchers.isPlatformPopup())
                    .perform(click())
                onView(withText("Анна Смирнова")).inRoot(RootMatchers.isPlatformPopup())
                    .perform(click())
                pressBack()
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            selectMultipleTightTextFieldBottomEnd(R.style.Serv_Sdds_ComponentOverlays_SelectMultipleTightL)
        }
        captureScreenRoboImage()
    }

    @Test
    override fun testSelectMultipleNormalCenterDisabled() {
        themedComponent {
            selectMultipleNormalCenterDisabled(R.style.Serv_Sdds_ComponentOverlays_SelectMultipleNormalXl)
        }
    }

    @Test
    override fun testSelectMultipleNormalCenterReadOnly() {
        themedComponent {
            selectMultipleNormalCenterReadOnly(R.style.Serv_Sdds_ComponentOverlays_SelectMultipleNormalL)
        }
    }
}
