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
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupDense
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupDenseShape
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupDenseSize
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupDenseView
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupStyles
import com.sdds.plasma.homeds.styles.chipgroup.Default
import com.sdds.plasma.homeds.styles.chipgroup.L
import com.sdds.plasma.homeds.styles.chipgroup.M
import com.sdds.plasma.homeds.styles.chipgroup.Pilled
import com.sdds.plasma.homeds.styles.chipgroup.S
import com.sdds.plasma.homeds.styles.chipgroup.Secondary
import com.sdds.plasma.homeds.styles.chipgroup.Xs
import com.sdds.plasma.homeds.styles.chipgroup.Xxs
import com.sdds.plasma.homeds.styles.chipgroup.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsChipGroupDenseVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Secondary")),
        )

    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "ChipGroupDense.L.Default" to ComposeStyleReference { ChipGroupDense.L.Default.style() },
            "ChipGroupDense.L.Secondary" to ComposeStyleReference { ChipGroupDense.L.Secondary.style() },
            "ChipGroupDense.L.Pilled.Default" to ComposeStyleReference { ChipGroupDense.L.Pilled.Default.style() },
            "ChipGroupDense.L.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.L.Pilled.Secondary.style() },
            "ChipGroupDense.M.Default" to ComposeStyleReference { ChipGroupDense.M.Default.style() },
            "ChipGroupDense.M.Secondary" to ComposeStyleReference { ChipGroupDense.M.Secondary.style() },
            "ChipGroupDense.M.Pilled.Default" to ComposeStyleReference { ChipGroupDense.M.Pilled.Default.style() },
            "ChipGroupDense.M.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.M.Pilled.Secondary.style() },
            "ChipGroupDense.S.Default" to ComposeStyleReference { ChipGroupDense.S.Default.style() },
            "ChipGroupDense.S.Secondary" to ComposeStyleReference { ChipGroupDense.S.Secondary.style() },
            "ChipGroupDense.S.Pilled.Default" to ComposeStyleReference { ChipGroupDense.S.Pilled.Default.style() },
            "ChipGroupDense.S.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.S.Pilled.Secondary.style() },
            "ChipGroupDense.Xs.Default" to ComposeStyleReference { ChipGroupDense.Xs.Default.style() },
            "ChipGroupDense.Xs.Secondary" to ComposeStyleReference { ChipGroupDense.Xs.Secondary.style() },
            "ChipGroupDense.Xs.Pilled.Default" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Default.style() },
            "ChipGroupDense.Xs.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.Xs.Pilled.Secondary.style() },
            "ChipGroupDense.Xxs.Default" to ComposeStyleReference { ChipGroupDense.Xxs.Default.style() },
            "ChipGroupDense.Xxs.Secondary" to ComposeStyleReference { ChipGroupDense.Xxs.Secondary.style() },
            "ChipGroupDense.Xxs.Pilled.Default" to ComposeStyleReference { ChipGroupDense.Xxs.Pilled.Default.style() },
            "ChipGroupDense.Xxs.Pilled.Secondary" to ComposeStyleReference { ChipGroupDense.Xxs.Pilled.Secondary.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipGroupStyles.Dense.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ChipGroupDenseSize.L
                "M" -> ChipGroupDenseSize.M
                "S" -> ChipGroupDenseSize.S
                "Xs" -> ChipGroupDenseSize.Xs
                "Xxs" -> ChipGroupDenseSize.Xxs
                else -> ChipGroupDenseSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ChipGroupDenseShape.Default
                "Pilled" -> ChipGroupDenseShape.Pilled
                else -> ChipGroupDenseShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipGroupDenseView.Default
                "Secondary" -> ChipGroupDenseView.Secondary
                else -> ChipGroupDenseView.Default
            },
        ).key
    }
}
