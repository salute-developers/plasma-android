// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chip.Chip
import com.sdds.plasma.homeds.styles.chip.ChipShape
import com.sdds.plasma.homeds.styles.chip.ChipSize
import com.sdds.plasma.homeds.styles.chip.ChipStyles
import com.sdds.plasma.homeds.styles.chip.ChipView
import com.sdds.plasma.homeds.styles.chip.Default
import com.sdds.plasma.homeds.styles.chip.L
import com.sdds.plasma.homeds.styles.chip.M
import com.sdds.plasma.homeds.styles.chip.Pilled
import com.sdds.plasma.homeds.styles.chip.S
import com.sdds.plasma.homeds.styles.chip.Secondary
import com.sdds.plasma.homeds.styles.chip.Xs
import com.sdds.plasma.homeds.styles.chip.Xxs
import com.sdds.plasma.homeds.styles.chip.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsChipVariationsCompose : ComposeStyleProvider<ChipStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Secondary")),
        )

    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "Chip.L.Default" to ComposeStyleReference { Chip.L.Default.style() },
            "Chip.L.Secondary" to ComposeStyleReference { Chip.L.Secondary.style() },
            "Chip.L.Pilled.Default" to ComposeStyleReference { Chip.L.Pilled.Default.style() },
            "Chip.L.Pilled.Secondary" to ComposeStyleReference { Chip.L.Pilled.Secondary.style() },
            "Chip.M.Default" to ComposeStyleReference { Chip.M.Default.style() },
            "Chip.M.Secondary" to ComposeStyleReference { Chip.M.Secondary.style() },
            "Chip.M.Pilled.Default" to ComposeStyleReference { Chip.M.Pilled.Default.style() },
            "Chip.M.Pilled.Secondary" to ComposeStyleReference { Chip.M.Pilled.Secondary.style() },
            "Chip.S.Default" to ComposeStyleReference { Chip.S.Default.style() },
            "Chip.S.Secondary" to ComposeStyleReference { Chip.S.Secondary.style() },
            "Chip.S.Pilled.Default" to ComposeStyleReference { Chip.S.Pilled.Default.style() },
            "Chip.S.Pilled.Secondary" to ComposeStyleReference { Chip.S.Pilled.Secondary.style() },
            "Chip.Xs.Default" to ComposeStyleReference { Chip.Xs.Default.style() },
            "Chip.Xs.Secondary" to ComposeStyleReference { Chip.Xs.Secondary.style() },
            "Chip.Xs.Pilled.Default" to ComposeStyleReference { Chip.Xs.Pilled.Default.style() },
            "Chip.Xs.Pilled.Secondary" to ComposeStyleReference { Chip.Xs.Pilled.Secondary.style() },
            "Chip.Xxs.Default" to ComposeStyleReference { Chip.Xxs.Default.style() },
            "Chip.Xxs.Secondary" to ComposeStyleReference { Chip.Xxs.Secondary.style() },
            "Chip.Xxs.Pilled.Default" to ComposeStyleReference { Chip.Xxs.Pilled.Default.style() },
            "Chip.Xxs.Pilled.Secondary" to ComposeStyleReference { Chip.Xxs.Pilled.Secondary.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ChipSize.L
                "M" -> ChipSize.M
                "S" -> ChipSize.S
                "Xs" -> ChipSize.Xs
                "Xxs" -> ChipSize.Xxs
                else -> ChipSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ChipShape.Default
                "Pilled" -> ChipShape.Pilled
                else -> ChipShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipView.Default
                "Secondary" -> ChipView.Secondary
                else -> ChipView.Default
            },
        ).key
    }
}
