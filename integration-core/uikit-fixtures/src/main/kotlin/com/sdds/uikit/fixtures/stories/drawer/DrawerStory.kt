package com.sdds.uikit.fixtures.stories.drawer

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.DrawerLayout
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.DrawerUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.DrawerUiStateTransformer

/**
 * История компонента Drawer для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Drawer.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Drawer
 */
@Story
object DrawerStory : ViewBaseStory<DrawerUiState, View>(
    ComponentKey.Drawer,
    DrawerUiState(),
    DrawerUiStatePropertiesProducer,
    DrawerUiStateTransformer,
) {

    override fun provideLayoutParams(): FrameLayout.LayoutParams {
        return FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.MATCH_PARENT,
        )
    }

    override fun getComponent(context: Context): View {
        return drawer(context)
    }

    override fun onComponentUpdate(component: View, state: DrawerUiState) {
        component.findViewById<DrawerLayout>(R.id.drawer_layout)?.applyState(state)
    }
}
