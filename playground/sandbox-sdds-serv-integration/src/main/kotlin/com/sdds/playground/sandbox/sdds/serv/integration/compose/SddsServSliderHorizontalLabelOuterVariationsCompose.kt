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
import com.sdds.serv.styles.slider.SliderHorizontalLabelOuter
import com.sdds.serv.styles.slider.ThumbS

internal object SddsServSliderHorizontalLabelOuterVariationsCompose : ComposeStyleProvider<String, SliderStyle>() {
    override val variations: Map<String, @Composable () -> SliderStyle> =
        mapOf(
            "L.Default" to { SliderHorizontalLabelOuter.L.Default.style() },
            "L.Accent" to { SliderHorizontalLabelOuter.L.Accent.style() },
            "L.Gradient" to { SliderHorizontalLabelOuter.L.Gradient.style() },
            "L.LimitLabelCenter.Default" to { SliderHorizontalLabelOuter.L.LimitLabelCenter.Default.style() },
            "L.LimitLabelCenter.Accent" to { SliderHorizontalLabelOuter.L.LimitLabelCenter.Accent.style() },
            "L.LimitLabelCenter.Gradient" to { SliderHorizontalLabelOuter.L.LimitLabelCenter.Gradient.style() },
            "L.LimitLabelCenter.ThumbS.Default" to { SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Default.style() },
            "L.LimitLabelCenter.ThumbS.Accent" to { SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Accent.style() },
            "L.LimitLabelCenter.ThumbS.Gradient" to { SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Gradient.style() },
            "L.ThumbS.Default" to { SliderHorizontalLabelOuter.L.ThumbS.Default.style() },
            "L.ThumbS.Accent" to { SliderHorizontalLabelOuter.L.ThumbS.Accent.style() },
            "L.ThumbS.Gradient" to { SliderHorizontalLabelOuter.L.ThumbS.Gradient.style() },
            "M.Default" to { SliderHorizontalLabelOuter.M.Default.style() },
            "M.Accent" to { SliderHorizontalLabelOuter.M.Accent.style() },
            "M.Gradient" to { SliderHorizontalLabelOuter.M.Gradient.style() },
            "M.LimitLabelCenter.Default" to { SliderHorizontalLabelOuter.M.LimitLabelCenter.Default.style() },
            "M.LimitLabelCenter.Accent" to { SliderHorizontalLabelOuter.M.LimitLabelCenter.Accent.style() },
            "M.LimitLabelCenter.Gradient" to { SliderHorizontalLabelOuter.M.LimitLabelCenter.Gradient.style() },
            "M.LimitLabelCenter.ThumbS.Default" to { SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Default.style() },
            "M.LimitLabelCenter.ThumbS.Accent" to { SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Accent.style() },
            "M.LimitLabelCenter.ThumbS.Gradient" to { SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Gradient.style() },
            "M.ThumbS.Default" to { SliderHorizontalLabelOuter.M.ThumbS.Default.style() },
            "M.ThumbS.Accent" to { SliderHorizontalLabelOuter.M.ThumbS.Accent.style() },
            "M.ThumbS.Gradient" to { SliderHorizontalLabelOuter.M.ThumbS.Gradient.style() },
            "S.Default" to { SliderHorizontalLabelOuter.S.Default.style() },
            "S.Accent" to { SliderHorizontalLabelOuter.S.Accent.style() },
            "S.Gradient" to { SliderHorizontalLabelOuter.S.Gradient.style() },
            "S.LimitLabelCenter.Default" to { SliderHorizontalLabelOuter.S.LimitLabelCenter.Default.style() },
            "S.LimitLabelCenter.Accent" to { SliderHorizontalLabelOuter.S.LimitLabelCenter.Accent.style() },
            "S.LimitLabelCenter.Gradient" to { SliderHorizontalLabelOuter.S.LimitLabelCenter.Gradient.style() },
            "S.LimitLabelCenter.ThumbS.Default" to { SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Default.style() },
            "S.LimitLabelCenter.ThumbS.Accent" to { SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Accent.style() },
            "S.LimitLabelCenter.ThumbS.Gradient" to { SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Gradient.style() },
            "S.ThumbS.Default" to { SliderHorizontalLabelOuter.S.ThumbS.Default.style() },
            "S.ThumbS.Accent" to { SliderHorizontalLabelOuter.S.ThumbS.Accent.style() },
            "S.ThumbS.Gradient" to { SliderHorizontalLabelOuter.S.ThumbS.Gradient.style() },
        )
}
