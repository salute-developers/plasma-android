package com.sdds.testing.vs.note

import android.content.Context
import androidx.annotation.StyleRes
import com.sdds.icons.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.ImageView
import com.sdds.uikit.LinkButton
import com.sdds.uikit.Note
import com.sdds.uikit.NoteCompact

/**
 * Создает [Note]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun note(
    context: Context,
    @StyleRes style: Int? = null,
    state: NoteUiState = NoteUiState(),
): Note {
    return Note(context.styleWrapper(style)).apply {
        setContentBefore(
            ImageView(context).apply {
                setImageResource(R.drawable.ic_salute_fill_36)
            },
        )
    }
        .applyState(state)
}

/**
 * Применяет [NoteUiState] к [Note]
 */
fun Note.applyState(state: NoteUiState) = apply {
    title = state.title
    text = state.text
    if (state.hasAction) {
        setAction(LinkButton(context).apply { text = "Label" })
    } else {
        removeAction()
    }
}

/**
 * Создает [Note]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun noteCompact(
    context: Context,
    @StyleRes style: Int? = null,
    state: NoteUiState = NoteUiState(),
): NoteCompact {
    return NoteCompact(context.styleWrapper(style)).apply {
        setContentBefore(
            ImageView(context).apply {
                setImageResource(R.drawable.ic_salute_fill_36)
            },
        )
    }
        .applyState(state)
}

/**
 * Применяет [NoteUiState] к [Note]
 */
fun NoteCompact.applyState(state: NoteUiState) = apply {
    title = state.title
    text = state.text
    if (state.hasAction) {
        setAction(LinkButton(context).apply { text = "Label" })
    } else {
        removeAction()
    }
}
