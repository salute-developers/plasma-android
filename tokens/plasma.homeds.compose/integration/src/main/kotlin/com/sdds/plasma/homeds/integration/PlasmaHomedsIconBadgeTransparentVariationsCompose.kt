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
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeStyles
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeTransparent
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeTransparentShape
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeTransparentSize
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeTransparentView
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

internal object PlasmaHomedsIconBadgeTransparentVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
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
            "IconBadgeTransparent.L.Default" to ComposeStyleReference { IconBadgeTransparent.L.Default.style() },
            "IconBadgeTransparent.L.Accent" to ComposeStyleReference { IconBadgeTransparent.L.Accent.style() },
            "IconBadgeTransparent.L.Negative" to ComposeStyleReference { IconBadgeTransparent.L.Negative.style() },
            "IconBadgeTransparent.L.Positive" to ComposeStyleReference { IconBadgeTransparent.L.Positive.style() },
            "IconBadgeTransparent.L.Warning" to ComposeStyleReference { IconBadgeTransparent.L.Warning.style() },
            "IconBadgeTransparent.L.Dark" to ComposeStyleReference { IconBadgeTransparent.L.Dark.style() },
            "IconBadgeTransparent.L.Light" to ComposeStyleReference { IconBadgeTransparent.L.Light.style() },
            "IconBadgeTransparent.L.Pilled.Default" to ComposeStyleReference { IconBadgeTransparent.L.Pilled.Default.style() },
            "IconBadgeTransparent.L.Pilled.Accent" to ComposeStyleReference { IconBadgeTransparent.L.Pilled.Accent.style() },
            "IconBadgeTransparent.L.Pilled.Negative" to ComposeStyleReference { IconBadgeTransparent.L.Pilled.Negative.style() },
            "IconBadgeTransparent.L.Pilled.Positive" to ComposeStyleReference { IconBadgeTransparent.L.Pilled.Positive.style() },
            "IconBadgeTransparent.L.Pilled.Warning" to ComposeStyleReference { IconBadgeTransparent.L.Pilled.Warning.style() },
            "IconBadgeTransparent.L.Pilled.Dark" to ComposeStyleReference { IconBadgeTransparent.L.Pilled.Dark.style() },
            "IconBadgeTransparent.L.Pilled.Light" to ComposeStyleReference { IconBadgeTransparent.L.Pilled.Light.style() },
            "IconBadgeTransparent.M.Default" to ComposeStyleReference { IconBadgeTransparent.M.Default.style() },
            "IconBadgeTransparent.M.Accent" to ComposeStyleReference { IconBadgeTransparent.M.Accent.style() },
            "IconBadgeTransparent.M.Negative" to ComposeStyleReference { IconBadgeTransparent.M.Negative.style() },
            "IconBadgeTransparent.M.Positive" to ComposeStyleReference { IconBadgeTransparent.M.Positive.style() },
            "IconBadgeTransparent.M.Warning" to ComposeStyleReference { IconBadgeTransparent.M.Warning.style() },
            "IconBadgeTransparent.M.Dark" to ComposeStyleReference { IconBadgeTransparent.M.Dark.style() },
            "IconBadgeTransparent.M.Light" to ComposeStyleReference { IconBadgeTransparent.M.Light.style() },
            "IconBadgeTransparent.M.Pilled.Default" to ComposeStyleReference { IconBadgeTransparent.M.Pilled.Default.style() },
            "IconBadgeTransparent.M.Pilled.Accent" to ComposeStyleReference { IconBadgeTransparent.M.Pilled.Accent.style() },
            "IconBadgeTransparent.M.Pilled.Negative" to ComposeStyleReference { IconBadgeTransparent.M.Pilled.Negative.style() },
            "IconBadgeTransparent.M.Pilled.Positive" to ComposeStyleReference { IconBadgeTransparent.M.Pilled.Positive.style() },
            "IconBadgeTransparent.M.Pilled.Warning" to ComposeStyleReference { IconBadgeTransparent.M.Pilled.Warning.style() },
            "IconBadgeTransparent.M.Pilled.Dark" to ComposeStyleReference { IconBadgeTransparent.M.Pilled.Dark.style() },
            "IconBadgeTransparent.M.Pilled.Light" to ComposeStyleReference { IconBadgeTransparent.M.Pilled.Light.style() },
            "IconBadgeTransparent.S.Default" to ComposeStyleReference { IconBadgeTransparent.S.Default.style() },
            "IconBadgeTransparent.S.Accent" to ComposeStyleReference { IconBadgeTransparent.S.Accent.style() },
            "IconBadgeTransparent.S.Negative" to ComposeStyleReference { IconBadgeTransparent.S.Negative.style() },
            "IconBadgeTransparent.S.Positive" to ComposeStyleReference { IconBadgeTransparent.S.Positive.style() },
            "IconBadgeTransparent.S.Warning" to ComposeStyleReference { IconBadgeTransparent.S.Warning.style() },
            "IconBadgeTransparent.S.Dark" to ComposeStyleReference { IconBadgeTransparent.S.Dark.style() },
            "IconBadgeTransparent.S.Light" to ComposeStyleReference { IconBadgeTransparent.S.Light.style() },
            "IconBadgeTransparent.S.Pilled.Default" to ComposeStyleReference { IconBadgeTransparent.S.Pilled.Default.style() },
            "IconBadgeTransparent.S.Pilled.Accent" to ComposeStyleReference { IconBadgeTransparent.S.Pilled.Accent.style() },
            "IconBadgeTransparent.S.Pilled.Negative" to ComposeStyleReference { IconBadgeTransparent.S.Pilled.Negative.style() },
            "IconBadgeTransparent.S.Pilled.Positive" to ComposeStyleReference { IconBadgeTransparent.S.Pilled.Positive.style() },
            "IconBadgeTransparent.S.Pilled.Warning" to ComposeStyleReference { IconBadgeTransparent.S.Pilled.Warning.style() },
            "IconBadgeTransparent.S.Pilled.Dark" to ComposeStyleReference { IconBadgeTransparent.S.Pilled.Dark.style() },
            "IconBadgeTransparent.S.Pilled.Light" to ComposeStyleReference { IconBadgeTransparent.S.Pilled.Light.style() },
            "IconBadgeTransparent.Xs.Default" to ComposeStyleReference { IconBadgeTransparent.Xs.Default.style() },
            "IconBadgeTransparent.Xs.Accent" to ComposeStyleReference { IconBadgeTransparent.Xs.Accent.style() },
            "IconBadgeTransparent.Xs.Negative" to ComposeStyleReference { IconBadgeTransparent.Xs.Negative.style() },
            "IconBadgeTransparent.Xs.Positive" to ComposeStyleReference { IconBadgeTransparent.Xs.Positive.style() },
            "IconBadgeTransparent.Xs.Warning" to ComposeStyleReference { IconBadgeTransparent.Xs.Warning.style() },
            "IconBadgeTransparent.Xs.Dark" to ComposeStyleReference { IconBadgeTransparent.Xs.Dark.style() },
            "IconBadgeTransparent.Xs.Light" to ComposeStyleReference { IconBadgeTransparent.Xs.Light.style() },
            "IconBadgeTransparent.Xs.Pilled.Default" to ComposeStyleReference { IconBadgeTransparent.Xs.Pilled.Default.style() },
            "IconBadgeTransparent.Xs.Pilled.Accent" to ComposeStyleReference { IconBadgeTransparent.Xs.Pilled.Accent.style() },
            "IconBadgeTransparent.Xs.Pilled.Negative" to ComposeStyleReference { IconBadgeTransparent.Xs.Pilled.Negative.style() },
            "IconBadgeTransparent.Xs.Pilled.Positive" to ComposeStyleReference { IconBadgeTransparent.Xs.Pilled.Positive.style() },
            "IconBadgeTransparent.Xs.Pilled.Warning" to ComposeStyleReference { IconBadgeTransparent.Xs.Pilled.Warning.style() },
            "IconBadgeTransparent.Xs.Pilled.Dark" to ComposeStyleReference { IconBadgeTransparent.Xs.Pilled.Dark.style() },
            "IconBadgeTransparent.Xs.Pilled.Light" to ComposeStyleReference { IconBadgeTransparent.Xs.Pilled.Light.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconBadgeStyles.Transparent.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> IconBadgeTransparentSize.L
                "M" -> IconBadgeTransparentSize.M
                "S" -> IconBadgeTransparentSize.S
                "Xs" -> IconBadgeTransparentSize.Xs
                else -> IconBadgeTransparentSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> IconBadgeTransparentShape.Default
                "Pilled" -> IconBadgeTransparentShape.Pilled
                else -> IconBadgeTransparentShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> IconBadgeTransparentView.Default
                "Accent" -> IconBadgeTransparentView.Accent
                "Negative" -> IconBadgeTransparentView.Negative
                "Positive" -> IconBadgeTransparentView.Positive
                "Warning" -> IconBadgeTransparentView.Warning
                "Dark" -> IconBadgeTransparentView.Dark
                "Light" -> IconBadgeTransparentView.Light
                else -> IconBadgeTransparentView.Default
            },
        ).key
    }
}
