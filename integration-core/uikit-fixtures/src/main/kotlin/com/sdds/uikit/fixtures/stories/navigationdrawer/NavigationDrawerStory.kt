package com.sdds.uikit.fixtures.stories.navigationdrawer

import android.content.Context
import android.view.Gravity
import android.widget.FrameLayout
import androidx.core.view.setMargins
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.NavigationDrawer
import com.sdds.uikit.dp
import com.sdds.uikit.fixtures.stories.NavigationDrawerUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.NavigationDrawerUiStateTransformer

/**
 * История компонента NavigationDrawer для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации NavigationDrawer.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.NavigationDrawer
 */
@Story
object NavigationDrawerStory : ViewBaseStory<NavigationDrawerUiState, NavigationDrawer>(
    ComponentKey.NavigationDrawer,
    NavigationDrawerUiState(),
    NavigationDrawerUiStatePropertiesProducer,
    NavigationDrawerUiStateTransformer,
) {
    override fun getComponent(context: Context): NavigationDrawer {
        return navigationDrawer(context)
    }

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return super.provideLayoutParams().apply {
            height = FrameLayout.LayoutParams.MATCH_PARENT
            setMargins(20.dp)
            gravity = Gravity.CENTER_VERTICAL or Gravity.START
        }
    }

    override fun onComponentUpdate(component: NavigationDrawer, state: NavigationDrawerUiState) {
        component.applyState(state)
    }
}
