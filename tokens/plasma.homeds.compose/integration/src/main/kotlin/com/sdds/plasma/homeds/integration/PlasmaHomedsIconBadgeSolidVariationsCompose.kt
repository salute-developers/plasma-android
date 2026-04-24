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
import com.sdds.plasma.homeds.styles.iconbadge.Accent
import com.sdds.plasma.homeds.styles.iconbadge.Dark
import com.sdds.plasma.homeds.styles.iconbadge.Default
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeSolid
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeSolidShape
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeSolidSize
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeSolidView
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeStyles
import com.sdds.plasma.homeds.styles.iconbadge.L
import com.sdds.plasma.homeds.styles.iconbadge.Light
import com.sdds.plasma.homeds.styles.iconbadge.M
import com.sdds.plasma.homeds.styles.iconbadge.Negative
import com.sdds.plasma.homeds.styles.iconbadge.Pilled
import com.sdds.plasma.homeds.styles.iconbadge.Positive
import com.sdds.plasma.homeds.styles.iconbadge.S
import com.sdds.plasma.homeds.styles.iconbadge.Warning
import com.sdds.plasma.homeds.styles.iconbadge.Xs
import com.sdds.plasma.homeds.styles.iconbadge.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsIconBadgeSolidVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
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
            "IconBadgeSolid.L.Default" to ComposeStyleReference { IconBadgeSolid.L.Default.style() },
            "IconBadgeSolid.L.Accent" to ComposeStyleReference { IconBadgeSolid.L.Accent.style() },
            "IconBadgeSolid.L.Negative" to ComposeStyleReference { IconBadgeSolid.L.Negative.style() },
            "IconBadgeSolid.L.Positive" to ComposeStyleReference { IconBadgeSolid.L.Positive.style() },
            "IconBadgeSolid.L.Warning" to ComposeStyleReference { IconBadgeSolid.L.Warning.style() },
            "IconBadgeSolid.L.Dark" to ComposeStyleReference { IconBadgeSolid.L.Dark.style() },
            "IconBadgeSolid.L.Light" to ComposeStyleReference { IconBadgeSolid.L.Light.style() },
            "IconBadgeSolid.L.Pilled.Default" to ComposeStyleReference { IconBadgeSolid.L.Pilled.Default.style() },
            "IconBadgeSolid.L.Pilled.Accent" to ComposeStyleReference { IconBadgeSolid.L.Pilled.Accent.style() },
            "IconBadgeSolid.L.Pilled.Negative" to ComposeStyleReference { IconBadgeSolid.L.Pilled.Negative.style() },
            "IconBadgeSolid.L.Pilled.Positive" to ComposeStyleReference { IconBadgeSolid.L.Pilled.Positive.style() },
            "IconBadgeSolid.L.Pilled.Warning" to ComposeStyleReference { IconBadgeSolid.L.Pilled.Warning.style() },
            "IconBadgeSolid.L.Pilled.Dark" to ComposeStyleReference { IconBadgeSolid.L.Pilled.Dark.style() },
            "IconBadgeSolid.L.Pilled.Light" to ComposeStyleReference { IconBadgeSolid.L.Pilled.Light.style() },
            "IconBadgeSolid.M.Default" to ComposeStyleReference { IconBadgeSolid.M.Default.style() },
            "IconBadgeSolid.M.Accent" to ComposeStyleReference { IconBadgeSolid.M.Accent.style() },
            "IconBadgeSolid.M.Negative" to ComposeStyleReference { IconBadgeSolid.M.Negative.style() },
            "IconBadgeSolid.M.Positive" to ComposeStyleReference { IconBadgeSolid.M.Positive.style() },
            "IconBadgeSolid.M.Warning" to ComposeStyleReference { IconBadgeSolid.M.Warning.style() },
            "IconBadgeSolid.M.Dark" to ComposeStyleReference { IconBadgeSolid.M.Dark.style() },
            "IconBadgeSolid.M.Light" to ComposeStyleReference { IconBadgeSolid.M.Light.style() },
            "IconBadgeSolid.M.Pilled.Default" to ComposeStyleReference { IconBadgeSolid.M.Pilled.Default.style() },
            "IconBadgeSolid.M.Pilled.Accent" to ComposeStyleReference { IconBadgeSolid.M.Pilled.Accent.style() },
            "IconBadgeSolid.M.Pilled.Negative" to ComposeStyleReference { IconBadgeSolid.M.Pilled.Negative.style() },
            "IconBadgeSolid.M.Pilled.Positive" to ComposeStyleReference { IconBadgeSolid.M.Pilled.Positive.style() },
            "IconBadgeSolid.M.Pilled.Warning" to ComposeStyleReference { IconBadgeSolid.M.Pilled.Warning.style() },
            "IconBadgeSolid.M.Pilled.Dark" to ComposeStyleReference { IconBadgeSolid.M.Pilled.Dark.style() },
            "IconBadgeSolid.M.Pilled.Light" to ComposeStyleReference { IconBadgeSolid.M.Pilled.Light.style() },
            "IconBadgeSolid.S.Default" to ComposeStyleReference { IconBadgeSolid.S.Default.style() },
            "IconBadgeSolid.S.Accent" to ComposeStyleReference { IconBadgeSolid.S.Accent.style() },
            "IconBadgeSolid.S.Negative" to ComposeStyleReference { IconBadgeSolid.S.Negative.style() },
            "IconBadgeSolid.S.Positive" to ComposeStyleReference { IconBadgeSolid.S.Positive.style() },
            "IconBadgeSolid.S.Warning" to ComposeStyleReference { IconBadgeSolid.S.Warning.style() },
            "IconBadgeSolid.S.Dark" to ComposeStyleReference { IconBadgeSolid.S.Dark.style() },
            "IconBadgeSolid.S.Light" to ComposeStyleReference { IconBadgeSolid.S.Light.style() },
            "IconBadgeSolid.S.Pilled.Default" to ComposeStyleReference { IconBadgeSolid.S.Pilled.Default.style() },
            "IconBadgeSolid.S.Pilled.Accent" to ComposeStyleReference { IconBadgeSolid.S.Pilled.Accent.style() },
            "IconBadgeSolid.S.Pilled.Negative" to ComposeStyleReference { IconBadgeSolid.S.Pilled.Negative.style() },
            "IconBadgeSolid.S.Pilled.Positive" to ComposeStyleReference { IconBadgeSolid.S.Pilled.Positive.style() },
            "IconBadgeSolid.S.Pilled.Warning" to ComposeStyleReference { IconBadgeSolid.S.Pilled.Warning.style() },
            "IconBadgeSolid.S.Pilled.Dark" to ComposeStyleReference { IconBadgeSolid.S.Pilled.Dark.style() },
            "IconBadgeSolid.S.Pilled.Light" to ComposeStyleReference { IconBadgeSolid.S.Pilled.Light.style() },
            "IconBadgeSolid.Xs.Default" to ComposeStyleReference { IconBadgeSolid.Xs.Default.style() },
            "IconBadgeSolid.Xs.Accent" to ComposeStyleReference { IconBadgeSolid.Xs.Accent.style() },
            "IconBadgeSolid.Xs.Negative" to ComposeStyleReference { IconBadgeSolid.Xs.Negative.style() },
            "IconBadgeSolid.Xs.Positive" to ComposeStyleReference { IconBadgeSolid.Xs.Positive.style() },
            "IconBadgeSolid.Xs.Warning" to ComposeStyleReference { IconBadgeSolid.Xs.Warning.style() },
            "IconBadgeSolid.Xs.Dark" to ComposeStyleReference { IconBadgeSolid.Xs.Dark.style() },
            "IconBadgeSolid.Xs.Light" to ComposeStyleReference { IconBadgeSolid.Xs.Light.style() },
            "IconBadgeSolid.Xs.Pilled.Default" to ComposeStyleReference { IconBadgeSolid.Xs.Pilled.Default.style() },
            "IconBadgeSolid.Xs.Pilled.Accent" to ComposeStyleReference { IconBadgeSolid.Xs.Pilled.Accent.style() },
            "IconBadgeSolid.Xs.Pilled.Negative" to ComposeStyleReference { IconBadgeSolid.Xs.Pilled.Negative.style() },
            "IconBadgeSolid.Xs.Pilled.Positive" to ComposeStyleReference { IconBadgeSolid.Xs.Pilled.Positive.style() },
            "IconBadgeSolid.Xs.Pilled.Warning" to ComposeStyleReference { IconBadgeSolid.Xs.Pilled.Warning.style() },
            "IconBadgeSolid.Xs.Pilled.Dark" to ComposeStyleReference { IconBadgeSolid.Xs.Pilled.Dark.style() },
            "IconBadgeSolid.Xs.Pilled.Light" to ComposeStyleReference { IconBadgeSolid.Xs.Pilled.Light.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconBadgeStyles.Solid.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> IconBadgeSolidSize.L
                "M" -> IconBadgeSolidSize.M
                "S" -> IconBadgeSolidSize.S
                "Xs" -> IconBadgeSolidSize.Xs
                else -> IconBadgeSolidSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> IconBadgeSolidShape.Default
                "Pilled" -> IconBadgeSolidShape.Pilled
                else -> IconBadgeSolidShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> IconBadgeSolidView.Default
                "Accent" -> IconBadgeSolidView.Accent
                "Negative" -> IconBadgeSolidView.Negative
                "Positive" -> IconBadgeSolidView.Positive
                "Warning" -> IconBadgeSolidView.Warning
                "Dark" -> IconBadgeSolidView.Dark
                "Light" -> IconBadgeSolidView.Light
                else -> IconBadgeSolidView.Default
            },
        ).key
    }
}
