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
import com.sdds.plasma.giga.styles.list.L
import com.sdds.plasma.giga.styles.list.ListStyles
import com.sdds.plasma.giga.styles.list.ListTight
import com.sdds.plasma.giga.styles.list.ListTightSize
import com.sdds.plasma.giga.styles.list.M
import com.sdds.plasma.giga.styles.list.S
import com.sdds.plasma.giga.styles.list.Xl
import com.sdds.plasma.giga.styles.list.Xs
import com.sdds.plasma.giga.styles.list.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaListTightVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "ListTight.Xl" to ComposeStyleReference { ListTight.Xl.style() },
            "ListTight.L" to ComposeStyleReference { ListTight.L.style() },
            "ListTight.M" to ComposeStyleReference { ListTight.M.style() },
            "ListTight.S" to ComposeStyleReference { ListTight.S.style() },
            "ListTight.Xs" to ComposeStyleReference { ListTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.Tight.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> ListTightSize.Xl
                "L" -> ListTightSize.L
                "M" -> ListTightSize.M
                "S" -> ListTightSize.S
                "Xs" -> ListTightSize.Xs
                else -> ListTightSize.Xl
            },
        ).key
    }
}
