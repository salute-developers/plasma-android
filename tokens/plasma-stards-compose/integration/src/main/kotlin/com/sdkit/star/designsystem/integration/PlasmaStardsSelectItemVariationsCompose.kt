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
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.selectitem.L
import com.sdkit.star.designsystem.styles.selectitem.M
import com.sdkit.star.designsystem.styles.selectitem.S
import com.sdkit.star.designsystem.styles.selectitem.SelectItem
import com.sdkit.star.designsystem.styles.selectitem.SelectItemSize
import com.sdkit.star.designsystem.styles.selectitem.SelectItemStyles
import com.sdkit.star.designsystem.styles.selectitem.Xs
import com.sdkit.star.designsystem.styles.selectitem.resolve

internal object PlasmaStardsSelectItemVariationsCompose : ComposeStyleProvider<SelectItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<SelectItemStyle>> =
        mapOf(
            "SelectItem.L" to ComposeStyleReference { SelectItem.L.style() },
            "SelectItem.M" to ComposeStyleReference { SelectItem.M.style() },
            "SelectItem.S" to ComposeStyleReference { SelectItem.S.style() },
            "SelectItem.Xs" to ComposeStyleReference { SelectItem.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SelectItemStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> SelectItemSize.L
                "M" -> SelectItemSize.M
                "S" -> SelectItemSize.S
                "Xs" -> SelectItemSize.Xs
                else -> SelectItemSize.L
            },
        ).key
    }
}
