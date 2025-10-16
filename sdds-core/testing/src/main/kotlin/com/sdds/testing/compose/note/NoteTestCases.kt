package com.sdds.testing.compose.note

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.Note
import com.sdds.compose.uikit.NoteCompact
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.NoteStyle
import com.sdds.icons.R

/**
 * Тест-кейсы для компонента [Note]
 */

/**
 * PLASMA-T2315
 */
@Composable
fun NoteCompactTitleTextHasAction(style: NoteCompactStyle) {
    NoteCompact(
        style = style,
        title = "Title",
        text = "Text",
        closeIconRes = null,
        contentBefore = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_36),
                contentDescription = null,
            )
        },
        action = {
            LinkButton(
                label = "Label",
                onClick = {},
            )
        },
    )
}

/**
 * PLASMA-T2316
 */
@Composable
fun NoteCompactHasCloseTitleText(style: NoteCompactStyle) {
    NoteCompact(
        style = style,
        title = "Title",
        text = "Text",
        closeIconRes = R.drawable.ic_close_24,
        contentBefore = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_24),
                contentDescription = null,
            )
        },
        action = null,
    )
}

/**
 * PLASMA-T2317
 */
@Composable
fun NoteTitleTextHasAction(style: NoteStyle) {
    Note(
        style = style,
        title = "Title",
        text = "Text",
        contentBefore = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_24),
                contentDescription = null,
            )
        },
        action = {
            LinkButton(
                label = "Label",
                onClick = {},
            )
        },
    )
}

/**
 * PLASMA-T2318
 */
@Composable
fun NoteHasCloseTitleText(style: NoteStyle) {
    Note(
        style = style,
        title = "Title",
        text = "Text",
        closeIconRes = R.drawable.ic_close_24,
        contentBefore = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_24),
                contentDescription = null,
            )
        },
        action = null,
    )
}

/**
 * PLASMA-T2319
 */
@Composable
fun NoteCompactHasCloseLongText(style: NoteCompactStyle) {
    NoteCompact(
        style = style,
        title = "Title",
        text = LONG_TEXT,
        closeIconRes = R.drawable.ic_close_24,
        contentBefore = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_24),
                contentDescription = null,
            )
        },
        action = null,
    )
}

/**
 * PLASMA-T2320
 */
@Composable
fun NoteHasCloseLongTitleLongTextHasAction(style: NoteStyle) {
    Note(
        style = style,
        title = "Lorem Ipsum is simply dummy text of the printing and typesetting",
        text = LONG_TEXT,
        closeIconRes = R.drawable.ic_close_24,
        contentBefore = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_24),
                contentDescription = null,
            )
        },
        action = {
            LinkButton(
                label = "Label",
                onClick = {},
            )
        },
    )
}

/**
 * PLASMA-T2322
 */
@Composable
fun NoteHasCloseNoAction(style: NoteStyle) {
    Note(
        style = style,
        title = "Title",
        text = "Text",
        closeIconRes = R.drawable.ic_close_24,
        contentBefore = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_36),
                contentDescription = null,
            )
        },
    )
}

/**
 * PLASMA-T2181
 */
@Composable
fun NoteCompactNoTitleNoText(style: NoteCompactStyle) {
    NoteCompact(
        style = style,
        title = "",
        text = "",
        closeIconRes = null,
        contentBefore = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_24),
                contentDescription = null,
            )
        },
        action = null,
    )
}

private const val LONG_TEXT =
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
        "It has survived not only five centuries, but also the leap into electronic typesetting, " +
        "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
        "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
        "like Aldus PageMaker including versions of Lorem Ipsum."
