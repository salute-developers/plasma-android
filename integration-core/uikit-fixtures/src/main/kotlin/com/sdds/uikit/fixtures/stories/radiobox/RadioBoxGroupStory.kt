package com.sdds.uikit.fixtures.stories.radiobox

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.RadioBoxGroup
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.RadioBoxUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.RadioBoxUiStateTransformer

/**
 * История компонента RadioBoxGroup для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации RadioBoxGroup.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.RadioBoxGroup
 */
@Story
object RadioBoxGroupStory : ViewBaseStory<RadioBoxUiState, RadioBoxGroup>(
    ComponentKey.RadioBoxGroup,
    RadioBoxUiState(),
    RadioBoxUiStatePropertiesProducer,
    RadioBoxUiStateTransformer,
) {
    override fun getComponent(context: Context): RadioBoxGroup {
        return radioBoxGroup(context)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = 160.dp
            height = FrameLayout.LayoutParams.WRAP_CONTENT
        }
    }

    override fun onComponentUpdate(component: RadioBoxGroup, state: RadioBoxUiState) {
        component.applyState(state)
    }
}
