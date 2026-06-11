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
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.list.DropdownMenuListNormal
import com.sdds.plasma.giga.styles.list.DropdownMenuListNormalSize
import com.sdds.plasma.giga.styles.list.L
import com.sdds.plasma.giga.styles.list.ListStyles
import com.sdds.plasma.giga.styles.list.M
import com.sdds.plasma.giga.styles.list.S
import com.sdds.plasma.giga.styles.list.Xl
import com.sdds.plasma.giga.styles.list.Xs
import com.sdds.plasma.giga.styles.list.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaDropdownMenuListNormalVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "DropdownMenuListNormal.Xl" to ComposeStyleReference { DropdownMenuListNormal.Xl.style() },
            "DropdownMenuListNormal.L" to ComposeStyleReference { DropdownMenuListNormal.L.style() },
            "DropdownMenuListNormal.M" to ComposeStyleReference { DropdownMenuListNormal.M.style() },
            "DropdownMenuListNormal.S" to ComposeStyleReference { DropdownMenuListNormal.S.style() },
            "DropdownMenuListNormal.Xs" to ComposeStyleReference { DropdownMenuListNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.DropdownMenuListNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> DropdownMenuListNormalSize.Xl
                "L" -> DropdownMenuListNormalSize.L
                "M" -> DropdownMenuListNormalSize.M
                "S" -> DropdownMenuListNormalSize.S
                "Xs" -> DropdownMenuListNormalSize.Xs
                else -> DropdownMenuListNormalSize.Xl
            },
        ).key
    }
}
