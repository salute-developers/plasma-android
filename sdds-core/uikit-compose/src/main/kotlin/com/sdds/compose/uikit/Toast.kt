package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.icontext.BaseIconText

/**
 * Компонент Toast
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param text текст
 * @param contentStart контент в начале
 * @param contentEnd контент в конце
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Toast(
    modifier: Modifier = Modifier,
    style: ToastStyle = LocalToastStyle.current,
    text: String = "Toast",
    contentStart: (@Composable () -> Unit)? = null,
    contentEnd: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    if (text.isEmpty() && contentStart == null && contentEnd == null) return
    val textStyle = style.textStyle
    val shape = style.shape
    val dimensions = style.dimensions
    val colors = style.colors

    BaseIconText(
        modifier = modifier
            .background(
                brush = colors.backgroundColor.getValue(interactionSource),
                shape = shape,
            )
            .padding(top = dimensions.paddingTop, bottom = dimensions.paddingBottom),
        labelContent = text,
        labelStyle = textStyle,
        dimensionsSet = BaseIconText.Dimensions(
            startContentSize = dimensions.contentStartSize,
            endContentSize = dimensions.contentEndSize,
            startContentMargin = dimensions.contentStartPadding,
            endContentMargin = dimensions.contentEndPadding,
            startPadding = dimensions.paddingStart,
            endPadding = dimensions.paddingEnd,
        ),
        colorsSet = BaseIconText.Colors(
            labelColor = colors.textColor,
            startContentColor = colors.contentStartColor,
            endContentColor = colors.contentEndColor,
        ),
        startContent = contentStart,
        endContent = contentEnd,
        interactionSource = interactionSource,
    )
}

@Composable
@Preview(showBackground = true)
private fun ToastPreview() {
    Toast(text = "Toast text")
}
