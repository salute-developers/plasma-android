package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.slider.Accent
import com.sdds.serv.styles.slider.Default
import com.sdds.serv.styles.slider.Gradient
import com.sdds.serv.styles.slider.L
import com.sdds.serv.styles.slider.LimitLabelCenter
import com.sdds.serv.styles.slider.M
import com.sdds.serv.styles.slider.S
import com.sdds.serv.styles.slider.SliderHorizontalLabelInner
import com.sdds.serv.styles.slider.ThumbS

internal object SddsServSliderHorizontalLabelInnerVariationsCompose : ComposeStyleProvider<String, SliderStyle>() {
    override val variations: Map<String, @Composable () -> SliderStyle> =
        mapOf(
            "L.Default" to { SliderHorizontalLabelInner.L.Default.style() },
            "L.Accent" to { SliderHorizontalLabelInner.L.Accent.style() },
            "L.Gradient" to { SliderHorizontalLabelInner.L.Gradient.style() },
            "L.LimitLabelCenter.Default" to { SliderHorizontalLabelInner.L.LimitLabelCenter.Default.style() },
            "L.LimitLabelCenter.Accent" to { SliderHorizontalLabelInner.L.LimitLabelCenter.Accent.style() },
            "L.LimitLabelCenter.Gradient" to { SliderHorizontalLabelInner.L.LimitLabelCenter.Gradient.style() },
            "L.LimitLabelCenter.ThumbS.Default" to { SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Default.style() },
            "L.LimitLabelCenter.ThumbS.Accent" to { SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Accent.style() },
            "L.LimitLabelCenter.ThumbS.Gradient" to { SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Gradient.style() },
            "L.ThumbS.Default" to { SliderHorizontalLabelInner.L.ThumbS.Default.style() },
            "L.ThumbS.Accent" to { SliderHorizontalLabelInner.L.ThumbS.Accent.style() },
            "L.ThumbS.Gradient" to { SliderHorizontalLabelInner.L.ThumbS.Gradient.style() },
            "M.Default" to { SliderHorizontalLabelInner.M.Default.style() },
            "M.Accent" to { SliderHorizontalLabelInner.M.Accent.style() },
            "M.Gradient" to { SliderHorizontalLabelInner.M.Gradient.style() },
            "M.LimitLabelCenter.Default" to { SliderHorizontalLabelInner.M.LimitLabelCenter.Default.style() },
            "M.LimitLabelCenter.Accent" to { SliderHorizontalLabelInner.M.LimitLabelCenter.Accent.style() },
            "M.LimitLabelCenter.Gradient" to { SliderHorizontalLabelInner.M.LimitLabelCenter.Gradient.style() },
            "M.LimitLabelCenter.ThumbS.Default" to { SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Default.style() },
            "M.LimitLabelCenter.ThumbS.Accent" to { SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Accent.style() },
            "M.LimitLabelCenter.ThumbS.Gradient" to { SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Gradient.style() },
            "M.ThumbS.Default" to { SliderHorizontalLabelInner.M.ThumbS.Default.style() },
            "M.ThumbS.Accent" to { SliderHorizontalLabelInner.M.ThumbS.Accent.style() },
            "M.ThumbS.Gradient" to { SliderHorizontalLabelInner.M.ThumbS.Gradient.style() },
            "S.Default" to { SliderHorizontalLabelInner.S.Default.style() },
            "S.Accent" to { SliderHorizontalLabelInner.S.Accent.style() },
            "S.Gradient" to { SliderHorizontalLabelInner.S.Gradient.style() },
            "S.LimitLabelCenter.Default" to { SliderHorizontalLabelInner.S.LimitLabelCenter.Default.style() },
            "S.LimitLabelCenter.Accent" to { SliderHorizontalLabelInner.S.LimitLabelCenter.Accent.style() },
            "S.LimitLabelCenter.Gradient" to { SliderHorizontalLabelInner.S.LimitLabelCenter.Gradient.style() },
            "S.LimitLabelCenter.ThumbS.Default" to { SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Default.style() },
            "S.LimitLabelCenter.ThumbS.Accent" to { SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Accent.style() },
            "S.LimitLabelCenter.ThumbS.Gradient" to { SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Gradient.style() },
            "S.ThumbS.Default" to { SliderHorizontalLabelInner.S.ThumbS.Default.style() },
            "S.ThumbS.Accent" to { SliderHorizontalLabelInner.S.ThumbS.Accent.style() },
            "S.ThumbS.Gradient" to { SliderHorizontalLabelInner.S.ThumbS.Gradient.style() },
        )
}
