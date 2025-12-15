package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.file.Default
import com.sdds.serv.styles.file.FileLinearProgress
import com.sdds.serv.styles.file.L
import com.sdds.serv.styles.file.M
import com.sdds.serv.styles.file.Negative
import com.sdds.serv.styles.file.S
import com.sdds.serv.styles.file.Xs

internal object SddsServFileLinearProgressVariationsCompose : ComposeStyleProvider<String, FileStyle>() {
    override val variations: Map<String, @Composable () -> FileStyle> =
        mapOf(
            "Xs.Default" to { FileLinearProgress.Xs.Default.style() },
            "Xs.Negative" to { FileLinearProgress.Xs.Negative.style() },
            "S.Default" to { FileLinearProgress.S.Default.style() },
            "S.Negative" to { FileLinearProgress.S.Negative.style() },
            "M.Default" to { FileLinearProgress.M.Default.style() },
            "M.Negative" to { FileLinearProgress.M.Negative.style() },
            "L.Default" to { FileLinearProgress.L.Default.style() },
            "L.Negative" to { FileLinearProgress.L.Negative.style() },
        )
}
