package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.note.Default
import com.sdds.serv.styles.note.HasClose
import com.sdds.serv.styles.note.HasCloseContentScalable
import com.sdds.serv.styles.note.Info
import com.sdds.serv.styles.note.L
import com.sdds.serv.styles.note.Negative
import com.sdds.serv.styles.note.Note
import com.sdds.serv.styles.note.S
import com.sdds.serv.styles.note.Warning
import com.sdds.serv.styles.note.Xs
import com.sdds.serv.styles.notecompact.Default
import com.sdds.serv.styles.notecompact.HasClose
import com.sdds.serv.styles.notecompact.HasCloseContentScalable
import com.sdds.serv.styles.notecompact.Info
import com.sdds.serv.styles.notecompact.L
import com.sdds.serv.styles.notecompact.M
import com.sdds.serv.styles.notecompact.NoteCompact
import com.sdds.serv.styles.notecompact.Positive
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.note.NoteCompactHasCloseLongText
import com.sdds.testing.compose.note.NoteCompactHasCloseTitleText
import com.sdds.testing.compose.note.NoteCompactLScalableDefaultTitleTextHasAction
import com.sdds.testing.compose.note.NoteCompactTitleTextHasAction
import com.sdds.testing.compose.note.NoteHasCloseLongTitleLongTextHasAction
import com.sdds.testing.compose.note.NoteHasCloseNoAction
import com.sdds.testing.compose.note.NoteHasCloseTitleText
import com.sdds.testing.compose.note.NoteNoTitleNoText
import com.sdds.testing.compose.note.NoteTitleTextHasAction
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeNoteScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testNoteCompactLDefaultTitleTextHasAction() {
        composeTestRule.content {
            NoteCompactTitleTextHasAction(NoteCompact.L.Default.style())
        }
    }

    @Test
    fun testNoteCompactHasCloseMPositive() {
        composeTestRule.content {
            NoteCompactHasCloseTitleText(NoteCompact.M.HasClose.Positive.style())
        }
    }

    @Test
    fun testNoteSNegativeTitleTextHasAction() {
        composeTestRule.content {
            NoteTitleTextHasAction(Note.S.Negative.style())
        }
    }

    @Test
    fun testNoteHasCloseXsWarningTitleText() {
        composeTestRule.content {
            NoteHasCloseTitleText(Note.Xs.HasClose.Warning.style())
        }
    }

    @Test
    fun testNoteCompactLongTextInfo() {
        composeTestRule.content {
            NoteCompactHasCloseLongText(NoteCompact.L.HasClose.Info.style())
        }
    }

    @Test
    fun testNoteHasCloseLongTitleLongText() {
        composeTestRule.content {
            NoteHasCloseLongTitleLongTextHasAction(Note.L.HasClose.Default.style())
        }
    }

    @Test
    fun testNoteCompactHasCloseLScalableDefault() {
        composeTestRule.content {
            NoteCompactLScalableDefaultTitleTextHasAction(NoteCompact.L.HasCloseContentScalable.Default.style())
        }
    }

    @Test
    fun testNoteHasCloseXsScalableInfo() {
        composeTestRule.content {
            NoteHasCloseNoAction(Note.Xs.HasCloseContentScalable.Info.style())
        }
    }

    @Test
    fun testNoteLDefaultNoTitleNoText() {
        composeTestRule.content {
            NoteNoTitleNoText(Note.L.Default.style())
        }
    }
}
