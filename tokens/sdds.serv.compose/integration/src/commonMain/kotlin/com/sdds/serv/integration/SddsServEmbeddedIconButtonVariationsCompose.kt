// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.iconbutton.Accent
import com.sdds.serv.styles.iconbutton.Default
import com.sdds.serv.styles.iconbutton.EmbeddedIconButton
import com.sdds.serv.styles.iconbutton.EmbeddedIconButtonSize
import com.sdds.serv.styles.iconbutton.EmbeddedIconButtonView
import com.sdds.serv.styles.iconbutton.IconButtonStyles
import com.sdds.serv.styles.iconbutton.Info
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.Negative
import com.sdds.serv.styles.iconbutton.Positive
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Secondary
import com.sdds.serv.styles.iconbutton.Warning
import com.sdds.serv.styles.iconbutton.Xs
import com.sdds.serv.styles.iconbutton.resolve

internal object SddsServEmbeddedIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning", "Clear", "Info"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "EmbeddedIconButton.L.Default" to ComposeStyleReference { EmbeddedIconButton.L.Default.style() },
            "EmbeddedIconButton.L.Secondary" to ComposeStyleReference { EmbeddedIconButton.L.Secondary.style() },
            "EmbeddedIconButton.L.Accent" to ComposeStyleReference { EmbeddedIconButton.L.Accent.style() },
            "EmbeddedIconButton.L.Positive" to ComposeStyleReference { EmbeddedIconButton.L.Positive.style() },
            "EmbeddedIconButton.L.Negative" to ComposeStyleReference { EmbeddedIconButton.L.Negative.style() },
            "EmbeddedIconButton.L.Warning" to ComposeStyleReference { EmbeddedIconButton.L.Warning.style() },
            "EmbeddedIconButton.L.Info" to ComposeStyleReference { EmbeddedIconButton.L.Info.style() },
            "EmbeddedIconButton.M.Default" to ComposeStyleReference { EmbeddedIconButton.M.Default.style() },
            "EmbeddedIconButton.M.Secondary" to ComposeStyleReference { EmbeddedIconButton.M.Secondary.style() },
            "EmbeddedIconButton.M.Accent" to ComposeStyleReference { EmbeddedIconButton.M.Accent.style() },
            "EmbeddedIconButton.M.Positive" to ComposeStyleReference { EmbeddedIconButton.M.Positive.style() },
            "EmbeddedIconButton.M.Negative" to ComposeStyleReference { EmbeddedIconButton.M.Negative.style() },
            "EmbeddedIconButton.M.Warning" to ComposeStyleReference { EmbeddedIconButton.M.Warning.style() },
            "EmbeddedIconButton.M.Info" to ComposeStyleReference { EmbeddedIconButton.M.Info.style() },
            "EmbeddedIconButton.S.Default" to ComposeStyleReference { EmbeddedIconButton.S.Default.style() },
            "EmbeddedIconButton.S.Secondary" to ComposeStyleReference { EmbeddedIconButton.S.Secondary.style() },
            "EmbeddedIconButton.S.Accent" to ComposeStyleReference { EmbeddedIconButton.S.Accent.style() },
            "EmbeddedIconButton.S.Positive" to ComposeStyleReference { EmbeddedIconButton.S.Positive.style() },
            "EmbeddedIconButton.S.Negative" to ComposeStyleReference { EmbeddedIconButton.S.Negative.style() },
            "EmbeddedIconButton.S.Warning" to ComposeStyleReference { EmbeddedIconButton.S.Warning.style() },
            "EmbeddedIconButton.S.Info" to ComposeStyleReference { EmbeddedIconButton.S.Info.style() },
            "EmbeddedIconButton.Xs.Default" to ComposeStyleReference { EmbeddedIconButton.Xs.Default.style() },
            "EmbeddedIconButton.Xs.Secondary" to ComposeStyleReference { EmbeddedIconButton.Xs.Secondary.style() },
            "EmbeddedIconButton.Xs.Accent" to ComposeStyleReference { EmbeddedIconButton.Xs.Accent.style() },
            "EmbeddedIconButton.Xs.Positive" to ComposeStyleReference { EmbeddedIconButton.Xs.Positive.style() },
            "EmbeddedIconButton.Xs.Negative" to ComposeStyleReference { EmbeddedIconButton.Xs.Negative.style() },
            "EmbeddedIconButton.Xs.Warning" to ComposeStyleReference { EmbeddedIconButton.Xs.Warning.style() },
            "EmbeddedIconButton.Xs.Info" to ComposeStyleReference { EmbeddedIconButton.Xs.Info.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconButtonStyles.EmbeddedIconButton.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> EmbeddedIconButtonSize.L
                "M" -> EmbeddedIconButtonSize.M
                "S" -> EmbeddedIconButtonSize.S
                "Xs" -> EmbeddedIconButtonSize.Xs
                else -> EmbeddedIconButtonSize.M
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> EmbeddedIconButtonView.Default
                "Secondary" -> EmbeddedIconButtonView.Secondary
                "Accent" -> EmbeddedIconButtonView.Accent
                "Positive" -> EmbeddedIconButtonView.Positive
                "Negative" -> EmbeddedIconButtonView.Negative
                "Warning" -> EmbeddedIconButtonView.Warning
                "Clear" -> EmbeddedIconButtonView.Clear
                "Info" -> EmbeddedIconButtonView.Info
                else -> EmbeddedIconButtonView.Default
            },
        ).key
    }
}
