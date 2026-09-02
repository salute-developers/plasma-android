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
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.chipgroup.Accent
import com.sdds.finai.styles.chipgroup.ChipGroupSize
import com.sdds.finai.styles.chipgroup.ChipGroupStyles
import com.sdds.finai.styles.chipgroup.ChipGroupView
import com.sdds.finai.styles.chipgroup.Default
import com.sdds.finai.styles.chipgroup.EmbeddedChipGroup
import com.sdds.finai.styles.chipgroup.Negative
import com.sdds.finai.styles.chipgroup.Positive
import com.sdds.finai.styles.chipgroup.S
import com.sdds.finai.styles.chipgroup.Secondary
import com.sdds.finai.styles.chipgroup.Warning
import com.sdds.finai.styles.chipgroup.Xs
import com.sdds.finai.styles.chipgroup.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiEmbeddedChipGroupVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S", "Xs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Negative", "Positive", "Secondary", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "EmbeddedChipGroup.S.Default" to ComposeStyleReference { EmbeddedChipGroup.S.Default.style() },
            "EmbeddedChipGroup.S.Accent" to ComposeStyleReference { EmbeddedChipGroup.S.Accent.style() },
            "EmbeddedChipGroup.S.Negative" to ComposeStyleReference { EmbeddedChipGroup.S.Negative.style() },
            "EmbeddedChipGroup.S.Positive" to ComposeStyleReference { EmbeddedChipGroup.S.Positive.style() },
            "EmbeddedChipGroup.S.Secondary" to ComposeStyleReference { EmbeddedChipGroup.S.Secondary.style() },
            "EmbeddedChipGroup.S.Warning" to ComposeStyleReference { EmbeddedChipGroup.S.Warning.style() },
            "EmbeddedChipGroup.Xs.Default" to ComposeStyleReference { EmbeddedChipGroup.Xs.Default.style() },
            "EmbeddedChipGroup.Xs.Accent" to ComposeStyleReference { EmbeddedChipGroup.Xs.Accent.style() },
            "EmbeddedChipGroup.Xs.Negative" to ComposeStyleReference { EmbeddedChipGroup.Xs.Negative.style() },
            "EmbeddedChipGroup.Xs.Positive" to ComposeStyleReference { EmbeddedChipGroup.Xs.Positive.style() },
            "EmbeddedChipGroup.Xs.Secondary" to ComposeStyleReference { EmbeddedChipGroup.Xs.Secondary.style() },
            "EmbeddedChipGroup.Xs.Warning" to ComposeStyleReference { EmbeddedChipGroup.Xs.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipGroupStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> ChipGroupSize.S
                "Xs" -> ChipGroupSize.Xs
                else -> ChipGroupSize.S
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipGroupView.Default
                "Accent" -> ChipGroupView.Accent
                "Negative" -> ChipGroupView.Negative
                "Positive" -> ChipGroupView.Positive
                "Secondary" -> ChipGroupView.Secondary
                "Warning" -> ChipGroupView.Warning
                else -> ChipGroupView.Default
            },
        ).key
    }
}
