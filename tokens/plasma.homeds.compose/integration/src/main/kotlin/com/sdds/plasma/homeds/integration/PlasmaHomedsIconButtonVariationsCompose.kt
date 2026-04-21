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
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.iconbutton.Accent
import com.sdds.plasma.homeds.styles.iconbutton.Clear
import com.sdds.plasma.homeds.styles.iconbutton.Dark
import com.sdds.plasma.homeds.styles.iconbutton.Default
import com.sdds.plasma.homeds.styles.iconbutton.IconButton
import com.sdds.plasma.homeds.styles.iconbutton.IconButtonSize
import com.sdds.plasma.homeds.styles.iconbutton.IconButtonStyles
import com.sdds.plasma.homeds.styles.iconbutton.IconButtonView
import com.sdds.plasma.homeds.styles.iconbutton.L
import com.sdds.plasma.homeds.styles.iconbutton.M
import com.sdds.plasma.homeds.styles.iconbutton.Negative
import com.sdds.plasma.homeds.styles.iconbutton.S
import com.sdds.plasma.homeds.styles.iconbutton.Secondary
import com.sdds.plasma.homeds.styles.iconbutton.Warning
import com.sdds.plasma.homeds.styles.iconbutton.Xs
import com.sdds.plasma.homeds.styles.iconbutton.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Dark", "Negative", "Warning", "Accent", "Clear"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "IconButton.L.Default" to ComposeStyleReference { IconButton.L.Default.style() },
            "IconButton.L.Secondary" to ComposeStyleReference { IconButton.L.Secondary.style() },
            "IconButton.L.Dark" to ComposeStyleReference { IconButton.L.Dark.style() },
            "IconButton.L.Negative" to ComposeStyleReference { IconButton.L.Negative.style() },
            "IconButton.L.Warning" to ComposeStyleReference { IconButton.L.Warning.style() },
            "IconButton.L.Accent" to ComposeStyleReference { IconButton.L.Accent.style() },
            "IconButton.L.Clear" to ComposeStyleReference { IconButton.L.Clear.style() },
            "IconButton.M.Default" to ComposeStyleReference { IconButton.M.Default.style() },
            "IconButton.M.Secondary" to ComposeStyleReference { IconButton.M.Secondary.style() },
            "IconButton.M.Dark" to ComposeStyleReference { IconButton.M.Dark.style() },
            "IconButton.M.Negative" to ComposeStyleReference { IconButton.M.Negative.style() },
            "IconButton.M.Warning" to ComposeStyleReference { IconButton.M.Warning.style() },
            "IconButton.M.Accent" to ComposeStyleReference { IconButton.M.Accent.style() },
            "IconButton.M.Clear" to ComposeStyleReference { IconButton.M.Clear.style() },
            "IconButton.S.Default" to ComposeStyleReference { IconButton.S.Default.style() },
            "IconButton.S.Secondary" to ComposeStyleReference { IconButton.S.Secondary.style() },
            "IconButton.S.Dark" to ComposeStyleReference { IconButton.S.Dark.style() },
            "IconButton.S.Negative" to ComposeStyleReference { IconButton.S.Negative.style() },
            "IconButton.S.Warning" to ComposeStyleReference { IconButton.S.Warning.style() },
            "IconButton.S.Accent" to ComposeStyleReference { IconButton.S.Accent.style() },
            "IconButton.S.Clear" to ComposeStyleReference { IconButton.S.Clear.style() },
            "IconButton.Xs.Default" to ComposeStyleReference { IconButton.Xs.Default.style() },
            "IconButton.Xs.Secondary" to ComposeStyleReference { IconButton.Xs.Secondary.style() },
            "IconButton.Xs.Dark" to ComposeStyleReference { IconButton.Xs.Dark.style() },
            "IconButton.Xs.Negative" to ComposeStyleReference { IconButton.Xs.Negative.style() },
            "IconButton.Xs.Warning" to ComposeStyleReference { IconButton.Xs.Warning.style() },
            "IconButton.Xs.Accent" to ComposeStyleReference { IconButton.Xs.Accent.style() },
            "IconButton.Xs.Clear" to ComposeStyleReference { IconButton.Xs.Clear.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconButtonStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> IconButtonSize.L
                "M" -> IconButtonSize.M
                "S" -> IconButtonSize.S
                "Xs" -> IconButtonSize.Xs
                else -> IconButtonSize.L
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> IconButtonView.Default
                "Secondary" -> IconButtonView.Secondary
                "Dark" -> IconButtonView.Dark
                "Negative" -> IconButtonView.Negative
                "Warning" -> IconButtonView.Warning
                "Accent" -> IconButtonView.Accent
                "Clear" -> IconButtonView.Clear
                else -> IconButtonView.Default
            },
        ).key
    }
}
