package com.sdds.uikit.fixtures.stories.note

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Note
import com.sdds.uikit.fixtures.stories.NoteUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.NoteUiStateTransformer

/**
 * История компонента Note для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Note.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Note
 */
@Story
object NoteStory : ViewBaseStory<NoteUiState, Note>(
    ComponentKey.Note,
    NoteUiState(),
    NoteUiStatePropertiesProducer,
    NoteUiStateTransformer,
) {
    override fun getComponent(context: Context): Note {
        return note(context)
    }

    override fun onComponentUpdate(component: Note, state: NoteUiState) {
        component.applyState(state)
    }
}
