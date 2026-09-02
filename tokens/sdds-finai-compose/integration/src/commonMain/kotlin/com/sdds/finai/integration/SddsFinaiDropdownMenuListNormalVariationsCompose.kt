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
import com.sdds.finai.styles.list.DropdownMenuListNormal
import com.sdds.finai.styles.list.DropdownMenuListNormalSize
import com.sdds.finai.styles.list.ListStyles
import com.sdds.finai.styles.list.M
import com.sdds.finai.styles.list.S
import com.sdds.finai.styles.list.Xs
import com.sdds.finai.styles.list.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiDropdownMenuListNormalVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "DropdownMenuListNormal.M" to ComposeStyleReference { DropdownMenuListNormal.M.style() },
            "DropdownMenuListNormal.S" to ComposeStyleReference { DropdownMenuListNormal.S.style() },
            "DropdownMenuListNormal.Xs" to ComposeStyleReference { DropdownMenuListNormal.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.DropdownMenuListNormal.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> DropdownMenuListNormalSize.M
                "S" -> DropdownMenuListNormalSize.S
                "Xs" -> DropdownMenuListNormalSize.Xs
                else -> DropdownMenuListNormalSize.M
            },
        ).key
    }
}
