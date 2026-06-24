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
import com.sdds.plasma.giga.styles.toolbar.ToolBarHorizontal
import com.sdds.plasma.giga.styles.toolbar.ToolBarHorizontalSize
import com.sdds.plasma.giga.styles.toolbar.ToolBarStyles
import com.sdds.plasma.giga.styles.toolbar.Xs
import com.sdds.plasma.giga.styles.toolbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaToolBarHorizontalVariationsCompose : ComposeStyleProvider<ToolBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.BooleanProperty(name = "hasShadow", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<ToolBarStyle>> =
        mapOf(
            "ToolBarHorizontal.L" to ComposeStyleReference { ToolBarHorizontal.L.style() },
            "ToolBarHorizontal.L.HasShadow" to ComposeStyleReference { ToolBarHorizontal.L.HasShadow.style() },
            "ToolBarHorizontal.M" to ComposeStyleReference { ToolBarHorizontal.M.style() },
            "ToolBarHorizontal.M.HasShadow" to ComposeStyleReference { ToolBarHorizontal.M.HasShadow.style() },
            "ToolBarHorizontal.S" to ComposeStyleReference { ToolBarHorizontal.S.style() },
            "ToolBarHorizontal.S.HasShadow" to ComposeStyleReference { ToolBarHorizontal.S.HasShadow.style() },
            "ToolBarHorizontal.Xs" to ComposeStyleReference { ToolBarHorizontal.Xs.style() },
            "ToolBarHorizontal.Xs.HasShadow" to ComposeStyleReference { ToolBarHorizontal.Xs.HasShadow.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ToolBarStyles.Horizontal.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ToolBarHorizontalSize.L
                "M" -> ToolBarHorizontalSize.M
                "S" -> ToolBarHorizontalSize.S
                "Xs" -> ToolBarHorizontalSize.Xs
                else -> ToolBarHorizontalSize.L
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
        ).key
    }
}
