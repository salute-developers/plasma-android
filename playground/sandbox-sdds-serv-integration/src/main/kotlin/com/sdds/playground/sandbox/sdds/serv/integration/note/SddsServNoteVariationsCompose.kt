package com.sdds.playground.sandbox.sdds.serv.integration.note

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.note.ContentScalable
import com.sdds.serv.styles.note.Default
import com.sdds.serv.styles.note.HasClose
import com.sdds.serv.styles.note.HasCloseContentScalable
import com.sdds.serv.styles.note.Info
import com.sdds.serv.styles.note.L
import com.sdds.serv.styles.note.M
import com.sdds.serv.styles.note.Negative
import com.sdds.serv.styles.note.Note
import com.sdds.serv.styles.note.Positive
import com.sdds.serv.styles.note.S
import com.sdds.serv.styles.note.Warning
import com.sdds.serv.styles.note.Xs

internal object SddsServNoteVariationsCompose :
    ComposeStyleProvider<String, NoteStyle>() {
    override val variations: Map<String, @Composable () -> NoteStyle> =
        mapOf(
            "LDefault" to { Note.L.Default.style() },
            "MDefault" to { Note.M.Default.style() },
            "SDefault" to { Note.S.Default.style() },
            "XsDefault" to { Note.Xs.Default.style() },

            "LContentScalableDefault" to { Note.L.ContentScalable.Default.style() },
            "MContentScalableDefault" to { Note.M.ContentScalable.Default.style() },
            "SContentScalableDefault" to { Note.S.ContentScalable.Default.style() },
            "XsContentScalableDefault" to { Note.Xs.ContentScalable.Default.style() },

            "LHasCloseDefault" to { Note.L.HasClose.Default.style() },
            "MHasCloseDefault" to { Note.M.HasClose.Default.style() },
            "SHasCloseDefault" to { Note.S.HasClose.Default.style() },
            "XsHasCloseDefault" to { Note.Xs.HasClose.Default.style() },

            "LHasCloseContentScalableDefault" to { Note.L.HasCloseContentScalable.Default.style() },
            "MHasCloseDContentScalableefault" to { Note.M.HasCloseContentScalable.Default.style() },
            "SHasCloseContentScalableDefault" to { Note.S.HasCloseContentScalable.Default.style() },
            "XsHasCloseContentScalableDefault" to { Note.Xs.HasCloseContentScalable.Default.style() },

            "LPositive" to { Note.L.Positive.style() },
            "MPositive" to { Note.M.Positive.style() },
            "SPositive" to { Note.S.Positive.style() },
            "XsPositive" to { Note.Xs.Positive.style() },

            "LContentScalablePositive" to { Note.L.ContentScalable.Positive.style() },
            "MContentScalablePositive" to { Note.M.ContentScalable.Positive.style() },
            "SContentScalablePositive" to { Note.S.ContentScalable.Positive.style() },
            "XsContentScalablePositive" to { Note.Xs.ContentScalable.Positive.style() },

            "LHasClosePositive" to { Note.L.HasClose.Positive.style() },
            "MHasClosePositive" to { Note.M.HasClose.Positive.style() },
            "SHasClosePositive" to { Note.S.HasClose.Positive.style() },
            "XsHasClosePositive" to { Note.Xs.HasClose.Positive.style() },

            "LHasCloseContentScalablePositive" to { Note.L.HasCloseContentScalable.Positive.style() },
            "MHasCloseContentScalablePositive" to { Note.M.HasCloseContentScalable.Positive.style() },
            "SHasCloseContentScalablePositive" to { Note.S.HasCloseContentScalable.Positive.style() },
            "XsHasCloseContentScalablePositive" to { Note.Xs.HasCloseContentScalable.Positive.style() },

            "LNegative" to { Note.L.Negative.style() },
            "MNegative" to { Note.M.Negative.style() },
            "SNegative" to { Note.S.Negative.style() },
            "XsNegative" to { Note.Xs.Negative.style() },

            "LContentScalableNegative" to { Note.L.ContentScalable.Negative.style() },
            "MContentScalableNegative" to { Note.M.ContentScalable.Negative.style() },
            "SContentScalableNegative" to { Note.S.ContentScalable.Negative.style() },
            "XsContentScalableNegative" to { Note.Xs.ContentScalable.Negative.style() },

            "LHasCloseNegative" to { Note.L.HasClose.Negative.style() },
            "MHasCloseNegative" to { Note.M.HasClose.Negative.style() },
            "SHasCloseNegative" to { Note.S.HasClose.Negative.style() },
            "XsHasCloseNegative" to { Note.Xs.HasClose.Negative.style() },

            "LHasCloseContentScalableNegative" to { Note.L.HasCloseContentScalable.Negative.style() },
            "MHasCloseContentScalableNegative" to { Note.M.HasCloseContentScalable.Negative.style() },
            "SHasCloseContentScalableNegative" to { Note.S.HasCloseContentScalable.Negative.style() },
            "XsHasCloseContentScalableNegative" to { Note.Xs.HasCloseContentScalable.Negative.style() },

            "LWarning" to { Note.L.Warning.style() },
            "MWarning" to { Note.M.Warning.style() },
            "SWarning" to { Note.S.Warning.style() },
            "XsWarning" to { Note.Xs.Warning.style() },

            "LContentScalableWarning" to { Note.L.ContentScalable.Warning.style() },
            "MContentScalableWarning" to { Note.M.ContentScalable.Warning.style() },
            "SContentScalableWarning" to { Note.S.ContentScalable.Warning.style() },
            "XsContentScalableWarning" to { Note.Xs.ContentScalable.Warning.style() },

            "LHasCloseWarning" to { Note.L.HasClose.Warning.style() },
            "MHasCloseWarning" to { Note.M.HasClose.Warning.style() },
            "SHasCloseWarning" to { Note.S.HasClose.Warning.style() },
            "XsHasCloseWarning" to { Note.Xs.HasClose.Warning.style() },

            "LHasCloseContentScalableWarning" to { Note.L.HasCloseContentScalable.Warning.style() },
            "MHasCloseContentScalableWarning" to { Note.M.HasCloseContentScalable.Warning.style() },
            "SHasCloseContentScalableWarning" to { Note.S.HasCloseContentScalable.Warning.style() },
            "XsHasCloseContentScalableWarning" to { Note.Xs.HasCloseContentScalable.Warning.style() },

            "LInfo" to { Note.L.Info.style() },
            "MInfo" to { Note.M.Info.style() },
            "SInfo" to { Note.S.Info.style() },
            "XsInfo" to { Note.Xs.Info.style() },

            "LContentScalableInfo" to { Note.L.ContentScalable.Info.style() },
            "MContentScalableInfo" to { Note.M.ContentScalable.Info.style() },
            "SContentScalableInfo" to { Note.S.ContentScalable.Info.style() },
            "XsContentScalableInfo" to { Note.Xs.ContentScalable.Info.style() },

            "LHasCloseInfo" to { Note.L.HasClose.Info.style() },
            "MHasCloseInfo" to { Note.M.HasClose.Info.style() },
            "SHasCloseInfo" to { Note.S.HasClose.Info.style() },
            "XsHasCloseInfo" to { Note.Xs.HasClose.Info.style() },

            "LHasCloseContentScalableInfo" to { Note.L.HasCloseContentScalable.Info.style() },
            "MHasCloseContentScalableInfo" to { Note.M.HasCloseContentScalable.Info.style() },
            "SHasCloseContentScalableInfo" to { Note.S.HasCloseContentScalable.Info.style() },
            "XsHasCloseContentScalableInfo" to { Note.Xs.HasCloseContentScalable.Info.style() },

        )
}
