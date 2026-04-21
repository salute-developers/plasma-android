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
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.spinner.Accent
import com.sdds.plasma.homeds.styles.spinner.Default
import com.sdds.plasma.homeds.styles.spinner.Info
import com.sdds.plasma.homeds.styles.spinner.M
import com.sdds.plasma.homeds.styles.spinner.Negative
import com.sdds.plasma.homeds.styles.spinner.Positive
import com.sdds.plasma.homeds.styles.spinner.S
import com.sdds.plasma.homeds.styles.spinner.Scalable
import com.sdds.plasma.homeds.styles.spinner.Secondary
import com.sdds.plasma.homeds.styles.spinner.Spinner
import com.sdds.plasma.homeds.styles.spinner.SpinnerSize
import com.sdds.plasma.homeds.styles.spinner.SpinnerStyles
import com.sdds.plasma.homeds.styles.spinner.SpinnerView
import com.sdds.plasma.homeds.styles.spinner.Warning
import com.sdds.plasma.homeds.styles.spinner.Xs
import com.sdds.plasma.homeds.styles.spinner.Xxs
import com.sdds.plasma.homeds.styles.spinner.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsSpinnerVariationsCompose : ComposeStyleProvider<SpinnerStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "M",
                variants = listOf("M", "S", "Xs", "Xxs", "Scalable"),
            ),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning", "Info"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<SpinnerStyle>> =
        mapOf(
            "Spinner.M.Default" to ComposeStyleReference { Spinner.M.Default.style() },
            "Spinner.M.Secondary" to ComposeStyleReference { Spinner.M.Secondary.style() },
            "Spinner.M.Accent" to ComposeStyleReference { Spinner.M.Accent.style() },
            "Spinner.M.Positive" to ComposeStyleReference { Spinner.M.Positive.style() },
            "Spinner.M.Negative" to ComposeStyleReference { Spinner.M.Negative.style() },
            "Spinner.M.Warning" to ComposeStyleReference { Spinner.M.Warning.style() },
            "Spinner.M.Info" to ComposeStyleReference { Spinner.M.Info.style() },
            "Spinner.S.Default" to ComposeStyleReference { Spinner.S.Default.style() },
            "Spinner.S.Secondary" to ComposeStyleReference { Spinner.S.Secondary.style() },
            "Spinner.S.Accent" to ComposeStyleReference { Spinner.S.Accent.style() },
            "Spinner.S.Positive" to ComposeStyleReference { Spinner.S.Positive.style() },
            "Spinner.S.Negative" to ComposeStyleReference { Spinner.S.Negative.style() },
            "Spinner.S.Warning" to ComposeStyleReference { Spinner.S.Warning.style() },
            "Spinner.S.Info" to ComposeStyleReference { Spinner.S.Info.style() },
            "Spinner.Xs.Default" to ComposeStyleReference { Spinner.Xs.Default.style() },
            "Spinner.Xs.Secondary" to ComposeStyleReference { Spinner.Xs.Secondary.style() },
            "Spinner.Xs.Accent" to ComposeStyleReference { Spinner.Xs.Accent.style() },
            "Spinner.Xs.Positive" to ComposeStyleReference { Spinner.Xs.Positive.style() },
            "Spinner.Xs.Negative" to ComposeStyleReference { Spinner.Xs.Negative.style() },
            "Spinner.Xs.Warning" to ComposeStyleReference { Spinner.Xs.Warning.style() },
            "Spinner.Xs.Info" to ComposeStyleReference { Spinner.Xs.Info.style() },
            "Spinner.Xxs.Default" to ComposeStyleReference { Spinner.Xxs.Default.style() },
            "Spinner.Xxs.Secondary" to ComposeStyleReference { Spinner.Xxs.Secondary.style() },
            "Spinner.Xxs.Accent" to ComposeStyleReference { Spinner.Xxs.Accent.style() },
            "Spinner.Xxs.Positive" to ComposeStyleReference { Spinner.Xxs.Positive.style() },
            "Spinner.Xxs.Negative" to ComposeStyleReference { Spinner.Xxs.Negative.style() },
            "Spinner.Xxs.Warning" to ComposeStyleReference { Spinner.Xxs.Warning.style() },
            "Spinner.Xxs.Info" to ComposeStyleReference { Spinner.Xxs.Info.style() },
            "Spinner.Scalable.Default" to ComposeStyleReference { Spinner.Scalable.Default.style() },
            "Spinner.Scalable.Secondary" to ComposeStyleReference { Spinner.Scalable.Secondary.style() },
            "Spinner.Scalable.Accent" to ComposeStyleReference { Spinner.Scalable.Accent.style() },
            "Spinner.Scalable.Positive" to ComposeStyleReference { Spinner.Scalable.Positive.style() },
            "Spinner.Scalable.Negative" to ComposeStyleReference { Spinner.Scalable.Negative.style() },
            "Spinner.Scalable.Warning" to ComposeStyleReference { Spinner.Scalable.Warning.style() },
            "Spinner.Scalable.Info" to ComposeStyleReference { Spinner.Scalable.Info.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SpinnerStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> SpinnerSize.M
                "S" -> SpinnerSize.S
                "Xs" -> SpinnerSize.Xs
                "Xxs" -> SpinnerSize.Xxs
                "Scalable" -> SpinnerSize.Scalable
                else -> SpinnerSize.M
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> SpinnerView.Default
                "Secondary" -> SpinnerView.Secondary
                "Accent" -> SpinnerView.Accent
                "Positive" -> SpinnerView.Positive
                "Negative" -> SpinnerView.Negative
                "Warning" -> SpinnerView.Warning
                "Info" -> SpinnerView.Info
                else -> SpinnerView.Default
            },
        ).key
    }
}
