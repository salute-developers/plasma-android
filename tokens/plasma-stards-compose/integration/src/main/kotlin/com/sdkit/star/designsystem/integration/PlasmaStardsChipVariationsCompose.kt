// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.chip.Accent
import com.sdkit.star.designsystem.styles.chip.Chip
import com.sdkit.star.designsystem.styles.chip.ChipShape
import com.sdkit.star.designsystem.styles.chip.ChipSize
import com.sdkit.star.designsystem.styles.chip.ChipStyles
import com.sdkit.star.designsystem.styles.chip.ChipView
import com.sdkit.star.designsystem.styles.chip.Default
import com.sdkit.star.designsystem.styles.chip.L
import com.sdkit.star.designsystem.styles.chip.M
import com.sdkit.star.designsystem.styles.chip.Negative
import com.sdkit.star.designsystem.styles.chip.Pilled
import com.sdkit.star.designsystem.styles.chip.Positive
import com.sdkit.star.designsystem.styles.chip.S
import com.sdkit.star.designsystem.styles.chip.Secondary
import com.sdkit.star.designsystem.styles.chip.Warning
import com.sdkit.star.designsystem.styles.chip.Xs
import com.sdkit.star.designsystem.styles.chip.resolve

internal object PlasmaStardsChipVariationsCompose : ComposeStyleProvider<ChipStyle>() {
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

    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "Chip.L.Default" to ComposeStyleReference { Chip.L.Default.style() },
            "Chip.L.Accent" to ComposeStyleReference { Chip.L.Accent.style() },
            "Chip.L.Negative" to ComposeStyleReference { Chip.L.Negative.style() },
            "Chip.L.Positive" to ComposeStyleReference { Chip.L.Positive.style() },
            "Chip.L.Secondary" to ComposeStyleReference { Chip.L.Secondary.style() },
            "Chip.L.Warning" to ComposeStyleReference { Chip.L.Warning.style() },
            "Chip.L.Pilled.Default" to ComposeStyleReference { Chip.L.Pilled.Default.style() },
            "Chip.L.Pilled.Accent" to ComposeStyleReference { Chip.L.Pilled.Accent.style() },
            "Chip.L.Pilled.Negative" to ComposeStyleReference { Chip.L.Pilled.Negative.style() },
            "Chip.L.Pilled.Positive" to ComposeStyleReference { Chip.L.Pilled.Positive.style() },
            "Chip.L.Pilled.Secondary" to ComposeStyleReference { Chip.L.Pilled.Secondary.style() },
            "Chip.L.Pilled.Warning" to ComposeStyleReference { Chip.L.Pilled.Warning.style() },
            "Chip.M.Default" to ComposeStyleReference { Chip.M.Default.style() },
            "Chip.M.Accent" to ComposeStyleReference { Chip.M.Accent.style() },
            "Chip.M.Negative" to ComposeStyleReference { Chip.M.Negative.style() },
            "Chip.M.Positive" to ComposeStyleReference { Chip.M.Positive.style() },
            "Chip.M.Secondary" to ComposeStyleReference { Chip.M.Secondary.style() },
            "Chip.M.Warning" to ComposeStyleReference { Chip.M.Warning.style() },
            "Chip.M.Pilled.Default" to ComposeStyleReference { Chip.M.Pilled.Default.style() },
            "Chip.M.Pilled.Accent" to ComposeStyleReference { Chip.M.Pilled.Accent.style() },
            "Chip.M.Pilled.Negative" to ComposeStyleReference { Chip.M.Pilled.Negative.style() },
            "Chip.M.Pilled.Positive" to ComposeStyleReference { Chip.M.Pilled.Positive.style() },
            "Chip.M.Pilled.Secondary" to ComposeStyleReference { Chip.M.Pilled.Secondary.style() },
            "Chip.M.Pilled.Warning" to ComposeStyleReference { Chip.M.Pilled.Warning.style() },
            "Chip.S.Default" to ComposeStyleReference { Chip.S.Default.style() },
            "Chip.S.Accent" to ComposeStyleReference { Chip.S.Accent.style() },
            "Chip.S.Negative" to ComposeStyleReference { Chip.S.Negative.style() },
            "Chip.S.Positive" to ComposeStyleReference { Chip.S.Positive.style() },
            "Chip.S.Secondary" to ComposeStyleReference { Chip.S.Secondary.style() },
            "Chip.S.Warning" to ComposeStyleReference { Chip.S.Warning.style() },
            "Chip.S.Pilled.Default" to ComposeStyleReference { Chip.S.Pilled.Default.style() },
            "Chip.S.Pilled.Accent" to ComposeStyleReference { Chip.S.Pilled.Accent.style() },
            "Chip.S.Pilled.Negative" to ComposeStyleReference { Chip.S.Pilled.Negative.style() },
            "Chip.S.Pilled.Positive" to ComposeStyleReference { Chip.S.Pilled.Positive.style() },
            "Chip.S.Pilled.Secondary" to ComposeStyleReference { Chip.S.Pilled.Secondary.style() },
            "Chip.S.Pilled.Warning" to ComposeStyleReference { Chip.S.Pilled.Warning.style() },
            "Chip.Xs.Default" to ComposeStyleReference { Chip.Xs.Default.style() },
            "Chip.Xs.Accent" to ComposeStyleReference { Chip.Xs.Accent.style() },
            "Chip.Xs.Negative" to ComposeStyleReference { Chip.Xs.Negative.style() },
            "Chip.Xs.Positive" to ComposeStyleReference { Chip.Xs.Positive.style() },
            "Chip.Xs.Secondary" to ComposeStyleReference { Chip.Xs.Secondary.style() },
            "Chip.Xs.Warning" to ComposeStyleReference { Chip.Xs.Warning.style() },
            "Chip.Xs.Pilled.Default" to ComposeStyleReference { Chip.Xs.Pilled.Default.style() },
            "Chip.Xs.Pilled.Accent" to ComposeStyleReference { Chip.Xs.Pilled.Accent.style() },
            "Chip.Xs.Pilled.Negative" to ComposeStyleReference { Chip.Xs.Pilled.Negative.style() },
            "Chip.Xs.Pilled.Positive" to ComposeStyleReference { Chip.Xs.Pilled.Positive.style() },
            "Chip.Xs.Pilled.Secondary" to ComposeStyleReference { Chip.Xs.Pilled.Secondary.style() },
            "Chip.Xs.Pilled.Warning" to ComposeStyleReference { Chip.Xs.Pilled.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ChipSize.L
                "M" -> ChipSize.M
                "S" -> ChipSize.S
                "Xs" -> ChipSize.Xs
                else -> ChipSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ChipShape.Default
                "Pilled" -> ChipShape.Pilled
                else -> ChipShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipView.Default
                "Accent" -> ChipView.Accent
                "Negative" -> ChipView.Negative
                "Positive" -> ChipView.Positive
                "Secondary" -> ChipView.Secondary
                "Warning" -> ChipView.Warning
                else -> ChipView.Default
            },
        ).key
    }
}
