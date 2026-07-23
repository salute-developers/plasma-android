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
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.chipgroup.Accent
import com.sdds.serv.styles.chipgroup.ChipGroupStyles
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.EmbeddedChipGroupDense
import com.sdds.serv.styles.chipgroup.EmbeddedChipGroupDenseSize
import com.sdds.serv.styles.chipgroup.EmbeddedChipGroupDenseView
import com.sdds.serv.styles.chipgroup.L
import com.sdds.serv.styles.chipgroup.M
import com.sdds.serv.styles.chipgroup.Negative
import com.sdds.serv.styles.chipgroup.Positive
import com.sdds.serv.styles.chipgroup.S
import com.sdds.serv.styles.chipgroup.Secondary
import com.sdds.serv.styles.chipgroup.Warning
import com.sdds.serv.styles.chipgroup.Xl
import com.sdds.serv.styles.chipgroup.Xs
import com.sdds.serv.styles.chipgroup.resolve

internal object SddsServEmbeddedChipGroupDenseVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Negative", "Positive", "Secondary", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "EmbeddedChipGroupDense.Xl.Default" to ComposeStyleReference { EmbeddedChipGroupDense.Xl.Default.style() },
            "EmbeddedChipGroupDense.Xl.Accent" to ComposeStyleReference { EmbeddedChipGroupDense.Xl.Accent.style() },
            "EmbeddedChipGroupDense.Xl.Negative" to ComposeStyleReference { EmbeddedChipGroupDense.Xl.Negative.style() },
            "EmbeddedChipGroupDense.Xl.Positive" to ComposeStyleReference { EmbeddedChipGroupDense.Xl.Positive.style() },
            "EmbeddedChipGroupDense.Xl.Secondary" to ComposeStyleReference { EmbeddedChipGroupDense.Xl.Secondary.style() },
            "EmbeddedChipGroupDense.Xl.Warning" to ComposeStyleReference { EmbeddedChipGroupDense.Xl.Warning.style() },
            "EmbeddedChipGroupDense.L.Default" to ComposeStyleReference { EmbeddedChipGroupDense.L.Default.style() },
            "EmbeddedChipGroupDense.L.Accent" to ComposeStyleReference { EmbeddedChipGroupDense.L.Accent.style() },
            "EmbeddedChipGroupDense.L.Negative" to ComposeStyleReference { EmbeddedChipGroupDense.L.Negative.style() },
            "EmbeddedChipGroupDense.L.Positive" to ComposeStyleReference { EmbeddedChipGroupDense.L.Positive.style() },
            "EmbeddedChipGroupDense.L.Secondary" to ComposeStyleReference { EmbeddedChipGroupDense.L.Secondary.style() },
            "EmbeddedChipGroupDense.L.Warning" to ComposeStyleReference { EmbeddedChipGroupDense.L.Warning.style() },
            "EmbeddedChipGroupDense.M.Default" to ComposeStyleReference { EmbeddedChipGroupDense.M.Default.style() },
            "EmbeddedChipGroupDense.M.Accent" to ComposeStyleReference { EmbeddedChipGroupDense.M.Accent.style() },
            "EmbeddedChipGroupDense.M.Negative" to ComposeStyleReference { EmbeddedChipGroupDense.M.Negative.style() },
            "EmbeddedChipGroupDense.M.Positive" to ComposeStyleReference { EmbeddedChipGroupDense.M.Positive.style() },
            "EmbeddedChipGroupDense.M.Secondary" to ComposeStyleReference { EmbeddedChipGroupDense.M.Secondary.style() },
            "EmbeddedChipGroupDense.M.Warning" to ComposeStyleReference { EmbeddedChipGroupDense.M.Warning.style() },
            "EmbeddedChipGroupDense.S.Default" to ComposeStyleReference { EmbeddedChipGroupDense.S.Default.style() },
            "EmbeddedChipGroupDense.S.Accent" to ComposeStyleReference { EmbeddedChipGroupDense.S.Accent.style() },
            "EmbeddedChipGroupDense.S.Negative" to ComposeStyleReference { EmbeddedChipGroupDense.S.Negative.style() },
            "EmbeddedChipGroupDense.S.Positive" to ComposeStyleReference { EmbeddedChipGroupDense.S.Positive.style() },
            "EmbeddedChipGroupDense.S.Secondary" to ComposeStyleReference { EmbeddedChipGroupDense.S.Secondary.style() },
            "EmbeddedChipGroupDense.S.Warning" to ComposeStyleReference { EmbeddedChipGroupDense.S.Warning.style() },
            "EmbeddedChipGroupDense.Xs.Default" to ComposeStyleReference { EmbeddedChipGroupDense.Xs.Default.style() },
            "EmbeddedChipGroupDense.Xs.Accent" to ComposeStyleReference { EmbeddedChipGroupDense.Xs.Accent.style() },
            "EmbeddedChipGroupDense.Xs.Negative" to ComposeStyleReference { EmbeddedChipGroupDense.Xs.Negative.style() },
            "EmbeddedChipGroupDense.Xs.Positive" to ComposeStyleReference { EmbeddedChipGroupDense.Xs.Positive.style() },
            "EmbeddedChipGroupDense.Xs.Secondary" to ComposeStyleReference { EmbeddedChipGroupDense.Xs.Secondary.style() },
            "EmbeddedChipGroupDense.Xs.Warning" to ComposeStyleReference { EmbeddedChipGroupDense.Xs.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipGroupStyles.EmbeddedChipGroupDense.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> EmbeddedChipGroupDenseSize.Xl
                "L" -> EmbeddedChipGroupDenseSize.L
                "M" -> EmbeddedChipGroupDenseSize.M
                "S" -> EmbeddedChipGroupDenseSize.S
                "Xs" -> EmbeddedChipGroupDenseSize.Xs
                else -> EmbeddedChipGroupDenseSize.Xl
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> EmbeddedChipGroupDenseView.Default
                "Accent" -> EmbeddedChipGroupDenseView.Accent
                "Negative" -> EmbeddedChipGroupDenseView.Negative
                "Positive" -> EmbeddedChipGroupDenseView.Positive
                "Secondary" -> EmbeddedChipGroupDenseView.Secondary
                "Warning" -> EmbeddedChipGroupDenseView.Warning
                else -> EmbeddedChipGroupDenseView.Default
            },
        ).key
    }
}
