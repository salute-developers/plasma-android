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
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.tabs.H1
import com.sdds.finai.styles.tabs.H2
import com.sdds.finai.styles.tabs.H3
import com.sdds.finai.styles.tabs.H4
import com.sdds.finai.styles.tabs.H5
import com.sdds.finai.styles.tabs.TabsHeader
import com.sdds.finai.styles.tabs.TabsHeaderSize
import com.sdds.finai.styles.tabs.TabsStyles
import com.sdds.finai.styles.tabs.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiTabsHeaderVariationsCompose : ComposeStyleProvider<TabsStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "H1", variants = listOf("H1", "H2", "H3", "H4", "H5")),
        )

    override val variations: Map<String, ComposeStyleReference<TabsStyle>> =
        mapOf(
            "TabsHeader.H1" to ComposeStyleReference { TabsHeader.H1.style() },
            "TabsHeader.H2" to ComposeStyleReference { TabsHeader.H2.style() },
            "TabsHeader.H3" to ComposeStyleReference { TabsHeader.H3.style() },
            "TabsHeader.H4" to ComposeStyleReference { TabsHeader.H4.style() },
            "TabsHeader.H5" to ComposeStyleReference { TabsHeader.H5.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TabsStyles.Header.resolve(
            size = when (bindings["size"]?.toString()) {
                "H1" -> TabsHeaderSize.H1
                "H2" -> TabsHeaderSize.H2
                "H3" -> TabsHeaderSize.H3
                "H4" -> TabsHeaderSize.H4
                "H5" -> TabsHeaderSize.H5
                else -> TabsHeaderSize.H1
            },
        ).key
    }
}
