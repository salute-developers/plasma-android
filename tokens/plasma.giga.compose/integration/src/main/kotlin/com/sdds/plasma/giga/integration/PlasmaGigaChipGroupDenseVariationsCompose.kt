// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.chipgroup.Accent
import com.sdds.plasma.giga.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.giga.styles.chipgroup.ChipGroupDenseShape
import com.sdds.plasma.giga.styles.chipgroup.ChipGroupDenseSize
import com.sdds.plasma.giga.styles.chipgroup.ChipGroupDenseView
import com.sdds.plasma.giga.styles.chipgroup.ChipGroupStyles
import com.sdds.plasma.giga.styles.chipgroup.Default
import com.sdds.plasma.giga.styles.chipgroup.L
import com.sdds.plasma.giga.styles.chipgroup.M
import com.sdds.plasma.giga.styles.chipgroup.Negative
import com.sdds.plasma.giga.styles.chipgroup.Pilled
import com.sdds.plasma.giga.styles.chipgroup.Positive
import com.sdds.plasma.giga.styles.chipgroup.S
import com.sdds.plasma.giga.styles.chipgroup.Secondary
import com.sdds.plasma.giga.styles.chipgroup.Warning
import com.sdds.plasma.giga.styles.chipgroup.Xs
import com.sdds.plasma.giga.styles.chipgroup.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaChipGroupDenseVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Negative", "Positive", "Secondary", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "ChipGroupDense.L.Default" to ComposeStyleReference { ChipGroupDense.L.Default.style() },
            "ChipGroupDense.L.Accent" to ComposeStyleReference { ChipGroupDense.L.Accent.style() },
            "ChipGroupDense.L.Negative" to ComposeStyleReference { ChipGroupDense.L.Negative.style() },
            "ChipGroupDense.L.Positive" to ComposeStyleReference { ChipGroupDense.L.Positive.style() },
            "ChipGroupDense.L.Secondary" to ComposeStyleReference { ChipGroupDense.L.Secondary.style() },
            "ChipGroupDense.L.Warning" to ComposeStyleReference { ChipGroupDense.L.Warning.style() },
            "ChipGroupDense.L.Pilled.Default" to ComposeStyleReference { ChipGroupDense.L.Pilled.Default.style() },
            "ChipGroupDense.L.Pilled.Accent" to ComposeStyleReference { ChipGroupDense.L.Pilled.Accent.style() },
            "ChipGroupDense.L.Pilled.Negative" to ComposeStyleReference { ChipGroupDense.L.Pilled.Negative.style() },
            "ChipGroupDense.L.Pilled.Positive" to ComposeStyleReference { ChipGroupDense.L.Pilled.Positive.style() },
            "ChipGroupDense.L.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.L.Pilled.Secondary.style() },
            "ChipGroupDense.L.Pilled.Warning" to ComposeStyleReference { ChipGroupDense.L.Pilled.Warning.style() },
            "ChipGroupDense.M.Default" to ComposeStyleReference { ChipGroupDense.M.Default.style() },
            "ChipGroupDense.M.Accent" to ComposeStyleReference { ChipGroupDense.M.Accent.style() },
            "ChipGroupDense.M.Negative" to ComposeStyleReference { ChipGroupDense.M.Negative.style() },
            "ChipGroupDense.M.Positive" to ComposeStyleReference { ChipGroupDense.M.Positive.style() },
            "ChipGroupDense.M.Secondary" to ComposeStyleReference { ChipGroupDense.M.Secondary.style() },
            "ChipGroupDense.M.Warning" to ComposeStyleReference { ChipGroupDense.M.Warning.style() },
            "ChipGroupDense.M.Pilled.Default" to ComposeStyleReference { ChipGroupDense.M.Pilled.Default.style() },
            "ChipGroupDense.M.Pilled.Accent" to ComposeStyleReference { ChipGroupDense.M.Pilled.Accent.style() },
            "ChipGroupDense.M.Pilled.Negative" to ComposeStyleReference { ChipGroupDense.M.Pilled.Negative.style() },
            "ChipGroupDense.M.Pilled.Positive" to ComposeStyleReference { ChipGroupDense.M.Pilled.Positive.style() },
            "ChipGroupDense.M.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.M.Pilled.Secondary.style() },
            "ChipGroupDense.M.Pilled.Warning" to ComposeStyleReference { ChipGroupDense.M.Pilled.Warning.style() },
            "ChipGroupDense.S.Default" to ComposeStyleReference { ChipGroupDense.S.Default.style() },
            "ChipGroupDense.S.Accent" to ComposeStyleReference { ChipGroupDense.S.Accent.style() },
            "ChipGroupDense.S.Negative" to ComposeStyleReference { ChipGroupDense.S.Negative.style() },
            "ChipGroupDense.S.Positive" to ComposeStyleReference { ChipGroupDense.S.Positive.style() },
            "ChipGroupDense.S.Secondary" to ComposeStyleReference { ChipGroupDense.S.Secondary.style() },
            "ChipGroupDense.S.Warning" to ComposeStyleReference { ChipGroupDense.S.Warning.style() },
            "ChipGroupDense.S.Pilled.Default" to ComposeStyleReference { ChipGroupDense.S.Pilled.Default.style() },
            "ChipGroupDense.S.Pilled.Accent" to ComposeStyleReference { ChipGroupDense.S.Pilled.Accent.style() },
            "ChipGroupDense.S.Pilled.Negative" to ComposeStyleReference { ChipGroupDense.S.Pilled.Negative.style() },
            "ChipGroupDense.S.Pilled.Positive" to ComposeStyleReference { ChipGroupDense.S.Pilled.Positive.style() },
            "ChipGroupDense.S.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.S.Pilled.Secondary.style() },
            "ChipGroupDense.S.Pilled.Warning" to ComposeStyleReference { ChipGroupDense.S.Pilled.Warning.style() },
            "ChipGroupDense.Xs.Default" to ComposeStyleReference { ChipGroupDense.Xs.Default.style() },
            "ChipGroupDense.Xs.Accent" to ComposeStyleReference { ChipGroupDense.Xs.Accent.style() },
            "ChipGroupDense.Xs.Negative" to ComposeStyleReference { ChipGroupDense.Xs.Negative.style() },
            "ChipGroupDense.Xs.Positive" to ComposeStyleReference { ChipGroupDense.Xs.Positive.style() },
            "ChipGroupDense.Xs.Secondary" to ComposeStyleReference { ChipGroupDense.Xs.Secondary.style() },
            "ChipGroupDense.Xs.Warning" to ComposeStyleReference { ChipGroupDense.Xs.Warning.style() },
            "ChipGroupDense.Xs.Pilled.Default" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Default.style() },
            "ChipGroupDense.Xs.Pilled.Accent" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Accent.style() },
            "ChipGroupDense.Xs.Pilled.Negative" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Negative.style() },
            "ChipGroupDense.Xs.Pilled.Positive" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Positive.style() },
            "ChipGroupDense.Xs.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Secondary.style() },
            "ChipGroupDense.Xs.Pilled.Warning" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipGroupStyles.Dense.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ChipGroupDenseSize.L
                "M" -> ChipGroupDenseSize.M
                "S" -> ChipGroupDenseSize.S
                "Xs" -> ChipGroupDenseSize.Xs
                else -> ChipGroupDenseSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ChipGroupDenseShape.Default
                "Pilled" -> ChipGroupDenseShape.Pilled
                else -> ChipGroupDenseShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipGroupDenseView.Default
                "Accent" -> ChipGroupDenseView.Accent
                "Negative" -> ChipGroupDenseView.Negative
                "Positive" -> ChipGroupDenseView.Positive
                "Secondary" -> ChipGroupDenseView.Secondary
                "Warning" -> ChipGroupDenseView.Warning
                else -> ChipGroupDenseView.Default
            },
        ).key
    }
}
