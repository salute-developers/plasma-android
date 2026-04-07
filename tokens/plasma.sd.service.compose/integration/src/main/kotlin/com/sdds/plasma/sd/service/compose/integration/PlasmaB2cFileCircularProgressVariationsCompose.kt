// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.file.Default
import com.sdds.plasma.sd.service.styles.file.FileCircularProgress
import com.sdds.plasma.sd.service.styles.file.L
import com.sdds.plasma.sd.service.styles.file.M
import com.sdds.plasma.sd.service.styles.file.Negative
import com.sdds.plasma.sd.service.styles.file.S
import com.sdds.plasma.sd.service.styles.file.Xs

internal object PlasmaB2cFileCircularProgressVariationsCompose : ComposeStyleProvider<FileStyle>() {
    override val variations: Map<String, ComposeStyleReference<FileStyle>> =
        mapOf(
            "Xs.Default" to ComposeStyleReference { FileCircularProgress.Xs.Default.style() },
            "Xs.Negative" to ComposeStyleReference { FileCircularProgress.Xs.Negative.style() },
            "S.Default" to ComposeStyleReference { FileCircularProgress.S.Default.style() },
            "S.Negative" to ComposeStyleReference { FileCircularProgress.S.Negative.style() },
            "M.Default" to ComposeStyleReference { FileCircularProgress.M.Default.style() },
            "M.Negative" to ComposeStyleReference { FileCircularProgress.M.Negative.style() },
            "L.Default" to ComposeStyleReference { FileCircularProgress.L.Default.style() },
            "L.Negative" to ComposeStyleReference { FileCircularProgress.L.Negative.style() },
        )
}
