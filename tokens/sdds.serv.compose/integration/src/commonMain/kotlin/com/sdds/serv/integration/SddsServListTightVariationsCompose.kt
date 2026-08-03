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
import com.sdds.serv.styles.list.L
import com.sdds.serv.styles.list.ListStyles
import com.sdds.serv.styles.list.ListTight
import com.sdds.serv.styles.list.ListTightSize
import com.sdds.serv.styles.list.M
import com.sdds.serv.styles.list.S
import com.sdds.serv.styles.list.Xl
import com.sdds.serv.styles.list.Xs
import com.sdds.serv.styles.list.resolve

internal object SddsServListTightVariationsCompose : ComposeStyleProvider<ListStyle>() {
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
