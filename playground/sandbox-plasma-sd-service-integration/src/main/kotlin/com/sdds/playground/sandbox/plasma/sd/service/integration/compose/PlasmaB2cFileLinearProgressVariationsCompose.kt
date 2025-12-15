package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.file.Default
import com.sdds.plasma.sd.service.styles.file.FileLinearProgress
import com.sdds.plasma.sd.service.styles.file.L
import com.sdds.plasma.sd.service.styles.file.M
import com.sdds.plasma.sd.service.styles.file.Negative
import com.sdds.plasma.sd.service.styles.file.S
import com.sdds.plasma.sd.service.styles.file.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cFileLinearProgressVariationsCompose : ComposeStyleProvider<String, FileStyle>() {
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
