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
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.toolbar.HasShadow
import com.sdds.plasma.giga.styles.toolbar.L
import com.sdds.plasma.giga.styles.toolbar.M
import com.sdds.plasma.giga.styles.toolbar.S
import com.sdds.plasma.giga.styles.toolbar.ToolBarStyles
import com.sdds.plasma.giga.styles.toolbar.ToolBarVertical
import com.sdds.plasma.giga.styles.toolbar.ToolBarVerticalSize
import com.sdds.plasma.giga.styles.toolbar.Xs
import com.sdds.plasma.giga.styles.toolbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaToolBarVerticalVariationsCompose : ComposeStyleProvider<ToolBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.BooleanProperty(name = "hasShadow", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<ToolBarStyle>> =
        mapOf(
            "ToolBarVertical.L" to ComposeStyleReference { ToolBarVertical.L.style() },
            "ToolBarVertical.L.HasShadow" to ComposeStyleReference { ToolBarVertical.L.HasShadow.style() },
            "ToolBarVertical.M" to ComposeStyleReference { ToolBarVertical.M.style() },
            "ToolBarVertical.M.HasShadow" to ComposeStyleReference { ToolBarVertical.M.HasShadow.style() },
            "ToolBarVertical.S" to ComposeStyleReference { ToolBarVertical.S.style() },
            "ToolBarVertical.S.HasShadow" to ComposeStyleReference { ToolBarVertical.S.HasShadow.style() },
            "ToolBarVertical.Xs" to ComposeStyleReference { ToolBarVertical.Xs.style() },
            "ToolBarVertical.Xs.HasShadow" to ComposeStyleReference { ToolBarVertical.Xs.HasShadow.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ToolBarStyles.Vertical.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ToolBarVerticalSize.L
                "M" -> ToolBarVerticalSize.M
                "S" -> ToolBarVerticalSize.S
                "Xs" -> ToolBarVerticalSize.Xs
                else -> ToolBarVerticalSize.L
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
        ).key
    }
}
