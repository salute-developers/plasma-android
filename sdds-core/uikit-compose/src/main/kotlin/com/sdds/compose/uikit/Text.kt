package com.sdds.compose.uikit

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow

/**
 * Текст
 *
 * @param text текст
 * @param modifier модификатор текста
 * @param style стиль текста
 * @param onTextLayout колбэк, сообщающий о том, что новый лэйаут текста расчитан
 * @param overflow режим переполнения текста
 * @param softWrap должен ли текст разрываться при мягких разрывах строк
 * @param maxLines максимальное количество строк
 */
@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle.Default,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
) {
    BasicText(
        text = text,
        modifier = modifier,
        style = style,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
    )
}
