// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.chipgroup.ChipGroup
import com.sdds.sbcom.styles.chipgroup.ChipGroupChipSlot
import com.sdds.sbcom.styles.chipgroup.ChipGroupStyles
import com.sdds.sbcom.styles.chipgroup.ChipSlotAvatar
import com.sdds.sbcom.styles.chipgroup.ChipSlotPadding
import com.sdds.sbcom.styles.chipgroup.resolve

internal object SddsSbcomChipGroupVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "chipSlot", value = "Padding", variants = listOf("Padding", "Avatar")),
        )

    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "ChipGroup.ChipSlotPadding" to ComposeStyleReference { ChipGroup.ChipSlotPadding.style() },
            "ChipGroup.ChipSlotAvatar" to ComposeStyleReference { ChipGroup.ChipSlotAvatar.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipGroupStyles.resolve(
            chipSlot = when (bindings["chipSlot"]?.toString()) {
                "Padding" -> ChipGroupChipSlot.Padding
                "Avatar" -> ChipGroupChipSlot.Avatar
                else -> ChipGroupChipSlot.Padding
            },
        ).key
    }
}
