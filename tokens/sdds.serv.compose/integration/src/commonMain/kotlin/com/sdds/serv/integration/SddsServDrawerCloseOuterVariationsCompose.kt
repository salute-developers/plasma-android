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
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.drawer.DrawerCloseOuter
import com.sdds.serv.styles.drawer.DrawerCloseOuterSize
import com.sdds.serv.styles.drawer.DrawerStyles
import com.sdds.serv.styles.drawer.HasShadow
import com.sdds.serv.styles.drawer.M
import com.sdds.serv.styles.drawer.resolve

internal object SddsServDrawerCloseOuterVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M")),
            Property.BooleanProperty(name = "hasShadow", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<DrawerStyle>> =
        mapOf(
            "DrawerCloseOuter.M" to ComposeStyleReference { DrawerCloseOuter.M.style() },
            "DrawerCloseOuter.M.HasShadow" to ComposeStyleReference { DrawerCloseOuter.M.HasShadow.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DrawerStyles.CloseOuter.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> DrawerCloseOuterSize.M
                else -> DrawerCloseOuterSize.M
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
        ).key
    }
}
