// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.iconbutton.Accent
import com.sdds.plasma.giga.styles.iconbutton.Black
import com.sdds.plasma.giga.styles.iconbutton.Clear
import com.sdds.plasma.giga.styles.iconbutton.Dark
import com.sdds.plasma.giga.styles.iconbutton.Default
import com.sdds.plasma.giga.styles.iconbutton.IconButton
import com.sdds.plasma.giga.styles.iconbutton.IconButtonShape
import com.sdds.plasma.giga.styles.iconbutton.IconButtonSize
import com.sdds.plasma.giga.styles.iconbutton.IconButtonStyles
import com.sdds.plasma.giga.styles.iconbutton.IconButtonView
import com.sdds.plasma.giga.styles.iconbutton.L
import com.sdds.plasma.giga.styles.iconbutton.M
import com.sdds.plasma.giga.styles.iconbutton.Negative
import com.sdds.plasma.giga.styles.iconbutton.Pilled
import com.sdds.plasma.giga.styles.iconbutton.Positive
import com.sdds.plasma.giga.styles.iconbutton.S
import com.sdds.plasma.giga.styles.iconbutton.Secondary
import com.sdds.plasma.giga.styles.iconbutton.Warning
import com.sdds.plasma.giga.styles.iconbutton.White
import com.sdds.plasma.giga.styles.iconbutton.Xl
import com.sdds.plasma.giga.styles.iconbutton.Xs
import com.sdds.plasma.giga.styles.iconbutton.Xxs
import com.sdds.plasma.giga.styles.iconbutton.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Xl",
                variants = listOf("Xl", "L", "M", "S", "Xs", "Xxs"),
            ),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning", "Clear", "Dark", "Black", "White"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "IconButton.Xl.Default" to ComposeStyleReference { IconButton.Xl.Default.style() },
            "IconButton.Xl.Secondary" to ComposeStyleReference { IconButton.Xl.Secondary.style() },
            "IconButton.Xl.Accent" to ComposeStyleReference { IconButton.Xl.Accent.style() },
            "IconButton.Xl.Positive" to ComposeStyleReference { IconButton.Xl.Positive.style() },
            "IconButton.Xl.Negative" to ComposeStyleReference { IconButton.Xl.Negative.style() },
            "IconButton.Xl.Warning" to ComposeStyleReference { IconButton.Xl.Warning.style() },
            "IconButton.Xl.Clear" to ComposeStyleReference { IconButton.Xl.Clear.style() },
            "IconButton.Xl.Dark" to ComposeStyleReference { IconButton.Xl.Dark.style() },
            "IconButton.Xl.Black" to ComposeStyleReference { IconButton.Xl.Black.style() },
            "IconButton.Xl.White" to ComposeStyleReference { IconButton.Xl.White.style() },
            "IconButton.Xl.Pilled.Default" to ComposeStyleReference { IconButton.Xl.Pilled.Default.style() },
            "IconButton.Xl.Pilled.Secondary" to ComposeStyleReference { IconButton.Xl.Pilled.Secondary.style() },
            "IconButton.Xl.Pilled.Accent" to ComposeStyleReference { IconButton.Xl.Pilled.Accent.style() },
            "IconButton.Xl.Pilled.Positive" to ComposeStyleReference { IconButton.Xl.Pilled.Positive.style() },
            "IconButton.Xl.Pilled.Negative" to ComposeStyleReference { IconButton.Xl.Pilled.Negative.style() },
            "IconButton.Xl.Pilled.Warning" to ComposeStyleReference { IconButton.Xl.Pilled.Warning.style() },
            "IconButton.Xl.Pilled.Clear" to ComposeStyleReference { IconButton.Xl.Pilled.Clear.style() },
            "IconButton.Xl.Pilled.Dark" to ComposeStyleReference { IconButton.Xl.Pilled.Dark.style() },
            "IconButton.Xl.Pilled.Black" to ComposeStyleReference { IconButton.Xl.Pilled.Black.style() },
            "IconButton.Xl.Pilled.White" to ComposeStyleReference { IconButton.Xl.Pilled.White.style() },
            "IconButton.L.Default" to ComposeStyleReference { IconButton.L.Default.style() },
            "IconButton.L.Secondary" to ComposeStyleReference { IconButton.L.Secondary.style() },
            "IconButton.L.Accent" to ComposeStyleReference { IconButton.L.Accent.style() },
            "IconButton.L.Positive" to ComposeStyleReference { IconButton.L.Positive.style() },
            "IconButton.L.Negative" to ComposeStyleReference { IconButton.L.Negative.style() },
            "IconButton.L.Warning" to ComposeStyleReference { IconButton.L.Warning.style() },
            "IconButton.L.Clear" to ComposeStyleReference { IconButton.L.Clear.style() },
            "IconButton.L.Dark" to ComposeStyleReference { IconButton.L.Dark.style() },
            "IconButton.L.Black" to ComposeStyleReference { IconButton.L.Black.style() },
            "IconButton.L.White" to ComposeStyleReference { IconButton.L.White.style() },
            "IconButton.L.Pilled.Default" to ComposeStyleReference { IconButton.L.Pilled.Default.style() },
            "IconButton.L.Pilled.Secondary" to ComposeStyleReference { IconButton.L.Pilled.Secondary.style() },
            "IconButton.L.Pilled.Accent" to ComposeStyleReference { IconButton.L.Pilled.Accent.style() },
            "IconButton.L.Pilled.Positive" to ComposeStyleReference { IconButton.L.Pilled.Positive.style() },
            "IconButton.L.Pilled.Negative" to ComposeStyleReference { IconButton.L.Pilled.Negative.style() },
            "IconButton.L.Pilled.Warning" to ComposeStyleReference { IconButton.L.Pilled.Warning.style() },
            "IconButton.L.Pilled.Clear" to ComposeStyleReference { IconButton.L.Pilled.Clear.style() },
            "IconButton.L.Pilled.Dark" to ComposeStyleReference { IconButton.L.Pilled.Dark.style() },
            "IconButton.L.Pilled.Black" to ComposeStyleReference { IconButton.L.Pilled.Black.style() },
            "IconButton.L.Pilled.White" to ComposeStyleReference { IconButton.L.Pilled.White.style() },
            "IconButton.M.Default" to ComposeStyleReference { IconButton.M.Default.style() },
            "IconButton.M.Secondary" to ComposeStyleReference { IconButton.M.Secondary.style() },
            "IconButton.M.Accent" to ComposeStyleReference { IconButton.M.Accent.style() },
            "IconButton.M.Positive" to ComposeStyleReference { IconButton.M.Positive.style() },
            "IconButton.M.Negative" to ComposeStyleReference { IconButton.M.Negative.style() },
            "IconButton.M.Warning" to ComposeStyleReference { IconButton.M.Warning.style() },
            "IconButton.M.Clear" to ComposeStyleReference { IconButton.M.Clear.style() },
            "IconButton.M.Dark" to ComposeStyleReference { IconButton.M.Dark.style() },
            "IconButton.M.Black" to ComposeStyleReference { IconButton.M.Black.style() },
            "IconButton.M.White" to ComposeStyleReference { IconButton.M.White.style() },
            "IconButton.M.Pilled.Default" to ComposeStyleReference { IconButton.M.Pilled.Default.style() },
            "IconButton.M.Pilled.Secondary" to ComposeStyleReference { IconButton.M.Pilled.Secondary.style() },
            "IconButton.M.Pilled.Accent" to ComposeStyleReference { IconButton.M.Pilled.Accent.style() },
            "IconButton.M.Pilled.Positive" to ComposeStyleReference { IconButton.M.Pilled.Positive.style() },
            "IconButton.M.Pilled.Negative" to ComposeStyleReference { IconButton.M.Pilled.Negative.style() },
            "IconButton.M.Pilled.Warning" to ComposeStyleReference { IconButton.M.Pilled.Warning.style() },
            "IconButton.M.Pilled.Clear" to ComposeStyleReference { IconButton.M.Pilled.Clear.style() },
            "IconButton.M.Pilled.Dark" to ComposeStyleReference { IconButton.M.Pilled.Dark.style() },
            "IconButton.M.Pilled.Black" to ComposeStyleReference { IconButton.M.Pilled.Black.style() },
            "IconButton.M.Pilled.White" to ComposeStyleReference { IconButton.M.Pilled.White.style() },
            "IconButton.S.Default" to ComposeStyleReference { IconButton.S.Default.style() },
            "IconButton.S.Secondary" to ComposeStyleReference { IconButton.S.Secondary.style() },
            "IconButton.S.Accent" to ComposeStyleReference { IconButton.S.Accent.style() },
            "IconButton.S.Positive" to ComposeStyleReference { IconButton.S.Positive.style() },
            "IconButton.S.Negative" to ComposeStyleReference { IconButton.S.Negative.style() },
            "IconButton.S.Warning" to ComposeStyleReference { IconButton.S.Warning.style() },
            "IconButton.S.Clear" to ComposeStyleReference { IconButton.S.Clear.style() },
            "IconButton.S.Dark" to ComposeStyleReference { IconButton.S.Dark.style() },
            "IconButton.S.Black" to ComposeStyleReference { IconButton.S.Black.style() },
            "IconButton.S.White" to ComposeStyleReference { IconButton.S.White.style() },
            "IconButton.S.Pilled.Default" to ComposeStyleReference { IconButton.S.Pilled.Default.style() },
            "IconButton.S.Pilled.Secondary" to ComposeStyleReference { IconButton.S.Pilled.Secondary.style() },
            "IconButton.S.Pilled.Accent" to ComposeStyleReference { IconButton.S.Pilled.Accent.style() },
            "IconButton.S.Pilled.Positive" to ComposeStyleReference { IconButton.S.Pilled.Positive.style() },
            "IconButton.S.Pilled.Negative" to ComposeStyleReference { IconButton.S.Pilled.Negative.style() },
            "IconButton.S.Pilled.Warning" to ComposeStyleReference { IconButton.S.Pilled.Warning.style() },
            "IconButton.S.Pilled.Clear" to ComposeStyleReference { IconButton.S.Pilled.Clear.style() },
            "IconButton.S.Pilled.Dark" to ComposeStyleReference { IconButton.S.Pilled.Dark.style() },
            "IconButton.S.Pilled.Black" to ComposeStyleReference { IconButton.S.Pilled.Black.style() },
            "IconButton.S.Pilled.White" to ComposeStyleReference { IconButton.S.Pilled.White.style() },
            "IconButton.Xs.Default" to ComposeStyleReference { IconButton.Xs.Default.style() },
            "IconButton.Xs.Secondary" to ComposeStyleReference { IconButton.Xs.Secondary.style() },
            "IconButton.Xs.Accent" to ComposeStyleReference { IconButton.Xs.Accent.style() },
            "IconButton.Xs.Positive" to ComposeStyleReference { IconButton.Xs.Positive.style() },
            "IconButton.Xs.Negative" to ComposeStyleReference { IconButton.Xs.Negative.style() },
            "IconButton.Xs.Warning" to ComposeStyleReference { IconButton.Xs.Warning.style() },
            "IconButton.Xs.Clear" to ComposeStyleReference { IconButton.Xs.Clear.style() },
            "IconButton.Xs.Dark" to ComposeStyleReference { IconButton.Xs.Dark.style() },
            "IconButton.Xs.Black" to ComposeStyleReference { IconButton.Xs.Black.style() },
            "IconButton.Xs.White" to ComposeStyleReference { IconButton.Xs.White.style() },
            "IconButton.Xs.Pilled.Default" to ComposeStyleReference { IconButton.Xs.Pilled.Default.style() },
            "IconButton.Xs.Pilled.Secondary" to ComposeStyleReference { IconButton.Xs.Pilled.Secondary.style() },
            "IconButton.Xs.Pilled.Accent" to ComposeStyleReference { IconButton.Xs.Pilled.Accent.style() },
            "IconButton.Xs.Pilled.Positive" to ComposeStyleReference { IconButton.Xs.Pilled.Positive.style() },
            "IconButton.Xs.Pilled.Negative" to ComposeStyleReference { IconButton.Xs.Pilled.Negative.style() },
            "IconButton.Xs.Pilled.Warning" to ComposeStyleReference { IconButton.Xs.Pilled.Warning.style() },
            "IconButton.Xs.Pilled.Clear" to ComposeStyleReference { IconButton.Xs.Pilled.Clear.style() },
            "IconButton.Xs.Pilled.Dark" to ComposeStyleReference { IconButton.Xs.Pilled.Dark.style() },
            "IconButton.Xs.Pilled.Black" to ComposeStyleReference { IconButton.Xs.Pilled.Black.style() },
            "IconButton.Xs.Pilled.White" to ComposeStyleReference { IconButton.Xs.Pilled.White.style() },
            "IconButton.Xxs.Default" to ComposeStyleReference { IconButton.Xxs.Default.style() },
            "IconButton.Xxs.Secondary" to ComposeStyleReference { IconButton.Xxs.Secondary.style() },
            "IconButton.Xxs.Accent" to ComposeStyleReference { IconButton.Xxs.Accent.style() },
            "IconButton.Xxs.Positive" to ComposeStyleReference { IconButton.Xxs.Positive.style() },
            "IconButton.Xxs.Negative" to ComposeStyleReference { IconButton.Xxs.Negative.style() },
            "IconButton.Xxs.Warning" to ComposeStyleReference { IconButton.Xxs.Warning.style() },
            "IconButton.Xxs.Clear" to ComposeStyleReference { IconButton.Xxs.Clear.style() },
            "IconButton.Xxs.Dark" to ComposeStyleReference { IconButton.Xxs.Dark.style() },
            "IconButton.Xxs.Black" to ComposeStyleReference { IconButton.Xxs.Black.style() },
            "IconButton.Xxs.White" to ComposeStyleReference { IconButton.Xxs.White.style() },
            "IconButton.Xxs.Pilled.Default" to ComposeStyleReference { IconButton.Xxs.Pilled.Default.style() },
            "IconButton.Xxs.Pilled.Secondary" to ComposeStyleReference { IconButton.Xxs.Pilled.Secondary.style() },
            "IconButton.Xxs.Pilled.Accent" to ComposeStyleReference { IconButton.Xxs.Pilled.Accent.style() },
            "IconButton.Xxs.Pilled.Positive" to ComposeStyleReference { IconButton.Xxs.Pilled.Positive.style() },
            "IconButton.Xxs.Pilled.Negative" to ComposeStyleReference { IconButton.Xxs.Pilled.Negative.style() },
            "IconButton.Xxs.Pilled.Warning" to ComposeStyleReference { IconButton.Xxs.Pilled.Warning.style() },
            "IconButton.Xxs.Pilled.Clear" to ComposeStyleReference { IconButton.Xxs.Pilled.Clear.style() },
            "IconButton.Xxs.Pilled.Dark" to ComposeStyleReference { IconButton.Xxs.Pilled.Dark.style() },
            "IconButton.Xxs.Pilled.Black" to ComposeStyleReference { IconButton.Xxs.Pilled.Black.style() },
            "IconButton.Xxs.Pilled.White" to ComposeStyleReference { IconButton.Xxs.Pilled.White.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconButtonStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> IconButtonSize.Xl
                "L" -> IconButtonSize.L
                "M" -> IconButtonSize.M
                "S" -> IconButtonSize.S
                "Xs" -> IconButtonSize.Xs
                "Xxs" -> IconButtonSize.Xxs
                else -> IconButtonSize.Xl
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> IconButtonShape.Default
                "Pilled" -> IconButtonShape.Pilled
                else -> IconButtonShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> IconButtonView.Default
                "Secondary" -> IconButtonView.Secondary
                "Accent" -> IconButtonView.Accent
                "Positive" -> IconButtonView.Positive
                "Negative" -> IconButtonView.Negative
                "Warning" -> IconButtonView.Warning
                "Clear" -> IconButtonView.Clear
                "Dark" -> IconButtonView.Dark
                "Black" -> IconButtonView.Black
                "White" -> IconButtonView.White
                else -> IconButtonView.Default
            },
        ).key
    }
}
