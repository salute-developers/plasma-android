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
import com.sdds.plasma.sd.service.styles.file.FileLinearProgress
import com.sdds.plasma.sd.service.styles.file.FileLinearProgressSize
import com.sdds.plasma.sd.service.styles.file.FileLinearProgressView
import com.sdds.plasma.sd.service.styles.file.FileStyles
import com.sdds.plasma.sd.service.styles.file.L
import com.sdds.plasma.sd.service.styles.file.M
import com.sdds.plasma.sd.service.styles.file.Negative
import com.sdds.plasma.sd.service.styles.file.S
import com.sdds.plasma.sd.service.styles.file.Xs
import com.sdds.plasma.sd.service.styles.file.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cFileLinearProgressVariationsCompose : ComposeStyleProvider<FileStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xs", variants = listOf("Xs", "S", "M", "L")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Negative")),
        )

    override val variations: Map<String, ComposeStyleReference<FileStyle>> =
        mapOf(
            "FileLinearProgress.Xs.Default" to ComposeStyleReference { FileLinearProgress.Xs.Default.style() },
            "FileLinearProgress.Xs.Negative" to ComposeStyleReference { FileLinearProgress.Xs.Negative.style() },
            "FileLinearProgress.S.Default" to ComposeStyleReference { FileLinearProgress.S.Default.style() },
            "FileLinearProgress.S.Negative" to ComposeStyleReference { FileLinearProgress.S.Negative.style() },
            "FileLinearProgress.M.Default" to ComposeStyleReference { FileLinearProgress.M.Default.style() },
            "FileLinearProgress.M.Negative" to ComposeStyleReference { FileLinearProgress.M.Negative.style() },
            "FileLinearProgress.L.Default" to ComposeStyleReference { FileLinearProgress.L.Default.style() },
            "FileLinearProgress.L.Negative" to ComposeStyleReference { FileLinearProgress.L.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return FileStyles.LinearProgress.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> FileLinearProgressSize.Xs
                "S" -> FileLinearProgressSize.S
                "M" -> FileLinearProgressSize.M
                "L" -> FileLinearProgressSize.L
                else -> FileLinearProgressSize.Xs
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> FileLinearProgressView.Default
                "Negative" -> FileLinearProgressView.Negative
                else -> FileLinearProgressView.Default
            },
        ).key
    }
}
