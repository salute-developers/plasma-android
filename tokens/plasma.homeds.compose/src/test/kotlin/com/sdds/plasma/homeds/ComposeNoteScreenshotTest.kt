package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.note.ContentBeforeFixed
import com.sdds.plasma.homeds.styles.note.ContentBeforeScalable
import com.sdds.plasma.homeds.styles.note.Default
import com.sdds.plasma.homeds.styles.note.HasClose
import com.sdds.plasma.homeds.styles.note.Info
import com.sdds.plasma.homeds.styles.note.Negative
import com.sdds.plasma.homeds.styles.note.Note
import com.sdds.plasma.homeds.styles.note.Warning
import com.sdds.plasma.homeds.styles.notecompact.ContentBeforeFixed
import com.sdds.plasma.homeds.styles.notecompact.ContentBeforeScalable
import com.sdds.plasma.homeds.styles.notecompact.Default
import com.sdds.plasma.homeds.styles.notecompact.HasClose
import com.sdds.plasma.homeds.styles.notecompact.Info
import com.sdds.plasma.homeds.styles.notecompact.NoteCompact
import com.sdds.plasma.homeds.styles.notecompact.Positive
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
            NoteCompactTitleTextHasAction(NoteCompact.ContentBeforeFixed.Default.style())
        }
    }

    @Test
    fun testNoteCompactHasCloseMPositive() {
        composeTestRule.content {
            NoteCompactHasCloseTitleText(NoteCompact.ContentBeforeFixed.HasClose.Positive.style())
        }
    }

    @Test
    fun testNoteSNegativeTitleTextHasAction() {
        composeTestRule.content {
            NoteTitleTextHasAction(Note.ContentBeforeFixed.Negative.style())
        }
    }

    @Test
    fun testNoteHasCloseXsWarningTitleText() {
        composeTestRule.content {
            NoteHasCloseTitleText(Note.ContentBeforeFixed.HasClose.Warning.style())
        }
    }

    @Test
    fun testNoteCompactLongTextInfo() {
        composeTestRule.content {
            NoteCompactHasCloseLongText(NoteCompact.ContentBeforeFixed.HasClose.Info.style())
        }
    }

    @Test
    fun testNoteHasCloseLongTitleLongText() {
        composeTestRule.content {
            NoteHasCloseLongTitleLongTextHasAction(Note.ContentBeforeFixed.HasClose.Default.style())
        }
    }

    @Test
    fun testNoteCompactHasCloseLScalableDefault() {
        composeTestRule.content {
            NoteCompactLScalableDefaultTitleTextHasAction(NoteCompact.ContentBeforeScalable.HasClose.Default.style())
        }
    }

    @Test
    fun testNoteHasCloseXsScalableInfo() {
        composeTestRule.content {
            NoteHasCloseNoAction(Note.ContentBeforeScalable.HasClose.Info.style())
        }
    }

    @Test
    fun testNoteLDefaultNoTitleNoText() {
        composeTestRule.content {
            NoteNoTitleNoText(Note.ContentBeforeFixed.Default.style())
        }
    }
}
