package com.sdds.serv

import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.FormItemDisabled
import com.sdds.compose.uikit.fixtures.testcases.FormItemHasCaptionTitleTitleCaption
import com.sdds.compose.uikit.fixtures.testcases.FormItemLongContent
import com.sdds.compose.uikit.fixtures.testcases.FormItemLongText
import com.sdds.compose.uikit.fixtures.testcases.FormItemNoCaptionCounter
import com.sdds.compose.uikit.fixtures.testcases.FormItemNoHintNoCounterLongTitleCaption
import com.sdds.compose.uikit.fixtures.testcases.FormItemNoHintNoTitleCapNoCounter
import com.sdds.compose.uikit.fixtures.testcases.FormItemNoHintNoTitleCaption
import com.sdds.compose.uikit.fixtures.testcases.FormItemTapHasHint
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.formitem.Default
import com.sdds.serv.styles.formitem.FormItem
import com.sdds.serv.styles.formitem.L
import com.sdds.serv.styles.formitem.M
import com.sdds.serv.styles.formitem.Negative
import com.sdds.serv.styles.formitem.Positive
import com.sdds.serv.styles.formitem.RequiredEnd
import com.sdds.serv.styles.formitem.RequiredStart
import com.sdds.serv.styles.formitem.S
import com.sdds.serv.styles.formitem.TitleStart
import com.sdds.serv.styles.formitem.TitleTop
import com.sdds.serv.styles.formitem.Warning
import com.sdds.serv.styles.formitem.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeFormItemScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testFormItemLDefault() {
        composeTestRule.content {
            FormItemHasCaptionTitleTitleCaption(FormItem.L.Default.style())
        }
    }

    @Test
    fun testFormItemMRequiredStartPositive() {
        composeTestRule.content {
            FormItemNoHintNoTitleCapNoCounter(FormItem.M.RequiredStart.Positive.style())
        }
    }

    @Test
    fun testFormItemSRequiredEndNegative() {
        composeTestRule.content {
            FormItemHasCaptionTitleTitleCaption(FormItem.S.RequiredEnd.Negative.style())
        }
    }

    @Test
    fun testFormItemXsTitleTopWarning() {
        composeTestRule.content {
            FormItemNoCaptionCounter(FormItem.Xs.TitleTop.Warning.style())
        }
    }

    @Test
    fun testFormItemLTitleTopRequiredStartLongTitle() {
        composeTestRule.content {
            FormItemLongText(FormItem.L.TitleTop.RequiredStart.Default.style())
        }
    }

    @Test
    fun testFormItemLTitleTopRequiredEndPositiveLongTitleCaption() {
        composeTestRule.content {
            FormItemNoHintNoCounterLongTitleCaption(FormItem.L.TitleTop.RequiredEnd.Positive.style())
        }
    }

    @Test
    fun testFormItemLTitleStartNegativeLongContent() {
        composeTestRule.content {
            FormItemLongContent(FormItem.L.TitleStart.Negative.style())
        }
    }

    @Test
    fun testFormItemLTitleStartRequiredStart() {
        composeTestRule.content {
            FormItemNoHintNoTitleCaption(FormItem.L.TitleStart.RequiredStart.Warning.style())
        }
    }

    @Test
    fun testFormItemLTitleStartRequiredEnd() {
        composeTestRule.content {
            FormItemNoHintNoTitleCaption(FormItem.L.TitleStart.RequiredEnd.Default.style())
        }
    }

    @Test
    fun testFormItemDisabled() {
        composeTestRule.content {
            FormItemDisabled(FormItem.L.TitleStart.RequiredStart.Positive.style())
        }
    }

    @Test
    fun testFormItemTapHasHint() {
        composeTestRule.content {
            FormItemTapHasHint(FormItem.L.Default.style())
        }
        composeTestRule.onNodeWithContentDescription("Hint", useUnmergedTree = true).performClick()
        composeTestRule.waitForIdle()
    }
}
