package com.sdkit.star.designsystem

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
import com.sdds.uikit.fixtures.stories.select.TriggerType
import com.sdds.uikit.fixtures.testcases.SelectTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemSelectScreenshotTest : SelectTestCases("+night") {

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testSelectSingleNormalXlTextFieldTopStartSingle() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
            },
            skipDefaultCaptureRoboImage = true,
        ) {
            selectTextFieldTopStartSingle(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectL,
                triggerType = TriggerType.Button,
            )
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
            selectButtonTopEnd(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectL,
                triggerType = TriggerType.Button,
            )
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
            selectTextFieldTopCenterEmptyState(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectM,
                triggerType = TriggerType.Button,
            )
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
            selectMultipleTightButtonCenterStrict(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectS,
                triggerType = TriggerType.Button,
            )
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
            selectSingleNormalTextFieldCenterStartStrict(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectXs,
                triggerType = TriggerType.Button,
            )
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
            selectSingleTightButtonCenterEndEmptyState(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectL,
                triggerType = TriggerType.Button,
            )
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
            selectMultipleNormalTextFieldLoadingBottomStart(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectL,
                triggerType = TriggerType.Button,
            )
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
            selectMultipleTightTextFieldBottomEnd(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectL,
                triggerType = TriggerType.Button,
            )
        }
        captureScreenRoboImage()
    }

    @Test
    override fun testSelectMultipleNormalCenterDisabled() {
        themedComponent {
            selectMultipleNormalCenterDisabled(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectL,
                triggerType = TriggerType.Button,
            )
        }
    }

    @Test
    override fun testSelectMultipleNormalCenterReadOnly() {
        themedComponent {
            selectMultipleNormalCenterReadOnly(
                R.style.Sdkit_StarDs_ComponentOverlays_SelectL,
                triggerType = TriggerType.Button,
            )
        }
    }
}
