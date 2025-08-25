package com.sdds.playground.sandbox.codefield.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.codefield.CodeFieldUiState

/**
 * ViewModel для экрана с компонентом CodeField
 * @param defaultState состояние по-умолчанию
 */
internal class CodeFieldParametersViewModel(
    defaultState: CodeFieldUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CodeFieldUiState>(defaultState, componentKey) {

    override fun CodeFieldUiState.toProps() = emptyList<Property<*>>()

}

/**
 * Фабрика [CodeFieldParametersViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class CodeFieldParametersViewModelFactory(
    private val defaultState: CodeFieldUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CodeFieldParametersViewModel(defaultState = defaultState, componentKey = componentKey) as T
    }
}