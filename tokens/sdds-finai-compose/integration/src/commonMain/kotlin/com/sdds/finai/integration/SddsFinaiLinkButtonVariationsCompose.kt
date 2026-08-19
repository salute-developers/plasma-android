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
import com.sdds.finai.styles.linkbutton.Accent
import com.sdds.finai.styles.linkbutton.Default
import com.sdds.finai.styles.linkbutton.LinkButton
import com.sdds.finai.styles.linkbutton.LinkButtonSize
import com.sdds.finai.styles.linkbutton.LinkButtonStyles
import com.sdds.finai.styles.linkbutton.LinkButtonView
import com.sdds.finai.styles.linkbutton.Negative
import com.sdds.finai.styles.linkbutton.Positive
import com.sdds.finai.styles.linkbutton.S
import com.sdds.finai.styles.linkbutton.Secondary
import com.sdds.finai.styles.linkbutton.Warning
import com.sdds.finai.styles.linkbutton.Xs
import com.sdds.finai.styles.linkbutton.Xxs
import com.sdds.finai.styles.linkbutton.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiLinkButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "S", variants = listOf("S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "LinkButton.S.Default" to ComposeStyleReference { LinkButton.S.Default.style() },
            "LinkButton.S.Secondary" to ComposeStyleReference { LinkButton.S.Secondary.style() },
            "LinkButton.S.Accent" to ComposeStyleReference { LinkButton.S.Accent.style() },
            "LinkButton.S.Positive" to ComposeStyleReference { LinkButton.S.Positive.style() },
            "LinkButton.S.Negative" to ComposeStyleReference { LinkButton.S.Negative.style() },
            "LinkButton.S.Warning" to ComposeStyleReference { LinkButton.S.Warning.style() },
            "LinkButton.Xs.Default" to ComposeStyleReference { LinkButton.Xs.Default.style() },
            "LinkButton.Xs.Secondary" to ComposeStyleReference { LinkButton.Xs.Secondary.style() },
            "LinkButton.Xs.Accent" to ComposeStyleReference { LinkButton.Xs.Accent.style() },
            "LinkButton.Xs.Positive" to ComposeStyleReference { LinkButton.Xs.Positive.style() },
            "LinkButton.Xs.Negative" to ComposeStyleReference { LinkButton.Xs.Negative.style() },
            "LinkButton.Xs.Warning" to ComposeStyleReference { LinkButton.Xs.Warning.style() },
            "LinkButton.Xxs.Default" to ComposeStyleReference { LinkButton.Xxs.Default.style() },
            "LinkButton.Xxs.Secondary" to ComposeStyleReference { LinkButton.Xxs.Secondary.style() },
            "LinkButton.Xxs.Accent" to ComposeStyleReference { LinkButton.Xxs.Accent.style() },
            "LinkButton.Xxs.Positive" to ComposeStyleReference { LinkButton.Xxs.Positive.style() },
            "LinkButton.Xxs.Negative" to ComposeStyleReference { LinkButton.Xxs.Negative.style() },
            "LinkButton.Xxs.Warning" to ComposeStyleReference { LinkButton.Xxs.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return LinkButtonStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> LinkButtonSize.S
                "Xs" -> LinkButtonSize.Xs
                "Xxs" -> LinkButtonSize.Xxs
                else -> LinkButtonSize.S
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> LinkButtonView.Default
                "Secondary" -> LinkButtonView.Secondary
                "Accent" -> LinkButtonView.Accent
                "Positive" -> LinkButtonView.Positive
                "Negative" -> LinkButtonView.Negative
                "Warning" -> LinkButtonView.Warning
                else -> LinkButtonView.Default
            },
        ).key
    }
}
