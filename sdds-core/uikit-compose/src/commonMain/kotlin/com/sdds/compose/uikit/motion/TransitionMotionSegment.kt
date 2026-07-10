package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Immutable

/**
 * Сегмент [TransitionMotionProperty].
 */
interface TransitionSegment<T> : MotionSegment<T, MotionTransitionSpec<T>>

/**
 * Scope для настройки сегмента transition-свойства.
 */
interface TransitionSegmentBuilderScope : MotionSegmentBuilderScope

/**
 * Билдер сегмента [TransitionMotionProperty].
 */
interface TransitionSegmentBuilder<T> : TransitionSegmentBuilderScope {
    /**
     * Собирает сегмент с указанной transition-спецификацией.
     */
    fun build(spec: () -> MotionTransitionSpec<T>): TransitionSegment<T>

    companion object {
        internal fun <T> instance(): TransitionSegmentBuilder<T> =
            TransitionSegmentBuilderImpl()
    }
}

@Immutable
private class TransitionSegmentImpl<T>(
    override val spec: () -> MotionTransitionSpec<T>,
    override val condition: MotionSegmentCondition,
) : TransitionSegment<T>

private class TransitionSegmentBuilderImpl<T> : TransitionSegmentBuilder<T> {

    var condition = MotionSegmentCondition { true }

    override fun condition(condition: MotionSegmentCondition) {
        this.condition = condition
    }

    override fun build(spec: () -> MotionTransitionSpec<T>): TransitionSegment<T> {
        return TransitionSegmentImpl(condition = condition, spec = spec)
    }
}
