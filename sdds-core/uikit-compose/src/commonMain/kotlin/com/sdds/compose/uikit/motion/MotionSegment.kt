package com.sdds.compose.uikit.motion

import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.ValueStateSet

/**
 * Сегмент motion-свойства.
 *
 * Сегмент связывает условие [condition] со спецификацией [spec]. Когда условие подходит
 * под текущий [MotionStateSnapshot], именно этот сегмент используется для вычисления значения.
 */
interface MotionSegment<T, Spec : MotionSpec<T>> {
    /**
     * Спецификация, описывающая способ вычисления значения в рамках сегмента.
     */
    val spec: () -> Spec

    /**
     * Условие выбора сегмента по снимку состояний.
     */
    val condition: MotionSegmentCondition
}

/**
 * Базовый scope билдеров сегментов.
 */
interface MotionSegmentBuilderScope {
    /**
     * Устанавливает условие выбора сегмента.
     */
    fun condition(condition: MotionSegmentCondition)
}

internal fun <T> emptySegment(): MotionSegment<T, MotionSpec<T>> = EmptySegment()

private class EmptySegment<T> : MotionSegment<T, MotionSpec<T>> {
    override val spec: () -> MotionSpec<T> = { NoInterpolation() }
    override val condition: MotionSegmentCondition = MotionSegmentCondition { false }
}

/**
 * Условие применения сегмента.
 */
fun interface MotionSegmentCondition {
    /**
     * Возвращает `true`, если сегмент должен использоваться для переданного снимка состояний.
     */
    fun matches(stateSnapshot: MotionStateSnapshot): Boolean
}

/**
 * Проверяет, что состояние либо появилось, либо исчезло между `initial` и `target`.
 */
infix fun MotionStateSnapshot.changes(state: ValueState): Boolean {
    return this changesFrom state || this changesTo state
}

/**
 * Проверяет, что состояние отсутствовало в `initial` и присутствует в `target`.
 */
infix fun MotionStateSnapshot.changesTo(state: ValueState): Boolean {
    return (initial hasNo state && target has state)
}

/**
 * Проверяет, что состояние присутствовало в `initial` и отсутствует в `target`.
 */
infix fun MotionStateSnapshot.changesFrom(state: ValueState): Boolean {
    return (initial has state && target hasNo state)
}

/**
 * Проверяет, что состояние отсутствует и в `initial`, и в `target`.
 */
infix fun MotionStateSnapshot.hasNo(state: ValueState): Boolean {
    return (initial hasNo state && target hasNo state)
}

/**
 * Проверяет, что состояние присутствует хотя бы в одном из наборов: `initial` или `target`.
 */
infix fun MotionStateSnapshot.has(state: ValueState): Boolean {
    return (initial has state || target has state)
}

/**
 * Проверяет, что набор содержит только одно указанное состояние.
 */
infix fun ValueStateSet.hasOnly(state: ValueState): Boolean {
    return this.size == 1 && this has state
}

/**
 * Проверяет, что набор содержит указанное состояние.
 */
infix fun ValueStateSet.has(state: ValueState): Boolean {
    return this.contains(state)
}

/**
 * Проверяет, что набор не содержит указанное состояние.
 */
infix fun ValueStateSet.hasNo(state: ValueState): Boolean {
    return this.contains(state).not()
}
