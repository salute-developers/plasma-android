package com.sdds.uikit.fixtures.stories.codeinput

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.CodeInput
import com.sdds.uikit.fixtures.stories.CodeInputUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.CodeInputUiStateTransformer

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
object CodeInputStory : ViewBaseStory<CodeInputUiState, CodeInput>(
    ComponentKey.CodeInput,
    CodeInputUiState(),
    CodeInputUiStatePropertiesProducer,
    CodeInputUiStateTransformer,
) {
    override fun getComponent(context: Context): CodeInput {
        return codeInput(context)
    }

    override fun onComponentUpdate(component: CodeInput, state: CodeInputUiState) {
        component.applyState(state)
    }
}
