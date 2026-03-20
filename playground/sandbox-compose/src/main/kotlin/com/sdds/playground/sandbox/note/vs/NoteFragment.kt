package com.sdds.playground.sandbox.note.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.Note
import com.sdds.uikit.fixtures.stories.note.NoteUiState
import com.sdds.uikit.fixtures.stories.note.applyState
import com.sdds.uikit.fixtures.stories.note.note

/**
 * Фрагмент с компонентом Note
 */
internal class NoteFragment : ComponentFragment<NoteUiState, Note, NoteParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        NoteParametersViewModelFactory(
            defaultState = getState { NoteUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): Note {
        return note(contextWrapper)
    }

    override fun onComponentUpdate(component: Note?, state: NoteUiState) {
        component?.applyState(state)
    }
}
