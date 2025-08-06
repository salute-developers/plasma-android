package com.sdds.serv

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.accordion.AccordionTestCases
import org.hamcrest.core.AllOf.allOf
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemAccordionScreenshotTest(
    theme: String,
) : AccordionTestCases(theme) {

    @Test
    override fun testAccordionSolidActionEndSizeL() {
        themedComponent(
            action = {
                onView(allOf(withId(it.id)))
                    .perform(click())
            },
        ) {
            accordionCommon(R.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndL)
        }
    }

    @Test
    override fun testAccordionSolidActionStartSizeMAmountTen() {
        themedComponent {
            accordionAmountTen(R.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartM)
        }
    }

    @Test
    override fun testAccordionClearActionEndSizeSHasDivider() {
        themedComponent(
            action = {
                onView(allOf(withId(it.id)))
                    .perform(click())
            },
        ) {
            accordionHasDivider(R.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndS)
        }
    }

    @Test
    override fun testAccordionClearActionStartSizeXs() {
        themedComponent(
            action = {
                onView(allOf(withId(it.id)))
                    .perform(click())
            },
        ) {
            accordionCommon(R.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartXs)
        }
    }

    @Test
    override fun testAccordionSolidActionEndSizeLNoTextNoContent() {
        themedComponent(
            action = {
                onView(allOf(withId(it.id)))
                    .perform(click())
            },
        ) {
            accordionSolidActionEndSizeLNoTextNoContent(
                R.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndL,
            )
        }
    }

    @Test
    override fun testAccordionSolidActionEndSizeLAmountTen() {
        themedComponent {
            accordionAmountTen(R.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndL)
        }
    }

    @Test
    override fun testAccordionClearActionStartSizeH2AmountTen() {
        themedComponent {
            accordionAmountTen(R.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH2)
        }
    }

    @Test
    override fun testAccordionSolidActionEndSizeH2() {
        themedComponent(
            action = {
                onView(allOf(withId(it.id)))
                    .perform(click())
            },
        ) {
            accordionCommon(R.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndH2)
        }
    }

    @Test
    override fun testAccordionSolidActionStartSizeH3() {
        themedComponent(
            action = {
                onView(allOf(withId(it.id)))
                    .perform(click())
            },
        ) {
            accordionCommon(R.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartH3)
        }
    }

    @Test
    override fun testAccordionClearActionEndSizeH4HasDivider() {
        themedComponent(
            action = {
                onView(allOf(withId(it.id)))
                    .perform(click())
            },
        ) {
            accordionHasDivider(R.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndH4)
        }
    }

    @Test
    override fun testAccordionClearActionStartSizeH5() {
        themedComponent(
            action = {
                onView(allOf(withId(it.id)))
                    .perform(click())
            },
        ) {
            accordionHasDivider(R.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH5)
        }
    }

    @Test
    override fun testAccordionSolidActionEndSizeLLongText() {
        themedComponent(
            action = {
                onView(allOf(withId(it.id)))
                    .perform(click())
            },
        ) {
            accordionLongText(R.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndL)
        }
    }
}
