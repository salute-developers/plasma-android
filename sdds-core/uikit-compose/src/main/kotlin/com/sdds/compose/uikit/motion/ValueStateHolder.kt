package com.sdds.compose.uikit.motion

import com.sdds.compose.uikit.interactions.ValueState

sealed interface ValueStateHolder {
    val state: ValueState

    fun matches(states: Set<ValueState>): Boolean
}



internal fun Set<ValueStateHolder>.matches(stateSet: Set<ValueState>): Boolean {
    return all { holder -> holder.matches(stateSet) }
}

@JvmInline
internal value class HasValueState(override val state: ValueState) : ValueStateHolder {
    override fun matches(states: Set<ValueState>): Boolean = state in states
}

@JvmInline
internal value class NoValueState(override val state: ValueState) : ValueStateHolder {
    override fun matches(states: Set<ValueState>): Boolean = state !in states
}

