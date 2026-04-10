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
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.graphics.backgroundColor
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.counter.CounterMotionStyle
import com.sdds.compose.uikit.motion.components.counter.LocalCounterMotionStyle
import com.sdds.compose.uikit.motion.components.counter.rememberCounterMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент Counter
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param count текст [AnnotatedString]
 * @param interactionSource источник взаимодействий
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    count: AnnotatedString = AnnotatedString(""),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CounterMotionStyle> = rememberCounterMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    Counter(
        modifier = modifier,
        style = style,
        motion = motion,
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
 * @param motion объект анимаций
 */
@Composable
@NonRestartableComposable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    count: String = "",
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<CounterMotionStyle> = rememberCounterMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    Counter(
        modifier = modifier,
        style = style,
        motion = motion,
    ) {
        Text(AnnotatedString(count))
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
@NonRestartableComposable
@Deprecated("Use Counter with motion parameter")
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
        content = { content?.invoke() },
    )
}

/**
 * Компонент Counter
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param motion объект анимаций
 * @param content контент
 */
@Composable
fun Counter(
    modifier: Modifier = Modifier,
    style: CounterStyle = LocalCounterStyle.current,
    motion: Motion<CounterMotionStyle> = rememberCounterMotion(),
    content: @Composable () -> Unit,
) {
    val backgroundColor = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundBrush,
    )
    Box(
        modifier = modifier
            .heightIn(min = style.dimensions.minHeight)
            .widthIn(min = style.dimensions.minWidth)
            .backgroundBrush(
                brushProducer = { backgroundColor.value },
                shape = style.shape,
            )
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
            ),
        contentAlignment = Alignment.Center,
    ) {
        ProvideTextBehaviour(TextBehaviour(maxLines = 1)) {
            val textColor = style.colors.textBrush.getBrushAsState(
                motion.context,
                motion.style.textBrush,
            )
            ProvideTextStyle(style.textStyle, brush = { textColor.value }) {
                content()
            }
        }
    }
}
