package com.sdds.compose.uikit.interactions

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState

/**
 * Интерфейс-маркер, описывающий состояние [StatefulValue]
 */
interface ValueState

/**
 * Абстрактный класс, представляющий список значений, соответствующих наборам состояний [ValueState].
 *
 * Используется для сопоставления значения типа [T] с определённым набором состояний (stateSet).
 *
 * @param T Тип значения, связанного с состоянием.
 * @param states Набор состояний.
 * @param values Набор значений, соответствующих каждому набору состояний.
 */
@Immutable
open class StatefulValue<T> internal constructor(
    private val states: List<Set<ValueState>>,
    private val values: List<T>,
    private val defaultValue: T? = null,
) {

    /**
     * Возвращает значение, соответствующее переданному набору состояний.
     *
     * @param stateSet Набор состояний, для которого нужно найти значение.
     * @param defaultValue Значение по умолчанию, возвращаемое если соответствие не найдено.
     * @return Значение, соответствующее переданному набору состояний, либо [defaultValue], либо значение по умолчанию.
     */
    fun getValue(stateSet: Set<ValueState>, defaultValue: T? = null): T {
        val index = indexOfStateSet(stateSet)
        return if (index >= 0) values[index] else defaultValue ?: getDefaultValue()
    }

    /**
     * Возвращает значение по умолчанию, соответствующее пустому набору состояний.
     *
     * @return Значение, связанное с пустым набором состояний, либо первое значение из массива.
     */
    fun getDefaultValue(): T = defaultValue ?: values.getOrElse(indexOfDefault()) { values.first() }

    /**
     * Проверяет, содержит ли список значения, зависящие от состояния.
     *
     * @return `true`, если хотя бы один набор состояний не пустой.
     */
    fun isStateful(): Boolean = states.any { it.isNotEmpty() }

    /**
     * Возвращает копию [StatefulValue]
     */
    fun copy(
        states: List<Set<ValueState>> = this.states,
        values: List<T> = this.values,
        defaultValue: T? = this.defaultValue,
    ): StatefulValue<T> = StatefulValue(states, values, defaultValue)

    private fun indexOfDefault(): Int = states.indexOfFirst { it.isEmpty() }.takeIf { it >= 0 } ?: 0

    private fun indexOfStateSet(stateSet: Set<ValueState>): Int {
        for (i in states.indices) {
            if (states[i].all { it in stateSet }) {
                return i
            }
        }
        return -1
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StatefulValue<*>) return false

        if (states != other.states) return false
        if (values != other.values) return false
        if (defaultValue != other.defaultValue) return false

        return true
    }

    override fun hashCode(): Int {
        var result = states.hashCode()
        result = 31 * result + values.hashCode()
        result = 31 * result + (defaultValue?.hashCode() ?: 0)
        return result
    }

    companion object {
        /**
         * Создает [StatefulValue] из набора состояний [states] и значений [values].
         */
        fun <T> from(states: List<Set<ValueState>>, values: List<T>, defaultValue: T? = null): StatefulValue<T> {
            require(states.size == values.size) { "States and values must be the same size" }
            return StatefulValue(states, values, defaultValue)
        }

        internal fun <T, V> transform(other: StatefulValue<T>, transformer: (T) -> V): StatefulValue<V> {
            return StatefulValue(other.states, other.values.map(transformer), other.defaultValue?.let(transformer))
        }
    }
}

/**
 * Создает [StatefulValue] из значения @receiver [T] и набора пар состояние-значение
 */
@Stable
fun <T : Any> T.asStatefulValue(
    vararg valueStates: Pair<Set<ValueState>, T>,
): StatefulValue<T> {
    return StatefulValue(
        states = valueStates.map { it.first },
        values = valueStates.map { it.second },
        defaultValue = this,
    )
}

/**
 * Возвращает значение, которое соответствует набору состояний [stateSet] и [interactionSource]
 */
@Composable
fun <T : Any> StatefulValue<T>.getValue(
    interactionSource: InteractionSource,
    stateSet: Set<ValueState> = emptySet(),
    defaultValue: T? = null,
): T {
    if (!isStateful()) return remember { getDefaultValue() }

    val isPressed by interactionSource.collectIsPressedAsState()
    val isHovered by interactionSource.collectIsHoveredAsState()
    val isFocused by interactionSource.collectIsFocusedAsState()
    val isActivated by interactionSource.collectIsActivatedAsState()
    val isSelected by interactionSource.collectIsSelectedAsState()
    val interactiveStateSet = remember(
        isPressed,
        isFocused,
        isHovered,
        isActivated,
        isSelected,
    ) {
        HashSet<InteractiveState>().apply {
            if (isPressed) add(InteractiveState.Pressed)
            if (isFocused) add(InteractiveState.Focused)
            if (isHovered) add(InteractiveState.Hovered)
            if (isActivated) add(InteractiveState.Activated)
            if (isSelected) add(InteractiveState.Selected)
        }
    }
    val combinedStateSet = remember(interactiveStateSet, stateSet) { interactiveStateSet + stateSet }
    return remember(combinedStateSet, defaultValue) {
        getValue(combinedStateSet, defaultValue)
    }
}

/**
 * Возвращает значение как [State], которое соответствует набору состояний [stateSet] и [interactionSource]
 */
@Composable
fun <T : Any> StatefulValue<T>.getValueAsState(
    interactionSource: InteractionSource,
    stateSet: Set<ValueState> = emptySet(),
    defaultValue: T? = null,
): State<T> = rememberUpdatedState(getValue(interactionSource, stateSet, defaultValue))

/**
 * Трансформирует значение [StatefulValue]<[T]> в [StatefulValue]<[V]>, используя [transformer]
 */
fun <T, V> StatefulValue<T>.transform(transformer: (T) -> V): StatefulValue<V> =
    StatefulValue.transform(this, transformer)
