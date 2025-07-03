package com.sdds.serv

import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.accordion.AccordionClearActionEnd
import com.sdds.serv.styles.accordion.AccordionClearActionStart
import com.sdds.serv.styles.accordion.AccordionSolidActionEnd
import com.sdds.serv.styles.accordion.AccordionSolidActionStart
import com.sdds.serv.styles.accordion.H2
import com.sdds.serv.styles.accordion.H3
import com.sdds.serv.styles.accordion.H4
import com.sdds.serv.styles.accordion.H5
import com.sdds.serv.styles.accordion.L
import com.sdds.serv.styles.accordion.M
import com.sdds.serv.styles.accordion.S
import com.sdds.serv.styles.accordion.Xs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.accordion.AccordionClearActionEndSizeH4
import com.sdds.testing.compose.accordion.AccordionClearActionEndSizeSDivider
import com.sdds.testing.compose.accordion.AccordionClearActionStartSizeH2AmountTen
import com.sdds.testing.compose.accordion.AccordionClearActionStartSizeH5
import com.sdds.testing.compose.accordion.AccordionClearActionStartSizeXs
import com.sdds.testing.compose.accordion.AccordionSolidActionEndSizeH2
import com.sdds.testing.compose.accordion.AccordionSolidActionEndSizeL
import com.sdds.testing.compose.accordion.AccordionSolidActionEndSizeLAmountTen
import com.sdds.testing.compose.accordion.AccordionSolidActionEndSizeLNoTextNoContent
import com.sdds.testing.compose.accordion.AccordionSolidActionStartAmountTenSizeM
import com.sdds.testing.compose.accordion.AccordionSolidActionStartSizeH3
import com.sdds.testing.vs.SDK_NUMBER
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
}
