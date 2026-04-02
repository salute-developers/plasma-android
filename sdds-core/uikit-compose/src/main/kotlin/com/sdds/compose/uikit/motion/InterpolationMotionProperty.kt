package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
interface InterpolationMotionProperty<T>: MotionProperty<T> {

    fun resolve(stateSnapshot: MotionStateSnapshot): InterpolationSegment<T>
}

fun <T> interpolation(
    label: String? = null,
    configure: InterpolationMotionPropertyScope<T>.() -> Unit = {},
): InterpolationMotionProperty<T> {
    return InterpolationMotionPropertyImpl<T>(label)
        .apply { configure() }
}

interface InterpolationMotionPropertyScope<T> {

    fun segment(
        configure: InterpolationSegmentBuilderScope.() -> Unit
    ): InterpolationSegmentBuilder<T>

    infix fun InterpolationSegmentBuilder<T>.interpolatesBy(
        spec: () -> ValueInterpolator<T>
    ): InterpolationSegment<T>
}

@Stable
private class InterpolationMotionPropertyImpl<T>(
    override val label: String?
) : InterpolationMotionProperty<T>, InterpolationMotionPropertyScope<T> {

    private var defaultSpecBuilder = { NoInterpolation<T>() }
    private var defaultSegment: InterpolationSegment<T>? = null
    private val segments: MutableList<InterpolationSegment<T>> = mutableListOf()

    override val isEmpty: Boolean
        get() = segments.isEmpty()

    override fun segment(configure: InterpolationSegmentBuilderScope.() -> Unit): InterpolationSegmentBuilder<T> {
        val builder = InterpolationSegmentBuilder.instance<T>()
        builder.configure()
        return builder
    }

    override fun InterpolationSegmentBuilder<T>.interpolatesBy(spec: () -> ValueInterpolator<T>): InterpolationSegment<T> {
        return build { interpolationSpec(spec()) }.also {
            segments.add(it)
        }
    }

    override fun resolve(stateSnapshot: MotionStateSnapshot): InterpolationSegment<T> {
        return segments
            .asSequence()
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
