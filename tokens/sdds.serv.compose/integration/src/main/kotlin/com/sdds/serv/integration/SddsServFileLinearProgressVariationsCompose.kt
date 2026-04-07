// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.file.Default
import com.sdds.serv.styles.file.FileLinearProgress
import com.sdds.serv.styles.file.L
import com.sdds.serv.styles.file.M
import com.sdds.serv.styles.file.Negative
import com.sdds.serv.styles.file.S
import com.sdds.serv.styles.file.Xs

internal object SddsServFileLinearProgressVariationsCompose : ComposeStyleProvider<FileStyle>() {
    override val variations: Map<String, ComposeStyleReference<FileStyle>> =
        mapOf(
            "Xs.Default" to ComposeStyleReference { FileLinearProgress.Xs.Default.style() },
            "Xs.Negative" to ComposeStyleReference { FileLinearProgress.Xs.Negative.style() },
            "S.Default" to ComposeStyleReference { FileLinearProgress.S.Default.style() },
            "S.Negative" to ComposeStyleReference { FileLinearProgress.S.Negative.style() },
            "M.Default" to ComposeStyleReference { FileLinearProgress.M.Default.style() },
            "M.Negative" to ComposeStyleReference { FileLinearProgress.M.Negative.style() },
            "L.Default" to ComposeStyleReference { FileLinearProgress.L.Default.style() },
            "L.Negative" to ComposeStyleReference { FileLinearProgress.L.Negative.style() },
        )
}
