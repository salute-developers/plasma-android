package com.sdds.compose.uikit.interactions

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.runtime.Stable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Источник семантических состояний компонента.
 *
 * В отличие от [InteractionSource], описывает не пользовательские взаимодействия,
 * а логические состояния компонента: expanded/collapsed, checked/unchecked и т.п.
 */
@Stable
interface SemanticStateSource {
    /**
     * Текущий набор семантических состояний.
     */
    val states: StateFlow<ValueStateSet>
}

/**
 * Мутабельный источник semantic states
 */
@Stable
interface MutableSemanticStateSource : SemanticStateSource {

    /**
     * Заменяет текущий набор семантических состояний.
     */
    fun replace(vararg states: ValueState)

    /**
     * Добавляет [states] в текущий набор семантических состояний.
     */
    fun add(vararg states: ValueState) {
        update { it + states.toSet() }
    }

    /**
     * Удаляет [states] из текущего набора семантических состояний.
     */
    fun remove(vararg states: ValueState) {
        update { it - states.toSet() }
    }

    /**
     * Добавляет или удаляет [state] в зависимости от [enabled].
     */
    fun set(state: ValueState, enabled: Boolean) {
        if (enabled) {
            add(state)
        } else {
            remove(state)
        }
    }

    /**
     * Добавляет [state] и удаляет из текущего набора все состояния из [excludedStates].
     *
     * Удобно для групп взаимоисключающих состояний, например `Expanded`/`Collapsed`.
     */
    fun setExclusive(state: ValueState, vararg excludedStates: ValueState) {
        val statesToRemove = excludedStates.toSet()
        update { (it - statesToRemove) + state }
    }

    /**
     * Переключает наличие [state] в текущем наборе семантических состояний.
     */
    fun toggle(state: ValueState) {
        set(state, state !in states.value)
    }

    /**
     * Очищает текущий набор семантических состояний.
     */
    fun clear()

    /**
     * Возвращает `true`, если [state] есть в текущем наборе семантических состояний.
     */
    fun contains(state: ValueState): Boolean = state in states.value

    /**
     * Обновляет текущий набор семантических состояний через [transform].
     */
    fun update(transform: (ValueStateSet) -> ValueStateSet)

    /**
     * Добавляет [state] в текущий набор семантических состояний.
     */
    operator fun plusAssign(state: ValueState) {
        add(state)
    }

    /**
     * Удаляет [state] из текущего набора семантических состояний.
     */
    operator fun minusAssign(state: ValueState) {
        remove(state)
    }
}

/**
 * Возвращает экземпляр [MutableSemanticStateSource]
 */
fun MutableSemanticStateSource(): MutableSemanticStateSource {
    return MutableSemanticStateSourceImpl()
}

/**
 * Изменяемый [SemanticStateSource].
 */
@Stable
private class MutableSemanticStateSourceImpl(
    initialStateSet: ValueStateSet = emptySet(),
) : MutableSemanticStateSource {

    private val _states = MutableStateFlow(initialStateSet)

    override val states: StateFlow<ValueStateSet> = _states.asStateFlow()

    /**
     * Текущий набор семантических состояний.
     */
    var value: ValueStateSet
        get() = _states.value
        set(value) {
            _states.value = value
        }

    /**
     * Заменяет текущий набор семантических состояний.
     */
    override fun replace(vararg states: ValueState) {
        _states.value = states.toSet()
    }

    /**
     * Очищает текущий набор семантических состояний.
     */
    override fun clear() {
        _states.value = emptySet()
    }

    /**
     * Обновляет текущий набор семантических состояний через [transform].
     */
    override fun update(transform: (ValueStateSet) -> ValueStateSet) {
        _states.value = transform(_states.value)
    }
}
