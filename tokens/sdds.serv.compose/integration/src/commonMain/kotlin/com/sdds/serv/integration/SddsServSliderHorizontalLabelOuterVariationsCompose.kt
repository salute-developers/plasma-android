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
import com.sdds.serv.styles.slider.SliderHorizontalLabelOuter
import com.sdds.serv.styles.slider.SliderHorizontalLabelOuterLimitLabelAlignment
import com.sdds.serv.styles.slider.SliderHorizontalLabelOuterSize
import com.sdds.serv.styles.slider.SliderHorizontalLabelOuterThumbSize
import com.sdds.serv.styles.slider.SliderHorizontalLabelOuterView
import com.sdds.serv.styles.slider.SliderStyles
import com.sdds.serv.styles.slider.ThumbS
import com.sdds.serv.styles.slider.resolve

internal object SddsServSliderHorizontalLabelOuterVariationsCompose : ComposeStyleProvider<SliderStyle>() {
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
            "SliderHorizontalLabelOuter.L.Default" to ComposeStyleReference { SliderHorizontalLabelOuter.L.Default.style() },
            "SliderHorizontalLabelOuter.L.Accent" to ComposeStyleReference { SliderHorizontalLabelOuter.L.Accent.style() },
            "SliderHorizontalLabelOuter.L.Gradient" to ComposeStyleReference { SliderHorizontalLabelOuter.L.Gradient.style() },
            "SliderHorizontalLabelOuter.L.LimitLabelCenter.Default" to ComposeStyleReference {
                SliderHorizontalLabelOuter.L.LimitLabelCenter.Default.style()
            },
            "SliderHorizontalLabelOuter.L.LimitLabelCenter.Accent" to ComposeStyleReference {
                SliderHorizontalLabelOuter.L.LimitLabelCenter.Accent.style()
            },
            "SliderHorizontalLabelOuter.L.LimitLabelCenter.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelOuter.L.LimitLabelCenter.Gradient.style()
            },
            "SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Default.style()
            },
            "SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelOuter.L.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelOuter.L.ThumbS.Default.style()
            },
            "SliderHorizontalLabelOuter.L.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelOuter.L.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelOuter.L.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelOuter.L.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelOuter.M.Default" to ComposeStyleReference { SliderHorizontalLabelOuter.M.Default.style() },
            "SliderHorizontalLabelOuter.M.Accent" to ComposeStyleReference { SliderHorizontalLabelOuter.M.Accent.style() },
            "SliderHorizontalLabelOuter.M.Gradient" to ComposeStyleReference { SliderHorizontalLabelOuter.M.Gradient.style() },
            "SliderHorizontalLabelOuter.M.LimitLabelCenter.Default" to ComposeStyleReference {
                SliderHorizontalLabelOuter.M.LimitLabelCenter.Default.style()
            },
            "SliderHorizontalLabelOuter.M.LimitLabelCenter.Accent" to ComposeStyleReference {
                SliderHorizontalLabelOuter.M.LimitLabelCenter.Accent.style()
            },
            "SliderHorizontalLabelOuter.M.LimitLabelCenter.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelOuter.M.LimitLabelCenter.Gradient.style()
            },
            "SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Default.style()
            },
            "SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelOuter.M.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelOuter.M.ThumbS.Default.style()
            },
            "SliderHorizontalLabelOuter.M.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelOuter.M.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelOuter.M.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelOuter.M.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelOuter.S.Default" to ComposeStyleReference { SliderHorizontalLabelOuter.S.Default.style() },
            "SliderHorizontalLabelOuter.S.Accent" to ComposeStyleReference { SliderHorizontalLabelOuter.S.Accent.style() },
            "SliderHorizontalLabelOuter.S.Gradient" to ComposeStyleReference { SliderHorizontalLabelOuter.S.Gradient.style() },
            "SliderHorizontalLabelOuter.S.LimitLabelCenter.Default" to ComposeStyleReference {
                SliderHorizontalLabelOuter.S.LimitLabelCenter.Default.style()
            },
            "SliderHorizontalLabelOuter.S.LimitLabelCenter.Accent" to ComposeStyleReference {
                SliderHorizontalLabelOuter.S.LimitLabelCenter.Accent.style()
            },
            "SliderHorizontalLabelOuter.S.LimitLabelCenter.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelOuter.S.LimitLabelCenter.Gradient.style()
            },
            "SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Default.style()
            },
            "SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Gradient.style()
            },
            "SliderHorizontalLabelOuter.S.ThumbS.Default" to ComposeStyleReference {
                SliderHorizontalLabelOuter.S.ThumbS.Default.style()
            },
            "SliderHorizontalLabelOuter.S.ThumbS.Accent" to ComposeStyleReference {
                SliderHorizontalLabelOuter.S.ThumbS.Accent.style()
            },
            "SliderHorizontalLabelOuter.S.ThumbS.Gradient" to ComposeStyleReference {
                SliderHorizontalLabelOuter.S.ThumbS.Gradient.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SliderStyles.HorizontalLabelOuter.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> SliderHorizontalLabelOuterSize.L
                "M" -> SliderHorizontalLabelOuterSize.M
                "S" -> SliderHorizontalLabelOuterSize.S
                else -> SliderHorizontalLabelOuterSize.L
            },
            limitLabelAlignment = when (bindings["limitLabelAlignment"]?.toString()) {
                "End" -> SliderHorizontalLabelOuterLimitLabelAlignment.End
                "Center" -> SliderHorizontalLabelOuterLimitLabelAlignment.Center
                else -> SliderHorizontalLabelOuterLimitLabelAlignment.End
            },
            thumbSize = when (bindings["thumbSize"]?.toString()) {
                "Default" -> SliderHorizontalLabelOuterThumbSize.Default
                "S" -> SliderHorizontalLabelOuterThumbSize.S
                else -> SliderHorizontalLabelOuterThumbSize.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> SliderHorizontalLabelOuterView.Default
                "Accent" -> SliderHorizontalLabelOuterView.Accent
                "Gradient" -> SliderHorizontalLabelOuterView.Gradient
                else -> SliderHorizontalLabelOuterView.Default
            },
        ).key
    }
}
