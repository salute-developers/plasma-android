package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

/**
 * Motion-свойство, которое вычисляет промежуточное значение по внешнему каналу интерполяции.
 */
@Immutable
interface InterpolationMotionProperty<T> : MotionProperty<T> {
    /**
     * Возвращает сегмент, подходящий для переданного снимка состояний.
     */
    fun resolve(stateSnapshot: MotionStateSnapshot): InterpolationSegment<T>
}

/**
 * Создаёт interpolation-свойство.
 *
 * В отличие от [transition], это свойство не запускает анимацию самостоятельно, а
 * использует `fraction` из канала интерполяции, зарегистрированного в [MotionContext].
 *
 * @param channelKey ключ канала интерполяции по умолчанию для сегментов свойства.
 * @param label метка свойства для отладки.
 * @param configure конфигурация сегментов interpolation-свойства.
 */
fun <T> interpolation(
    channelKey: MotionChannelKey? = null,
    label: String? = null,
    configure: InterpolationMotionPropertyScope<T>.() -> Unit = {},
): InterpolationMotionProperty<T> {
    return InterpolationMotionPropertyImpl<T>(channelKey, label)
        .apply { configure() }
}

/**
 * Scope для описания [InterpolationMotionProperty].
 */
interface InterpolationMotionPropertyScope<T> {
    /**
     * Начинает описание сегмента interpolation-свойства.
     */
    fun segment(
        configure: InterpolationSegmentBuilderScope.() -> Unit,
    ): InterpolationSegmentBuilder<T>

    /**
     * Завершает описание сегмента и связывает его с evaluator.
     */
    infix fun InterpolationSegmentBuilder<T>.evaluatesBy(
        spec: () -> MotionEvaluator<T>,
    ): InterpolationSegment<T>
}

@Stable
private class InterpolationMotionPropertyImpl<T>(
    private val channelKey: MotionChannelKey?,
    override val label: String?,
) : InterpolationMotionProperty<T>, InterpolationMotionPropertyScope<T> {

    private var defaultSpecBuilder = { NoInterpolation<T>() }
    private var defaultSegment: InterpolationSegment<T>? = null
    private val segments: MutableList<InterpolationSegment<T>> = mutableListOf()

    override val isEmpty: Boolean
        get() = segments.isEmpty()

    override fun segment(configure: InterpolationSegmentBuilderScope.() -> Unit): InterpolationSegmentBuilder<T> {
        val builder = InterpolationSegmentBuilder.instance<T>()
        if (channelKey != null) builder.channel(channelKey)
        builder.configure()
        return builder
    }

    override fun InterpolationSegmentBuilder<T>.evaluatesBy(spec: () -> MotionEvaluator<T>): InterpolationSegment<T> {
        return build { interpolationSpec(spec()) }.also {
            segments.add(it)
        }
    }

    override fun resolve(stateSnapshot: MotionStateSnapshot): InterpolationSegment<T> {
        return segments
            // Проверяем подходит ли сегмент под заданный переход состояния
            .find { segment -> segment.condition.matches(stateSnapshot) }
            ?: getOrCreateDefaultSegment()
    }

    private fun getOrCreateDefaultSegment(): InterpolationSegment<T> {
        return defaultSegment ?: segment { }.build(defaultSpecBuilder).also {
            defaultSegment = it
        }
    }

    override fun toString(): String {
        return segments.toString()
    }
}
