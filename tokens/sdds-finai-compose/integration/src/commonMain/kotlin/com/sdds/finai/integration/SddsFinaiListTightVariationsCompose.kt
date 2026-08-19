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
import com.sdds.finai.styles.list.L
import com.sdds.finai.styles.list.ListStyles
import com.sdds.finai.styles.list.ListTight
import com.sdds.finai.styles.list.ListTightSize
import com.sdds.finai.styles.list.M
import com.sdds.finai.styles.list.S
import com.sdds.finai.styles.list.Xs
import com.sdds.finai.styles.list.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiListTightVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "ListTight.L" to ComposeStyleReference { ListTight.L.style() },
            "ListTight.M" to ComposeStyleReference { ListTight.M.style() },
            "ListTight.S" to ComposeStyleReference { ListTight.S.style() },
            "ListTight.Xs" to ComposeStyleReference { ListTight.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ListStyles.Tight.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ListTightSize.L
                "M" -> ListTightSize.M
                "S" -> ListTightSize.S
                "Xs" -> ListTightSize.Xs
                else -> ListTightSize.L
            },
        ).key
    }
}
