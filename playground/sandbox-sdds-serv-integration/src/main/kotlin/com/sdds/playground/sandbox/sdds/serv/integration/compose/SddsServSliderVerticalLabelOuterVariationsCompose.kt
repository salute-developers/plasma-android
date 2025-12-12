package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.slider.Accent
import com.sdds.serv.styles.slider.Default
import com.sdds.serv.styles.slider.Gradient
import com.sdds.serv.styles.slider.L
import com.sdds.serv.styles.slider.LabelEnd
import com.sdds.serv.styles.slider.M
import com.sdds.serv.styles.slider.S
import com.sdds.serv.styles.slider.SliderAlignmentEnd
import com.sdds.serv.styles.slider.SliderVerticalLabelOuter
import com.sdds.serv.styles.slider.ThumbS

internal object SddsServSliderVerticalLabelOuterVariationsCompose : ComposeStyleProvider<String, SliderStyle>() {
    override val variations: Map<String, @Composable () -> SliderStyle> =
        mapOf(
            "L.Default" to { SliderVerticalLabelOuter.L.Default.style() },
            "L.Accent" to { SliderVerticalLabelOuter.L.Accent.style() },
            "L.Gradient" to { SliderVerticalLabelOuter.L.Gradient.style() },
            "L.AlignmentEnd.Default" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.Default.style() },
            "L.AlignmentEnd.Accent" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.Accent.style() },
            "L.AlignmentEnd.Gradient" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.Gradient.style() },
            "L.AlignmentEnd.LabelEnd.Default" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.LabelEnd.Default.style() },
            "L.AlignmentEnd.LabelEnd.Accent" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.LabelEnd.Accent.style() },
            "L.AlignmentEnd.LabelEnd.Gradient" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.LabelEnd.Gradient.style() },
            "L.AlignmentEnd.LabelEnd.ThumbS.Default" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.LabelEnd.ThumbS.Default.style() },
            "L.AlignmentEnd.LabelEnd.ThumbS.Accent" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.LabelEnd.ThumbS.Accent.style() },
            "L.AlignmentEnd.LabelEnd.ThumbS.Gradient" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.LabelEnd.ThumbS.Gradient.style() },
            "L.AlignmentEnd.ThumbS.Default" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.ThumbS.Default.style() },
            "L.AlignmentEnd.ThumbS.Accent" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.ThumbS.Accent.style() },
            "L.AlignmentEnd.ThumbS.Gradient" to { SliderVerticalLabelOuter.L.SliderAlignmentEnd.ThumbS.Gradient.style() },
            "L.LabelEnd.Default" to { SliderVerticalLabelOuter.L.LabelEnd.Default.style() },
            "L.LabelEnd.Accent" to { SliderVerticalLabelOuter.L.LabelEnd.Accent.style() },
            "L.LabelEnd.Gradient" to { SliderVerticalLabelOuter.L.LabelEnd.Gradient.style() },
            "L.LabelEnd.ThumbS.Default" to { SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Default.style() },
            "L.LabelEnd.ThumbS.Accent" to { SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Accent.style() },
            "L.LabelEnd.ThumbS.Gradient" to { SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Gradient.style() },
            "L.ThumbS.Default" to { SliderVerticalLabelOuter.L.ThumbS.Default.style() },
            "L.ThumbS.Accent" to { SliderVerticalLabelOuter.L.ThumbS.Accent.style() },
            "L.ThumbS.Gradient" to { SliderVerticalLabelOuter.L.ThumbS.Gradient.style() },
            "M.Default" to { SliderVerticalLabelOuter.M.Default.style() },
            "M.Accent" to { SliderVerticalLabelOuter.M.Accent.style() },
            "M.Gradient" to { SliderVerticalLabelOuter.M.Gradient.style() },
            "M.AlignmentEnd.Default" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.Default.style() },
            "M.AlignmentEnd.Accent" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.Accent.style() },
            "M.AlignmentEnd.Gradient" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.Gradient.style() },
            "M.AlignmentEnd.LabelEnd.Default" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.LabelEnd.Default.style() },
            "M.AlignmentEnd.LabelEnd.Accent" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.LabelEnd.Accent.style() },
            "M.AlignmentEnd.LabelEnd.Gradient" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.LabelEnd.Gradient.style() },
            "M.AlignmentEnd.LabelEnd.ThumbS.Default" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.LabelEnd.ThumbS.Default.style() },
            "M.AlignmentEnd.LabelEnd.ThumbS.Accent" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.LabelEnd.ThumbS.Accent.style() },
            "M.AlignmentEnd.LabelEnd.ThumbS.Gradient" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.LabelEnd.ThumbS.Gradient.style() },
            "M.AlignmentEnd.ThumbS.Default" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.ThumbS.Default.style() },
            "M.AlignmentEnd.ThumbS.Accent" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.ThumbS.Accent.style() },
            "M.AlignmentEnd.ThumbS.Gradient" to { SliderVerticalLabelOuter.M.SliderAlignmentEnd.ThumbS.Gradient.style() },
            "M.LabelEnd.Default" to { SliderVerticalLabelOuter.M.LabelEnd.Default.style() },
            "M.LabelEnd.Accent" to { SliderVerticalLabelOuter.M.LabelEnd.Accent.style() },
            "M.LabelEnd.Gradient" to { SliderVerticalLabelOuter.M.LabelEnd.Gradient.style() },
            "M.LabelEnd.ThumbS.Default" to { SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Default.style() },
            "M.LabelEnd.ThumbS.Accent" to { SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Accent.style() },
            "M.LabelEnd.ThumbS.Gradient" to { SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Gradient.style() },
            "M.ThumbS.Default" to { SliderVerticalLabelOuter.M.ThumbS.Default.style() },
            "M.ThumbS.Accent" to { SliderVerticalLabelOuter.M.ThumbS.Accent.style() },
            "M.ThumbS.Gradient" to { SliderVerticalLabelOuter.M.ThumbS.Gradient.style() },
            "S.Default" to { SliderVerticalLabelOuter.S.Default.style() },
            "S.Accent" to { SliderVerticalLabelOuter.S.Accent.style() },
            "S.Gradient" to { SliderVerticalLabelOuter.S.Gradient.style() },
            "S.AlignmentEnd.Default" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.Default.style() },
            "S.AlignmentEnd.Accent" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.Accent.style() },
            "S.AlignmentEnd.Gradient" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.Gradient.style() },
            "S.AlignmentEnd.LabelEnd.Default" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.LabelEnd.Default.style() },
            "S.AlignmentEnd.LabelEnd.Accent" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.LabelEnd.Accent.style() },
            "S.AlignmentEnd.LabelEnd.Gradient" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.LabelEnd.Gradient.style() },
            "S.AlignmentEnd.LabelEnd.ThumbS.Default" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.LabelEnd.ThumbS.Default.style() },
            "S.AlignmentEnd.LabelEnd.ThumbS.Accent" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.LabelEnd.ThumbS.Accent.style() },
            "S.AlignmentEnd.LabelEnd.ThumbS.Gradient" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.LabelEnd.ThumbS.Gradient.style() },
            "S.AlignmentEnd.ThumbS.Default" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.ThumbS.Default.style() },
            "S.AlignmentEnd.ThumbS.Accent" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.ThumbS.Accent.style() },
            "S.AlignmentEnd.ThumbS.Gradient" to { SliderVerticalLabelOuter.S.SliderAlignmentEnd.ThumbS.Gradient.style() },
            "S.LabelEnd.Default" to { SliderVerticalLabelOuter.S.LabelEnd.Default.style() },
            "S.LabelEnd.Accent" to { SliderVerticalLabelOuter.S.LabelEnd.Accent.style() },
            "S.LabelEnd.Gradient" to { SliderVerticalLabelOuter.S.LabelEnd.Gradient.style() },
            "S.LabelEnd.ThumbS.Default" to { SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Default.style() },
            "S.LabelEnd.ThumbS.Accent" to { SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Accent.style() },
            "S.LabelEnd.ThumbS.Gradient" to { SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Gradient.style() },
            "S.ThumbS.Default" to { SliderVerticalLabelOuter.S.ThumbS.Default.style() },
            "S.ThumbS.Accent" to { SliderVerticalLabelOuter.S.ThumbS.Accent.style() },
            "S.ThumbS.Gradient" to { SliderVerticalLabelOuter.S.ThumbS.Gradient.style() },
        )
}
