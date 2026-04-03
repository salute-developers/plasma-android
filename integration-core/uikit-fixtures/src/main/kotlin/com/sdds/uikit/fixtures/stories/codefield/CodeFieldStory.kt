package com.sdds.uikit.fixtures.stories.codefield

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.CodeField
import com.sdds.uikit.fixtures.stories.CodeFieldUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.CodeFieldUiStateTransformer

/**
 * История компонента CodeField для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации CodeField.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.CodeField
 */
@Story
object CodeFieldStory : ViewBaseStory<CodeFieldUiState, CodeField>(
    ComponentKey.CodeField,
    CodeFieldUiState(),
    CodeFieldUiStatePropertiesProducer,
    CodeFieldUiStateTransformer,
) {
    override fun getComponent(context: Context): CodeField {
        return codeField(context)
    }

    override fun onComponentUpdate(component: CodeField, state: CodeFieldUiState) {
        component.applyState(state)
    }
}
