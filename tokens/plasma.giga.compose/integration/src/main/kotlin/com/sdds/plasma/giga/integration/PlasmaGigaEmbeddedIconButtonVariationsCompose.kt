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
import com.sdds.plasma.giga.styles.iconbutton.Default
import com.sdds.plasma.giga.styles.iconbutton.EmbeddedIconButton
import com.sdds.plasma.giga.styles.iconbutton.EmbeddedIconButtonSize
import com.sdds.plasma.giga.styles.iconbutton.EmbeddedIconButtonView
import com.sdds.plasma.giga.styles.iconbutton.IconButtonStyles
import com.sdds.plasma.giga.styles.iconbutton.Info
import com.sdds.plasma.giga.styles.iconbutton.L
import com.sdds.plasma.giga.styles.iconbutton.M
import com.sdds.plasma.giga.styles.iconbutton.Negative
import com.sdds.plasma.giga.styles.iconbutton.Positive
import com.sdds.plasma.giga.styles.iconbutton.S
import com.sdds.plasma.giga.styles.iconbutton.Secondary
import com.sdds.plasma.giga.styles.iconbutton.Warning
import com.sdds.plasma.giga.styles.iconbutton.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaEmbeddedIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("L", "M", "S")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning", "Info"),
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
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconButtonStyles.EmbeddedIconButton.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> EmbeddedIconButtonSize.L
                "M" -> EmbeddedIconButtonSize.M
                "S" -> EmbeddedIconButtonSize.S
                else -> EmbeddedIconButtonSize.M
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> EmbeddedIconButtonView.Default
                "Secondary" -> EmbeddedIconButtonView.Secondary
                "Accent" -> EmbeddedIconButtonView.Accent
                "Positive" -> EmbeddedIconButtonView.Positive
                "Negative" -> EmbeddedIconButtonView.Negative
                "Warning" -> EmbeddedIconButtonView.Warning
                "Info" -> EmbeddedIconButtonView.Info
                else -> EmbeddedIconButtonView.Default
            },
        ).key
    }
}
