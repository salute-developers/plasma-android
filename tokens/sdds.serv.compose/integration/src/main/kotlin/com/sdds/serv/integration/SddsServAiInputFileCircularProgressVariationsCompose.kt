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
import com.sdds.serv.styles.file.AiInputFileCircularProgress
import com.sdds.serv.styles.file.AiInputFileCircularProgressSize
import com.sdds.serv.styles.file.AiInputFileCircularProgressView
import com.sdds.serv.styles.file.Default
import com.sdds.serv.styles.file.FileStyles
import com.sdds.serv.styles.file.L
import com.sdds.serv.styles.file.M
import com.sdds.serv.styles.file.Negative
import com.sdds.serv.styles.file.S
import com.sdds.serv.styles.file.Xs
import com.sdds.serv.styles.file.resolve

internal object SddsServAiInputFileCircularProgressVariationsCompose : ComposeStyleProvider<FileStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xs", variants = listOf("Xs", "S", "M", "L")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Negative")),
        )

    override val variations: Map<String, ComposeStyleReference<FileStyle>> =
        mapOf(
            "AiInputFileCircularProgress.Xs.Default" to ComposeStyleReference { AiInputFileCircularProgress.Xs.Default.style() },
            "AiInputFileCircularProgress.Xs.Negative" to ComposeStyleReference { AiInputFileCircularProgress.Xs.Negative.style() },
            "AiInputFileCircularProgress.S.Default" to ComposeStyleReference { AiInputFileCircularProgress.S.Default.style() },
            "AiInputFileCircularProgress.S.Negative" to ComposeStyleReference { AiInputFileCircularProgress.S.Negative.style() },
            "AiInputFileCircularProgress.M.Default" to ComposeStyleReference { AiInputFileCircularProgress.M.Default.style() },
            "AiInputFileCircularProgress.M.Negative" to ComposeStyleReference { AiInputFileCircularProgress.M.Negative.style() },
            "AiInputFileCircularProgress.L.Default" to ComposeStyleReference { AiInputFileCircularProgress.L.Default.style() },
            "AiInputFileCircularProgress.L.Negative" to ComposeStyleReference { AiInputFileCircularProgress.L.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return FileStyles.AiInputFileCircularProgress.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AiInputFileCircularProgressSize.Xs
                "S" -> AiInputFileCircularProgressSize.S
                "M" -> AiInputFileCircularProgressSize.M
                "L" -> AiInputFileCircularProgressSize.L
                else -> AiInputFileCircularProgressSize.Xs
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> AiInputFileCircularProgressView.Default
                "Negative" -> AiInputFileCircularProgressView.Negative
                else -> AiInputFileCircularProgressView.Default
            },
        ).key
    }
}
