package com.sdds.playground.sandbox.plasma.sd.service.integration.buttongroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.sd.service.styles.buttongroup.Default
import com.sdds.plasma.sd.service.styles.buttongroup.Dense
import com.sdds.plasma.sd.service.styles.buttongroup.L
import com.sdds.plasma.sd.service.styles.buttongroup.M
import com.sdds.plasma.sd.service.styles.buttongroup.NoGap
import com.sdds.plasma.sd.service.styles.buttongroup.S
import com.sdds.plasma.sd.service.styles.buttongroup.Segmented
import com.sdds.plasma.sd.service.styles.buttongroup.Wide
import com.sdds.plasma.sd.service.styles.buttongroup.Xs
import com.sdds.plasma.sd.service.styles.buttongroup.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceBasicButtonGroupVariationsCompose : ComposeStyleProvider<String, ButtonGroupStyle>() {

    override val variations: Map<String, @Composable () -> ButtonGroupStyle> =
        mapOf(
            "XxsWideDefault" to { BasicButtonGroup.Xxs.Wide.Default.style() },
            "XxsWideSegmented" to { BasicButtonGroup.Xxs.Wide.Segmented.style() },
            "XxsDenseDefault" to { BasicButtonGroup.Xxs.Dense.Default.style() },
            "XxsDenseSegmented" to { BasicButtonGroup.Xxs.Dense.Segmented.style() },
            "XxsNoGapDefault" to { BasicButtonGroup.Xxs.NoGap.Default.style() },
            "XxsNoGapSegmented" to { BasicButtonGroup.Xxs.NoGap.Segmented.style() },

            "XsWideDefault" to { BasicButtonGroup.Xs.Wide.Default.style() },
            "XsWideSegmented" to { BasicButtonGroup.Xs.Wide.Segmented.style() },
            "XsDenseDefault" to { BasicButtonGroup.Xs.Dense.Default.style() },
            "XsDenseSegmented" to { BasicButtonGroup.Xs.Dense.Segmented.style() },
            "XsNoGapDefault" to { BasicButtonGroup.Xs.NoGap.Default.style() },
            "XsNoGapSegmented" to { BasicButtonGroup.Xs.NoGap.Segmented.style() },

            "SWideDefault" to { BasicButtonGroup.S.Wide.Default.style() },
            "SWideSegmented" to { BasicButtonGroup.S.Wide.Segmented.style() },
            "SDenseDefault" to { BasicButtonGroup.S.Dense.Default.style() },
            "SDenseSegmented" to { BasicButtonGroup.S.Dense.Segmented.style() },
            "SNoGapDefault" to { BasicButtonGroup.S.NoGap.Default.style() },
            "SNoGapSegmented" to { BasicButtonGroup.S.NoGap.Segmented.style() },

            "MWideDefault" to { BasicButtonGroup.M.Wide.Default.style() },
            "MWideSegmented" to { BasicButtonGroup.M.Wide.Segmented.style() },
            "MDenseDefault" to { BasicButtonGroup.M.Dense.Default.style() },
            "MDenseSegmented" to { BasicButtonGroup.M.Dense.Segmented.style() },
            "MNoGapDefault" to { BasicButtonGroup.M.NoGap.Default.style() },
            "MNoGapSegmented" to { BasicButtonGroup.M.NoGap.Segmented.style() },

            "LWideDefault" to { BasicButtonGroup.L.Wide.Default.style() },
            "LWideSegmented" to { BasicButtonGroup.L.Wide.Segmented.style() },
            "LDenseDefault" to { BasicButtonGroup.L.Dense.Default.style() },
            "LDenseSegmented" to { BasicButtonGroup.L.Dense.Segmented.style() },
            "LNoGapDefault" to { BasicButtonGroup.L.NoGap.Default.style() },
            "LNoGapSegmented" to { BasicButtonGroup.L.NoGap.Segmented.style() },
        )
}
