package com.sdds.compose.uikit.fixtures.stories.form

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.FormItem
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.FormItemUiStatePropertiesProducer
import com.sdds.sandbox.FormItemUiStateTransformer
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState

@StoryUiState
data class FormItemUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val content: String = "Form item text content.\nSecond line text.",
    val title: String = "Title",
    val titleCaption: String = "",
    val caption: String = "Caption",
    val counter: String = "",
    val optional: String = "Optional",
    val hasHint: Boolean = false,
    val hasCaptionIcon: Boolean = true,
    val enabled: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object FormItemStory : ComposeBaseStory<FormItemUiState, FormItemStyle>(
    ComponentKey.FormItem,
    FormItemUiState(),
    FormItemUiStatePropertiesProducer,
    FormItemUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: FormItemStyle,
        state: FormItemUiState,
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            val hintTriggerInfo = remember { mutableStateOf(TriggerInfo()) }
            var showTooltip by remember { mutableStateOf(false) }
            FormItem(
                modifier = Modifier,
                style = style,
                content = getContent(state.content),
                title = getContentOrNull(state.title),
                optional = getContentOrNull(state.optional),
                titleCaption = getContentOrNull(state.titleCaption),
                caption = getIconTextOrNull(
                    state.caption,
                    state.hasCaptionIcon,
                ),
                counter = getContentOrNull(state.counter),
                hasHint = state.hasHint,

                onHintPressed = { showTooltip = true },
                hintTriggerInfo = hintTriggerInfo,
                enabled = state.enabled,
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
    override fun Preview(
        style: FormItemStyle,
        key: ComponentKey,
    ) {
        FormItem(
            style = style,
            content = getContent("Form Item Content"),
            title = getContentOrNull("Title"),
            titleCaption = getContentOrNull("TitleCaption"),
            caption = getIconTextOrNull("Caption", true),
            counter = getContentOrNull("Counter"),
        )
    }
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
