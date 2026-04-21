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
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.badge.Accent
import com.sdds.plasma.homeds.styles.badge.BadgeSolid
import com.sdds.plasma.homeds.styles.badge.BadgeSolidShape
import com.sdds.plasma.homeds.styles.badge.BadgeSolidSize
import com.sdds.plasma.homeds.styles.badge.BadgeSolidView
import com.sdds.plasma.homeds.styles.badge.BadgeStyles
import com.sdds.plasma.homeds.styles.badge.Dark
import com.sdds.plasma.homeds.styles.badge.Default
import com.sdds.plasma.homeds.styles.badge.L
import com.sdds.plasma.homeds.styles.badge.Light
import com.sdds.plasma.homeds.styles.badge.M
import com.sdds.plasma.homeds.styles.badge.Negative
import com.sdds.plasma.homeds.styles.badge.Pilled
import com.sdds.plasma.homeds.styles.badge.Positive
import com.sdds.plasma.homeds.styles.badge.S
import com.sdds.plasma.homeds.styles.badge.Warning
import com.sdds.plasma.homeds.styles.badge.Xs
import com.sdds.plasma.homeds.styles.badge.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsBadgeSolidVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Negative", "Positive", "Warning", "Dark", "Light"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<BadgeStyle>> =
        mapOf(
            "BadgeSolid.L.Default" to ComposeStyleReference { BadgeSolid.L.Default.style() },
            "BadgeSolid.L.Accent" to ComposeStyleReference { BadgeSolid.L.Accent.style() },
            "BadgeSolid.L.Negative" to ComposeStyleReference { BadgeSolid.L.Negative.style() },
            "BadgeSolid.L.Positive" to ComposeStyleReference { BadgeSolid.L.Positive.style() },
            "BadgeSolid.L.Warning" to ComposeStyleReference { BadgeSolid.L.Warning.style() },
            "BadgeSolid.L.Dark" to ComposeStyleReference { BadgeSolid.L.Dark.style() },
            "BadgeSolid.L.Light" to ComposeStyleReference { BadgeSolid.L.Light.style() },
            "BadgeSolid.L.Pilled.Default" to ComposeStyleReference { BadgeSolid.L.Pilled.Default.style() },
            "BadgeSolid.L.Pilled.Accent" to ComposeStyleReference { BadgeSolid.L.Pilled.Accent.style() },
            "BadgeSolid.L.Pilled.Negative" to ComposeStyleReference { BadgeSolid.L.Pilled.Negative.style() },
            "BadgeSolid.L.Pilled.Positive" to ComposeStyleReference { BadgeSolid.L.Pilled.Positive.style() },
            "BadgeSolid.L.Pilled.Warning" to ComposeStyleReference { BadgeSolid.L.Pilled.Warning.style() },
            "BadgeSolid.L.Pilled.Dark" to ComposeStyleReference { BadgeSolid.L.Pilled.Dark.style() },
            "BadgeSolid.L.Pilled.Light" to ComposeStyleReference { BadgeSolid.L.Pilled.Light.style() },
            "BadgeSolid.M.Default" to ComposeStyleReference { BadgeSolid.M.Default.style() },
            "BadgeSolid.M.Accent" to ComposeStyleReference { BadgeSolid.M.Accent.style() },
            "BadgeSolid.M.Negative" to ComposeStyleReference { BadgeSolid.M.Negative.style() },
            "BadgeSolid.M.Positive" to ComposeStyleReference { BadgeSolid.M.Positive.style() },
            "BadgeSolid.M.Warning" to ComposeStyleReference { BadgeSolid.M.Warning.style() },
            "BadgeSolid.M.Dark" to ComposeStyleReference { BadgeSolid.M.Dark.style() },
            "BadgeSolid.M.Light" to ComposeStyleReference { BadgeSolid.M.Light.style() },
            "BadgeSolid.M.Pilled.Default" to ComposeStyleReference { BadgeSolid.M.Pilled.Default.style() },
            "BadgeSolid.M.Pilled.Accent" to ComposeStyleReference { BadgeSolid.M.Pilled.Accent.style() },
            "BadgeSolid.M.Pilled.Negative" to ComposeStyleReference { BadgeSolid.M.Pilled.Negative.style() },
            "BadgeSolid.M.Pilled.Positive" to ComposeStyleReference { BadgeSolid.M.Pilled.Positive.style() },
            "BadgeSolid.M.Pilled.Warning" to ComposeStyleReference { BadgeSolid.M.Pilled.Warning.style() },
            "BadgeSolid.M.Pilled.Dark" to ComposeStyleReference { BadgeSolid.M.Pilled.Dark.style() },
            "BadgeSolid.M.Pilled.Light" to ComposeStyleReference { BadgeSolid.M.Pilled.Light.style() },
            "BadgeSolid.S.Default" to ComposeStyleReference { BadgeSolid.S.Default.style() },
            "BadgeSolid.S.Accent" to ComposeStyleReference { BadgeSolid.S.Accent.style() },
            "BadgeSolid.S.Negative" to ComposeStyleReference { BadgeSolid.S.Negative.style() },
            "BadgeSolid.S.Positive" to ComposeStyleReference { BadgeSolid.S.Positive.style() },
            "BadgeSolid.S.Warning" to ComposeStyleReference { BadgeSolid.S.Warning.style() },
            "BadgeSolid.S.Dark" to ComposeStyleReference { BadgeSolid.S.Dark.style() },
            "BadgeSolid.S.Light" to ComposeStyleReference { BadgeSolid.S.Light.style() },
            "BadgeSolid.S.Pilled.Default" to ComposeStyleReference { BadgeSolid.S.Pilled.Default.style() },
            "BadgeSolid.S.Pilled.Accent" to ComposeStyleReference { BadgeSolid.S.Pilled.Accent.style() },
            "BadgeSolid.S.Pilled.Negative" to ComposeStyleReference { BadgeSolid.S.Pilled.Negative.style() },
            "BadgeSolid.S.Pilled.Positive" to ComposeStyleReference { BadgeSolid.S.Pilled.Positive.style() },
            "BadgeSolid.S.Pilled.Warning" to ComposeStyleReference { BadgeSolid.S.Pilled.Warning.style() },
            "BadgeSolid.S.Pilled.Dark" to ComposeStyleReference { BadgeSolid.S.Pilled.Dark.style() },
            "BadgeSolid.S.Pilled.Light" to ComposeStyleReference { BadgeSolid.S.Pilled.Light.style() },
            "BadgeSolid.Xs.Default" to ComposeStyleReference { BadgeSolid.Xs.Default.style() },
            "BadgeSolid.Xs.Accent" to ComposeStyleReference { BadgeSolid.Xs.Accent.style() },
            "BadgeSolid.Xs.Negative" to ComposeStyleReference { BadgeSolid.Xs.Negative.style() },
            "BadgeSolid.Xs.Positive" to ComposeStyleReference { BadgeSolid.Xs.Positive.style() },
            "BadgeSolid.Xs.Warning" to ComposeStyleReference { BadgeSolid.Xs.Warning.style() },
            "BadgeSolid.Xs.Dark" to ComposeStyleReference { BadgeSolid.Xs.Dark.style() },
            "BadgeSolid.Xs.Light" to ComposeStyleReference { BadgeSolid.Xs.Light.style() },
            "BadgeSolid.Xs.Pilled.Default" to ComposeStyleReference { BadgeSolid.Xs.Pilled.Default.style() },
            "BadgeSolid.Xs.Pilled.Accent" to ComposeStyleReference { BadgeSolid.Xs.Pilled.Accent.style() },
            "BadgeSolid.Xs.Pilled.Negative" to ComposeStyleReference { BadgeSolid.Xs.Pilled.Negative.style() },
            "BadgeSolid.Xs.Pilled.Positive" to ComposeStyleReference { BadgeSolid.Xs.Pilled.Positive.style() },
            "BadgeSolid.Xs.Pilled.Warning" to ComposeStyleReference { BadgeSolid.Xs.Pilled.Warning.style() },
            "BadgeSolid.Xs.Pilled.Dark" to ComposeStyleReference { BadgeSolid.Xs.Pilled.Dark.style() },
            "BadgeSolid.Xs.Pilled.Light" to ComposeStyleReference { BadgeSolid.Xs.Pilled.Light.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return BadgeStyles.Solid.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> BadgeSolidSize.L
                "M" -> BadgeSolidSize.M
                "S" -> BadgeSolidSize.S
                "Xs" -> BadgeSolidSize.Xs
                else -> BadgeSolidSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> BadgeSolidShape.Default
                "Pilled" -> BadgeSolidShape.Pilled
                else -> BadgeSolidShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> BadgeSolidView.Default
                "Accent" -> BadgeSolidView.Accent
                "Negative" -> BadgeSolidView.Negative
                "Positive" -> BadgeSolidView.Positive
                "Warning" -> BadgeSolidView.Warning
                "Dark" -> BadgeSolidView.Dark
                "Light" -> BadgeSolidView.Light
                else -> BadgeSolidView.Default
            },
        ).key
    }
}
