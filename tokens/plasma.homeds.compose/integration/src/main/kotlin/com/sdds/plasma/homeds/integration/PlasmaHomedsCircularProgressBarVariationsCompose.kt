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
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.circularprogressbar.Accent
import com.sdds.plasma.homeds.styles.circularprogressbar.CircularProgressBar
import com.sdds.plasma.homeds.styles.circularprogressbar.CircularProgressBarSize
import com.sdds.plasma.homeds.styles.circularprogressbar.CircularProgressBarStyles
import com.sdds.plasma.homeds.styles.circularprogressbar.CircularProgressBarView
import com.sdds.plasma.homeds.styles.circularprogressbar.Default
import com.sdds.plasma.homeds.styles.circularprogressbar.Gradient
import com.sdds.plasma.homeds.styles.circularprogressbar.Info
import com.sdds.plasma.homeds.styles.circularprogressbar.L
import com.sdds.plasma.homeds.styles.circularprogressbar.M
import com.sdds.plasma.homeds.styles.circularprogressbar.Negative
import com.sdds.plasma.homeds.styles.circularprogressbar.Positive
import com.sdds.plasma.homeds.styles.circularprogressbar.S
import com.sdds.plasma.homeds.styles.circularprogressbar.Secondary
import com.sdds.plasma.homeds.styles.circularprogressbar.Warning
import com.sdds.plasma.homeds.styles.circularprogressbar.Xl
import com.sdds.plasma.homeds.styles.circularprogressbar.Xs
import com.sdds.plasma.homeds.styles.circularprogressbar.Xxl
import com.sdds.plasma.homeds.styles.circularprogressbar.Xxs
import com.sdds.plasma.homeds.styles.circularprogressbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsCircularProgressBarVariationsCompose : ComposeStyleProvider<CircularProgressBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Xxl",
                variants = listOf("Xxl", "Xl", "L", "M", "S", "Xs", "Xxs"),
            ),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf(
                    "Default",
                    "Secondary",
                    "Accent",
                    "Gradient",
                    "Info",
                    "Negative",
                    "Positive",
                    "Warning",
                ),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<CircularProgressBarStyle>> =
        mapOf(
            "CircularProgressBar.Xxl.Default" to ComposeStyleReference { CircularProgressBar.Xxl.Default.style() },
            "CircularProgressBar.Xxl.Secondary" to ComposeStyleReference { CircularProgressBar.Xxl.Secondary.style() },
            "CircularProgressBar.Xxl.Accent" to ComposeStyleReference { CircularProgressBar.Xxl.Accent.style() },
            "CircularProgressBar.Xxl.Gradient" to ComposeStyleReference { CircularProgressBar.Xxl.Gradient.style() },
            "CircularProgressBar.Xxl.Info" to ComposeStyleReference { CircularProgressBar.Xxl.Info.style() },
            "CircularProgressBar.Xxl.Negative" to ComposeStyleReference { CircularProgressBar.Xxl.Negative.style() },
            "CircularProgressBar.Xxl.Positive" to ComposeStyleReference { CircularProgressBar.Xxl.Positive.style() },
            "CircularProgressBar.Xxl.Warning" to ComposeStyleReference { CircularProgressBar.Xxl.Warning.style() },
            "CircularProgressBar.Xl.Default" to ComposeStyleReference { CircularProgressBar.Xl.Default.style() },
            "CircularProgressBar.Xl.Secondary" to ComposeStyleReference { CircularProgressBar.Xl.Secondary.style() },
            "CircularProgressBar.Xl.Accent" to ComposeStyleReference { CircularProgressBar.Xl.Accent.style() },
            "CircularProgressBar.Xl.Gradient" to ComposeStyleReference { CircularProgressBar.Xl.Gradient.style() },
            "CircularProgressBar.Xl.Info" to ComposeStyleReference { CircularProgressBar.Xl.Info.style() },
            "CircularProgressBar.Xl.Negative" to ComposeStyleReference { CircularProgressBar.Xl.Negative.style() },
            "CircularProgressBar.Xl.Positive" to ComposeStyleReference { CircularProgressBar.Xl.Positive.style() },
            "CircularProgressBar.Xl.Warning" to ComposeStyleReference { CircularProgressBar.Xl.Warning.style() },
            "CircularProgressBar.L.Default" to ComposeStyleReference { CircularProgressBar.L.Default.style() },
            "CircularProgressBar.L.Secondary" to ComposeStyleReference { CircularProgressBar.L.Secondary.style() },
            "CircularProgressBar.L.Accent" to ComposeStyleReference { CircularProgressBar.L.Accent.style() },
            "CircularProgressBar.L.Gradient" to ComposeStyleReference { CircularProgressBar.L.Gradient.style() },
            "CircularProgressBar.L.Info" to ComposeStyleReference { CircularProgressBar.L.Info.style() },
            "CircularProgressBar.L.Negative" to ComposeStyleReference { CircularProgressBar.L.Negative.style() },
            "CircularProgressBar.L.Positive" to ComposeStyleReference { CircularProgressBar.L.Positive.style() },
            "CircularProgressBar.L.Warning" to ComposeStyleReference { CircularProgressBar.L.Warning.style() },
            "CircularProgressBar.M.Default" to ComposeStyleReference { CircularProgressBar.M.Default.style() },
            "CircularProgressBar.M.Secondary" to ComposeStyleReference { CircularProgressBar.M.Secondary.style() },
            "CircularProgressBar.M.Accent" to ComposeStyleReference { CircularProgressBar.M.Accent.style() },
            "CircularProgressBar.M.Gradient" to ComposeStyleReference { CircularProgressBar.M.Gradient.style() },
            "CircularProgressBar.M.Info" to ComposeStyleReference { CircularProgressBar.M.Info.style() },
            "CircularProgressBar.M.Negative" to ComposeStyleReference { CircularProgressBar.M.Negative.style() },
            "CircularProgressBar.M.Positive" to ComposeStyleReference { CircularProgressBar.M.Positive.style() },
            "CircularProgressBar.M.Warning" to ComposeStyleReference { CircularProgressBar.M.Warning.style() },
            "CircularProgressBar.S.Default" to ComposeStyleReference { CircularProgressBar.S.Default.style() },
            "CircularProgressBar.S.Secondary" to ComposeStyleReference { CircularProgressBar.S.Secondary.style() },
            "CircularProgressBar.S.Accent" to ComposeStyleReference { CircularProgressBar.S.Accent.style() },
            "CircularProgressBar.S.Gradient" to ComposeStyleReference { CircularProgressBar.S.Gradient.style() },
            "CircularProgressBar.S.Info" to ComposeStyleReference { CircularProgressBar.S.Info.style() },
            "CircularProgressBar.S.Negative" to ComposeStyleReference { CircularProgressBar.S.Negative.style() },
            "CircularProgressBar.S.Positive" to ComposeStyleReference { CircularProgressBar.S.Positive.style() },
            "CircularProgressBar.S.Warning" to ComposeStyleReference { CircularProgressBar.S.Warning.style() },
            "CircularProgressBar.Xs.Default" to ComposeStyleReference { CircularProgressBar.Xs.Default.style() },
            "CircularProgressBar.Xs.Secondary" to ComposeStyleReference { CircularProgressBar.Xs.Secondary.style() },
            "CircularProgressBar.Xs.Accent" to ComposeStyleReference { CircularProgressBar.Xs.Accent.style() },
            "CircularProgressBar.Xs.Gradient" to ComposeStyleReference { CircularProgressBar.Xs.Gradient.style() },
            "CircularProgressBar.Xs.Info" to ComposeStyleReference { CircularProgressBar.Xs.Info.style() },
            "CircularProgressBar.Xs.Negative" to ComposeStyleReference { CircularProgressBar.Xs.Negative.style() },
            "CircularProgressBar.Xs.Positive" to ComposeStyleReference { CircularProgressBar.Xs.Positive.style() },
            "CircularProgressBar.Xs.Warning" to ComposeStyleReference { CircularProgressBar.Xs.Warning.style() },
            "CircularProgressBar.Xxs.Default" to ComposeStyleReference { CircularProgressBar.Xxs.Default.style() },
            "CircularProgressBar.Xxs.Secondary" to ComposeStyleReference { CircularProgressBar.Xxs.Secondary.style() },
            "CircularProgressBar.Xxs.Accent" to ComposeStyleReference { CircularProgressBar.Xxs.Accent.style() },
            "CircularProgressBar.Xxs.Gradient" to ComposeStyleReference { CircularProgressBar.Xxs.Gradient.style() },
            "CircularProgressBar.Xxs.Info" to ComposeStyleReference { CircularProgressBar.Xxs.Info.style() },
            "CircularProgressBar.Xxs.Negative" to ComposeStyleReference { CircularProgressBar.Xxs.Negative.style() },
            "CircularProgressBar.Xxs.Positive" to ComposeStyleReference { CircularProgressBar.Xxs.Positive.style() },
            "CircularProgressBar.Xxs.Warning" to ComposeStyleReference { CircularProgressBar.Xxs.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CircularProgressBarStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xxl" -> CircularProgressBarSize.Xxl
                "Xl" -> CircularProgressBarSize.Xl
                "L" -> CircularProgressBarSize.L
                "M" -> CircularProgressBarSize.M
                "S" -> CircularProgressBarSize.S
                "Xs" -> CircularProgressBarSize.Xs
                "Xxs" -> CircularProgressBarSize.Xxs
                else -> CircularProgressBarSize.Xxl
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> CircularProgressBarView.Default
                "Secondary" -> CircularProgressBarView.Secondary
                "Accent" -> CircularProgressBarView.Accent
                "Gradient" -> CircularProgressBarView.Gradient
                "Info" -> CircularProgressBarView.Info
                "Negative" -> CircularProgressBarView.Negative
                "Positive" -> CircularProgressBarView.Positive
                "Warning" -> CircularProgressBarView.Warning
                else -> CircularProgressBarView.Default
            },
        ).key
    }
}
