package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Immutable

/**
 * Сегмент [InterpolationMotionProperty].
 *
 * Помимо спецификации и условия содержит ключ канала интерполяции и вектор,
 * определяющий начальную и конечную точки интерполяции.
 */
interface InterpolationSegment<T> : MotionSegment<T, MotionInterpolationSpec<T>> {
    /**
     * Ключ канала, из которого будет получен прогресс интерполяции.
     */
    val channelKey: MotionChannelKey

    /**
     * Провайдер вектора интерполяции.
     */
    val vector: InterpolationVectorProvider
}

/**
 * Scope для настройки сегмента interpolation-свойства.
 */
interface InterpolationSegmentBuilderScope : MotionSegmentBuilderScope {
    /**
     * Устанавливает ключ канала интерполяции.
     */
    fun channel(channelKey: MotionChannelKey)

    /**
     * Устанавливает провайдер вектора интерполяции.
     */
    fun vector(vector: InterpolationVectorProvider)
}

/**
 * Билдер сегмента [InterpolationMotionProperty].
 */
interface InterpolationSegmentBuilder<T> : InterpolationSegmentBuilderScope {
    /**
     * Собирает сегмент с указанной interpolation-спецификацией.
     */
    fun build(spec: () -> MotionInterpolationSpec<T>): InterpolationSegment<T>

    companion object {
        internal fun <T> instance(): InterpolationSegmentBuilder<T> =
            InterpolationSegmentBuilderImpl()
    }
}

@Immutable
private class InterpolationSegmentImpl<T>(
    override val spec: () -> MotionInterpolationSpec<T>,
    override val channelKey: MotionChannelKey,
    override val condition: MotionSegmentCondition,
    override val vector: InterpolationVectorProvider,
) : InterpolationSegment<T>

private class InterpolationSegmentBuilderImpl<T> : InterpolationSegmentBuilder<T> {
    var channelKey: MotionChannelKey = DefaultInterpolationChannelKey
    var condition: MotionSegmentCondition = MotionSegmentCondition { true }
    var vector: InterpolationVectorProvider = InterpolationVectorProvider { it.defaultVector() }

    override fun channel(channelKey: MotionChannelKey) {
        this.channelKey = channelKey
    }

    override fun vector(vector: InterpolationVectorProvider) {
        this.vector = vector
    }

    override fun condition(condition: MotionSegmentCondition) {
        this.condition = condition
    }

    override fun build(spec: () -> MotionInterpolationSpec<T>): InterpolationSegment<T> {
        return InterpolationSegmentImpl(
            condition = condition,
            spec = spec,
            channelKey = channelKey,
            vector = vector,
        )
    }
}
