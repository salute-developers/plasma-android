package com.sdds.uikit.statelist

import android.util.AttributeSet
import android.util.StateSet

/**
 * Абстрактный класс, представляющий список значений, соответствующих наборам состояний View.
 *
 * Используется для сопоставления значения типа [T] с определённым набором состояний (stateSet),
 * аналогично работе с `ColorStateList` или `StateListDrawable`.
 *
 * @param T Тип значения, связанного с состоянием.
 * @param states Массив массивов состояний, где каждый подмассив представляет набор состояний.
 * @param values Массив значений, соответствующих каждому набору состояний.
 */
open class ValueStateList<T> internal constructor(
    private val states: Array<IntArray>,
    private val values: Array<T>,
) {

    /**
     * Возвращает значение, соответствующее переданному набору состояний.
     *
     * @param stateSet Набор состояний, для которого нужно найти значение.
     * @param defaultValue Значение по умолчанию, возвращаемое если соответствие не найдено.
     * @return Значение, соответствующее переданному набору состояний, либо [defaultValue], либо значение по умолчанию.
     */
    fun getValueForState(stateSet: IntArray, defaultValue: T? = null): T {
        val index = indexOfStateSet(stateSet)
        return if (index >= 0) values[index] else defaultValue ?: getDefaultValue()
    }

    /**
     * Возвращает значение по умолчанию, соответствующее пустому набору состояний.
     *
     * @return Значение, связанное с пустым набором состояний, либо первое значение из массива.
     */
    fun getDefaultValue(): T = values.getOrElse(indexOfDefault()) { values.first() }

    /**
     * Проверяет, содержит ли список значения, зависящие от состояния.
     *
     * @return `true`, если хотя бы один набор состояний не пустой.
     */
    fun isStateful(): Boolean = states.any { it.isNotEmpty() }

    private fun indexOfDefault(): Int {
        for (i in states.indices) {
            if (states[i].isEmpty()) return i
        }
        return 0
    }

    private fun indexOfStateSet(stateSet: IntArray): Int {
        for (i in states.indices) {
            if (StateSet.stateSetMatches(states[i], stateSet)) {
                return i
            }
        }
        return -1
    }

    companion object {

        /**
         * Извлекает массив состояний из атрибутов XML.
         *
         * @param attrs Атрибуты XML, содержащие состояния.
         * @return Массив состояний, положительные значения означают `true`, отрицательные — `false`.
         */
        fun extractStateSet(attrs: AttributeSet): IntArray {
            val stateSet = mutableListOf<Int>()

            for (i in 0 until attrs.attributeCount) {
                val attrRes = attrs.getAttributeNameResource(i)
                if (attrRes == android.R.attr.value || attrRes == android.R.attr.id) continue

                val value = attrs.getAttributeBooleanValue(i, false)
                val state = if (value) attrRes else -attrRes
                stateSet += state
            }

            return stateSet.toIntArray()
        }
    }
}
