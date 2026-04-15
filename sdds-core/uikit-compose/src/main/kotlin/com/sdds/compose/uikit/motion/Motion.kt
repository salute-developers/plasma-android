package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember

/**
 * Контейнер, объединяющий [MotionStyle] и [MotionContext].
 *
 * Используется как точка входа в Motion API на уровне компонента: стиль описывает
 * доступные motion-свойства, а контекст предоставляет текущее состояние и каналы анимации.
 */
interface Motion<S : MotionStyle> {
    /**
     * Контекст, в котором вычисляются состояния и запускаются анимации.
     */
    val context: MotionContext

    /**
     * Набор motion-свойств компонента.
     */
    val style: S
}

/**
 * Запоминает экземпляр [Motion] для переданного [style] и [context].
 *
 * Обычно вызывается внутри composable-компонента один раз, после чего значения из
 * [Motion.style] применяются к нужным `StatefulValue` через `get*AsState`.
 *
 * @param style motion-стиль компонента.
 * @param context контекст motion, управляющий каналами анимации и текущим снимком состояний.
 */
@Composable
fun <S : MotionStyle> rememberMotion(
    style: S,
    context: MotionContext = rememberMotionContext(),
): Motion<S> {
    return remember(style, context) { MotionImpl(context, style) }
}

@Immutable
private class MotionImpl<S : MotionStyle>(
    override val context: MotionContext,
    override val style: S,
) : Motion<S>
