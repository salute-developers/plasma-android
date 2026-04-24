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
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeClear
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeClearShape
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeClearSize
import com.sdds.plasma.homeds.styles.iconbadge.IconBadgeClearView
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

internal object PlasmaHomedsIconBadgeClearVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
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
            "IconBadgeClear.L.Default" to ComposeStyleReference { IconBadgeClear.L.Default.style() },
            "IconBadgeClear.L.Accent" to ComposeStyleReference { IconBadgeClear.L.Accent.style() },
            "IconBadgeClear.L.Negative" to ComposeStyleReference { IconBadgeClear.L.Negative.style() },
            "IconBadgeClear.L.Positive" to ComposeStyleReference { IconBadgeClear.L.Positive.style() },
            "IconBadgeClear.L.Warning" to ComposeStyleReference { IconBadgeClear.L.Warning.style() },
            "IconBadgeClear.L.Dark" to ComposeStyleReference { IconBadgeClear.L.Dark.style() },
            "IconBadgeClear.L.Light" to ComposeStyleReference { IconBadgeClear.L.Light.style() },
            "IconBadgeClear.L.Pilled.Default" to ComposeStyleReference { IconBadgeClear.L.Pilled.Default.style() },
            "IconBadgeClear.L.Pilled.Accent" to ComposeStyleReference { IconBadgeClear.L.Pilled.Accent.style() },
            "IconBadgeClear.L.Pilled.Negative" to ComposeStyleReference { IconBadgeClear.L.Pilled.Negative.style() },
            "IconBadgeClear.L.Pilled.Positive" to ComposeStyleReference { IconBadgeClear.L.Pilled.Positive.style() },
            "IconBadgeClear.L.Pilled.Warning" to ComposeStyleReference { IconBadgeClear.L.Pilled.Warning.style() },
            "IconBadgeClear.L.Pilled.Dark" to ComposeStyleReference { IconBadgeClear.L.Pilled.Dark.style() },
            "IconBadgeClear.L.Pilled.Light" to ComposeStyleReference { IconBadgeClear.L.Pilled.Light.style() },
            "IconBadgeClear.M.Default" to ComposeStyleReference { IconBadgeClear.M.Default.style() },
            "IconBadgeClear.M.Accent" to ComposeStyleReference { IconBadgeClear.M.Accent.style() },
            "IconBadgeClear.M.Negative" to ComposeStyleReference { IconBadgeClear.M.Negative.style() },
            "IconBadgeClear.M.Positive" to ComposeStyleReference { IconBadgeClear.M.Positive.style() },
            "IconBadgeClear.M.Warning" to ComposeStyleReference { IconBadgeClear.M.Warning.style() },
            "IconBadgeClear.M.Dark" to ComposeStyleReference { IconBadgeClear.M.Dark.style() },
            "IconBadgeClear.M.Light" to ComposeStyleReference { IconBadgeClear.M.Light.style() },
            "IconBadgeClear.M.Pilled.Default" to ComposeStyleReference { IconBadgeClear.M.Pilled.Default.style() },
            "IconBadgeClear.M.Pilled.Accent" to ComposeStyleReference { IconBadgeClear.M.Pilled.Accent.style() },
            "IconBadgeClear.M.Pilled.Negative" to ComposeStyleReference { IconBadgeClear.M.Pilled.Negative.style() },
            "IconBadgeClear.M.Pilled.Positive" to ComposeStyleReference { IconBadgeClear.M.Pilled.Positive.style() },
            "IconBadgeClear.M.Pilled.Warning" to ComposeStyleReference { IconBadgeClear.M.Pilled.Warning.style() },
            "IconBadgeClear.M.Pilled.Dark" to ComposeStyleReference { IconBadgeClear.M.Pilled.Dark.style() },
            "IconBadgeClear.M.Pilled.Light" to ComposeStyleReference { IconBadgeClear.M.Pilled.Light.style() },
            "IconBadgeClear.S.Default" to ComposeStyleReference { IconBadgeClear.S.Default.style() },
            "IconBadgeClear.S.Accent" to ComposeStyleReference { IconBadgeClear.S.Accent.style() },
            "IconBadgeClear.S.Negative" to ComposeStyleReference { IconBadgeClear.S.Negative.style() },
            "IconBadgeClear.S.Positive" to ComposeStyleReference { IconBadgeClear.S.Positive.style() },
            "IconBadgeClear.S.Warning" to ComposeStyleReference { IconBadgeClear.S.Warning.style() },
            "IconBadgeClear.S.Dark" to ComposeStyleReference { IconBadgeClear.S.Dark.style() },
            "IconBadgeClear.S.Light" to ComposeStyleReference { IconBadgeClear.S.Light.style() },
            "IconBadgeClear.S.Pilled.Default" to ComposeStyleReference { IconBadgeClear.S.Pilled.Default.style() },
            "IconBadgeClear.S.Pilled.Accent" to ComposeStyleReference { IconBadgeClear.S.Pilled.Accent.style() },
            "IconBadgeClear.S.Pilled.Negative" to ComposeStyleReference { IconBadgeClear.S.Pilled.Negative.style() },
            "IconBadgeClear.S.Pilled.Positive" to ComposeStyleReference { IconBadgeClear.S.Pilled.Positive.style() },
            "IconBadgeClear.S.Pilled.Warning" to ComposeStyleReference { IconBadgeClear.S.Pilled.Warning.style() },
            "IconBadgeClear.S.Pilled.Dark" to ComposeStyleReference { IconBadgeClear.S.Pilled.Dark.style() },
            "IconBadgeClear.S.Pilled.Light" to ComposeStyleReference { IconBadgeClear.S.Pilled.Light.style() },
            "IconBadgeClear.Xs.Default" to ComposeStyleReference { IconBadgeClear.Xs.Default.style() },
            "IconBadgeClear.Xs.Accent" to ComposeStyleReference { IconBadgeClear.Xs.Accent.style() },
            "IconBadgeClear.Xs.Negative" to ComposeStyleReference { IconBadgeClear.Xs.Negative.style() },
            "IconBadgeClear.Xs.Positive" to ComposeStyleReference { IconBadgeClear.Xs.Positive.style() },
            "IconBadgeClear.Xs.Warning" to ComposeStyleReference { IconBadgeClear.Xs.Warning.style() },
            "IconBadgeClear.Xs.Dark" to ComposeStyleReference { IconBadgeClear.Xs.Dark.style() },
            "IconBadgeClear.Xs.Light" to ComposeStyleReference { IconBadgeClear.Xs.Light.style() },
            "IconBadgeClear.Xs.Pilled.Default" to ComposeStyleReference { IconBadgeClear.Xs.Pilled.Default.style() },
            "IconBadgeClear.Xs.Pilled.Accent" to ComposeStyleReference { IconBadgeClear.Xs.Pilled.Accent.style() },
            "IconBadgeClear.Xs.Pilled.Negative" to ComposeStyleReference { IconBadgeClear.Xs.Pilled.Negative.style() },
            "IconBadgeClear.Xs.Pilled.Positive" to ComposeStyleReference { IconBadgeClear.Xs.Pilled.Positive.style() },
            "IconBadgeClear.Xs.Pilled.Warning" to ComposeStyleReference { IconBadgeClear.Xs.Pilled.Warning.style() },
            "IconBadgeClear.Xs.Pilled.Dark" to ComposeStyleReference { IconBadgeClear.Xs.Pilled.Dark.style() },
            "IconBadgeClear.Xs.Pilled.Light" to ComposeStyleReference { IconBadgeClear.Xs.Pilled.Light.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconBadgeStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> IconBadgeClearSize.L
                "M" -> IconBadgeClearSize.M
                "S" -> IconBadgeClearSize.S
                "Xs" -> IconBadgeClearSize.Xs
                else -> IconBadgeClearSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> IconBadgeClearShape.Default
                "Pilled" -> IconBadgeClearShape.Pilled
                else -> IconBadgeClearShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> IconBadgeClearView.Default
                "Accent" -> IconBadgeClearView.Accent
                "Negative" -> IconBadgeClearView.Negative
                "Positive" -> IconBadgeClearView.Positive
                "Warning" -> IconBadgeClearView.Warning
                "Dark" -> IconBadgeClearView.Dark
                "Light" -> IconBadgeClearView.Light
                else -> IconBadgeClearView.Default
            },
        ).key
    }
}
