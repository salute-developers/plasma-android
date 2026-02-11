package com.sdds.playground.sandbox.form

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.FormIndicatorAlignment
import com.sdds.compose.uikit.FormItem
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.FormTitlePlacement
import com.sdds.compose.uikit.FormType
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IndicatorMode
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.icons.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.theme.SddsServTheme

/**
 * Экран с компонентом [FormItem]
 */
@Composable
internal fun FormItemScreen(componentKey: ComponentKey = ComponentKey.FormItem) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<FormItemViewModel>(
            factory = FormItemViewModelFactory(
                defaultState = FormItemUiState(),
                componentKey = componentKey,
            ),
            key = componentKey.toString(),
        ),
        component = { formItemUiState, style ->
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                val hintTriggerInfo = remember { mutableStateOf(TriggerInfo()) }
                var showTooltip by remember { mutableStateOf(false) }
                FormItem(
                    modifier = Modifier,
                    style = style,
                    content = getContent(formItemUiState.content),
                    title = getContentOrNull(formItemUiState.title),
                    optional = getContentOrNull(formItemUiState.optional),
                    titleCaption = getContentOrNull(formItemUiState.titleCaption),
                    caption = getIconTextOrNull(
                        formItemUiState.caption,
                        formItemUiState.hasCaptionIcon,
                    ),
                    counter = getContentOrNull(formItemUiState.counter),
                    hasHint = formItemUiState.hasHint,

                    onHintPressed = { showTooltip = true },
                    hintTriggerInfo = hintTriggerInfo,
                    enabled = formItemUiState.enabled,
                    bottomTextAlignment = formItemUiState.bottomTextAlignment,
                )

                Tooltip(
                    show = showTooltip,
                    onDismissRequest = { showTooltip = false },
                    triggerInfo = { hintTriggerInfo.value },
                    text = AnnotatedString("Tooltip text"),
                    alignment = PopoverAlignment.Center,
                )
            }
        },
    )
}

@Composable
internal fun FormItemPreview(style: FormItemStyle) {
    FormItem(
        style = style,
        content = getContent("Form Item Content"),
        title = getContentOrNull("Title"),
        titleCaption = getContentOrNull("TitleCaption"),
        caption = getIconTextOrNull("Caption", true),
        counter = getContentOrNull("Counter"),
    )
}

@Composable
private fun getContentOrNull(content: String): (@Composable () -> Unit)? {
    return if (content.isNotEmpty()) {
        getContent(content)
    } else {
        null
    }
}

@Composable
private fun getContent(text: String): (@Composable () -> Unit) {
    return { Text(text = text) }
}

@Composable
private fun getIconTextOrNull(text: String, hasIcon: Boolean): (@Composable () -> Unit)? {
    return if (text.isNotEmpty() || hasIcon) {
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                if (hasIcon) {
                    Icon(
                        modifier = Modifier.height(14.dp),
                        contentScale = ContentScale.Crop,
                        painter = painterResource(com.sdds.icons.R.drawable.ic_shazam_16),
                        contentDescription = "",
                    )
                }
                Text(text = text)
            }
        }
    } else {
        null
    }
}

@Composable
@Preview(showBackground = true)
private fun FormItemPreviewCustom() {
    SandboxTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            val hintInfo = remember { mutableStateOf(TriggerInfo()) }
            var showTooltip by remember { mutableStateOf(false) }
            FormItem(
                style = FormItemStyle.builder()
                    .titlePlacement(FormTitlePlacement.Start)
                    .hintIcon(R.drawable.ic_info_circle_outline_24)
                    .formItemType(FormType.Optional)
                    .indicatorAlignment(FormIndicatorAlignment.TopEnd)
                    .indicatorAlignmentMode(IndicatorMode.Inner)
                    .indicatorStyle(
                        IndicatorStyle.builder()
                            .color { backgroundColor(Color.Red.asInteractive()) }
                            .style(),
                    )
                    .dimensions {
                        hintWidth(24.dp)
                        hintHeight(20.dp)
                        titleBlockPadding(4.dp)
                    }
                    .colors {
                        hintColor(Color.Gray)
                    }
                    .counterStyle(SddsServTheme.typography.bodyXsNormal)
                    .captionStyle(SddsServTheme.typography.bodyXsNormal)
                    .titleCaptionStyle(SddsServTheme.typography.bodyXsNormal)
                    .optionalStyle(SddsServTheme.typography.bodyXsNormal)
                    .titleStyle(SddsServTheme.typography.bodyXsNormal)
                    .style(),
                title = { Text(text = "title\ntext") },
                titleCaption = { Text("titleCaption") },
                caption = { Text("caption") },
                counter = { Text(text = "counter") },
                content = { Text("Coooonteeeeeeent\ncontent\ncontent") },
                optional = { Text("op") },
                hasHint = true,
                onHintPressed = { showTooltip = true },
                hintTriggerInfo = hintInfo,
            )

            Tooltip(
                show = showTooltip,
                onDismissRequest = { showTooltip = false },
                triggerInfo = { hintInfo.value },
                text = AnnotatedString("Tooltip text"),
                alignment = PopoverAlignment.Center,
            )
        }
    }
}
