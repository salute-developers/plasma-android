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
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.spinner.Accent
import com.sdds.serv.styles.spinner.Default
import com.sdds.serv.styles.spinner.Info
import com.sdds.serv.styles.spinner.L
import com.sdds.serv.styles.spinner.M
import com.sdds.serv.styles.spinner.Negative
import com.sdds.serv.styles.spinner.Positive
import com.sdds.serv.styles.spinner.S
import com.sdds.serv.styles.spinner.Scalable
import com.sdds.serv.styles.spinner.Secondary
import com.sdds.serv.styles.spinner.Spinner
import com.sdds.serv.styles.spinner.SpinnerSize
import com.sdds.serv.styles.spinner.SpinnerStyles
import com.sdds.serv.styles.spinner.SpinnerView
import com.sdds.serv.styles.spinner.Warning
import com.sdds.serv.styles.spinner.Xl
import com.sdds.serv.styles.spinner.Xs
import com.sdds.serv.styles.spinner.Xxl
import com.sdds.serv.styles.spinner.Xxs
import com.sdds.serv.styles.spinner.resolve

internal object SddsServSpinnerVariationsCompose : ComposeStyleProvider<SpinnerStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Xxl",
                variants = listOf("Xxl", "Xl", "L", "M", "S", "Xs", "Xxs", "Scalable"),
            ),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Secondary", "Accent", "Positive", "Negative", "Warning", "Info"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<SpinnerStyle>> =
        mapOf(
            "Spinner.Xxl.Default" to ComposeStyleReference { Spinner.Xxl.Default.style() },
            "Spinner.Xxl.Secondary" to ComposeStyleReference { Spinner.Xxl.Secondary.style() },
            "Spinner.Xxl.Accent" to ComposeStyleReference { Spinner.Xxl.Accent.style() },
            "Spinner.Xxl.Positive" to ComposeStyleReference { Spinner.Xxl.Positive.style() },
            "Spinner.Xxl.Negative" to ComposeStyleReference { Spinner.Xxl.Negative.style() },
            "Spinner.Xxl.Warning" to ComposeStyleReference { Spinner.Xxl.Warning.style() },
            "Spinner.Xxl.Info" to ComposeStyleReference { Spinner.Xxl.Info.style() },
            "Spinner.Xl.Default" to ComposeStyleReference { Spinner.Xl.Default.style() },
            "Spinner.Xl.Secondary" to ComposeStyleReference { Spinner.Xl.Secondary.style() },
            "Spinner.Xl.Accent" to ComposeStyleReference { Spinner.Xl.Accent.style() },
            "Spinner.Xl.Positive" to ComposeStyleReference { Spinner.Xl.Positive.style() },
            "Spinner.Xl.Negative" to ComposeStyleReference { Spinner.Xl.Negative.style() },
            "Spinner.Xl.Warning" to ComposeStyleReference { Spinner.Xl.Warning.style() },
            "Spinner.Xl.Info" to ComposeStyleReference { Spinner.Xl.Info.style() },
            "Spinner.L.Default" to ComposeStyleReference { Spinner.L.Default.style() },
            "Spinner.L.Secondary" to ComposeStyleReference { Spinner.L.Secondary.style() },
            "Spinner.L.Accent" to ComposeStyleReference { Spinner.L.Accent.style() },
            "Spinner.L.Positive" to ComposeStyleReference { Spinner.L.Positive.style() },
            "Spinner.L.Negative" to ComposeStyleReference { Spinner.L.Negative.style() },
            "Spinner.L.Warning" to ComposeStyleReference { Spinner.L.Warning.style() },
            "Spinner.L.Info" to ComposeStyleReference { Spinner.L.Info.style() },
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
                "Xxl" -> SpinnerSize.Xxl
                "Xl" -> SpinnerSize.Xl
                "L" -> SpinnerSize.L
                "M" -> SpinnerSize.M
                "S" -> SpinnerSize.S
                "Xs" -> SpinnerSize.Xs
                "Xxs" -> SpinnerSize.Xxs
                "Scalable" -> SpinnerSize.Scalable
                else -> SpinnerSize.Xxl
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
