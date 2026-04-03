package com.sdds.uikit.fixtures.stories.navigationbar

import android.content.Context
import android.widget.FrameLayout
import androidx.core.view.setMargins
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.NavigationBar
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.NavigationBarUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.NavigationBarUiStateTransformer

/**
 * История компонента NavigationBar для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации NavigationBar.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.NavigationBar
 */
@Story
object NavigationBarStory : ViewBaseStory<NavigationBarUiState, NavigationBar>(
    ComponentKey.NavigationBar,
    NavigationBarUiState(),
    NavigationBarUiStatePropertiesProducer,
    NavigationBarUiStateTransformer,
) {
    override fun getComponent(context: Context): NavigationBar {
        return navigationBar(context)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            width = FrameLayout.LayoutParams.MATCH_PARENT
            height = FrameLayout.LayoutParams.MATCH_PARENT
            setMargins(50.dp)
        }
    }

    override fun onComponentUpdate(component: NavigationBar, state: NavigationBarUiState) {
        component.applyState(state)
    }
}
