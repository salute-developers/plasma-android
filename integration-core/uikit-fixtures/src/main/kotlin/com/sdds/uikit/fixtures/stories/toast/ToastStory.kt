package com.sdds.uikit.fixtures.stories.toast

import android.content.Context
import android.view.View
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.fixtures.stories.ToastUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ToastUiStateTransformer

/**
 * История компонента Toast для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Toast.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Toast
 */
@Story
object ToastStory : ViewBaseStory<ToastUiState, View>(
    ComponentKey.Toast,
    ToastUiState(),
    ToastUiStatePropertiesProducer,
    ToastUiStateTransformer,
) {
    override fun getComponent(context: Context): View {
        return toastTrigger(context)
    }

    override fun onComponentUpdate(component: View, state: ToastUiState) {
        val context = component.context
        component.setOnClickListener { toast(context, state).show() }
    }
}
