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
import com.sdds.serv.styles.drawer.DrawerCloseInner
import com.sdds.serv.styles.drawer.DrawerCloseInnerSize
import com.sdds.serv.styles.drawer.DrawerStyles
import com.sdds.serv.styles.drawer.HasShadow
import com.sdds.serv.styles.drawer.M
import com.sdds.serv.styles.drawer.resolve

internal object SddsServDrawerCloseInnerVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M")),
            Property.BooleanProperty(name = "hasShadow", value = false),
        )

    override val variations: Map<String, ComposeStyleReference<DrawerStyle>> =
        mapOf(
            "DrawerCloseInner.M" to ComposeStyleReference { DrawerCloseInner.M.style() },
            "DrawerCloseInner.M.HasShadow" to ComposeStyleReference { DrawerCloseInner.M.HasShadow.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return DrawerStyles.CloseInner.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> DrawerCloseInnerSize.M
                else -> DrawerCloseInnerSize.M
            },
            hasShadow = booleanBindingValue(bindings, "hasShadow", false),
        ).key
    }
}
