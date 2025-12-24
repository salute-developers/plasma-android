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
import com.sdds.serv.styles.slider.SliderVerticalLabelInner
import com.sdds.serv.styles.slider.ThumbS

internal object SddsServSliderVerticalLabelInnerVariationsCompose : ComposeStyleProvider<String, SliderStyle>() {
    override val variations: Map<String, @Composable () -> SliderStyle> =
        mapOf(
            "L.Default" to { SliderVerticalLabelInner.L.Default.style() },
            "L.Accent" to { SliderVerticalLabelInner.L.Accent.style() },
            "L.Gradient" to { SliderVerticalLabelInner.L.Gradient.style() },
            "L.LabelEnd.Default" to { SliderVerticalLabelInner.L.LabelEnd.Default.style() },
            "L.LabelEnd.Accent" to { SliderVerticalLabelInner.L.LabelEnd.Accent.style() },
            "L.LabelEnd.Gradient" to { SliderVerticalLabelInner.L.LabelEnd.Gradient.style() },
            "L.LabelEnd.ThumbS.Default" to { SliderVerticalLabelInner.L.LabelEnd.ThumbS.Default.style() },
            "L.LabelEnd.ThumbS.Accent" to { SliderVerticalLabelInner.L.LabelEnd.ThumbS.Accent.style() },
            "L.LabelEnd.ThumbS.Gradient" to { SliderVerticalLabelInner.L.LabelEnd.ThumbS.Gradient.style() },
            "L.ThumbS.Default" to { SliderVerticalLabelInner.L.ThumbS.Default.style() },
            "L.ThumbS.Accent" to { SliderVerticalLabelInner.L.ThumbS.Accent.style() },
            "L.ThumbS.Gradient" to { SliderVerticalLabelInner.L.ThumbS.Gradient.style() },
            "M.Default" to { SliderVerticalLabelInner.M.Default.style() },
            "M.Accent" to { SliderVerticalLabelInner.M.Accent.style() },
            "M.Gradient" to { SliderVerticalLabelInner.M.Gradient.style() },
            "M.LabelEnd.Default" to { SliderVerticalLabelInner.M.LabelEnd.Default.style() },
            "M.LabelEnd.Accent" to { SliderVerticalLabelInner.M.LabelEnd.Accent.style() },
            "M.LabelEnd.Gradient" to { SliderVerticalLabelInner.M.LabelEnd.Gradient.style() },
            "M.LabelEnd.ThumbS.Default" to { SliderVerticalLabelInner.M.LabelEnd.ThumbS.Default.style() },
            "M.LabelEnd.ThumbS.Accent" to { SliderVerticalLabelInner.M.LabelEnd.ThumbS.Accent.style() },
            "M.LabelEnd.ThumbS.Gradient" to { SliderVerticalLabelInner.M.LabelEnd.ThumbS.Gradient.style() },
            "M.ThumbS.Default" to { SliderVerticalLabelInner.M.ThumbS.Default.style() },
            "M.ThumbS.Accent" to { SliderVerticalLabelInner.M.ThumbS.Accent.style() },
            "M.ThumbS.Gradient" to { SliderVerticalLabelInner.M.ThumbS.Gradient.style() },
            "S.Default" to { SliderVerticalLabelInner.S.Default.style() },
            "S.Accent" to { SliderVerticalLabelInner.S.Accent.style() },
            "S.Gradient" to { SliderVerticalLabelInner.S.Gradient.style() },
            "S.LabelEnd.Default" to { SliderVerticalLabelInner.S.LabelEnd.Default.style() },
            "S.LabelEnd.Accent" to { SliderVerticalLabelInner.S.LabelEnd.Accent.style() },
            "S.LabelEnd.Gradient" to { SliderVerticalLabelInner.S.LabelEnd.Gradient.style() },
            "S.LabelEnd.ThumbS.Default" to { SliderVerticalLabelInner.S.LabelEnd.ThumbS.Default.style() },
            "S.LabelEnd.ThumbS.Accent" to { SliderVerticalLabelInner.S.LabelEnd.ThumbS.Accent.style() },
            "S.LabelEnd.ThumbS.Gradient" to { SliderVerticalLabelInner.S.LabelEnd.ThumbS.Gradient.style() },
            "S.ThumbS.Default" to { SliderVerticalLabelInner.S.ThumbS.Default.style() },
            "S.ThumbS.Accent" to { SliderVerticalLabelInner.S.ThumbS.Accent.style() },
            "S.ThumbS.Gradient" to { SliderVerticalLabelInner.S.ThumbS.Gradient.style() },
        )
}
