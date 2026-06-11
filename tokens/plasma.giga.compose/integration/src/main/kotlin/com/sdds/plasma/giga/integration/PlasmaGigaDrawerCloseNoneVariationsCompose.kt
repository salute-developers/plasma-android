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
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.drawer.DrawerCloseNone
import com.sdds.plasma.giga.styles.drawer.DrawerCloseNoneSize
import com.sdds.plasma.giga.styles.drawer.DrawerStyles
import com.sdds.plasma.giga.styles.drawer.HasShadow
import com.sdds.plasma.giga.styles.drawer.M
import com.sdds.plasma.giga.styles.drawer.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaDrawerCloseNoneVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M")),
            Property.BooleanProperty(name = "hasShadow", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<DrawerStyle>> =
        mapOf(
            "DrawerCloseNone.M" to ComposeStyleReference { DrawerCloseNone.M.style() },
            "DrawerCloseNone.M.HasShadow" to ComposeStyleReference { DrawerCloseNone.M.HasShadow.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DrawerStyles.CloseNone.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> DrawerCloseNoneSize.M
                else -> DrawerCloseNoneSize.M
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
        ).key
    }
}
