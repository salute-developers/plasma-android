package com.sdds.uikit.fixtures.stories.overlay

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.OverlayView
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.OverlayUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.OverlayUiStateTransformer

/**
 * История компонента Overlay для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Overlay.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Overlay
 */
@Story
object OverlayStory : ViewBaseStory<OverlayUiState, View>(
    ComponentKey.Overlay,
    OverlayUiState(),
    OverlayUiStatePropertiesProducer,
    OverlayUiStateTransformer,
) {

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.MATCH_PARENT,
        )
    }

    override fun getComponent(context: Context): View {
        return overlayWithTrigger(context)
    }

    override fun onComponentUpdate(component: View, state: OverlayUiState) {
        component.findViewById<OverlayView>(R.id.overlay)?.applyState(state)
    }
}
