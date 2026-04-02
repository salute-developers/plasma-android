package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.uikit.components.counter.CounterMotionStyle
import com.sdds.compose.uikit.components.counter.LocalCounterMotionStyle
import com.sdds.compose.uikit.components.counter.rememberCounterMotion
import com.sdds.compose.uikit.internal.common.backgroundFillColor
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент Counter
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param count текст [AnnotatedString]
 * @param interactionSource источник взаимодействий
 */
@Composable
@NonRestartableComposable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    count: AnnotatedString = AnnotatedString(""),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Counter(
        modifier = modifier,
        style = style,
        interactionSource = interactionSource,
    ) {
        Text(count)
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
@NonRestartableComposable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    count: String = "",
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Counter(
        count = AnnotatedString(count),
        modifier = modifier,
        style = style,
        interactionSource = interactionSource,
    )
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
@NonRestartableComposable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: (@Composable () -> Unit)? = null,
) {
   Counter(
       modifier = modifier,
       style = style,
       motion = rememberMotion(LocalCounterMotionStyle.current, rememberMotionContext(interactionSource)),
       content = { content?.invoke() }
   )
}

/**
 * Компонент Counter
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param motion источник взаимодействий
 * @param content контент
 */
@Composable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    motion: Motion<CounterMotionStyle> = rememberCounterMotion(),
    content: @Composable () -> Unit,
) {
    val backgroundColor = style.colors.backgroundColor.colorForInteractionAsState(
        motion.context, motion.style.backgroundColor
    )
    Box(
        modifier = modifier
            .heightIn(min = style.dimensions.minHeight)
            .widthIn(min = style.dimensions.minWidth)
            .backgroundFillColor(
                colorProducer = { backgroundColor.value },
                shape = style.shape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            ),
        contentAlignment = Alignment.Center,
    ) {
        ProvideTextBehaviour(TextBehaviour(maxLines = 1)) {
            val textColor = style.colors.textColor.colorForInteractionAsState(
                motion.context, motion.style.textColor
            )
            ProvideTextStyle(style.textStyle, color = { textColor.value }) {
                content()
            }
        }
    }
}
