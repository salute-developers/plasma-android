// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.overlay.Default
import com.sdds.plasma.homeds.styles.overlay.DirectionBottom
import com.sdds.plasma.homeds.styles.overlay.DirectionTop
import com.sdds.plasma.homeds.styles.overlay.Overlay
import com.sdds.plasma.homeds.styles.overlay.OverlayKind
import com.sdds.plasma.homeds.styles.overlay.OverlayStyles
import com.sdds.plasma.homeds.styles.overlay.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsOverlayVariationsCompose : ComposeStyleProvider<OverlayStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "kind",
                value = "Default",
                variants = listOf("Default", "DirectionTop", "DirectionBottom"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<OverlayStyle>> =
        mapOf(
            "Overlay.Default" to ComposeStyleReference { Overlay.Default.style() },
            "Overlay.DirectionTop" to ComposeStyleReference { Overlay.DirectionTop.style() },
            "Overlay.DirectionBottom" to ComposeStyleReference { Overlay.DirectionBottom.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return OverlayStyles.resolve(
            kind = when (bindings["kind"]?.toString()) {
                "Default" -> OverlayKind.Default
                "DirectionTop" -> OverlayKind.DirectionTop
                "DirectionBottom" -> OverlayKind.DirectionBottom
                else -> OverlayKind.Default
            },
        ).key
    }
}
