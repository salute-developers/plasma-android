package com.sdds.uikit.fixtures.stories.divider

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Divider
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.DividerUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.DividerUiStateTransformer

/**
 * История компонента Divider для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Divider.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Divider
 */
@Story
object DividerStory : ViewBaseStory<DividerUiState, Divider>(
    ComponentKey.Divider,
    DividerUiState(),
    DividerUiStatePropertiesProducer,
    DividerUiStateTransformer,
) {

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = 216.dp
            height = FrameLayout.LayoutParams.WRAP_CONTENT
        }
    }

    override fun getComponent(context: Context): Divider {
        return Divider(context)
    }

    override fun onComponentUpdate(component: Divider, state: DividerUiState) = Unit
}
