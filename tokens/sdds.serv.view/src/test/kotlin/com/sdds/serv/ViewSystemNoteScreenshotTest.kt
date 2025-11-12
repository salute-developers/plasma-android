package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.note.NoteTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemNoteScreenshotTest(
    theme: String,
) : NoteTestCases(theme) {

    @Test
    override fun testNoteCompactLDefaultTitleTextHasAction() {
        themedComponent {
            noteCompactLDefaultTitleTextHasAction(R.style.Serv_Sdds_ComponentOverlays_NoteCompactLDefault)
        }
    }

    @Test
    override fun testNoteCompactMPositiveTitleTextHasClose() {
        themedComponent {
            noteCompactMPositiveTitleTextHasClose(R.style.Serv_Sdds_ComponentOverlays_NoteCompactMHasClosePositive)
        }
    }

    @Test
    override fun testNoteSNegativeTitleTextHasAction() {
        themedComponent {
            noteSNegativeTitleTextHasAction(R.style.Serv_Sdds_ComponentOverlays_NoteSNegative)
        }
    }

    @Test
    override fun testNoteXsWarningTitleTextHasClose() {
        themedComponent {
            noteXsWarningTitleTextHasClose(R.style.Serv_Sdds_ComponentOverlays_NoteXsHasCloseWarning)
        }
    }

    @Test
    override fun testNoteCompactLInfoTitleLongTextHasClose() {
        themedComponent {
            noteCompactLInfoTitleLongTextHasClose(R.style.Serv_Sdds_ComponentOverlays_NoteCompactLHasCloseInfo)
        }
    }

    @Test
    override fun testNoteLDefaultLongTitleLongTextHasCloseHasAction() {
        themedComponent {
            noteLDefaultLongTitleLongTextHasCloseHasAction(R.style.Serv_Sdds_ComponentOverlays_NoteLHasCloseDefault)
        }
    }

    @Test
    override fun testNoteCompactLScalableDefaultTitleTextHasCloseHasAction() {
        themedComponent {
            noteCompactLScalableDefaultTitleTextHasCloseHasAction(
                R.style.Serv_Sdds_ComponentOverlays_NoteCompactLHasCloseContentScalableDefault,
            )
        }
    }

    @Test
    override fun testNoteXsScalableInfoHasCloseTitleText() {
        themedComponent {
            noteXsScalableInfoHasCloseTitleText(R.style.Serv_Sdds_ComponentOverlays_NoteXsHasCloseContentScalableInfo)
        }
    }

    @Test
    override fun testNoteLDefaultNoTitleNoText() {
        themedComponent {
            noteLDefaultNoTitleNoText(R.style.Serv_Sdds_ComponentOverlays_NoteLDefault)
        }
    }
}
