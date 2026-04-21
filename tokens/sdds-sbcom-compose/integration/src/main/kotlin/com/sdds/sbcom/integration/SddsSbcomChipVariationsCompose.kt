// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.chip.Chip
import com.sdds.sbcom.styles.chip.ChipChipSlot
import com.sdds.sbcom.styles.chip.ChipSlotAvatar
import com.sdds.sbcom.styles.chip.ChipSlotPadding
import com.sdds.sbcom.styles.chip.ChipStyles
import com.sdds.sbcom.styles.chip.resolve

internal object SddsSbcomChipVariationsCompose : ComposeStyleProvider<ChipStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "chipSlot", value = "Padding", variants = listOf("Padding", "Avatar")),
        )

    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "Chip.ChipSlotPadding" to ComposeStyleReference { Chip.ChipSlotPadding.style() },
            "Chip.ChipSlotAvatar" to ComposeStyleReference { Chip.ChipSlotAvatar.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipStyles.resolve(
            chipSlot = when (bindings["chipSlot"]?.toString()) {
                "Padding" -> ChipChipSlot.Padding
                "Avatar" -> ChipChipSlot.Avatar
                else -> ChipChipSlot.Padding
            },
        ).key
    }
}
