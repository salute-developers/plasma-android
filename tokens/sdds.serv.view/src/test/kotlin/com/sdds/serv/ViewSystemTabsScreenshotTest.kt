package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.tabs.TabsTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemTabsScreenshotTest(
    theme: String,
) : TabsTestCases(theme) {

    @Test
    override fun testTabsLHorizontalHasDividerScroll() {
        themedComponent(
            action = {
                onView(withText("Label 2")).perform(click())
            },
        ) {
            tabsAmountFiveNoIconLabelHasDividerScroll(R.style.Serv_Sdds_ComponentOverlays_TabsDefaultLHorizontal)
        }
    }

    @Test
    override fun testTabsMVerticalIconStartNoLabelValueHasActionScrollExtra() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
            },
        ) {
            tabsAmountTwentyIconStartNoLabelValueHasActionScrollExtra(
                R.style.Serv_Sdds_ComponentOverlays_TabsDefaultMVertical,
            )
        }
    }

    @Test
    override fun testTabsSHorizontalAmountFiveIconEndHasDividerStretch() {
        themedComponent {
            tabsAmountFiveIconEndHasDividerStretch(R.style.Serv_Sdds_ComponentOverlays_TabsDefaultSHorizontal)
        }
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTabsXsHorizontalAmountTenHasDividerIfRoomExtra() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Show All")).perform(click())
            },
        ) {
            tabsAmountTenHasDividerIfRoomExtra(R.style.Serv_Sdds_ComponentOverlays_TabsDefaultXsHorizontal)
        }
        captureScreenRoboImage()
    }

    @Test
    override fun testTabsLVerticalAmountFiveStretch() {
        themedComponent(
            action = {
                onView(withText("Label 1")).perform(click())
            },
        ) {
            tabsAmountFiveStretch(R.style.Serv_Sdds_ComponentOverlays_TabsDefaultLVertical)
        }
    }

    @Test
    override fun testTabsDisabled() {
        themedComponent {
            tabsAmountFiveNoIconLabelHasDividerScroll(R.style.Serv_Sdds_ComponentOverlays_TabsDefaultLHorizontal)
        }
    }

    @Test
    override fun testTabsH1AmountFiveValueNoIconLabelHasDividerScroll() {
        themedComponent {
            tabsAmountFiveValueNoIconLabelHasDividerScroll(R.style.Serv_Sdds_ComponentOverlays_TabsHeaderH1)
        }
    }

    @Test
    override fun testTabsH2AmountTwoValueNoIconLabelStretch() {
        themedComponent(
            action = {
                onView(withText("Label 1")).perform(click())
            },
        ) {
            tabsAmountTwoValueNoIconLabelStretch(R.style.Serv_Sdds_ComponentOverlays_TabsHeaderH2)
        }
    }

    @Test
    override fun testTabsH3AmountOneIconStartValueLabelIfRoom() {
        themedComponent {
            tabsAmountOneIconStartValueLabelIfRoom(R.style.Serv_Sdds_ComponentOverlays_TabsHeaderH3)
        }
    }

    @Test
    override fun testTabsH4AmountFiveIconEndValueLabelHasActionScroll() {
        themedComponent(
            action = {
                onView(withText("Label 0")).perform(click())
            },
        ) {
            tabsAmountFiveIconEndValueLabelHasActionScroll(R.style.Serv_Sdds_ComponentOverlays_TabsHeaderH4)
        }
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testTabsH5AmountHundredIconEndValueLabelHasActionIfRoom() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withText("Label 0")).perform(click())
                onView(withText("Show All")).perform(click())
            },
        ) {
            tabsAmountHundredIconEndValueLabelHasActionIfRoom(R.style.Serv_Sdds_ComponentOverlays_TabsHeaderH5)
        }
        captureScreenRoboImage()
    }

    @Test
    override fun testIconTabsLHorizontalAmountFiveHasActionHasDividerScroll() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
            },
        ) {
            iconTabsAmountFiveHasActionHasDividerScroll(R.style.Serv_Sdds_ComponentOverlays_IconTabsLHorizontal)
        }
    }

    @Test
    override fun testIconTabsMVerticalAmountFiveHasDividerExtraStretch() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
            },
        ) {
            iconTabsAmountFiveHasDividerExtraStretch(R.style.Serv_Sdds_ComponentOverlays_IconTabsMVertical)
        }
    }

    @OptIn(ExperimentalRoborazziApi::class)
    @Test
    override fun testIconTabsSHorizontalAmountFiveHasDividerActionIfRoom() {
        themedComponent(
            skipDefaultCaptureRoboImage = true,
            action = {
                onView(withId(com.sdds.uikit.R.id.sd_tabDisclosureId)).perform(click())
            },
        ) {
            iconTabsAmountFiveHasDividerActionIfRoom(R.style.Serv_Sdds_ComponentOverlays_IconTabsSHorizontal)
        }
        captureScreenRoboImage()
    }

    @Test
    override fun testIconTabsXsVerticalAmountFiveHasActionHasDividerScrollExtra() {
        themedComponent(
            action = {
                onView(withId(it.id)).perform(click())
            },
        ) {
            iconTabsAmountFiveHasActionHasDividerScrollExtra(R.style.Serv_Sdds_ComponentOverlays_IconTabsXsVertical)
        }
    }
}
