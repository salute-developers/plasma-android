package com.sdds.serv

import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
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
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.form.FormItemDisabled
import com.sdds.testing.compose.form.FormItemHasCaptionTitleTitleCaption
import com.sdds.testing.compose.form.FormItemLongContent
import com.sdds.testing.compose.form.FormItemLongText
import com.sdds.testing.compose.form.FormItemNoCaptionCounter
import com.sdds.testing.compose.form.FormItemNoHintNoCounterLongTitleCaption
import com.sdds.testing.compose.form.FormItemNoHintNoTitleCapNoCounter
import com.sdds.testing.compose.form.FormItemNoHintNoTitleCaption
import com.sdds.testing.compose.form.FormItemTapHasHint
import com.sdds.testing.vs.SDK_NUMBER
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
