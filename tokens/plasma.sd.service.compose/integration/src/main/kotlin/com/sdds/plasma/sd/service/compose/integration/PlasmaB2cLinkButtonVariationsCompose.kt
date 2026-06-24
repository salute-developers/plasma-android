// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.linkbutton.Accent
import com.sdds.plasma.sd.service.styles.linkbutton.Default
import com.sdds.plasma.sd.service.styles.linkbutton.L
import com.sdds.plasma.sd.service.styles.linkbutton.LinkButton
import com.sdds.plasma.sd.service.styles.linkbutton.LinkButtonSize
import com.sdds.plasma.sd.service.styles.linkbutton.LinkButtonStyles
import com.sdds.plasma.sd.service.styles.linkbutton.LinkButtonView
import com.sdds.plasma.sd.service.styles.linkbutton.M
import com.sdds.plasma.sd.service.styles.linkbutton.Negative
import com.sdds.plasma.sd.service.styles.linkbutton.Positive
import com.sdds.plasma.sd.service.styles.linkbutton.S
import com.sdds.plasma.sd.service.styles.linkbutton.Secondary
import com.sdds.plasma.sd.service.styles.linkbutton.Warning
import com.sdds.plasma.sd.service.styles.linkbutton.Xl
import com.sdds.plasma.sd.service.styles.linkbutton.Xs
import com.sdds.plasma.sd.service.styles.linkbutton.Xxs
import com.sdds.plasma.sd.service.styles.linkbutton.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cLinkButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
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
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "LinkButton.Xl.Default" to ComposeStyleReference { LinkButton.Xl.Default.style() },
            "LinkButton.Xl.Secondary" to ComposeStyleReference { LinkButton.Xl.Secondary.style() },
            "LinkButton.Xl.Accent" to ComposeStyleReference { LinkButton.Xl.Accent.style() },
            "LinkButton.Xl.Positive" to ComposeStyleReference { LinkButton.Xl.Positive.style() },
            "LinkButton.Xl.Negative" to ComposeStyleReference { LinkButton.Xl.Negative.style() },
            "LinkButton.Xl.Warning" to ComposeStyleReference { LinkButton.Xl.Warning.style() },
            "LinkButton.L.Default" to ComposeStyleReference { LinkButton.L.Default.style() },
            "LinkButton.L.Secondary" to ComposeStyleReference { LinkButton.L.Secondary.style() },
            "LinkButton.L.Accent" to ComposeStyleReference { LinkButton.L.Accent.style() },
            "LinkButton.L.Positive" to ComposeStyleReference { LinkButton.L.Positive.style() },
            "LinkButton.L.Negative" to ComposeStyleReference { LinkButton.L.Negative.style() },
            "LinkButton.L.Warning" to ComposeStyleReference { LinkButton.L.Warning.style() },
            "LinkButton.M.Default" to ComposeStyleReference { LinkButton.M.Default.style() },
            "LinkButton.M.Secondary" to ComposeStyleReference { LinkButton.M.Secondary.style() },
            "LinkButton.M.Accent" to ComposeStyleReference { LinkButton.M.Accent.style() },
            "LinkButton.M.Positive" to ComposeStyleReference { LinkButton.M.Positive.style() },
            "LinkButton.M.Negative" to ComposeStyleReference { LinkButton.M.Negative.style() },
            "LinkButton.M.Warning" to ComposeStyleReference { LinkButton.M.Warning.style() },
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
                "Xl" -> LinkButtonSize.Xl
                "L" -> LinkButtonSize.L
                "M" -> LinkButtonSize.M
                "S" -> LinkButtonSize.S
                "Xs" -> LinkButtonSize.Xs
                "Xxs" -> LinkButtonSize.Xxs
                else -> LinkButtonSize.Xl
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
