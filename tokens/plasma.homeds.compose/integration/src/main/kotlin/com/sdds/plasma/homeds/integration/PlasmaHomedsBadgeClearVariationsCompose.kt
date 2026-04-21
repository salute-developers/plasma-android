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
import com.sdds.plasma.homeds.styles.badge.BadgeClear
import com.sdds.plasma.homeds.styles.badge.BadgeClearShape
import com.sdds.plasma.homeds.styles.badge.BadgeClearSize
import com.sdds.plasma.homeds.styles.badge.BadgeClearView
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

internal object PlasmaHomedsBadgeClearVariationsCompose : ComposeStyleProvider<BadgeStyle>() {
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
            "BadgeClear.L.Default" to ComposeStyleReference { BadgeClear.L.Default.style() },
            "BadgeClear.L.Accent" to ComposeStyleReference { BadgeClear.L.Accent.style() },
            "BadgeClear.L.Negative" to ComposeStyleReference { BadgeClear.L.Negative.style() },
            "BadgeClear.L.Positive" to ComposeStyleReference { BadgeClear.L.Positive.style() },
            "BadgeClear.L.Warning" to ComposeStyleReference { BadgeClear.L.Warning.style() },
            "BadgeClear.L.Dark" to ComposeStyleReference { BadgeClear.L.Dark.style() },
            "BadgeClear.L.Light" to ComposeStyleReference { BadgeClear.L.Light.style() },
            "BadgeClear.L.Pilled.Default" to ComposeStyleReference { BadgeClear.L.Pilled.Default.style() },
            "BadgeClear.L.Pilled.Accent" to ComposeStyleReference { BadgeClear.L.Pilled.Accent.style() },
            "BadgeClear.L.Pilled.Negative" to ComposeStyleReference { BadgeClear.L.Pilled.Negative.style() },
            "BadgeClear.L.Pilled.Positive" to ComposeStyleReference { BadgeClear.L.Pilled.Positive.style() },
            "BadgeClear.L.Pilled.Warning" to ComposeStyleReference { BadgeClear.L.Pilled.Warning.style() },
            "BadgeClear.L.Pilled.Dark" to ComposeStyleReference { BadgeClear.L.Pilled.Dark.style() },
            "BadgeClear.L.Pilled.Light" to ComposeStyleReference { BadgeClear.L.Pilled.Light.style() },
            "BadgeClear.M.Default" to ComposeStyleReference { BadgeClear.M.Default.style() },
            "BadgeClear.M.Accent" to ComposeStyleReference { BadgeClear.M.Accent.style() },
            "BadgeClear.M.Negative" to ComposeStyleReference { BadgeClear.M.Negative.style() },
            "BadgeClear.M.Positive" to ComposeStyleReference { BadgeClear.M.Positive.style() },
            "BadgeClear.M.Warning" to ComposeStyleReference { BadgeClear.M.Warning.style() },
            "BadgeClear.M.Dark" to ComposeStyleReference { BadgeClear.M.Dark.style() },
            "BadgeClear.M.Light" to ComposeStyleReference { BadgeClear.M.Light.style() },
            "BadgeClear.M.Pilled.Default" to ComposeStyleReference { BadgeClear.M.Pilled.Default.style() },
            "BadgeClear.M.Pilled.Accent" to ComposeStyleReference { BadgeClear.M.Pilled.Accent.style() },
            "BadgeClear.M.Pilled.Negative" to ComposeStyleReference { BadgeClear.M.Pilled.Negative.style() },
            "BadgeClear.M.Pilled.Positive" to ComposeStyleReference { BadgeClear.M.Pilled.Positive.style() },
            "BadgeClear.M.Pilled.Warning" to ComposeStyleReference { BadgeClear.M.Pilled.Warning.style() },
            "BadgeClear.M.Pilled.Dark" to ComposeStyleReference { BadgeClear.M.Pilled.Dark.style() },
            "BadgeClear.M.Pilled.Light" to ComposeStyleReference { BadgeClear.M.Pilled.Light.style() },
            "BadgeClear.S.Default" to ComposeStyleReference { BadgeClear.S.Default.style() },
            "BadgeClear.S.Accent" to ComposeStyleReference { BadgeClear.S.Accent.style() },
            "BadgeClear.S.Negative" to ComposeStyleReference { BadgeClear.S.Negative.style() },
            "BadgeClear.S.Positive" to ComposeStyleReference { BadgeClear.S.Positive.style() },
            "BadgeClear.S.Warning" to ComposeStyleReference { BadgeClear.S.Warning.style() },
            "BadgeClear.S.Dark" to ComposeStyleReference { BadgeClear.S.Dark.style() },
            "BadgeClear.S.Light" to ComposeStyleReference { BadgeClear.S.Light.style() },
            "BadgeClear.S.Pilled.Default" to ComposeStyleReference { BadgeClear.S.Pilled.Default.style() },
            "BadgeClear.S.Pilled.Accent" to ComposeStyleReference { BadgeClear.S.Pilled.Accent.style() },
            "BadgeClear.S.Pilled.Negative" to ComposeStyleReference { BadgeClear.S.Pilled.Negative.style() },
            "BadgeClear.S.Pilled.Positive" to ComposeStyleReference { BadgeClear.S.Pilled.Positive.style() },
            "BadgeClear.S.Pilled.Warning" to ComposeStyleReference { BadgeClear.S.Pilled.Warning.style() },
            "BadgeClear.S.Pilled.Dark" to ComposeStyleReference { BadgeClear.S.Pilled.Dark.style() },
            "BadgeClear.S.Pilled.Light" to ComposeStyleReference { BadgeClear.S.Pilled.Light.style() },
            "BadgeClear.Xs.Default" to ComposeStyleReference { BadgeClear.Xs.Default.style() },
            "BadgeClear.Xs.Accent" to ComposeStyleReference { BadgeClear.Xs.Accent.style() },
            "BadgeClear.Xs.Negative" to ComposeStyleReference { BadgeClear.Xs.Negative.style() },
            "BadgeClear.Xs.Positive" to ComposeStyleReference { BadgeClear.Xs.Positive.style() },
            "BadgeClear.Xs.Warning" to ComposeStyleReference { BadgeClear.Xs.Warning.style() },
            "BadgeClear.Xs.Dark" to ComposeStyleReference { BadgeClear.Xs.Dark.style() },
            "BadgeClear.Xs.Light" to ComposeStyleReference { BadgeClear.Xs.Light.style() },
            "BadgeClear.Xs.Pilled.Default" to ComposeStyleReference { BadgeClear.Xs.Pilled.Default.style() },
            "BadgeClear.Xs.Pilled.Accent" to ComposeStyleReference { BadgeClear.Xs.Pilled.Accent.style() },
            "BadgeClear.Xs.Pilled.Negative" to ComposeStyleReference { BadgeClear.Xs.Pilled.Negative.style() },
            "BadgeClear.Xs.Pilled.Positive" to ComposeStyleReference { BadgeClear.Xs.Pilled.Positive.style() },
            "BadgeClear.Xs.Pilled.Warning" to ComposeStyleReference { BadgeClear.Xs.Pilled.Warning.style() },
            "BadgeClear.Xs.Pilled.Dark" to ComposeStyleReference { BadgeClear.Xs.Pilled.Dark.style() },
            "BadgeClear.Xs.Pilled.Light" to ComposeStyleReference { BadgeClear.Xs.Pilled.Light.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return BadgeStyles.Clear.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> BadgeClearSize.L
                "M" -> BadgeClearSize.M
                "S" -> BadgeClearSize.S
                "Xs" -> BadgeClearSize.Xs
                else -> BadgeClearSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> BadgeClearShape.Default
                "Pilled" -> BadgeClearShape.Pilled
                else -> BadgeClearShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> BadgeClearView.Default
                "Accent" -> BadgeClearView.Accent
                "Negative" -> BadgeClearView.Negative
                "Positive" -> BadgeClearView.Positive
                "Warning" -> BadgeClearView.Warning
                "Dark" -> BadgeClearView.Dark
                "Light" -> BadgeClearView.Light
                else -> BadgeClearView.Default
            },
        ).key
    }
}
