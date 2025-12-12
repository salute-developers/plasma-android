package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.file.Default
import com.sdds.serv.styles.file.FileCircularProgress
import com.sdds.serv.styles.file.L
import com.sdds.serv.styles.file.M
import com.sdds.serv.styles.file.Negative
import com.sdds.serv.styles.file.S
import com.sdds.serv.styles.file.Xs

internal object SddsServFileCircularProgressVariationsCompose : ComposeStyleProvider<String, FileStyle>() {
    override val variations: Map<String, @Composable () -> FileStyle> =
        mapOf(
            "Xs.Default" to { FileCircularProgress.Xs.Default.style() },
            "Xs.Negative" to { FileCircularProgress.Xs.Negative.style() },
            "S.Default" to { FileCircularProgress.S.Default.style() },
            "S.Negative" to { FileCircularProgress.S.Negative.style() },
            "M.Default" to { FileCircularProgress.M.Default.style() },
            "M.Negative" to { FileCircularProgress.M.Negative.style() },
            "L.Default" to { FileCircularProgress.L.Default.style() },
            "L.Negative" to { FileCircularProgress.L.Negative.style() },
        )
}
