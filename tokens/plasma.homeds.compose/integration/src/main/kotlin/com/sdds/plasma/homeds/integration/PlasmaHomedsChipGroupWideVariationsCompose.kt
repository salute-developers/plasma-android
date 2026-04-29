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
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupStyles
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupWide
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupWideShape
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupWideSize
import com.sdds.plasma.homeds.styles.chipgroup.ChipGroupWideView
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

internal object PlasmaHomedsChipGroupWideVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Secondary")),
        )

    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "ChipGroupWide.L.Default" to ComposeStyleReference { ChipGroupWide.L.Default.style() },
            "ChipGroupWide.L.Secondary" to ComposeStyleReference { ChipGroupWide.L.Secondary.style() },
            "ChipGroupWide.L.Pilled.Default" to ComposeStyleReference { ChipGroupWide.L.Pilled.Default.style() },
            "ChipGroupWide.L.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.L.Pilled.Secondary.style() },
            "ChipGroupWide.M.Default" to ComposeStyleReference { ChipGroupWide.M.Default.style() },
            "ChipGroupWide.M.Secondary" to ComposeStyleReference { ChipGroupWide.M.Secondary.style() },
            "ChipGroupWide.M.Pilled.Default" to ComposeStyleReference { ChipGroupWide.M.Pilled.Default.style() },
            "ChipGroupWide.M.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.M.Pilled.Secondary.style() },
            "ChipGroupWide.S.Default" to ComposeStyleReference { ChipGroupWide.S.Default.style() },
            "ChipGroupWide.S.Secondary" to ComposeStyleReference { ChipGroupWide.S.Secondary.style() },
            "ChipGroupWide.S.Pilled.Default" to ComposeStyleReference { ChipGroupWide.S.Pilled.Default.style() },
            "ChipGroupWide.S.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.S.Pilled.Secondary.style() },
            "ChipGroupWide.Xs.Default" to ComposeStyleReference { ChipGroupWide.Xs.Default.style() },
            "ChipGroupWide.Xs.Secondary" to ComposeStyleReference { ChipGroupWide.Xs.Secondary.style() },
            "ChipGroupWide.Xs.Pilled.Default" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Default.style() },
            "ChipGroupWide.Xs.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Secondary.style() },
            "ChipGroupWide.Xxs.Default" to ComposeStyleReference { ChipGroupWide.Xxs.Default.style() },
            "ChipGroupWide.Xxs.Secondary" to ComposeStyleReference { ChipGroupWide.Xxs.Secondary.style() },
            "ChipGroupWide.Xxs.Pilled.Default" to ComposeStyleReference { ChipGroupWide.Xxs.Pilled.Default.style() },
            "ChipGroupWide.Xxs.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.Xxs.Pilled.Secondary.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipGroupStyles.Wide.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ChipGroupWideSize.L
                "M" -> ChipGroupWideSize.M
                "S" -> ChipGroupWideSize.S
                "Xs" -> ChipGroupWideSize.Xs
                "Xxs" -> ChipGroupWideSize.Xxs
                else -> ChipGroupWideSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ChipGroupWideShape.Default
                "Pilled" -> ChipGroupWideShape.Pilled
                else -> ChipGroupWideShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipGroupWideView.Default
                "Secondary" -> ChipGroupWideView.Secondary
                else -> ChipGroupWideView.Default
            },
        ).key
    }
}
