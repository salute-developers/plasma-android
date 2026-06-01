// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.file.Default
import com.sdds.serv.styles.file.FileCircularProgress
import com.sdds.serv.styles.file.FileCircularProgressSize
import com.sdds.serv.styles.file.FileCircularProgressView
import com.sdds.serv.styles.file.FileStyles
import com.sdds.serv.styles.file.L
import com.sdds.serv.styles.file.M
import com.sdds.serv.styles.file.Negative
import com.sdds.serv.styles.file.S
import com.sdds.serv.styles.file.Xs
import com.sdds.serv.styles.file.resolve

internal object SddsServFileCircularProgressVariationsCompose : ComposeStyleProvider<FileStyle>() {
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
