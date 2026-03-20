package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
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
import com.sdds.compose.uikit.FormItem
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.PopoverAlignment
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.TriggerInfo
import com.sdds.icons.R

/**
 * Тест-кейсы для [FormItem]
 */

/**
 * PLASMA-T2523, PLASMA-T2525
 */
@Composable
fun FormItemHasCaptionTitleTitleCaption(style: FormItemStyle) {
    FormItemCommon(
        style = style,
    )
}

/**
 * PLASMA-T2524
 */
@Composable
fun FormItemNoHintNoTitleCapNoCounter(style: FormItemStyle) {
    FormItemCommon(
        style = style,
        hasHint = false,
        counter = null,
        titleCaption = null,
    )
}

/**
 * PLASMA-T2526
 */
@Composable
fun FormItemNoCaptionCounter(style: FormItemStyle) {
    FormItemCommon(
        style = style,
        caption = captionContent(null, hasIcon = true),
        counter = null,
    )
}

/**
 * PLASMA-T2527
 */
@Composable
fun FormItemLongText(style: FormItemStyle) {
    Box {
        FormItemCommon(
            modifier = Modifier.padding(start = 16.dp),
            style = style,
            title = textContent("Title text for testing long title in form component"),
            caption = captionContent("Caption", hasIcon = false),
        )
    }
}

/**
 * PLASMA-T2528
 */
@Composable
fun FormItemNoHintNoCounterLongTitleCaption(style: FormItemStyle) {
    FormItemCommon(
        style = style,
        hasHint = false,
        counter = null,
        titleCaption = textContent("Title caption for testing long text"),
    )
}

/**
 * PLASMA-T2529
 */
@Composable
fun FormItemLongContent(style: FormItemStyle) {
    FormItemCommon(
        style = style,
        content = { Text(LONG_CONTENT) },
        titleCaption = null,
        counter = null,
    )
}

/**
 * PLASMA-T2530, PLASMA-T2531
 */
@Composable
fun FormItemNoHintNoTitleCaption(style: FormItemStyle) {
    FormItemCommon(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        style = style,
        hasHint = false,
        titleCaption = null,
    )
}

/**
 * PLASMA-T2532
 */
@Composable
fun FormItemDisabled(style: FormItemStyle) {
    FormItemCommon(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        style = style,
        enabled = false,
        titleCaption = null,
        hasHint = false,
        counter = null,
    )
}

/**
 * PLASMA-T2548
 */
@Composable
fun FormItemTapHasHint(style: FormItemStyle) {
    Box(modifier = Modifier.fillMaxSize()) {
        val hintTriggerInfo = remember { mutableStateOf(TriggerInfo()) }
        var showTooltip by remember { mutableStateOf(false) }
        FormItemCommon(
            modifier = Modifier.align(Alignment.Center),
            style = style,
            hintTriggerInfo = hintTriggerInfo,
            onHintPressed = { showTooltip = true },
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
private fun FormItemCommon(
    modifier: Modifier = Modifier,
    style: FormItemStyle,
    content: @Composable () -> Unit = { Text("Form item text content\nSecond line text") },
    title: (@Composable () -> Unit)? = textContent("Title"),
    optional: (@Composable () -> Unit)? = textContent("Optional"),
    titleCaption: (@Composable () -> Unit)? = textContent("TitleCaption"),
    caption: (@Composable () -> Unit)? = captionContent("Caption"),
    counter: (@Composable () -> Unit)? = textContent("Counter"),
    hasHint: Boolean = true,
    enabled: Boolean = true,
    hintTriggerInfo: MutableState<TriggerInfo> = remember { mutableStateOf(TriggerInfo()) },
    onHintPressed: (() -> Unit)? = null,
) {
    FormItem(
        modifier = modifier,
        style = style,
        content = content,
        title = title,
        optional = optional,
        titleCaption = titleCaption,
        caption = caption,
        counter = counter,
        hasHint = hasHint,
        enabled = enabled,
        hintTriggerInfo = hintTriggerInfo,
        onHintPressed = onHintPressed,
    )
}

/**
 * Caption content
 */
private fun captionContent(text: String?, hasIcon: Boolean = true): (@Composable () -> Unit)? {
    if (text.isNullOrEmpty() && !hasIcon) return null
    return {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            if (hasIcon) {
                Icon(
                    modifier = Modifier.height(14.dp),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(R.drawable.ic_shazam_16),
                    contentDescription = "",
                )
            }
            if (!text.isNullOrEmpty()) {
                Text(text)
            }
        }
    }
}

/**
 * Text content
 */
private fun textContent(text: String): (@Composable () -> Unit)? {
    return if (text.isEmpty()) {
        null
    } else {
        @Composable { Text(text) }
    }
}

private const val LONG_CONTENT =
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. "
