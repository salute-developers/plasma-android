package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource

/**
 * Контейнер, объединяющий [MotionStyle] и [MotionContext].
 *
 * Используется как точка входа в Motion API на уровне компонента: стиль описывает
 * доступные motion-свойства, а контекст предоставляет текущее состояние и каналы анимации.
 */
interface Motion<out S : MotionStyle> {
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

/**
 * Создаёт и запоминает копию данного [Motion] с другим источником семантических состояний.
 *
 * [Motion.style] сохраняется без изменений, а [Motion.context] заменяется на производный
 * от текущего контекста (см. [MotionContext.rememberWithSemanticStateSource]):
 * интеракции и каналы анимации общие, семантические состояния — свои.
 *
 * @param semanticStateSource источник семантических состояний производного контекста.
 */
@Composable
fun <S : MotionStyle> Motion<S>.rememberWithSemanticStateSource(
    semanticStateSource: MutableSemanticStateSource,
): Motion<S> = rememberMotion(
    style = style,
    context = context.rememberWithSemanticStateSource(semanticStateSource),
)

@Immutable
private class MotionImpl<S : MotionStyle>(
    override val context: MotionContext,
    override val style: S,
) : Motion<S>
