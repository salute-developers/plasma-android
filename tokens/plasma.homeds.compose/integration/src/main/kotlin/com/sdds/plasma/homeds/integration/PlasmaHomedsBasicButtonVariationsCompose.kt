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
import com.sdds.plasma.homeds.styles.basicbutton.Accent
import com.sdds.plasma.homeds.styles.basicbutton.BasicButton
import com.sdds.plasma.homeds.styles.basicbutton.BasicButtonSize
import com.sdds.plasma.homeds.styles.basicbutton.BasicButtonStyles
import com.sdds.plasma.homeds.styles.basicbutton.BasicButtonView
import com.sdds.plasma.homeds.styles.basicbutton.Clear
import com.sdds.plasma.homeds.styles.basicbutton.Dark
import com.sdds.plasma.homeds.styles.basicbutton.Default
import com.sdds.plasma.homeds.styles.basicbutton.M
import com.sdds.plasma.homeds.styles.basicbutton.Negative
import com.sdds.plasma.homeds.styles.basicbutton.S
import com.sdds.plasma.homeds.styles.basicbutton.Secondary
import com.sdds.plasma.homeds.styles.basicbutton.Warning
import com.sdds.plasma.homeds.styles.basicbutton.Xs
import com.sdds.plasma.homeds.styles.basicbutton.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsBasicButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Dark", "Negative", "Warning", "Accent", "Clear"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "BasicButton.M.Default" to ComposeStyleReference { BasicButton.M.Default.style() },
            "BasicButton.M.Secondary" to ComposeStyleReference { BasicButton.M.Secondary.style() },
            "BasicButton.M.Dark" to ComposeStyleReference { BasicButton.M.Dark.style() },
            "BasicButton.M.Negative" to ComposeStyleReference { BasicButton.M.Negative.style() },
            "BasicButton.M.Warning" to ComposeStyleReference { BasicButton.M.Warning.style() },
            "BasicButton.M.Accent" to ComposeStyleReference { BasicButton.M.Accent.style() },
            "BasicButton.M.Clear" to ComposeStyleReference { BasicButton.M.Clear.style() },
            "BasicButton.S.Default" to ComposeStyleReference { BasicButton.S.Default.style() },
            "BasicButton.S.Secondary" to ComposeStyleReference { BasicButton.S.Secondary.style() },
            "BasicButton.S.Dark" to ComposeStyleReference { BasicButton.S.Dark.style() },
            "BasicButton.S.Negative" to ComposeStyleReference { BasicButton.S.Negative.style() },
            "BasicButton.S.Warning" to ComposeStyleReference { BasicButton.S.Warning.style() },
            "BasicButton.S.Accent" to ComposeStyleReference { BasicButton.S.Accent.style() },
            "BasicButton.S.Clear" to ComposeStyleReference { BasicButton.S.Clear.style() },
            "BasicButton.Xs.Default" to ComposeStyleReference { BasicButton.Xs.Default.style() },
            "BasicButton.Xs.Secondary" to ComposeStyleReference { BasicButton.Xs.Secondary.style() },
            "BasicButton.Xs.Dark" to ComposeStyleReference { BasicButton.Xs.Dark.style() },
            "BasicButton.Xs.Negative" to ComposeStyleReference { BasicButton.Xs.Negative.style() },
            "BasicButton.Xs.Warning" to ComposeStyleReference { BasicButton.Xs.Warning.style() },
            "BasicButton.Xs.Accent" to ComposeStyleReference { BasicButton.Xs.Accent.style() },
            "BasicButton.Xs.Clear" to ComposeStyleReference { BasicButton.Xs.Clear.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return BasicButtonStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> BasicButtonSize.M
                "S" -> BasicButtonSize.S
                "Xs" -> BasicButtonSize.Xs
                else -> BasicButtonSize.M
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> BasicButtonView.Default
                "Secondary" -> BasicButtonView.Secondary
                "Dark" -> BasicButtonView.Dark
                "Negative" -> BasicButtonView.Negative
                "Warning" -> BasicButtonView.Warning
                "Accent" -> BasicButtonView.Accent
                "Clear" -> BasicButtonView.Clear
                else -> BasicButtonView.Default
            },
        ).key
    }
}
