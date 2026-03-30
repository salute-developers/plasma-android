package com.sdds.uikit.fixtures.stories.toolbar

import android.content.Context
import android.widget.LinearLayout.HORIZONTAL
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.ToolBar
import com.sdds.uikit.fixtures.stories.ToolBarUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ToolBarUiStateTransformer

/**
 * История компонента Toolbar для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Toolbar.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.ToolBar
 */
@Story
object ToolBarStory : ViewBaseStory<ToolBarUiState, ToolBar>(
    ComponentKey.ToolBar,
    ToolBarUiState(),
    ToolBarUiStatePropertiesProducer,
    ToolBarUiStateTransformer,
) {

    private var state: ToolBarUiState = ToolBarUiState()
    private var orientation: Int = HORIZONTAL

    override val scrollMode: ScrollMode
        get() = when (orientation) {
            HORIZONTAL -> ScrollMode.HORIZONTAL
            else -> ScrollMode.VERTICAL
        }

    override fun getComponent(context: Context): ToolBar {
        return toolBar(context, state = state)
    }

    override fun onComponentUpdate(component: ToolBar, state: ToolBarUiState) {
        component.applyState(state)
        orientation = (component.orientation) ?: HORIZONTAL
    }
}
