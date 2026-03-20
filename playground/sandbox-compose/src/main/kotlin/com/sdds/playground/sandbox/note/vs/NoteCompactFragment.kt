package com.sdds.playground.sandbox.note.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.uikit.NoteCompact
import com.sdds.uikit.fixtures.stories.note.NoteUiState
import com.sdds.uikit.fixtures.stories.note.applyState
import com.sdds.uikit.fixtures.stories.note.noteCompact

/**
 * Фрагмент с компонентом NoteCompact
 */
internal class NoteCompactFragment : ComponentFragment<NoteUiState, NoteCompact, NoteCompactParametersViewModel>() {

    override val viewModelFactory: ViewModelProvider.Factory by lazy {
        NoteCompactParametersViewModelFactory(
            defaultState = getState { NoteUiState() },
            componentKey = componentKey,
        )
    }

    override fun getComponent(contextWrapper: ContextThemeWrapper): NoteCompact {
        return noteCompact(contextWrapper)
    }

    override fun onComponentUpdate(component: NoteCompact?, state: NoteUiState) {
        component?.applyState(state)
    }
}
