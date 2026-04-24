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
import com.sdds.plasma.homeds.styles.list.ListNumbered
import com.sdds.plasma.homeds.styles.list.ListNumberedSize
import com.sdds.plasma.homeds.styles.list.ListStyles
import com.sdds.plasma.homeds.styles.list.S
import com.sdds.plasma.homeds.styles.list.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsListNumberedVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "ListNumbered.S" to ComposeStyleReference { ListNumbered.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.Numbered.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> ListNumberedSize.S
                else -> ListNumberedSize.S
            },
        ).key
    }
}
