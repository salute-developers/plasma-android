package com.sdds.uikit.fixtures.stories.chip

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.ChipGroup
import com.sdds.uikit.fixtures.stories.ChipUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ChipUiStateTransformer

/**
 * История компонента ChipGroup для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации ChipGroup.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.ChipGroup
 */
@Story
object ChipGroupStory : ViewBaseStory<ChipUiState, ChipGroup>(
    ComponentKey.Chip,
    ChipUiState(),
    ChipUiStatePropertiesProducer,
    ChipUiStateTransformer,
) {

    private var isWrapped: Boolean = false

    override val scrollMode: ScrollMode
        get() = if (isWrapped) ScrollMode.VERTICAL else ScrollMode.HORIZONTAL

    override fun shouldRecreateComponentOnStateUpdate(state: ChipUiState): Boolean {
        return if (isWrapped != state.isWrapped) {
            isWrapped = state.isWrapped
            true
        } else {
            false
        }
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = FrameLayout.LayoutParams.MATCH_PARENT
            height = FrameLayout.LayoutParams.WRAP_CONTENT
        }
    }

    override fun getComponent(context: Context): ChipGroup {
        return chipGroup(context)
    }

    override fun onComponentUpdate(component: ChipGroup, state: ChipUiState) {
        component.applyState(state)
    }
}
