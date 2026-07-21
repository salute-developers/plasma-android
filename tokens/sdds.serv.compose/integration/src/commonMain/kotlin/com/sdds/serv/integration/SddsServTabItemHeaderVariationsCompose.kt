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
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.tabitem.H1
import com.sdds.serv.styles.tabitem.H2
import com.sdds.serv.styles.tabitem.H3
import com.sdds.serv.styles.tabitem.H4
import com.sdds.serv.styles.tabitem.H5
import com.sdds.serv.styles.tabitem.TabItemHeader
import com.sdds.serv.styles.tabitem.TabItemHeaderSize
import com.sdds.serv.styles.tabitem.TabItemStyles
import com.sdds.serv.styles.tabitem.resolve

internal object SddsServTabItemHeaderVariationsCompose : ComposeStyleProvider<TabItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "H1", variants = listOf("H1", "H2", "H3", "H4", "H5")),
        )

    override val variations: Map<String, ComposeStyleReference<TabItemStyle>> =
        mapOf(
            "TabItemHeader.H1" to ComposeStyleReference { TabItemHeader.H1.style() },
            "TabItemHeader.H2" to ComposeStyleReference { TabItemHeader.H2.style() },
            "TabItemHeader.H3" to ComposeStyleReference { TabItemHeader.H3.style() },
            "TabItemHeader.H4" to ComposeStyleReference { TabItemHeader.H4.style() },
            "TabItemHeader.H5" to ComposeStyleReference { TabItemHeader.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabItemStyles.Header.resolve(
            size = when (bindings["size"]?.toString()) {
                "H1" -> TabItemHeaderSize.H1
                "H2" -> TabItemHeaderSize.H2
                "H3" -> TabItemHeaderSize.H3
                "H4" -> TabItemHeaderSize.H4
                "H5" -> TabItemHeaderSize.H5
                else -> TabItemHeaderSize.H1
            },
        ).key
    }
}
