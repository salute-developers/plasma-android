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
import com.sdds.serv.styles.drawer.DrawerCloseNone
import com.sdds.serv.styles.drawer.DrawerCloseNoneSize
import com.sdds.serv.styles.drawer.DrawerStyles
import com.sdds.serv.styles.drawer.HasShadow
import com.sdds.serv.styles.drawer.M
import com.sdds.serv.styles.drawer.resolve

internal object SddsServDrawerCloseNoneVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
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
