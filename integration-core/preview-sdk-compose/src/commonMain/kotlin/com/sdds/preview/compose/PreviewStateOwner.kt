package com.sdds.preview.compose

import com.sdds.sandbox.StateOwner
import com.sdds.sandbox.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Локальный владелец состояния story в preview.
 *
 * Story меняют состояние на нажатиях (`CheckBox`, `Switch`, `Accordion`) через [updateState]. В demo
 * владельцем служит ViewModel, а в preview её нет: без владельца story бросает `IllegalStateException`
 * прямо в обработчике нажатия, и Compose останавливается. Состояние живёт, пока показан этот payload.
 */
internal class PreviewStateOwner<State : UiState>(initial: State) : StateOwner<State> {
    private val state = MutableStateFlow(initial)

    override val uiState: StateFlow<State> = state.asStateFlow()

    override fun updateState(state: State) {
        this.state.value = state
    }
}
