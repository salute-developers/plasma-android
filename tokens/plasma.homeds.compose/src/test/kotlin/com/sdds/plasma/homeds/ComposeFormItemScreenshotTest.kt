package com.sdds.plasma.homeds

import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.formitem.Default
import com.sdds.plasma.homeds.styles.formitem.FormItem
import com.sdds.plasma.homeds.styles.formitem.Negative
import com.sdds.plasma.homeds.styles.formitem.Positive
import com.sdds.plasma.homeds.styles.formitem.Warning
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
    fun testFormItemDefault() {
        composeTestRule.content {
            FormItemHasCaptionTitleTitleCaption(FormItem.Default.style())
        }
    }

    @Test
    fun testFormItemPositive() {
        composeTestRule.content {
            FormItemNoHintNoTitleCapNoCounter(FormItem.Positive.style())
        }
    }

    @Test
    fun testFormItemNegative() {
        composeTestRule.content {
            FormItemHasCaptionTitleTitleCaption(FormItem.Negative.style())
        }
    }

    @Test
    fun testFormItemWarning() {
        composeTestRule.content {
            FormItemNoCaptionCounter(FormItem.Warning.style())
        }
    }

    @Test
    fun testFormItemNoCaptionIcon() {
        composeTestRule.content {
            FormItemLongText(FormItem.Default.style())
        }
    }

    @Test
    fun testFormItemPositiveLongTitleCaption() {
        composeTestRule.content {
            FormItemNoHintNoCounterLongTitleCaption(FormItem.Positive.style())
        }
    }

    @Test
    fun testFormItemLongContent() {
        composeTestRule.content {
            FormItemLongContent(FormItem.Negative.style())
        }
    }

    @Test
    fun testFormItemNoHintNoTitleCaption() {
        composeTestRule.content {
            FormItemNoHintNoTitleCaption(FormItem.Warning.style())
        }
    }

    @Test
    fun testFormItemDefaultNoHintNoTitleCaption() {
        composeTestRule.content {
            FormItemNoHintNoTitleCaption(FormItem.Default.style())
        }
    }

    @Test
    fun testFormItemDisabled() {
        composeTestRule.content {
            FormItemDisabled(FormItem.Positive.style())
        }
    }

    @Test
    fun testFormItemTapHasHint() {
        composeTestRule.content {
            FormItemTapHasHint(FormItem.Default.style())
        }
        composeTestRule.onNodeWithContentDescription("Hint", useUnmergedTree = true).performClick()
        composeTestRule.waitForIdle()
    }
}
