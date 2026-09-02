// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.list.DropdownMenuListTight
import com.sdds.finai.styles.list.DropdownMenuListTightSize
import com.sdds.finai.styles.list.ListStyles
import com.sdds.finai.styles.list.M
import com.sdds.finai.styles.list.S
import com.sdds.finai.styles.list.Xs
import com.sdds.finai.styles.list.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiDropdownMenuListTightVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "DropdownMenuListTight.M" to ComposeStyleReference { DropdownMenuListTight.M.style() },
            "DropdownMenuListTight.S" to ComposeStyleReference { DropdownMenuListTight.S.style() },
            "DropdownMenuListTight.Xs" to ComposeStyleReference { DropdownMenuListTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.DropdownMenuListTight.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> DropdownMenuListTightSize.M
                "S" -> DropdownMenuListTightSize.S
                "Xs" -> DropdownMenuListTightSize.Xs
                else -> DropdownMenuListTightSize.M
            },
        ).key
    }
}
