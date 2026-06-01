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
import com.sdds.serv.styles.slider.LabelEnd
import com.sdds.serv.styles.slider.M
import com.sdds.serv.styles.slider.S
import com.sdds.serv.styles.slider.SliderStyles
import com.sdds.serv.styles.slider.SliderVerticalLabelInner
import com.sdds.serv.styles.slider.SliderVerticalLabelInnerLabelAlignment
import com.sdds.serv.styles.slider.SliderVerticalLabelInnerSize
import com.sdds.serv.styles.slider.SliderVerticalLabelInnerThumbSize
import com.sdds.serv.styles.slider.SliderVerticalLabelInnerView
import com.sdds.serv.styles.slider.ThumbS
import com.sdds.serv.styles.slider.resolve

internal object SddsServSliderVerticalLabelInnerVariationsCompose : ComposeStyleProvider<SliderStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
            Property.SingleChoiceProperty(name = "labelAlignment", value = "Start", variants = listOf("Start", "End")),
            Property.SingleChoiceProperty(name = "thumbSize", value = "Default", variants = listOf("Default", "S")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Gradient"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<SliderStyle>> =
        mapOf(
            "SliderVerticalLabelInner.L.Default" to ComposeStyleReference { SliderVerticalLabelInner.L.Default.style() },
            "SliderVerticalLabelInner.L.Accent" to ComposeStyleReference { SliderVerticalLabelInner.L.Accent.style() },
            "SliderVerticalLabelInner.L.Gradient" to ComposeStyleReference { SliderVerticalLabelInner.L.Gradient.style() },
            "SliderVerticalLabelInner.L.LabelEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelInner.L.LabelEnd.Default.style()
            },
            "SliderVerticalLabelInner.L.LabelEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelInner.L.LabelEnd.Accent.style()
            },
            "SliderVerticalLabelInner.L.LabelEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelInner.L.LabelEnd.Gradient.style()
            },
            "SliderVerticalLabelInner.L.LabelEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelInner.L.LabelEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelInner.L.LabelEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelInner.L.LabelEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelInner.L.LabelEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelInner.L.LabelEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelInner.L.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelInner.L.ThumbS.Default.style()
            },
            "SliderVerticalLabelInner.L.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelInner.L.ThumbS.Accent.style()
            },
            "SliderVerticalLabelInner.L.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelInner.L.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelInner.M.Default" to ComposeStyleReference { SliderVerticalLabelInner.M.Default.style() },
            "SliderVerticalLabelInner.M.Accent" to ComposeStyleReference { SliderVerticalLabelInner.M.Accent.style() },
            "SliderVerticalLabelInner.M.Gradient" to ComposeStyleReference { SliderVerticalLabelInner.M.Gradient.style() },
            "SliderVerticalLabelInner.M.LabelEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelInner.M.LabelEnd.Default.style()
            },
            "SliderVerticalLabelInner.M.LabelEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelInner.M.LabelEnd.Accent.style()
            },
            "SliderVerticalLabelInner.M.LabelEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelInner.M.LabelEnd.Gradient.style()
            },
            "SliderVerticalLabelInner.M.LabelEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelInner.M.LabelEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelInner.M.LabelEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelInner.M.LabelEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelInner.M.LabelEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelInner.M.LabelEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelInner.M.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelInner.M.ThumbS.Default.style()
            },
            "SliderVerticalLabelInner.M.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelInner.M.ThumbS.Accent.style()
            },
            "SliderVerticalLabelInner.M.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelInner.M.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelInner.S.Default" to ComposeStyleReference { SliderVerticalLabelInner.S.Default.style() },
            "SliderVerticalLabelInner.S.Accent" to ComposeStyleReference { SliderVerticalLabelInner.S.Accent.style() },
            "SliderVerticalLabelInner.S.Gradient" to ComposeStyleReference { SliderVerticalLabelInner.S.Gradient.style() },
            "SliderVerticalLabelInner.S.LabelEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelInner.S.LabelEnd.Default.style()
            },
            "SliderVerticalLabelInner.S.LabelEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelInner.S.LabelEnd.Accent.style()
            },
            "SliderVerticalLabelInner.S.LabelEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelInner.S.LabelEnd.Gradient.style()
            },
            "SliderVerticalLabelInner.S.LabelEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelInner.S.LabelEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelInner.S.LabelEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelInner.S.LabelEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelInner.S.LabelEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelInner.S.LabelEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelInner.S.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelInner.S.ThumbS.Default.style()
            },
            "SliderVerticalLabelInner.S.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelInner.S.ThumbS.Accent.style()
            },
            "SliderVerticalLabelInner.S.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelInner.S.ThumbS.Gradient.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SliderStyles.VerticalLabelInner.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> SliderVerticalLabelInnerSize.L
                "M" -> SliderVerticalLabelInnerSize.M
                "S" -> SliderVerticalLabelInnerSize.S
                else -> SliderVerticalLabelInnerSize.L
            },
            labelAlignment = when (bindings["labelAlignment"]?.toString()) {
                "Start" -> SliderVerticalLabelInnerLabelAlignment.Start
                "End" -> SliderVerticalLabelInnerLabelAlignment.End
                else -> SliderVerticalLabelInnerLabelAlignment.Start
            },
            thumbSize = when (bindings["thumbSize"]?.toString()) {
                "Default" -> SliderVerticalLabelInnerThumbSize.Default
                "S" -> SliderVerticalLabelInnerThumbSize.S
                else -> SliderVerticalLabelInnerThumbSize.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> SliderVerticalLabelInnerView.Default
                "Accent" -> SliderVerticalLabelInnerView.Accent
                "Gradient" -> SliderVerticalLabelInnerView.Gradient
                else -> SliderVerticalLabelInnerView.Default
            },
        ).key
    }
}
