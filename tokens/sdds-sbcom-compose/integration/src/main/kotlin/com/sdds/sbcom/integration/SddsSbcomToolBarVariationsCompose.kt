// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.toolbar.ToolBar
import com.sdds.sbcom.styles.toolbar.ToolBarStyles
import com.sdds.sbcom.styles.toolbar.ToolBarType
import com.sdds.sbcom.styles.toolbar.TypeDefault
import com.sdds.sbcom.styles.toolbar.TypeGroup
import com.sdds.sbcom.styles.toolbar.resolve

internal object SddsSbcomToolBarVariationsCompose : ComposeStyleProvider<ToolBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "type", value = "Default", variants = listOf("Default", "Group")),
        )

    override val variations: Map<String, ComposeStyleReference<ToolBarStyle>> =
        mapOf(
            "ToolBar.TypeDefault" to ComposeStyleReference { ToolBar.TypeDefault.style() },
            "ToolBar.TypeGroup" to ComposeStyleReference { ToolBar.TypeGroup.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ToolBarStyles.resolve(
            type = when (bindings["type"]?.toString()) {
                "Default" -> ToolBarType.Default
                "Group" -> ToolBarType.Group
                else -> ToolBarType.Default
            },
        ).key
    }
}
