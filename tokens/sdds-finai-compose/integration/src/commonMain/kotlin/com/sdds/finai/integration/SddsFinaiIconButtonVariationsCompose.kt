// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.iconbutton.Accent
import com.sdds.finai.styles.iconbutton.Black
import com.sdds.finai.styles.iconbutton.Clear
import com.sdds.finai.styles.iconbutton.Dark
import com.sdds.finai.styles.iconbutton.Default
import com.sdds.finai.styles.iconbutton.IconButton
import com.sdds.finai.styles.iconbutton.IconButtonDefaultShape
import com.sdds.finai.styles.iconbutton.IconButtonDefaultSize
import com.sdds.finai.styles.iconbutton.IconButtonDefaultView
import com.sdds.finai.styles.iconbutton.IconButtonStyles
import com.sdds.finai.styles.iconbutton.Negative
import com.sdds.finai.styles.iconbutton.Pilled
import com.sdds.finai.styles.iconbutton.Positive
import com.sdds.finai.styles.iconbutton.S
import com.sdds.finai.styles.iconbutton.Secondary
import com.sdds.finai.styles.iconbutton.Warning
import com.sdds.finai.styles.iconbutton.White
import com.sdds.finai.styles.iconbutton.Xs
import com.sdds.finai.styles.iconbutton.Xxs
import com.sdds.finai.styles.iconbutton.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning", "Clear", "Dark", "Black", "White"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
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
        return IconButtonStyles.Default.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> IconButtonDefaultSize.S
                "Xs" -> IconButtonDefaultSize.Xs
                "Xxs" -> IconButtonDefaultSize.Xxs
                else -> IconButtonDefaultSize.S
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> IconButtonDefaultShape.Default
                "Pilled" -> IconButtonDefaultShape.Pilled
                else -> IconButtonDefaultShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> IconButtonDefaultView.Default
                "Secondary" -> IconButtonDefaultView.Secondary
                "Accent" -> IconButtonDefaultView.Accent
                "Positive" -> IconButtonDefaultView.Positive
                "Negative" -> IconButtonDefaultView.Negative
                "Warning" -> IconButtonDefaultView.Warning
                "Clear" -> IconButtonDefaultView.Clear
                "Dark" -> IconButtonDefaultView.Dark
                "Black" -> IconButtonDefaultView.Black
                "White" -> IconButtonDefaultView.White
                else -> IconButtonDefaultView.Default
            },
        ).key
    }
}
