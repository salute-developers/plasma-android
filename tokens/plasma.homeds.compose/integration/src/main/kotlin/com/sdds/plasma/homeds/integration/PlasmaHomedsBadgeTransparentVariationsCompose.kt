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
import com.sdds.plasma.homeds.styles.badge.BadgeStyles
import com.sdds.plasma.homeds.styles.badge.BadgeTransparent
import com.sdds.plasma.homeds.styles.badge.BadgeTransparentShape
import com.sdds.plasma.homeds.styles.badge.BadgeTransparentSize
import com.sdds.plasma.homeds.styles.badge.BadgeTransparentView
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

internal object PlasmaHomedsBadgeTransparentVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
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
            "BadgeTransparent.L.Default" to ComposeStyleReference { BadgeTransparent.L.Default.style() },
            "BadgeTransparent.L.Accent" to ComposeStyleReference { BadgeTransparent.L.Accent.style() },
            "BadgeTransparent.L.Negative" to ComposeStyleReference { BadgeTransparent.L.Negative.style() },
            "BadgeTransparent.L.Positive" to ComposeStyleReference { BadgeTransparent.L.Positive.style() },
            "BadgeTransparent.L.Warning" to ComposeStyleReference { BadgeTransparent.L.Warning.style() },
            "BadgeTransparent.L.Dark" to ComposeStyleReference { BadgeTransparent.L.Dark.style() },
            "BadgeTransparent.L.Light" to ComposeStyleReference { BadgeTransparent.L.Light.style() },
            "BadgeTransparent.L.Pilled.Default" to ComposeStyleReference { BadgeTransparent.L.Pilled.Default.style() },
            "BadgeTransparent.L.Pilled.Accent" to ComposeStyleReference { BadgeTransparent.L.Pilled.Accent.style() },
            "BadgeTransparent.L.Pilled.Negative" to ComposeStyleReference { BadgeTransparent.L.Pilled.Negative.style() },
            "BadgeTransparent.L.Pilled.Positive" to ComposeStyleReference { BadgeTransparent.L.Pilled.Positive.style() },
            "BadgeTransparent.L.Pilled.Warning" to ComposeStyleReference { BadgeTransparent.L.Pilled.Warning.style() },
            "BadgeTransparent.L.Pilled.Dark" to ComposeStyleReference { BadgeTransparent.L.Pilled.Dark.style() },
            "BadgeTransparent.L.Pilled.Light" to ComposeStyleReference { BadgeTransparent.L.Pilled.Light.style() },
            "BadgeTransparent.M.Default" to ComposeStyleReference { BadgeTransparent.M.Default.style() },
            "BadgeTransparent.M.Accent" to ComposeStyleReference { BadgeTransparent.M.Accent.style() },
            "BadgeTransparent.M.Negative" to ComposeStyleReference { BadgeTransparent.M.Negative.style() },
            "BadgeTransparent.M.Positive" to ComposeStyleReference { BadgeTransparent.M.Positive.style() },
            "BadgeTransparent.M.Warning" to ComposeStyleReference { BadgeTransparent.M.Warning.style() },
            "BadgeTransparent.M.Dark" to ComposeStyleReference { BadgeTransparent.M.Dark.style() },
            "BadgeTransparent.M.Light" to ComposeStyleReference { BadgeTransparent.M.Light.style() },
            "BadgeTransparent.M.Pilled.Default" to ComposeStyleReference { BadgeTransparent.M.Pilled.Default.style() },
            "BadgeTransparent.M.Pilled.Accent" to ComposeStyleReference { BadgeTransparent.M.Pilled.Accent.style() },
            "BadgeTransparent.M.Pilled.Negative" to ComposeStyleReference { BadgeTransparent.M.Pilled.Negative.style() },
            "BadgeTransparent.M.Pilled.Positive" to ComposeStyleReference { BadgeTransparent.M.Pilled.Positive.style() },
            "BadgeTransparent.M.Pilled.Warning" to ComposeStyleReference { BadgeTransparent.M.Pilled.Warning.style() },
            "BadgeTransparent.M.Pilled.Dark" to ComposeStyleReference { BadgeTransparent.M.Pilled.Dark.style() },
            "BadgeTransparent.M.Pilled.Light" to ComposeStyleReference { BadgeTransparent.M.Pilled.Light.style() },
            "BadgeTransparent.S.Default" to ComposeStyleReference { BadgeTransparent.S.Default.style() },
            "BadgeTransparent.S.Accent" to ComposeStyleReference { BadgeTransparent.S.Accent.style() },
            "BadgeTransparent.S.Negative" to ComposeStyleReference { BadgeTransparent.S.Negative.style() },
            "BadgeTransparent.S.Positive" to ComposeStyleReference { BadgeTransparent.S.Positive.style() },
            "BadgeTransparent.S.Warning" to ComposeStyleReference { BadgeTransparent.S.Warning.style() },
            "BadgeTransparent.S.Dark" to ComposeStyleReference { BadgeTransparent.S.Dark.style() },
            "BadgeTransparent.S.Light" to ComposeStyleReference { BadgeTransparent.S.Light.style() },
            "BadgeTransparent.S.Pilled.Default" to ComposeStyleReference { BadgeTransparent.S.Pilled.Default.style() },
            "BadgeTransparent.S.Pilled.Accent" to ComposeStyleReference { BadgeTransparent.S.Pilled.Accent.style() },
            "BadgeTransparent.S.Pilled.Negative" to ComposeStyleReference { BadgeTransparent.S.Pilled.Negative.style() },
            "BadgeTransparent.S.Pilled.Positive" to ComposeStyleReference { BadgeTransparent.S.Pilled.Positive.style() },
            "BadgeTransparent.S.Pilled.Warning" to ComposeStyleReference { BadgeTransparent.S.Pilled.Warning.style() },
            "BadgeTransparent.S.Pilled.Dark" to ComposeStyleReference { BadgeTransparent.S.Pilled.Dark.style() },
            "BadgeTransparent.S.Pilled.Light" to ComposeStyleReference { BadgeTransparent.S.Pilled.Light.style() },
            "BadgeTransparent.Xs.Default" to ComposeStyleReference { BadgeTransparent.Xs.Default.style() },
            "BadgeTransparent.Xs.Accent" to ComposeStyleReference { BadgeTransparent.Xs.Accent.style() },
            "BadgeTransparent.Xs.Negative" to ComposeStyleReference { BadgeTransparent.Xs.Negative.style() },
            "BadgeTransparent.Xs.Positive" to ComposeStyleReference { BadgeTransparent.Xs.Positive.style() },
            "BadgeTransparent.Xs.Warning" to ComposeStyleReference { BadgeTransparent.Xs.Warning.style() },
            "BadgeTransparent.Xs.Dark" to ComposeStyleReference { BadgeTransparent.Xs.Dark.style() },
            "BadgeTransparent.Xs.Light" to ComposeStyleReference { BadgeTransparent.Xs.Light.style() },
            "BadgeTransparent.Xs.Pilled.Default" to ComposeStyleReference { BadgeTransparent.Xs.Pilled.Default.style() },
            "BadgeTransparent.Xs.Pilled.Accent" to ComposeStyleReference { BadgeTransparent.Xs.Pilled.Accent.style() },
            "BadgeTransparent.Xs.Pilled.Negative" to ComposeStyleReference { BadgeTransparent.Xs.Pilled.Negative.style() },
            "BadgeTransparent.Xs.Pilled.Positive" to ComposeStyleReference { BadgeTransparent.Xs.Pilled.Positive.style() },
            "BadgeTransparent.Xs.Pilled.Warning" to ComposeStyleReference { BadgeTransparent.Xs.Pilled.Warning.style() },
            "BadgeTransparent.Xs.Pilled.Dark" to ComposeStyleReference { BadgeTransparent.Xs.Pilled.Dark.style() },
            "BadgeTransparent.Xs.Pilled.Light" to ComposeStyleReference { BadgeTransparent.Xs.Pilled.Light.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return BadgeStyles.Transparent.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> BadgeTransparentSize.L
                "M" -> BadgeTransparentSize.M
                "S" -> BadgeTransparentSize.S
                "Xs" -> BadgeTransparentSize.Xs
                else -> BadgeTransparentSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> BadgeTransparentShape.Default
                "Pilled" -> BadgeTransparentShape.Pilled
                else -> BadgeTransparentShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> BadgeTransparentView.Default
                "Accent" -> BadgeTransparentView.Accent
                "Negative" -> BadgeTransparentView.Negative
                "Positive" -> BadgeTransparentView.Positive
                "Warning" -> BadgeTransparentView.Warning
                "Dark" -> BadgeTransparentView.Dark
                "Light" -> BadgeTransparentView.Light
                else -> BadgeTransparentView.Default
            },
        ).key
    }
}
