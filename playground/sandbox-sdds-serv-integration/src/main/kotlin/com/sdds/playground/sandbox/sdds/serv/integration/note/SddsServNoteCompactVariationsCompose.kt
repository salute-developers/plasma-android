package com.sdds.playground.sandbox.sdds.serv.integration.note

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NoteCompactStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.notecompact.ContentScalable
import com.sdds.serv.styles.notecompact.Default
import com.sdds.serv.styles.notecompact.HasClose
import com.sdds.serv.styles.notecompact.HasCloseContentScalable
import com.sdds.serv.styles.notecompact.Info
import com.sdds.serv.styles.notecompact.L
import com.sdds.serv.styles.notecompact.M
import com.sdds.serv.styles.notecompact.Negative
import com.sdds.serv.styles.notecompact.NoteCompact
import com.sdds.serv.styles.notecompact.Positive
import com.sdds.serv.styles.notecompact.S
import com.sdds.serv.styles.notecompact.Warning
import com.sdds.serv.styles.notecompact.Xs

internal object SddsServNoteCompactVariationsCompose :
    ComposeStyleProvider<String, NoteCompactStyle>() {
    override val variations: Map<String, @Composable () -> NoteCompactStyle> =
        mapOf(
            "LDefault" to { NoteCompact.L.Default.style() },
            "MDefault" to { NoteCompact.M.Default.style() },
            "SDefault" to { NoteCompact.S.Default.style() },
            "XsDefault" to { NoteCompact.Xs.Default.style() },

            "LContentScalableDefault" to { NoteCompact.L.ContentScalable.Default.style() },
            "MContentScalableDefault" to { NoteCompact.M.ContentScalable.Default.style() },
            "SContentScalableDefault" to { NoteCompact.S.ContentScalable.Default.style() },
            "XsContentScalableDefault" to { NoteCompact.Xs.ContentScalable.Default.style() },

            "LHasCloseDefault" to { NoteCompact.L.HasClose.Default.style() },
            "MHasCloseDefault" to { NoteCompact.M.HasClose.Default.style() },
            "SHasCloseDefault" to { NoteCompact.S.HasClose.Default.style() },
            "XsHasCloseDefault" to { NoteCompact.Xs.HasClose.Default.style() },

            "LHasCloseContentScalableDefault" to { NoteCompact.L.HasCloseContentScalable.Default.style() },
            "MHasCloseContentScalableDefault" to { NoteCompact.M.HasCloseContentScalable.Default.style() },
            "SHasCloseContentScalableDefault" to { NoteCompact.S.HasCloseContentScalable.Default.style() },
            "XsHasCloseContentScalableDefault" to { NoteCompact.Xs.HasCloseContentScalable.Default.style() },

            "LPositive" to { NoteCompact.L.Positive.style() },
            "MPositive" to { NoteCompact.M.Positive.style() },
            "SPositive" to { NoteCompact.S.Positive.style() },
            "XsPositive" to { NoteCompact.Xs.Positive.style() },

            "LContentScalablePositive" to { NoteCompact.L.ContentScalable.Positive.style() },
            "MContentScalablePositive" to { NoteCompact.M.ContentScalable.Positive.style() },
            "SContentScalablePositive" to { NoteCompact.S.ContentScalable.Positive.style() },
            "XsContentScalablePositive" to { NoteCompact.Xs.ContentScalable.Positive.style() },

            "LHasClosePositive" to { NoteCompact.L.HasClose.Positive.style() },
            "MHasClosePositive" to { NoteCompact.M.HasClose.Positive.style() },
            "SHasClosePositive" to { NoteCompact.S.HasClose.Positive.style() },
            "XsHasClosePositive" to { NoteCompact.Xs.HasClose.Positive.style() },

            "LHasCloseContentScalablePositive" to { NoteCompact.L.HasCloseContentScalable.Positive.style() },
            "MHasCloseContentScalablePositive" to { NoteCompact.M.HasCloseContentScalable.Positive.style() },
            "SHasCloseContentScalablePositive" to { NoteCompact.S.HasCloseContentScalable.Positive.style() },
            "XsHasCloseContentScalablePositive" to { NoteCompact.Xs.HasCloseContentScalable.Positive.style() },

            "LNegative" to { NoteCompact.L.Negative.style() },
            "MNegative" to { NoteCompact.M.Negative.style() },
            "SNegative" to { NoteCompact.S.Negative.style() },
            "XsNegative" to { NoteCompact.Xs.Negative.style() },

            "LContentScalableNegative" to { NoteCompact.L.ContentScalable.Negative.style() },
            "MContentScalableNegative" to { NoteCompact.M.ContentScalable.Negative.style() },
            "SContentScalableNegative" to { NoteCompact.S.ContentScalable.Negative.style() },
            "XsContentScalableNegative" to { NoteCompact.Xs.ContentScalable.Negative.style() },

            "LHasCloseNegative" to { NoteCompact.L.HasClose.Negative.style() },
            "MHasCloseNegative" to { NoteCompact.M.HasClose.Negative.style() },
            "SHasCloseNegative" to { NoteCompact.S.HasClose.Negative.style() },
            "XsHasCloseNegative" to { NoteCompact.Xs.HasClose.Negative.style() },

            "LHasCloseContentScalableNegative" to { NoteCompact.L.HasCloseContentScalable.Negative.style() },
            "MHasCloseContentScalableNegative" to { NoteCompact.M.HasCloseContentScalable.Negative.style() },
            "SHasCloseContentScalableNegative" to { NoteCompact.S.HasCloseContentScalable.Negative.style() },
            "XsHasCloseContentScalableNegative" to { NoteCompact.Xs.HasCloseContentScalable.Negative.style() },

            "LWarning" to { NoteCompact.L.Warning.style() },
            "MWarning" to { NoteCompact.M.Warning.style() },
            "SWarning" to { NoteCompact.S.Warning.style() },
            "XsWarning" to { NoteCompact.Xs.Warning.style() },

            "LContentScalableWarning" to { NoteCompact.L.ContentScalable.Warning.style() },
            "MContentScalableWarning" to { NoteCompact.M.ContentScalable.Warning.style() },
            "SContentScalableWarning" to { NoteCompact.S.ContentScalable.Warning.style() },
            "XsContentScalableWarning" to { NoteCompact.Xs.ContentScalable.Warning.style() },

            "LHasCloseWarning" to { NoteCompact.L.HasClose.Warning.style() },
            "MHasCloseWarning" to { NoteCompact.M.HasClose.Warning.style() },
            "SHasCloseWarning" to { NoteCompact.S.HasClose.Warning.style() },
            "XsHasCloseWarning" to { NoteCompact.Xs.HasClose.Warning.style() },

            "LHasCloseContentScalableWarning" to { NoteCompact.L.HasCloseContentScalable.Warning.style() },
            "MHasCloseContentScalableWarning" to { NoteCompact.M.HasCloseContentScalable.Warning.style() },
            "SHasCloseContentScalableWarning" to { NoteCompact.S.HasCloseContentScalable.Warning.style() },
            "XsHasCloseContentScalableWarning" to { NoteCompact.Xs.HasCloseContentScalable.Warning.style() },

            "LInfo" to { NoteCompact.L.Info.style() },
            "MInfo" to { NoteCompact.M.Info.style() },
            "SInfo" to { NoteCompact.S.Info.style() },
            "XsInfo" to { NoteCompact.Xs.Info.style() },

            "LContentScalableInfo" to { NoteCompact.L.ContentScalable.Info.style() },
            "MContentScalableInfo" to { NoteCompact.M.ContentScalable.Info.style() },
            "SContentScalableInfo" to { NoteCompact.S.ContentScalable.Info.style() },
            "XsContentScalableInfo" to { NoteCompact.Xs.ContentScalable.Info.style() },

            "LHasCloseInfo" to { NoteCompact.L.HasClose.Info.style() },
            "MHasCloseInfo" to { NoteCompact.M.HasClose.Info.style() },
            "SHasCloseInfo" to { NoteCompact.S.HasClose.Info.style() },
            "XsHasCloseInfo" to { NoteCompact.Xs.HasClose.Info.style() },

            "LHasCloseContentScalableInfo" to { NoteCompact.L.HasCloseContentScalable.Info.style() },
            "MHasCloseContentScalableInfo" to { NoteCompact.M.HasCloseContentScalable.Info.style() },
            "SHasCloseContentScalableInfo" to { NoteCompact.S.HasCloseContentScalable.Info.style() },
            "XsHasCloseContentScalableInfo" to { NoteCompact.Xs.HasCloseContentScalable.Info.style() },

        )
}
