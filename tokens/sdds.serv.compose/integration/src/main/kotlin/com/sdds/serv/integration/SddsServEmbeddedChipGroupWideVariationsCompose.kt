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
import com.sdds.serv.styles.chipgroup.ChipGroupEmbeddedChipGroupWideSize
import com.sdds.serv.styles.chipgroup.ChipGroupEmbeddedChipGroupWideView
import com.sdds.serv.styles.chipgroup.ChipGroupStyles
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.EmbeddedChipGroupWide
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

internal object SddsServEmbeddedChipGroupWideVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
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
            "EmbeddedChipGroupWide.Xl.Default" to ComposeStyleReference { EmbeddedChipGroupWide.Xl.Default.style() },
            "EmbeddedChipGroupWide.Xl.Accent" to ComposeStyleReference { EmbeddedChipGroupWide.Xl.Accent.style() },
            "EmbeddedChipGroupWide.Xl.Negative" to ComposeStyleReference { EmbeddedChipGroupWide.Xl.Negative.style() },
            "EmbeddedChipGroupWide.Xl.Positive" to ComposeStyleReference { EmbeddedChipGroupWide.Xl.Positive.style() },
            "EmbeddedChipGroupWide.Xl.Secondary" to ComposeStyleReference { EmbeddedChipGroupWide.Xl.Secondary.style() },
            "EmbeddedChipGroupWide.Xl.Warning" to ComposeStyleReference { EmbeddedChipGroupWide.Xl.Warning.style() },
            "EmbeddedChipGroupWide.L.Default" to ComposeStyleReference { EmbeddedChipGroupWide.L.Default.style() },
            "EmbeddedChipGroupWide.L.Accent" to ComposeStyleReference { EmbeddedChipGroupWide.L.Accent.style() },
            "EmbeddedChipGroupWide.L.Negative" to ComposeStyleReference { EmbeddedChipGroupWide.L.Negative.style() },
            "EmbeddedChipGroupWide.L.Positive" to ComposeStyleReference { EmbeddedChipGroupWide.L.Positive.style() },
            "EmbeddedChipGroupWide.L.Secondary" to ComposeStyleReference { EmbeddedChipGroupWide.L.Secondary.style() },
            "EmbeddedChipGroupWide.L.Warning" to ComposeStyleReference { EmbeddedChipGroupWide.L.Warning.style() },
            "EmbeddedChipGroupWide.M.Default" to ComposeStyleReference { EmbeddedChipGroupWide.M.Default.style() },
            "EmbeddedChipGroupWide.M.Accent" to ComposeStyleReference { EmbeddedChipGroupWide.M.Accent.style() },
            "EmbeddedChipGroupWide.M.Negative" to ComposeStyleReference { EmbeddedChipGroupWide.M.Negative.style() },
            "EmbeddedChipGroupWide.M.Positive" to ComposeStyleReference { EmbeddedChipGroupWide.M.Positive.style() },
            "EmbeddedChipGroupWide.M.Secondary" to ComposeStyleReference { EmbeddedChipGroupWide.M.Secondary.style() },
            "EmbeddedChipGroupWide.M.Warning" to ComposeStyleReference { EmbeddedChipGroupWide.M.Warning.style() },
            "EmbeddedChipGroupWide.S.Default" to ComposeStyleReference { EmbeddedChipGroupWide.S.Default.style() },
            "EmbeddedChipGroupWide.S.Accent" to ComposeStyleReference { EmbeddedChipGroupWide.S.Accent.style() },
            "EmbeddedChipGroupWide.S.Negative" to ComposeStyleReference { EmbeddedChipGroupWide.S.Negative.style() },
            "EmbeddedChipGroupWide.S.Positive" to ComposeStyleReference { EmbeddedChipGroupWide.S.Positive.style() },
            "EmbeddedChipGroupWide.S.Secondary" to ComposeStyleReference { EmbeddedChipGroupWide.S.Secondary.style() },
            "EmbeddedChipGroupWide.S.Warning" to ComposeStyleReference { EmbeddedChipGroupWide.S.Warning.style() },
            "EmbeddedChipGroupWide.Xs.Default" to ComposeStyleReference { EmbeddedChipGroupWide.Xs.Default.style() },
            "EmbeddedChipGroupWide.Xs.Accent" to ComposeStyleReference { EmbeddedChipGroupWide.Xs.Accent.style() },
            "EmbeddedChipGroupWide.Xs.Negative" to ComposeStyleReference { EmbeddedChipGroupWide.Xs.Negative.style() },
            "EmbeddedChipGroupWide.Xs.Positive" to ComposeStyleReference { EmbeddedChipGroupWide.Xs.Positive.style() },
            "EmbeddedChipGroupWide.Xs.Secondary" to ComposeStyleReference { EmbeddedChipGroupWide.Xs.Secondary.style() },
            "EmbeddedChipGroupWide.Xs.Warning" to ComposeStyleReference { EmbeddedChipGroupWide.Xs.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipGroupStyles.EmbeddedChipGroupWide.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ChipGroupEmbeddedChipGroupWideSize.Xl
                "L" -> ChipGroupEmbeddedChipGroupWideSize.L
                "M" -> ChipGroupEmbeddedChipGroupWideSize.M
                "S" -> ChipGroupEmbeddedChipGroupWideSize.S
                "Xs" -> ChipGroupEmbeddedChipGroupWideSize.Xs
                else -> ChipGroupEmbeddedChipGroupWideSize.Xl
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipGroupEmbeddedChipGroupWideView.Default
                "Accent" -> ChipGroupEmbeddedChipGroupWideView.Accent
                "Negative" -> ChipGroupEmbeddedChipGroupWideView.Negative
                "Positive" -> ChipGroupEmbeddedChipGroupWideView.Positive
                "Secondary" -> ChipGroupEmbeddedChipGroupWideView.Secondary
                "Warning" -> ChipGroupEmbeddedChipGroupWideView.Warning
                else -> ChipGroupEmbeddedChipGroupWideView.Default
            },
        ).key
    }
}
