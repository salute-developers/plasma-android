package com.sdds.compose.uikit.fixtures.samples.formitem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.FormHorizontal
import com.sdds.compose.uikit.FormIndicatorAlignment
import com.sdds.compose.uikit.FormItem
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.FormTextAlignment
import com.sdds.compose.uikit.FormTitlePlacement
import com.sdds.compose.uikit.FormType
import com.sdds.compose.uikit.FormVertical
import com.sdds.compose.uikit.IndicatorMode
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun FormItem_Simple() {
    composableCodeSnippet {
        FormItem(
            content = { Text("Form Item Content") },
            title = { Text("Title") },
            titleCaption = { Text("TitleCaption") },
            caption = { Text("Caption") },
            counter = { Text("Counter") },
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun FormItem_WithHint() {
    composableCodeSnippet {
        val hintTriggerInfo = remember { mutableStateOf(TriggerInfo()) }
        var showTooltip by remember { mutableStateOf(false) }
        FormItem(
            content = { Text("Form Item Content") },
            title = { Text("Title") },
            titleCaption = { Text("TitleCaption") },
            caption = { Text("Caption") },
            counter = { Text("Counter") },
            hasHint = true,
            onHintPressed = { showTooltip = true },
            hintTriggerInfo = hintTriggerInfo,
        )

        Tooltip(
            show = showTooltip,
            onDismissRequest = { showTooltip = false },
            triggerInfo = { hintTriggerInfo.value },
            text = AnnotatedString("Tooltip text"),
            alignment = PopoverAlignment.Center,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun FormVertical_Simple() {
    composableCodeSnippet {
        FormVertical {
            repeat(3) {
                FormItem(
                    content = { Text("Form Item Content $it") },
                    title = { Text("Title $it") },
                    titleCaption = { Text("TitleCaption $it") },
                    caption = { Text("Caption $it") },
                    counter = { Text("Counter $it") },
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun FormHorizontal_Simple() {
    composableCodeSnippet {
        FormHorizontal {
            repeat(3) {
                FormItem(
                    content = { Text("Form Item Content $it") },
                    title = { Text("Title $it") },
                    titleCaption = { Text("TitleCaption $it") },
                    caption = { Text("Caption $it") },
                    counter = { Text("Counter $it") },
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun FormItem_Style() {
    composableCodeSnippet {
        FormItemStyle.builder()
            .hintIcon(com.sdds.icons.R.drawable.ic_info_circle_outline_16)
            .captionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .titleCaptionStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .counterStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .optionalStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .titlePlacement(FormTitlePlacement.Top)
            .topTextAlignment(FormTextAlignment.Edge)
            .bottomTextAlignment(FormTextAlignment.Edge)
            .indicatorAlignment(FormIndicatorAlignment.TopStart)
            .indicatorAlignmentMode(IndicatorMode.Inner)
            .formItemType(FormType.Required)
            .colors {
                hintColor(placeholder(Color.Gray, "/** Токен цвета */").asInteractive())
                optionalColor(placeholder(Color.Gray, "/** Токен цвета */").asInteractive())
                titleCaptionColor(placeholder(Color.Gray, "/** Токен цвета */").asInteractive())
                titleColor(placeholder(Color.DarkGray, "/** Токен цвета */").asInteractive())
                counterColor(placeholder(Color.Gray, "/** Токен цвета */").asInteractive())
                captionColor(placeholder(Color.Gray, "/** Токен цвета */").asInteractive())
            }
            .dimensions {
                titleBlockWidth(140.0.dp)
                indicatorOffsetX(4.0.dp)
                indicatorOffsetX(0.0.dp)
                titleBlockSpacing(4.0.dp)
                titleBlockPadding(8.0.dp)
                titleCaptionPadding(4.0.dp)
                captionPadding(5.0.dp)
                counterPadding(5.0.dp)
                hintHeight(14.0.dp)
                hintWidth(16.0.dp)
            }
            .style()
    }
}
