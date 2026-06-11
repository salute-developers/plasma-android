// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.file.Default
import com.sdds.plasma.sd.service.styles.file.FileCircularProgress
import com.sdds.plasma.sd.service.styles.file.FileCircularProgressSize
import com.sdds.plasma.sd.service.styles.file.FileCircularProgressView
import com.sdds.plasma.sd.service.styles.file.FileStyles
import com.sdds.plasma.sd.service.styles.file.L
import com.sdds.plasma.sd.service.styles.file.M
import com.sdds.plasma.sd.service.styles.file.Negative
import com.sdds.plasma.sd.service.styles.file.S
import com.sdds.plasma.sd.service.styles.file.Xs
import com.sdds.plasma.sd.service.styles.file.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cFileCircularProgressVariationsCompose : ComposeStyleProvider<FileStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xs", variants = listOf("Xs", "S", "M", "L")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Negative")),
        )

    override val variations: Map<String, ComposeStyleReference<FileStyle>> =
        mapOf(
            "FileCircularProgress.Xs.Default" to ComposeStyleReference { FileCircularProgress.Xs.Default.style() },
            "FileCircularProgress.Xs.Negative" to ComposeStyleReference { FileCircularProgress.Xs.Negative.style() },
            "FileCircularProgress.S.Default" to ComposeStyleReference { FileCircularProgress.S.Default.style() },
            "FileCircularProgress.S.Negative" to ComposeStyleReference { FileCircularProgress.S.Negative.style() },
            "FileCircularProgress.M.Default" to ComposeStyleReference { FileCircularProgress.M.Default.style() },
            "FileCircularProgress.M.Negative" to ComposeStyleReference { FileCircularProgress.M.Negative.style() },
            "FileCircularProgress.L.Default" to ComposeStyleReference { FileCircularProgress.L.Default.style() },
            "FileCircularProgress.L.Negative" to ComposeStyleReference { FileCircularProgress.L.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return FileStyles.CircularProgress.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> FileCircularProgressSize.Xs
                "S" -> FileCircularProgressSize.S
                "M" -> FileCircularProgressSize.M
                "L" -> FileCircularProgressSize.L
                else -> FileCircularProgressSize.Xs
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> FileCircularProgressView.Default
                "Negative" -> FileCircularProgressView.Negative
                else -> FileCircularProgressView.Default
            },
        ).key
    }
}
