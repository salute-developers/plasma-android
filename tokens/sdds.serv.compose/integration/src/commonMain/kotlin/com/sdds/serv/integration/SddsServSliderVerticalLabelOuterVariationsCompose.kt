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
import com.sdds.serv.styles.slider.AlignmentEnd
import com.sdds.serv.styles.slider.Default
import com.sdds.serv.styles.slider.Gradient
import com.sdds.serv.styles.slider.L
import com.sdds.serv.styles.slider.LabelEnd
import com.sdds.serv.styles.slider.M
import com.sdds.serv.styles.slider.S
import com.sdds.serv.styles.slider.SliderStyles
import com.sdds.serv.styles.slider.SliderVerticalLabelOuter
import com.sdds.serv.styles.slider.SliderVerticalLabelOuterAlignment
import com.sdds.serv.styles.slider.SliderVerticalLabelOuterLabelAlignment
import com.sdds.serv.styles.slider.SliderVerticalLabelOuterSize
import com.sdds.serv.styles.slider.SliderVerticalLabelOuterThumbSize
import com.sdds.serv.styles.slider.SliderVerticalLabelOuterView
import com.sdds.serv.styles.slider.ThumbS
import com.sdds.serv.styles.slider.resolve

internal object SddsServSliderVerticalLabelOuterVariationsCompose : ComposeStyleProvider<SliderStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
            Property.SingleChoiceProperty(name = "alignment", value = "Start", variants = listOf("Start", "End")),
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
            "SliderVerticalLabelOuter.L.Default" to ComposeStyleReference { SliderVerticalLabelOuter.L.Default.style() },
            "SliderVerticalLabelOuter.L.Accent" to ComposeStyleReference { SliderVerticalLabelOuter.L.Accent.style() },
            "SliderVerticalLabelOuter.L.Gradient" to ComposeStyleReference { SliderVerticalLabelOuter.L.Gradient.style() },
            "SliderVerticalLabelOuter.L.AlignmentEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.Default.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.Accent.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.Gradient.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Default.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Accent.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Gradient.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.L.LabelEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.LabelEnd.Default.style()
            },
            "SliderVerticalLabelOuter.L.LabelEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.LabelEnd.Accent.style()
            },
            "SliderVerticalLabelOuter.L.LabelEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.LabelEnd.Gradient.style()
            },
            "SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.L.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.L.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.L.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.L.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.M.Default" to ComposeStyleReference { SliderVerticalLabelOuter.M.Default.style() },
            "SliderVerticalLabelOuter.M.Accent" to ComposeStyleReference { SliderVerticalLabelOuter.M.Accent.style() },
            "SliderVerticalLabelOuter.M.Gradient" to ComposeStyleReference { SliderVerticalLabelOuter.M.Gradient.style() },
            "SliderVerticalLabelOuter.M.AlignmentEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.Default.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.Accent.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.Gradient.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Default.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Accent.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Gradient.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.M.LabelEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.LabelEnd.Default.style()
            },
            "SliderVerticalLabelOuter.M.LabelEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.LabelEnd.Accent.style()
            },
            "SliderVerticalLabelOuter.M.LabelEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.LabelEnd.Gradient.style()
            },
            "SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.M.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.M.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.M.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.M.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.S.Default" to ComposeStyleReference { SliderVerticalLabelOuter.S.Default.style() },
            "SliderVerticalLabelOuter.S.Accent" to ComposeStyleReference { SliderVerticalLabelOuter.S.Accent.style() },
            "SliderVerticalLabelOuter.S.Gradient" to ComposeStyleReference { SliderVerticalLabelOuter.S.Gradient.style() },
            "SliderVerticalLabelOuter.S.AlignmentEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.Default.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.Accent.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.Gradient.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Default.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Accent.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Gradient.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.S.LabelEnd.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.LabelEnd.Default.style()
            },
            "SliderVerticalLabelOuter.S.LabelEnd.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.LabelEnd.Accent.style()
            },
            "SliderVerticalLabelOuter.S.LabelEnd.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.LabelEnd.Gradient.style()
            },
            "SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Gradient.style()
            },
            "SliderVerticalLabelOuter.S.ThumbS.Default" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.ThumbS.Default.style()
            },
            "SliderVerticalLabelOuter.S.ThumbS.Accent" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.ThumbS.Accent.style()
            },
            "SliderVerticalLabelOuter.S.ThumbS.Gradient" to ComposeStyleReference {
                SliderVerticalLabelOuter.S.ThumbS.Gradient.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SliderStyles.VerticalLabelOuter.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> SliderVerticalLabelOuterSize.L
                "M" -> SliderVerticalLabelOuterSize.M
                "S" -> SliderVerticalLabelOuterSize.S
                else -> SliderVerticalLabelOuterSize.L
            },
            alignment = when (bindings["alignment"]?.toString()) {
                "Start" -> SliderVerticalLabelOuterAlignment.Start
                "End" -> SliderVerticalLabelOuterAlignment.End
                else -> SliderVerticalLabelOuterAlignment.Start
            },
            labelAlignment = when (bindings["labelAlignment"]?.toString()) {
                "Start" -> SliderVerticalLabelOuterLabelAlignment.Start
                "End" -> SliderVerticalLabelOuterLabelAlignment.End
                else -> SliderVerticalLabelOuterLabelAlignment.Start
            },
            thumbSize = when (bindings["thumbSize"]?.toString()) {
                "Default" -> SliderVerticalLabelOuterThumbSize.Default
                "S" -> SliderVerticalLabelOuterThumbSize.S
                else -> SliderVerticalLabelOuterThumbSize.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> SliderVerticalLabelOuterView.Default
                "Accent" -> SliderVerticalLabelOuterView.Accent
                "Gradient" -> SliderVerticalLabelOuterView.Gradient
                else -> SliderVerticalLabelOuterView.Default
            },
        ).key
    }
}
