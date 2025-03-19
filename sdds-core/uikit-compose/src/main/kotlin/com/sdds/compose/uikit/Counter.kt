package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.uikit.internal.common.StyledText

/**
 * Компонент Counter
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param count текст [AnnotatedString]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    count: AnnotatedString = AnnotatedString(""),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    val textColor = style.colors.textColor.colorForInteraction(interactionSource)
    Box(
        modifier = modifier
            .heightIn(min = style.dimensions.minHeight)
            .widthIn(min = style.dimensions.minWidth)
            .background(
                color = backgroundColor,
                shape = style.shape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            ),
        contentAlignment = Alignment.Center,
    ) {
        StyledText(
            text = count,
            textColor = textColor,
            textStyle = style.textStyle,
            maxLines = 1,
        )
    }
}

/**
 * Компонент Counter
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param count текст [String]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    count: String = "",
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    val textColor = style.colors.textColor.colorForInteraction(interactionSource)
    Box(
        modifier = modifier
            .heightIn(min = style.dimensions.minHeight)
            .widthIn(min = style.dimensions.minWidth)
            .background(
                color = backgroundColor,
                shape = style.shape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            ),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = count,
            style = style.textStyle.copy(color = textColor),
            maxLines = 1,
        )
    }
}

/**
 * Компонент Counter
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param content контент
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit)? = null,
) {
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    Box(
        modifier = modifier
            .heightIn(min = style.dimensions.minHeight)
            .widthIn(min = style.dimensions.minWidth)
            .background(
                color = backgroundColor,
                shape = style.shape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            ),
        contentAlignment = Alignment.Center,
    ) {
        content?.invoke()
    }
}
