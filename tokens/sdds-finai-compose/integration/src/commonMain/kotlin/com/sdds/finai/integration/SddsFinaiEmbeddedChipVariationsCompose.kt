// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.chip.Accent
import com.sdds.finai.styles.chip.ChipStyles
import com.sdds.finai.styles.chip.Default
import com.sdds.finai.styles.chip.EmbeddedChip
import com.sdds.finai.styles.chip.EmbeddedChipSize
import com.sdds.finai.styles.chip.EmbeddedChipView
import com.sdds.finai.styles.chip.Negative
import com.sdds.finai.styles.chip.Positive
import com.sdds.finai.styles.chip.S
import com.sdds.finai.styles.chip.Secondary
import com.sdds.finai.styles.chip.Warning
import com.sdds.finai.styles.chip.Xs
import com.sdds.finai.styles.chip.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiEmbeddedChipVariationsCompose : ComposeStyleProvider<ChipStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S", "Xs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Negative", "Positive", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "EmbeddedChip.S.Default" to ComposeStyleReference { EmbeddedChip.S.Default.style() },
            "EmbeddedChip.S.Secondary" to ComposeStyleReference { EmbeddedChip.S.Secondary.style() },
            "EmbeddedChip.S.Accent" to ComposeStyleReference { EmbeddedChip.S.Accent.style() },
            "EmbeddedChip.S.Negative" to ComposeStyleReference { EmbeddedChip.S.Negative.style() },
            "EmbeddedChip.S.Positive" to ComposeStyleReference { EmbeddedChip.S.Positive.style() },
            "EmbeddedChip.S.Warning" to ComposeStyleReference { EmbeddedChip.S.Warning.style() },
            "EmbeddedChip.Xs.Default" to ComposeStyleReference { EmbeddedChip.Xs.Default.style() },
            "EmbeddedChip.Xs.Secondary" to ComposeStyleReference { EmbeddedChip.Xs.Secondary.style() },
            "EmbeddedChip.Xs.Accent" to ComposeStyleReference { EmbeddedChip.Xs.Accent.style() },
            "EmbeddedChip.Xs.Negative" to ComposeStyleReference { EmbeddedChip.Xs.Negative.style() },
            "EmbeddedChip.Xs.Positive" to ComposeStyleReference { EmbeddedChip.Xs.Positive.style() },
            "EmbeddedChip.Xs.Warning" to ComposeStyleReference { EmbeddedChip.Xs.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipStyles.EmbeddedChip.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> EmbeddedChipSize.S
                "Xs" -> EmbeddedChipSize.Xs
                else -> EmbeddedChipSize.S
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> EmbeddedChipView.Default
                "Secondary" -> EmbeddedChipView.Secondary
                "Accent" -> EmbeddedChipView.Accent
                "Negative" -> EmbeddedChipView.Negative
                "Positive" -> EmbeddedChipView.Positive
                "Warning" -> EmbeddedChipView.Warning
                else -> EmbeddedChipView.Default
            },
        ).key
    }
}
