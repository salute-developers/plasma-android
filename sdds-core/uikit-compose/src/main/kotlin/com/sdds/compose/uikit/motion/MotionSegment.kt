package com.sdds.compose.uikit.motion

import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.ValueStateSet

interface MotionSegment<T, Spec: MotionSpec<T>> {
    val spec: () -> Spec

    val condition: MotionSegmentCondition
}

interface MotionSegmentBuilderScope {

    fun condition(condition: MotionSegmentCondition)
}

internal fun <T> emptySegment(): MotionSegment<T, MotionSpec<T>> = EmptySegment()

private class EmptySegment<T> : MotionSegment<T, MotionSpec<T>> {
    override val spec: () -> MotionSpec<T> = { NoInterpolation() }
    override val condition: MotionSegmentCondition = MotionSegmentCondition { false }
}

fun interface MotionSegmentCondition {

    fun matches(stateSnapshot: MotionStateSnapshot): Boolean
}

infix fun MotionStateSnapshot.changes(state: ValueState): Boolean {
    return this changesFrom state || this changesTo state
}

infix fun MotionStateSnapshot.changesTo(state: ValueState): Boolean {
    return (initial hasNo state && target has state)
}

infix fun MotionStateSnapshot.changesFrom(state: ValueState): Boolean {
    return (initial has state && target hasNo state)
}

infix fun ValueStateSet.hasOnly(state: ValueState): Boolean {
    return this.size == 1 && this has state
}

infix fun ValueStateSet.has(state: ValueState): Boolean {
    return this.contains(state)
}

infix fun ValueStateSet.hasNo(state: ValueState): Boolean {
    return this.contains(state).not()
}
