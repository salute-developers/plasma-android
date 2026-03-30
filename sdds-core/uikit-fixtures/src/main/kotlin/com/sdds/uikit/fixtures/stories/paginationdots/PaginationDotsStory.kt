package com.sdds.uikit.fixtures.stories.paginationdots

import android.content.Context
import android.view.View
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.PaginationDots
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.PaginationDotsUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.PaginationDotsUiStateTransformer

/**
 * История компонента PaginationDots для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации PaginationDots.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.PaginationDots
 */
@Story
object PaginationDotsStory : ViewBaseStory<PaginationDotsUiState, View>(
    ComponentKey.PaginationDots,
    PaginationDotsUiState(),
    PaginationDotsUiStatePropertiesProducer,
    PaginationDotsUiStateTransformer,
) {
    private var currentState = PaginationDotsUiState()

    override fun getComponent(context: Context): View {
        return paginationDotsWithControls(context, state = currentState)
    }

    override fun shouldRecreateComponentOnStateUpdate(state: PaginationDotsUiState): Boolean {
        if (currentState.step != state.step) {
            currentState = state
            return true
        }
        return super.shouldRecreateComponentOnStateUpdate(state)
    }

    override fun onComponentUpdate(component: View, state: PaginationDotsUiState) {
        component.findViewById<PaginationDots>(R.id.pagination_dots)?.applyState(state)
    }
}
