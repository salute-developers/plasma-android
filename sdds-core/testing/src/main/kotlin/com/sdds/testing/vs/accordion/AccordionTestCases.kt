package com.sdds.testing.vs.accordion

import android.view.View
import android.widget.FrameLayout
import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.Accordion

/**
 * Тест-кейсы для [Accordion]
 */
@Suppress("UndocumentedPublicFunction")
abstract class AccordionTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2094
     */
    abstract fun testAccordionSolidActionEndSizeL()

    /**
     * PLASMA-T2095
     */
    abstract fun testAccordionSolidActionStartSizeMAmountTen()

    /**
     * PLASMA-T2096
     */
    abstract fun testAccordionClearActionEndSizeSHasDivider()

    /**
     * PLASMA-T2097
     */
    abstract fun testAccordionClearActionStartSizeXs()

    /**
     * PLASMA-T2098
     */
    abstract fun testAccordionSolidActionEndSizeLNoTextNoContent()

    /**
     * PLASMA-T2099
     */
    abstract fun testAccordionSolidActionEndSizeLAmountTen()

    /**
     * PLASMA-T2100
     */
    abstract fun testAccordionClearActionStartSizeH2AmountTen()

    /**
     * PLASMA-T2101
     */
    abstract fun testAccordionSolidActionEndSizeH2()

    /**
     * PLASMA-T2102
     */
    abstract fun testAccordionSolidActionStartSizeH3()

    /**
     * PLASMA-T2103
     */
    abstract fun testAccordionClearActionEndSizeH4HasDivider()

    /**
     * PLASMA-T2104
     */
    abstract fun testAccordionClearActionStartSizeH5()

    /**
     * PLASMA-T2107
     */
    abstract fun testAccordionSolidActionEndSizeLLongText()

    fun ComponentScope.accordionCommon(style: Int): View =
        accordion(
            context = context,
            style = style,
            AccordionUiState(
                variant = "",
                amount = 3,
                title = "Title",
                contentText = "Content text",
                animation = true,
                hasDivider = false,
            ),
        ).apply {
            id = R.id.accordion
        }

    fun ComponentScope.accordionAmountTen(style: Int): View =
        accordion(
            context = context,
            style = style,
            AccordionUiState(
                variant = "",
                amount = 10,
                title = "Title",
                contentText = "Content text",
                animation = true,
                hasDivider = false,
            ),
        ).apply {
            id = R.id.accordion
        }

    fun ComponentScope.accordionHasDivider(style: Int): View =
        accordion(
            context = context,
            style = style,
            AccordionUiState(
                variant = "",
                amount = 3,
                title = "Title",
                contentText = "Content text",
                animation = true,
                hasDivider = true,
            ),
        ).apply {
            id = R.id.accordion
        }

    fun ComponentScope.accordionSolidActionEndSizeLNoTextNoContent(style: Int): View =
        accordion(
            context = context,
            style = style,
            AccordionUiState(
                variant = "",
                amount = 3,
                title = "",
                contentText = "",
                animation = true,
                hasDivider = false,
            ),
        ).apply {
            id = R.id.accordion
        }

    fun ComponentScope.accordionLongText(style: Int): View =
        accordion(
            context = context,
            style = style,
            AccordionUiState(
                variant = "",
                amount = 3,
                title = "The standard lorem ipsum passage, used since the 1500\n",
                contentText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                    "ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                    "reprehenderit in voluptate velit esse cillum dolore",
                animation = true,
                hasDivider = false,
            ),
        ).apply {
            id = R.id.accordion
        }
            .apply {
                layoutParams = FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT,
                    FrameLayout.LayoutParams.MATCH_PARENT,
                )
            }
}
