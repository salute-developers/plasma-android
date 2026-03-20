package com.sdds.stylessalute

import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.AccordionClearActionEndSizeH4
import com.sdds.compose.uikit.fixtures.testcases.AccordionClearActionEndSizeSDivider
import com.sdds.compose.uikit.fixtures.testcases.AccordionClearActionStartSizeH2AmountTen
import com.sdds.compose.uikit.fixtures.testcases.AccordionClearActionStartSizeH5
import com.sdds.compose.uikit.fixtures.testcases.AccordionClearActionStartSizeXs
import com.sdds.compose.uikit.fixtures.testcases.AccordionSolidActionEndSizeH2
import com.sdds.compose.uikit.fixtures.testcases.AccordionSolidActionEndSizeL
import com.sdds.compose.uikit.fixtures.testcases.AccordionSolidActionEndSizeLAmountTen
import com.sdds.compose.uikit.fixtures.testcases.AccordionSolidActionEndSizeLLongText
import com.sdds.compose.uikit.fixtures.testcases.AccordionSolidActionEndSizeLNoTextNoContent
import com.sdds.compose.uikit.fixtures.testcases.AccordionSolidActionStartAmountTenSizeM
import com.sdds.compose.uikit.fixtures.testcases.AccordionSolidActionStartSizeH3
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.accordion.AccordionClearActionEnd
import com.sdds.stylessalute.styles.accordion.AccordionClearActionStart
import com.sdds.stylessalute.styles.accordion.AccordionSolidActionEnd
import com.sdds.stylessalute.styles.accordion.AccordionSolidActionStart
import com.sdds.stylessalute.styles.accordion.H2
import com.sdds.stylessalute.styles.accordion.H3
import com.sdds.stylessalute.styles.accordion.H4
import com.sdds.stylessalute.styles.accordion.H5
import com.sdds.stylessalute.styles.accordion.L
import com.sdds.stylessalute.styles.accordion.M
import com.sdds.stylessalute.styles.accordion.S
import com.sdds.stylessalute.styles.accordion.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeAccordionScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testAccordionSolidActionEndSizeL() {
        composeTestRule.content {
            AccordionSolidActionEndSizeL(AccordionSolidActionEnd.L.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAccordionSolidActionStartAmountTenSizeM() {
        composeTestRule.content {
            AccordionSolidActionStartAmountTenSizeM(AccordionSolidActionStart.M.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAccordionClearActionEndSizeSDivider() {
        composeTestRule.content {
            AccordionClearActionEndSizeSDivider(AccordionClearActionEnd.S.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAccordionClearActionStartSizeXs() {
        composeTestRule.content {
            AccordionClearActionStartSizeXs(AccordionClearActionStart.Xs.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAccordionSolidActionEndSizeLNoTextNoContent() {
        composeTestRule.content {
            AccordionSolidActionEndSizeLNoTextNoContent(AccordionSolidActionEnd.L.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAccordionSolidActionEndSizeLOpenAll() {
        composeTestRule.content {
            AccordionSolidActionEndSizeLAmountTen(AccordionSolidActionEnd.L.style())
        }
        for (i in 0..8) {
            composeTestRule
                .onAllNodesWithTag("Accordion", useUnmergedTree = true)[i]
                .performClick()
            composeTestRule.waitForIdle()
        }
    }

    @Test
    fun testAccordionClearActionStartSizeH2AmountTen() {
        composeTestRule.content {
            AccordionClearActionStartSizeH2AmountTen(AccordionClearActionStart.H2.style())
        }
        for (i in 0..9) {
            composeTestRule
                .onAllNodesWithTag("Accordion", useUnmergedTree = true)[i]
                .performClick()
            composeTestRule.waitForIdle()
        }
    }

    @Test
    fun testAccordionSolidActionEndSizeH2() {
        composeTestRule.content {
            AccordionSolidActionEndSizeH2(AccordionSolidActionEnd.H2.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAccordionSolidActionStartSizeH3() {
        composeTestRule.content {
            AccordionSolidActionStartSizeH3(AccordionSolidActionStart.H3.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAccordionClearActionEndSizeH4() {
        composeTestRule.content {
            AccordionClearActionEndSizeH4(AccordionClearActionEnd.H4.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAccordionClearActionStartSizeH5() {
        composeTestRule.content {
            AccordionClearActionStartSizeH5(AccordionClearActionStart.H5.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }

    @Test
    fun testAccordionSolidActionEndSizeLLongText() {
        composeTestRule.content {
            AccordionSolidActionEndSizeLLongText(AccordionSolidActionEnd.L.style())
        }
        composeTestRule
            .onAllNodesWithTag("Accordion", useUnmergedTree = true)[0]
            .performClick()
        composeTestRule.waitForIdle()
    }
}
