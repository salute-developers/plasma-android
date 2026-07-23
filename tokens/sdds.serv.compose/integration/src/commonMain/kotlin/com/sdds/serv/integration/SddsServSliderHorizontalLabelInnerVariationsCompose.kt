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
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.slider.Accent
import com.sdds.serv.styles.slider.Default
import com.sdds.serv.styles.slider.Gradient
import com.sdds.serv.styles.slider.L
import com.sdds.serv.styles.slider.LimitLabelCenter
import com.sdds.serv.styles.slider.M
import com.sdds.serv.styles.slider.S
import com.sdds.serv.styles.slider.SliderHorizontalLabelInner
import com.sdds.serv.styles.slider.SliderHorizontalLabelInnerLimitLabelAlignment
import com.sdds.serv.styles.slider.SliderHorizontalLabelInnerSize
import com.sdds.serv.styles.slider.SliderHorizontalLabelInnerThumbSize
import com.sdds.serv.styles.slider.SliderHorizontalLabelInnerView
import com.sdds.serv.styles.slider.SliderStyles
import com.sdds.serv.styles.slider.ThumbS
import com.sdds.serv.styles.slider.resolve

internal object SddsServSliderHorizontalLabelInnerVariationsCompose : ComposeStyleProvider<SliderStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
            Property.SingleChoiceProperty(
                name = "limitLabelAlignment",
                value = "End",
                variants = listOf("End", "Center"),
            ),
            Property.SingleChoiceProperty(name = "thumbSize", value = "Default", variants = listOf("Default", "S")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Gradient"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<SliderStyle>> =
        mapOf(
            "SliderHorizontalLabelInner.L.Default" to ComposeStyleReference { SliderHorizontalLabelInner.L.Default.style() },
            "SliderHorizontalLabelInner.L.Accent" to ComposeStyleReference { SliderHorizontalLabelInner.L.Accent.style() },
            "SliderHorizontalLabelInner.L.Gradient" to ComposeStyleReference { SliderHorizontalLabelInner.L.Gradient.style() },
            "SliderHorizontalLabelInner.L.LimitLabelCenter.Default" to ComposeStyleReference {
                SliderHorizontalLabelInner.L.LimitLabelCenter.Default.style()
            },
            "SliderHorizontalLabelInner.L.LimitLabelCenter.Accent" to ComposeStyleReference {
                SliderHorizontalLabelInner.L.LimitLabelCenter.Accent.style()
            },
            "SliderHorizontalLabelInner.L.LimitLabelCenter.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelInner.L.LimitLabelCenter.Gradient.style()
            },
            "SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Default.style()
            },
            "SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelInner.L.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelInner.L.ThumbS.Default.style()
            },
            "SliderHorizontalLabelInner.L.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelInner.L.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelInner.L.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelInner.L.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelInner.M.Default" to ComposeStyleReference { SliderHorizontalLabelInner.M.Default.style() },
            "SliderHorizontalLabelInner.M.Accent" to ComposeStyleReference { SliderHorizontalLabelInner.M.Accent.style() },
            "SliderHorizontalLabelInner.M.Gradient" to ComposeStyleReference { SliderHorizontalLabelInner.M.Gradient.style() },
            "SliderHorizontalLabelInner.M.LimitLabelCenter.Default" to ComposeStyleReference {
                SliderHorizontalLabelInner.M.LimitLabelCenter.Default.style()
            },
            "SliderHorizontalLabelInner.M.LimitLabelCenter.Accent" to ComposeStyleReference {
                SliderHorizontalLabelInner.M.LimitLabelCenter.Accent.style()
            },
            "SliderHorizontalLabelInner.M.LimitLabelCenter.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelInner.M.LimitLabelCenter.Gradient.style()
            },
            "SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Default.style()
            },
            "SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelInner.M.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelInner.M.ThumbS.Default.style()
            },
            "SliderHorizontalLabelInner.M.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelInner.M.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelInner.M.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelInner.M.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelInner.S.Default" to ComposeStyleReference { SliderHorizontalLabelInner.S.Default.style() },
            "SliderHorizontalLabelInner.S.Accent" to ComposeStyleReference { SliderHorizontalLabelInner.S.Accent.style() },
            "SliderHorizontalLabelInner.S.Gradient" to ComposeStyleReference { SliderHorizontalLabelInner.S.Gradient.style() },
            "SliderHorizontalLabelInner.S.LimitLabelCenter.Default" to ComposeStyleReference {
                SliderHorizontalLabelInner.S.LimitLabelCenter.Default.style()
            },
            "SliderHorizontalLabelInner.S.LimitLabelCenter.Accent" to ComposeStyleReference {
                SliderHorizontalLabelInner.S.LimitLabelCenter.Accent.style()
            },
            "SliderHorizontalLabelInner.S.LimitLabelCenter.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelInner.S.LimitLabelCenter.Gradient.style()
            },
            "SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Default.style()
            },
            "SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelInner.S.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelInner.S.ThumbS.Default.style()
            },
            "SliderHorizontalLabelInner.S.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelInner.S.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelInner.S.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelInner.S.ThumbS.Gradient.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SliderStyles.HorizontalLabelInner.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> SliderHorizontalLabelInnerSize.L
                "M" -> SliderHorizontalLabelInnerSize.M
                "S" -> SliderHorizontalLabelInnerSize.S
                else -> SliderHorizontalLabelInnerSize.L
            },
            limitLabelAlignment = when (bindings["limitLabelAlignment"]?.toString()) {
                "End" -> SliderHorizontalLabelInnerLimitLabelAlignment.End
                "Center" -> SliderHorizontalLabelInnerLimitLabelAlignment.Center
                else -> SliderHorizontalLabelInnerLimitLabelAlignment.End
            },
            thumbSize = when (bindings["thumbSize"]?.toString()) {
                "Default" -> SliderHorizontalLabelInnerThumbSize.Default
                "S" -> SliderHorizontalLabelInnerThumbSize.S
                else -> SliderHorizontalLabelInnerThumbSize.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> SliderHorizontalLabelInnerView.Default
                "Accent" -> SliderHorizontalLabelInnerView.Accent
                "Gradient" -> SliderHorizontalLabelInnerView.Gradient
                else -> SliderHorizontalLabelInnerView.Default
            },
        ).key
    }
}
