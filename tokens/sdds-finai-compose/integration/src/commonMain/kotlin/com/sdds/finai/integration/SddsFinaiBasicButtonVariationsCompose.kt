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
import com.sdds.finai.styles.basicbutton.Accent
import com.sdds.finai.styles.basicbutton.BasicButton
import com.sdds.finai.styles.basicbutton.BasicButtonSize
import com.sdds.finai.styles.basicbutton.BasicButtonStyles
import com.sdds.finai.styles.basicbutton.BasicButtonView
import com.sdds.finai.styles.basicbutton.Black
import com.sdds.finai.styles.basicbutton.Clear
import com.sdds.finai.styles.basicbutton.Dark
import com.sdds.finai.styles.basicbutton.Default
import com.sdds.finai.styles.basicbutton.Negative
import com.sdds.finai.styles.basicbutton.Positive
import com.sdds.finai.styles.basicbutton.S
import com.sdds.finai.styles.basicbutton.Secondary
import com.sdds.finai.styles.basicbutton.Warning
import com.sdds.finai.styles.basicbutton.White
import com.sdds.finai.styles.basicbutton.Xs
import com.sdds.finai.styles.basicbutton.Xxs
import com.sdds.finai.styles.basicbutton.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiBasicButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning", "Clear", "Dark", "Black", "White"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "BasicButton.S.Default" to ComposeStyleReference { BasicButton.S.Default.style() },
            "BasicButton.S.Secondary" to ComposeStyleReference { BasicButton.S.Secondary.style() },
            "BasicButton.S.Accent" to ComposeStyleReference { BasicButton.S.Accent.style() },
            "BasicButton.S.Positive" to ComposeStyleReference { BasicButton.S.Positive.style() },
            "BasicButton.S.Negative" to ComposeStyleReference { BasicButton.S.Negative.style() },
            "BasicButton.S.Warning" to ComposeStyleReference { BasicButton.S.Warning.style() },
            "BasicButton.S.Clear" to ComposeStyleReference { BasicButton.S.Clear.style() },
            "BasicButton.S.Dark" to ComposeStyleReference { BasicButton.S.Dark.style() },
            "BasicButton.S.Black" to ComposeStyleReference { BasicButton.S.Black.style() },
            "BasicButton.S.White" to ComposeStyleReference { BasicButton.S.White.style() },
            "BasicButton.Xs.Default" to ComposeStyleReference { BasicButton.Xs.Default.style() },
            "BasicButton.Xs.Secondary" to ComposeStyleReference { BasicButton.Xs.Secondary.style() },
            "BasicButton.Xs.Accent" to ComposeStyleReference { BasicButton.Xs.Accent.style() },
            "BasicButton.Xs.Positive" to ComposeStyleReference { BasicButton.Xs.Positive.style() },
            "BasicButton.Xs.Negative" to ComposeStyleReference { BasicButton.Xs.Negative.style() },
            "BasicButton.Xs.Warning" to ComposeStyleReference { BasicButton.Xs.Warning.style() },
            "BasicButton.Xs.Clear" to ComposeStyleReference { BasicButton.Xs.Clear.style() },
            "BasicButton.Xs.Dark" to ComposeStyleReference { BasicButton.Xs.Dark.style() },
            "BasicButton.Xs.Black" to ComposeStyleReference { BasicButton.Xs.Black.style() },
            "BasicButton.Xs.White" to ComposeStyleReference { BasicButton.Xs.White.style() },
            "BasicButton.Xxs.Default" to ComposeStyleReference { BasicButton.Xxs.Default.style() },
            "BasicButton.Xxs.Secondary" to ComposeStyleReference { BasicButton.Xxs.Secondary.style() },
            "BasicButton.Xxs.Accent" to ComposeStyleReference { BasicButton.Xxs.Accent.style() },
            "BasicButton.Xxs.Positive" to ComposeStyleReference { BasicButton.Xxs.Positive.style() },
            "BasicButton.Xxs.Negative" to ComposeStyleReference { BasicButton.Xxs.Negative.style() },
            "BasicButton.Xxs.Warning" to ComposeStyleReference { BasicButton.Xxs.Warning.style() },
            "BasicButton.Xxs.Clear" to ComposeStyleReference { BasicButton.Xxs.Clear.style() },
            "BasicButton.Xxs.Dark" to ComposeStyleReference { BasicButton.Xxs.Dark.style() },
            "BasicButton.Xxs.Black" to ComposeStyleReference { BasicButton.Xxs.Black.style() },
            "BasicButton.Xxs.White" to ComposeStyleReference { BasicButton.Xxs.White.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return BasicButtonStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> BasicButtonSize.S
                "Xs" -> BasicButtonSize.Xs
                "Xxs" -> BasicButtonSize.Xxs
                else -> BasicButtonSize.S
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> BasicButtonView.Default
                "Secondary" -> BasicButtonView.Secondary
                "Accent" -> BasicButtonView.Accent
                "Positive" -> BasicButtonView.Positive
                "Negative" -> BasicButtonView.Negative
                "Warning" -> BasicButtonView.Warning
                "Clear" -> BasicButtonView.Clear
                "Dark" -> BasicButtonView.Dark
                "Black" -> BasicButtonView.Black
                "White" -> BasicButtonView.White
                else -> BasicButtonView.Default
            },
        ).key
    }
}
