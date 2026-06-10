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
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.wheel.CenterAlign
import com.sdds.plasma.homeds.styles.wheel.H1
import com.sdds.plasma.homeds.styles.wheel.H4
import com.sdds.plasma.homeds.styles.wheel.LeftAlign
import com.sdds.plasma.homeds.styles.wheel.MixedAlign
import com.sdds.plasma.homeds.styles.wheel.RightAlign
import com.sdds.plasma.homeds.styles.wheel.Wheel
import com.sdds.plasma.homeds.styles.wheel.WheelAlignment
import com.sdds.plasma.homeds.styles.wheel.WheelSize
import com.sdds.plasma.homeds.styles.wheel.WheelStyles
import com.sdds.plasma.homeds.styles.wheel.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsWheelVariationsCompose : ComposeStyleProvider<WheelStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "H4", variants = listOf("H1", "H4")),
            Property.SingleChoiceProperty(
                name = "alignment",
                value = "Center",
                variants = listOf("Left", "Right", "Center", "Mixed"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<WheelStyle>> =
        mapOf(
            "Wheel.H1" to ComposeStyleReference { Wheel.H1.style() },
            "Wheel.H1.RightAlign" to ComposeStyleReference { Wheel.H1.RightAlign.style() },
            "Wheel.H1.CenterAlign" to ComposeStyleReference { Wheel.H1.CenterAlign.style() },
            "Wheel.H1.LeftAlign" to ComposeStyleReference { Wheel.H1.LeftAlign.style() },
            "Wheel.H1.MixedAlign" to ComposeStyleReference { Wheel.H1.MixedAlign.style() },
            "Wheel.H4" to ComposeStyleReference { Wheel.H4.style() },
            "Wheel.H4.RightAlign" to ComposeStyleReference { Wheel.H4.RightAlign.style() },
            "Wheel.H4.CenterAlign" to ComposeStyleReference { Wheel.H4.CenterAlign.style() },
            "Wheel.H4.LeftAlign" to ComposeStyleReference { Wheel.H4.LeftAlign.style() },
            "Wheel.H4.MixedAlign" to ComposeStyleReference { Wheel.H4.MixedAlign.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return WheelStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "H1" -> WheelSize.H1
                "H4" -> WheelSize.H4
                else -> WheelSize.H4
            },
            alignment = when (bindings["alignment"]?.toString()) {
                "Left" -> WheelAlignment.Left
                "Right" -> WheelAlignment.Right
                "Center" -> WheelAlignment.Center
                "Mixed" -> WheelAlignment.Mixed
                else -> WheelAlignment.Center
            },
        ).key
    }
}
