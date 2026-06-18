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
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.list.L
import com.sdkit.star.designsystem.styles.list.List
import com.sdkit.star.designsystem.styles.list.ListDefaultSize
import com.sdkit.star.designsystem.styles.list.ListStyles
import com.sdkit.star.designsystem.styles.list.M
import com.sdkit.star.designsystem.styles.list.S
import com.sdkit.star.designsystem.styles.list.Xs
import com.sdkit.star.designsystem.styles.list.resolve

internal object PlasmaStardsListVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "List.L" to ComposeStyleReference { List.L.style() },
            "List.M" to ComposeStyleReference { List.M.style() },
            "List.S" to ComposeStyleReference { List.S.style() },
            "List.Xs" to ComposeStyleReference { List.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ListDefaultSize.L
                "M" -> ListDefaultSize.M
                "S" -> ListDefaultSize.S
                "Xs" -> ListDefaultSize.Xs
                else -> ListDefaultSize.L
            },
        ).key
    }
}
