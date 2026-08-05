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
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.list.DropdownMenuListTight
import com.sdds.serv.styles.list.DropdownMenuListTightSize
import com.sdds.serv.styles.list.L
import com.sdds.serv.styles.list.ListStyles
import com.sdds.serv.styles.list.M
import com.sdds.serv.styles.list.S
import com.sdds.serv.styles.list.Xl
import com.sdds.serv.styles.list.Xs
import com.sdds.serv.styles.list.resolve

internal object SddsServDropdownMenuListTightVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "DropdownMenuListTight.Xl" to ComposeStyleReference { DropdownMenuListTight.Xl.style() },
            "DropdownMenuListTight.L" to ComposeStyleReference { DropdownMenuListTight.L.style() },
            "DropdownMenuListTight.M" to ComposeStyleReference { DropdownMenuListTight.M.style() },
            "DropdownMenuListTight.S" to ComposeStyleReference { DropdownMenuListTight.S.style() },
            "DropdownMenuListTight.Xs" to ComposeStyleReference { DropdownMenuListTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.DropdownMenuListTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> DropdownMenuListTightSize.Xl
                "L" -> DropdownMenuListTightSize.L
                "M" -> DropdownMenuListTightSize.M
                "S" -> DropdownMenuListTightSize.S
                "Xs" -> DropdownMenuListTightSize.Xs
                else -> DropdownMenuListTightSize.Xl
            },
        ).key
    }
}
