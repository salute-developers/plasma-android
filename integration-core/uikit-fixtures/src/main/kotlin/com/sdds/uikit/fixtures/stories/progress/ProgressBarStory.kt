package com.sdds.uikit.fixtures.stories.progress

import android.content.Context
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.ProgressBar
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.ProgressUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ProgressUiStateTransformer

/**
 * История компонента ProgressBar для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации ProgressBar.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.ProgressBar
 */
@Story
object ProgressBarStory : ViewBaseStory<ProgressUiState, ProgressBar>(
    ComponentKey.ProgressBar,
    ProgressUiState(),
    ProgressUiStatePropertiesProducer,
    ProgressUiStateTransformer,
) {
    override fun getComponent(context: Context): ProgressBar {
        return progressBar(context)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = 216.dp
            height = FrameLayout.LayoutParams.WRAP_CONTENT
        }
    }

    override fun onComponentUpdate(component: ProgressBar, state: ProgressUiState) {
        component.applyState(state)
    }
}
