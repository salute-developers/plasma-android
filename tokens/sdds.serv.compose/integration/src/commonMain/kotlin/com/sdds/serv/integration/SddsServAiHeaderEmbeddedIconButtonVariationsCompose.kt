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
import com.sdds.serv.styles.iconbutton.AiHeaderEmbeddedIconButton
import com.sdds.serv.styles.iconbutton.AiHeaderEmbeddedIconButtonSize
import com.sdds.serv.styles.iconbutton.AiHeaderEmbeddedIconButtonView
import com.sdds.serv.styles.iconbutton.Default
import com.sdds.serv.styles.iconbutton.IconButtonStyles
import com.sdds.serv.styles.iconbutton.Info
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.Negative
import com.sdds.serv.styles.iconbutton.Positive
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Secondary
import com.sdds.serv.styles.iconbutton.Warning
import com.sdds.serv.styles.iconbutton.Xl
import com.sdds.serv.styles.iconbutton.resolve

internal object SddsServAiHeaderEmbeddedIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xl", "L", "M", "S")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning", "Clear", "Info"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "AiHeaderEmbeddedIconButton.Xl.Default" to ComposeStyleReference { AiHeaderEmbeddedIconButton.Xl.Default.style() },
            "AiHeaderEmbeddedIconButton.Xl.Secondary" to ComposeStyleReference { AiHeaderEmbeddedIconButton.Xl.Secondary.style() },
            "AiHeaderEmbeddedIconButton.Xl.Accent" to ComposeStyleReference { AiHeaderEmbeddedIconButton.Xl.Accent.style() },
            "AiHeaderEmbeddedIconButton.Xl.Positive" to ComposeStyleReference { AiHeaderEmbeddedIconButton.Xl.Positive.style() },
            "AiHeaderEmbeddedIconButton.Xl.Negative" to ComposeStyleReference { AiHeaderEmbeddedIconButton.Xl.Negative.style() },
            "AiHeaderEmbeddedIconButton.Xl.Warning" to ComposeStyleReference { AiHeaderEmbeddedIconButton.Xl.Warning.style() },
            "AiHeaderEmbeddedIconButton.Xl.Info" to ComposeStyleReference { AiHeaderEmbeddedIconButton.Xl.Info.style() },
            "AiHeaderEmbeddedIconButton.L.Default" to ComposeStyleReference { AiHeaderEmbeddedIconButton.L.Default.style() },
            "AiHeaderEmbeddedIconButton.L.Secondary" to ComposeStyleReference { AiHeaderEmbeddedIconButton.L.Secondary.style() },
            "AiHeaderEmbeddedIconButton.L.Accent" to ComposeStyleReference { AiHeaderEmbeddedIconButton.L.Accent.style() },
            "AiHeaderEmbeddedIconButton.L.Positive" to ComposeStyleReference { AiHeaderEmbeddedIconButton.L.Positive.style() },
            "AiHeaderEmbeddedIconButton.L.Negative" to ComposeStyleReference { AiHeaderEmbeddedIconButton.L.Negative.style() },
            "AiHeaderEmbeddedIconButton.L.Warning" to ComposeStyleReference { AiHeaderEmbeddedIconButton.L.Warning.style() },
            "AiHeaderEmbeddedIconButton.L.Info" to ComposeStyleReference { AiHeaderEmbeddedIconButton.L.Info.style() },
            "AiHeaderEmbeddedIconButton.M.Default" to ComposeStyleReference { AiHeaderEmbeddedIconButton.M.Default.style() },
            "AiHeaderEmbeddedIconButton.M.Secondary" to ComposeStyleReference { AiHeaderEmbeddedIconButton.M.Secondary.style() },
            "AiHeaderEmbeddedIconButton.M.Accent" to ComposeStyleReference { AiHeaderEmbeddedIconButton.M.Accent.style() },
            "AiHeaderEmbeddedIconButton.M.Positive" to ComposeStyleReference { AiHeaderEmbeddedIconButton.M.Positive.style() },
            "AiHeaderEmbeddedIconButton.M.Negative" to ComposeStyleReference { AiHeaderEmbeddedIconButton.M.Negative.style() },
            "AiHeaderEmbeddedIconButton.M.Warning" to ComposeStyleReference { AiHeaderEmbeddedIconButton.M.Warning.style() },
            "AiHeaderEmbeddedIconButton.M.Info" to ComposeStyleReference { AiHeaderEmbeddedIconButton.M.Info.style() },
            "AiHeaderEmbeddedIconButton.S.Default" to ComposeStyleReference { AiHeaderEmbeddedIconButton.S.Default.style() },
            "AiHeaderEmbeddedIconButton.S.Secondary" to ComposeStyleReference { AiHeaderEmbeddedIconButton.S.Secondary.style() },
            "AiHeaderEmbeddedIconButton.S.Accent" to ComposeStyleReference { AiHeaderEmbeddedIconButton.S.Accent.style() },
            "AiHeaderEmbeddedIconButton.S.Positive" to ComposeStyleReference { AiHeaderEmbeddedIconButton.S.Positive.style() },
            "AiHeaderEmbeddedIconButton.S.Negative" to ComposeStyleReference { AiHeaderEmbeddedIconButton.S.Negative.style() },
            "AiHeaderEmbeddedIconButton.S.Warning" to ComposeStyleReference { AiHeaderEmbeddedIconButton.S.Warning.style() },
            "AiHeaderEmbeddedIconButton.S.Info" to ComposeStyleReference { AiHeaderEmbeddedIconButton.S.Info.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconButtonStyles.AiHeaderEmbeddedIconButton.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> AiHeaderEmbeddedIconButtonSize.Xl
                "L" -> AiHeaderEmbeddedIconButtonSize.L
                "M" -> AiHeaderEmbeddedIconButtonSize.M
                "S" -> AiHeaderEmbeddedIconButtonSize.S
                else -> AiHeaderEmbeddedIconButtonSize.M
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> AiHeaderEmbeddedIconButtonView.Default
                "Secondary" -> AiHeaderEmbeddedIconButtonView.Secondary
                "Accent" -> AiHeaderEmbeddedIconButtonView.Accent
                "Positive" -> AiHeaderEmbeddedIconButtonView.Positive
                "Negative" -> AiHeaderEmbeddedIconButtonView.Negative
                "Warning" -> AiHeaderEmbeddedIconButtonView.Warning
                "Clear" -> AiHeaderEmbeddedIconButtonView.Clear
                "Info" -> AiHeaderEmbeddedIconButtonView.Info
                else -> AiHeaderEmbeddedIconButtonView.Default
            },
        ).key
    }
}
