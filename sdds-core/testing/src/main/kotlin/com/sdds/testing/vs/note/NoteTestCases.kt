package com.sdds.testing.vs.note

import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig

/**
 * Тест-кейсы для компонента [Note]
 */
@Suppress("UndocumentedPublicFunction")
abstract class NoteTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2315
     */
    abstract fun testNoteCompactLDefaultTitleTextHasAction()

    /**
     * PLASMA-T2316
     */
    abstract fun testNoteCompactMPositiveTitleTextHasClose()

    /**
     * PLASMA-T2317
     */
    abstract fun testNoteSNegativeTitleTextHasAction()

    /**
     * PLASMA-T2318
     */
    abstract fun testNoteXsWarningTitleTextHasClose()

    /**
     * PLASMA-T2319
     */
    abstract fun testNoteCompactLInfoTitleLongTextHasClose()

    /**
     * PLASMA-T2320
     */
    abstract fun testNoteLDefaultLongTitleLongTextHasCloseHasAction()

    /**
     * PLASMA-T2321
     */
    abstract fun testNoteCompactLScalableDefaultTitleTextHasCloseHasAction()

    /**
     * PLASMA-T2322
     */
    abstract fun testNoteXsScalableInfoHasCloseTitleText()

    /**
     * PLASMA-T2181
     */
    abstract fun testNoteLDefaultNoTitleNoText()

    fun ComponentScope.noteCompactLDefaultTitleTextHasAction(style: Int) =
        noteCompact(
            context = context,
            style = style,
            state = NoteUiState(
                variant = "",
                appearance = "",
                title = "Title",
                text = "Text",
                hasAction = true,
            ),
        ).apply {
            id = R.id.note
        }

    fun ComponentScope.noteCompactMPositiveTitleTextHasClose(style: Int) =
        noteCompact(
            context = context,
            style = style,
            state = NoteUiState(
                variant = "",
                appearance = "",
                title = "Title",
                text = "Text",
                hasAction = false,
            ),
        ).apply {
            id = R.id.note
        }

    fun ComponentScope.noteSNegativeTitleTextHasAction(style: Int) =
        note(
            context = context,
            style = style,
            state = NoteUiState(
                variant = "",
                appearance = "",
                title = "Title",
                text = "Text",
                hasAction = true,
            ),
        ).apply {
            id = R.id.note
        }

    fun ComponentScope.noteXsWarningTitleTextHasClose(style: Int) =
        note(
            context = context,
            style = style,
            state = NoteUiState(
                variant = "",
                appearance = "",
                title = "Title",
                text = "Text",
                hasAction = false,
            ),
        ).apply {
            id = R.id.note
        }

    fun ComponentScope.noteCompactLInfoTitleLongTextHasClose(style: Int) =
        noteCompact(
            context = context,
            style = style,
            state = NoteUiState(
                variant = "",
                appearance = "",
                title = "Title",
                text = LONG_TEXT,
                hasAction = false,
            ),
        ).apply {
            id = R.id.note
        }

    fun ComponentScope.noteLDefaultLongTitleLongTextHasCloseHasAction(style: Int) =
        note(
            context = context,
            style = style,
            state = NoteUiState(
                variant = "",
                appearance = "",
                title = "Lorem Ipsum is simply dummy text of the printing and typesetting",
                text = LONG_TEXT,
                hasAction = true,
            ),
        ).apply {
            id = R.id.note
        }

    fun ComponentScope.noteCompactLScalableDefaultTitleTextHasCloseHasAction(style: Int) =
        noteCompact(
            context = context,
            style = style,
            state = NoteUiState(
                variant = "",
                appearance = "",
                title = "Title",
                text = "Text",
                hasAction = true,
            ),
        ).apply {
            id = R.id.note
        }

    fun ComponentScope.noteXsScalableInfoHasCloseTitleText(style: Int) =
        note(
            context = context,
            style = style,
            state = NoteUiState(
                variant = "",
                appearance = "",
                title = "Title",
                text = "Text",
                hasAction = false,
            ),
        ).apply {
            id = R.id.note
        }

    fun ComponentScope.noteLDefaultNoTitleNoText(style: Int) =
        note(
            context = context,
            style = style,
            state = NoteUiState(
                variant = "",
                appearance = "",
                title = "",
                text = "",
                hasAction = false,
            ),
        ).apply {
            id = R.id.note
        }
}

private const val LONG_TEXT =
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
            "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
            "It has survived not only five centuries, but also the leap into electronic typesetting, " +
            "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
            "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
            "like Aldus PageMaker including versions of Lorem Ipsum."
