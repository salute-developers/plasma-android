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
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.list.HasBackground
import com.sdds.plasma.homeds.styles.list.HasItemBackground
import com.sdds.plasma.homeds.styles.list.List
import com.sdds.plasma.homeds.styles.list.ListDefaultSize
import com.sdds.plasma.homeds.styles.list.ListStyles
import com.sdds.plasma.homeds.styles.list.NoBackground
import com.sdds.plasma.homeds.styles.list.S
import com.sdds.plasma.homeds.styles.list.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsListVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S")),
            Property.BooleanProperty(name = "hasBackground", value = false),
            Property.BooleanProperty(name = "hasItemBackground", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "List.S" to ComposeStyleReference { List.S.style() },
            "List.S.NoBackground" to ComposeStyleReference { List.S.NoBackground.style() },
            "List.S.NoBackground.HasItemBackground" to ComposeStyleReference { List.S.NoBackground.HasItemBackground.style() },
            "List.S.HasBackground" to ComposeStyleReference { List.S.HasBackground.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> ListDefaultSize.S
                else -> ListDefaultSize.S
            },
            hasBackground = booleanBindingValue(bindings, "hasBackground", false),
            hasItemBackground = booleanBindingValue(bindings, "hasItemBackground", false),
        ).key
    }
}
