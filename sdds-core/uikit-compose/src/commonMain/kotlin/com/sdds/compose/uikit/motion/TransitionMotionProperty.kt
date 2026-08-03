package com.sdds.compose.uikit.motion

import androidx.compose.animation.core.snap
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

/**
 * Motion-свойство, которое анимирует изменение значения через Compose [androidx.compose.animation.core.Transition].
 */
@Immutable
interface TransitionMotionProperty<T> : MotionProperty<T> {
    /**
     * Возвращает сегмент, подходящий для переданного снимка состояний.
     */
    fun resolve(stateSnapshot: MotionStateSnapshot): TransitionSegment<T>
}

/**
 * Создаёт transition-свойство.
 *
 * Внутри [configure] можно описать один или несколько сегментов с разными условиями
 * и `animationSpec`. Если ни один сегмент не подошёл, используется `snap()`.
 *
 * @param label метка свойства для отладки.
 * @param configure конфигурация сегментов transition-свойства.
 */
fun <T> transition(
    label: String? = null,
    configure: TransitionMotionPropertyScope<T>.() -> Unit = {},
): TransitionMotionProperty<T> {
    return TransitionMotionPropertyImpl<T>(label)
        .apply { configure() }
}

/**
 * Scope для описания [TransitionMotionProperty].
 */
interface TransitionMotionPropertyScope<T> {
    /**
     * Начинает описание сегмента transition-свойства.
     */
    fun segment(
        configure: TransitionSegmentBuilderScope.() -> Unit,
    ): TransitionSegmentBuilder<T>

    /**
     * Завершает описание сегмента и связывает его с transition-спецификацией.
     */
    infix fun TransitionSegmentBuilder<T>.changesWith(
        spec: () -> MotionTransitionSpec<T>,
    ): TransitionSegment<T>
}

@Stable
private class TransitionMotionPropertyImpl<T>(
    override val label: String?,
) : TransitionMotionProperty<T>, TransitionMotionPropertyScope<T> {

    private var defaultSpecBuilder = { finite(snap()) }
    private var defaultSegment: TransitionSegment<T>? = null
    private val segments: MutableList<TransitionSegment<T>> = mutableListOf()

    override val isEmpty: Boolean
        get() = segments.isEmpty()

    override fun segment(configure: TransitionSegmentBuilderScope.() -> Unit): TransitionSegmentBuilder<T> {
        val builder = TransitionSegmentBuilder.instance<T>()
        builder.configure()
        return builder
    }

    override fun TransitionSegmentBuilder<T>.changesWith(spec: () -> MotionTransitionSpec<T>): TransitionSegment<T> {
        return build(spec).also {
            segments.add(it)
        }
    }

    override fun resolve(stateSnapshot: MotionStateSnapshot): TransitionSegment<T> {
        return segments
            .asSequence()
            // Проверяем подходит ли сегмент под заданный переход состояния
            .find { segment -> segment.condition.matches(stateSnapshot) }
            ?: getOrCreateDefaultSegment()
    }

    private fun getOrCreateDefaultSegment(): TransitionSegment<T> {
        return defaultSegment ?: segment { }.build(defaultSpecBuilder).also {
            defaultSegment = it
        }
    }

    override fun toString(): String {
        return segments.toString()
    }
}
