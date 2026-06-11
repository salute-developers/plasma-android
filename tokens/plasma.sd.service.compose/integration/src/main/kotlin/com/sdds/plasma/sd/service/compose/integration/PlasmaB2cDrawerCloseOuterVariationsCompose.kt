// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.drawer.DrawerCloseOuter
import com.sdds.plasma.sd.service.styles.drawer.DrawerCloseOuterSize
import com.sdds.plasma.sd.service.styles.drawer.DrawerStyles
import com.sdds.plasma.sd.service.styles.drawer.HasShadow
import com.sdds.plasma.sd.service.styles.drawer.M
import com.sdds.plasma.sd.service.styles.drawer.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cDrawerCloseOuterVariationsCompose : ComposeStyleProvider<DrawerStyle>() {
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
