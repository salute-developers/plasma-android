package com.sdds.playground.sandbox.note.vs

import android.view.ContextThemeWrapper
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.testing.vs.note.NoteUiState
import com.sdds.testing.vs.note.applyState
import com.sdds.testing.vs.note.noteCompact
import com.sdds.uikit.NoteCompact

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
