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
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.chip.Accent
import com.sdds.serv.styles.chip.ChipStyles
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.EmbeddedChip
import com.sdds.serv.styles.chip.EmbeddedChipSize
import com.sdds.serv.styles.chip.EmbeddedChipView
import com.sdds.serv.styles.chip.L
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.chip.Negative
import com.sdds.serv.styles.chip.Positive
import com.sdds.serv.styles.chip.S
import com.sdds.serv.styles.chip.Secondary
import com.sdds.serv.styles.chip.Warning
import com.sdds.serv.styles.chip.Xl
import com.sdds.serv.styles.chip.Xs
import com.sdds.serv.styles.chip.resolve

internal object SddsServEmbeddedChipVariationsCompose : ComposeStyleProvider<ChipStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Negative", "Positive", "Secondary", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "EmbeddedChip.Xl.Default" to ComposeStyleReference { EmbeddedChip.Xl.Default.style() },
            "EmbeddedChip.Xl.Accent" to ComposeStyleReference { EmbeddedChip.Xl.Accent.style() },
            "EmbeddedChip.Xl.Negative" to ComposeStyleReference { EmbeddedChip.Xl.Negative.style() },
            "EmbeddedChip.Xl.Positive" to ComposeStyleReference { EmbeddedChip.Xl.Positive.style() },
            "EmbeddedChip.Xl.Secondary" to ComposeStyleReference { EmbeddedChip.Xl.Secondary.style() },
            "EmbeddedChip.Xl.Warning" to ComposeStyleReference { EmbeddedChip.Xl.Warning.style() },
            "EmbeddedChip.L.Default" to ComposeStyleReference { EmbeddedChip.L.Default.style() },
            "EmbeddedChip.L.Accent" to ComposeStyleReference { EmbeddedChip.L.Accent.style() },
            "EmbeddedChip.L.Negative" to ComposeStyleReference { EmbeddedChip.L.Negative.style() },
            "EmbeddedChip.L.Positive" to ComposeStyleReference { EmbeddedChip.L.Positive.style() },
            "EmbeddedChip.L.Secondary" to ComposeStyleReference { EmbeddedChip.L.Secondary.style() },
            "EmbeddedChip.L.Warning" to ComposeStyleReference { EmbeddedChip.L.Warning.style() },
            "EmbeddedChip.M.Default" to ComposeStyleReference { EmbeddedChip.M.Default.style() },
            "EmbeddedChip.M.Accent" to ComposeStyleReference { EmbeddedChip.M.Accent.style() },
            "EmbeddedChip.M.Negative" to ComposeStyleReference { EmbeddedChip.M.Negative.style() },
            "EmbeddedChip.M.Positive" to ComposeStyleReference { EmbeddedChip.M.Positive.style() },
            "EmbeddedChip.M.Secondary" to ComposeStyleReference { EmbeddedChip.M.Secondary.style() },
            "EmbeddedChip.M.Warning" to ComposeStyleReference { EmbeddedChip.M.Warning.style() },
            "EmbeddedChip.S.Default" to ComposeStyleReference { EmbeddedChip.S.Default.style() },
            "EmbeddedChip.S.Accent" to ComposeStyleReference { EmbeddedChip.S.Accent.style() },
            "EmbeddedChip.S.Negative" to ComposeStyleReference { EmbeddedChip.S.Negative.style() },
            "EmbeddedChip.S.Positive" to ComposeStyleReference { EmbeddedChip.S.Positive.style() },
            "EmbeddedChip.S.Secondary" to ComposeStyleReference { EmbeddedChip.S.Secondary.style() },
            "EmbeddedChip.S.Warning" to ComposeStyleReference { EmbeddedChip.S.Warning.style() },
            "EmbeddedChip.Xs.Default" to ComposeStyleReference { EmbeddedChip.Xs.Default.style() },
            "EmbeddedChip.Xs.Accent" to ComposeStyleReference { EmbeddedChip.Xs.Accent.style() },
            "EmbeddedChip.Xs.Negative" to ComposeStyleReference { EmbeddedChip.Xs.Negative.style() },
            "EmbeddedChip.Xs.Positive" to ComposeStyleReference { EmbeddedChip.Xs.Positive.style() },
            "EmbeddedChip.Xs.Secondary" to ComposeStyleReference { EmbeddedChip.Xs.Secondary.style() },
            "EmbeddedChip.Xs.Warning" to ComposeStyleReference { EmbeddedChip.Xs.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipStyles.EmbeddedChip.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> EmbeddedChipSize.Xl
                "L" -> EmbeddedChipSize.L
                "M" -> EmbeddedChipSize.M
                "S" -> EmbeddedChipSize.S
                "Xs" -> EmbeddedChipSize.Xs
                else -> EmbeddedChipSize.Xl
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> EmbeddedChipView.Default
                "Accent" -> EmbeddedChipView.Accent
                "Negative" -> EmbeddedChipView.Negative
                "Positive" -> EmbeddedChipView.Positive
                "Secondary" -> EmbeddedChipView.Secondary
                "Warning" -> EmbeddedChipView.Warning
                else -> EmbeddedChipView.Default
            },
        ).key
    }
}
