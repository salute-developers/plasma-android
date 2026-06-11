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
import com.sdds.plasma.giga.styles.basicbutton.Accent
import com.sdds.plasma.giga.styles.basicbutton.BasicButton
import com.sdds.plasma.giga.styles.basicbutton.BasicButtonSize
import com.sdds.plasma.giga.styles.basicbutton.BasicButtonStyles
import com.sdds.plasma.giga.styles.basicbutton.BasicButtonView
import com.sdds.plasma.giga.styles.basicbutton.Black
import com.sdds.plasma.giga.styles.basicbutton.Clear
import com.sdds.plasma.giga.styles.basicbutton.Dark
import com.sdds.plasma.giga.styles.basicbutton.Default
import com.sdds.plasma.giga.styles.basicbutton.L
import com.sdds.plasma.giga.styles.basicbutton.M
import com.sdds.plasma.giga.styles.basicbutton.Negative
import com.sdds.plasma.giga.styles.basicbutton.Positive
import com.sdds.plasma.giga.styles.basicbutton.S
import com.sdds.plasma.giga.styles.basicbutton.Secondary
import com.sdds.plasma.giga.styles.basicbutton.Warning
import com.sdds.plasma.giga.styles.basicbutton.White
import com.sdds.plasma.giga.styles.basicbutton.Xl
import com.sdds.plasma.giga.styles.basicbutton.Xs
import com.sdds.plasma.giga.styles.basicbutton.Xxs
import com.sdds.plasma.giga.styles.basicbutton.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaBasicButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Xl",
                variants = listOf("Xl", "L", "M", "S", "Xs", "Xxs"),
            ),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning", "Clear", "Dark", "Black", "White"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "BasicButton.Xl.Default" to ComposeStyleReference { BasicButton.Xl.Default.style() },
            "BasicButton.Xl.Secondary" to ComposeStyleReference { BasicButton.Xl.Secondary.style() },
            "BasicButton.Xl.Accent" to ComposeStyleReference { BasicButton.Xl.Accent.style() },
            "BasicButton.Xl.Positive" to ComposeStyleReference { BasicButton.Xl.Positive.style() },
            "BasicButton.Xl.Negative" to ComposeStyleReference { BasicButton.Xl.Negative.style() },
            "BasicButton.Xl.Warning" to ComposeStyleReference { BasicButton.Xl.Warning.style() },
            "BasicButton.Xl.Clear" to ComposeStyleReference { BasicButton.Xl.Clear.style() },
            "BasicButton.Xl.Dark" to ComposeStyleReference { BasicButton.Xl.Dark.style() },
            "BasicButton.Xl.Black" to ComposeStyleReference { BasicButton.Xl.Black.style() },
            "BasicButton.Xl.White" to ComposeStyleReference { BasicButton.Xl.White.style() },
            "BasicButton.L.Default" to ComposeStyleReference { BasicButton.L.Default.style() },
            "BasicButton.L.Secondary" to ComposeStyleReference { BasicButton.L.Secondary.style() },
            "BasicButton.L.Accent" to ComposeStyleReference { BasicButton.L.Accent.style() },
            "BasicButton.L.Positive" to ComposeStyleReference { BasicButton.L.Positive.style() },
            "BasicButton.L.Negative" to ComposeStyleReference { BasicButton.L.Negative.style() },
            "BasicButton.L.Warning" to ComposeStyleReference { BasicButton.L.Warning.style() },
            "BasicButton.L.Clear" to ComposeStyleReference { BasicButton.L.Clear.style() },
            "BasicButton.L.Dark" to ComposeStyleReference { BasicButton.L.Dark.style() },
            "BasicButton.L.Black" to ComposeStyleReference { BasicButton.L.Black.style() },
            "BasicButton.L.White" to ComposeStyleReference { BasicButton.L.White.style() },
            "BasicButton.M.Default" to ComposeStyleReference { BasicButton.M.Default.style() },
            "BasicButton.M.Secondary" to ComposeStyleReference { BasicButton.M.Secondary.style() },
            "BasicButton.M.Accent" to ComposeStyleReference { BasicButton.M.Accent.style() },
            "BasicButton.M.Positive" to ComposeStyleReference { BasicButton.M.Positive.style() },
            "BasicButton.M.Negative" to ComposeStyleReference { BasicButton.M.Negative.style() },
            "BasicButton.M.Warning" to ComposeStyleReference { BasicButton.M.Warning.style() },
            "BasicButton.M.Clear" to ComposeStyleReference { BasicButton.M.Clear.style() },
            "BasicButton.M.Dark" to ComposeStyleReference { BasicButton.M.Dark.style() },
            "BasicButton.M.Black" to ComposeStyleReference { BasicButton.M.Black.style() },
            "BasicButton.M.White" to ComposeStyleReference { BasicButton.M.White.style() },
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
                "Xl" -> BasicButtonSize.Xl
                "L" -> BasicButtonSize.L
                "M" -> BasicButtonSize.M
                "S" -> BasicButtonSize.S
                "Xs" -> BasicButtonSize.Xs
                "Xxs" -> BasicButtonSize.Xxs
                else -> BasicButtonSize.Xl
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
