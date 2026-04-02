package com.sdds.compose.uikit.motion

import androidx.compose.animation.core.snap
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
interface TransitionMotionProperty<T>: MotionProperty<T> {

    fun resolve(stateSnapshot: MotionStateSnapshot): TransitionSegment<T>

}

fun <T> transition(
    label: String? = null,
    configure: TransitionMotionPropertyScope<T>.() -> Unit = {},
): TransitionMotionProperty<T> {
    return TransitionMotionPropertyImpl<T>(label)
        .apply { configure() }
}

interface TransitionMotionPropertyScope<T> {

    fun segment(
        configure: TransitionSegmentBuilderScope.() -> Unit
    ): TransitionSegmentBuilder<T>

    infix fun TransitionSegmentBuilder<T>.changesWith(
        spec: () -> MotionTransitionSpec<T>
    ): TransitionSegment<T>
}

@Stable
private class TransitionMotionPropertyImpl<T>(
    override val label: String?
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
