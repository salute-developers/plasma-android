package com.sdds.playground.sandbox.plasma.homeds.integration.buttongroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.homeds.styles.buttongroup.Default
import com.sdds.plasma.homeds.styles.buttongroup.Dense
import com.sdds.plasma.homeds.styles.buttongroup.M
import com.sdds.plasma.homeds.styles.buttongroup.NoGap
import com.sdds.plasma.homeds.styles.buttongroup.S
import com.sdds.plasma.homeds.styles.buttongroup.Segmented
import com.sdds.plasma.homeds.styles.buttongroup.Wide
import com.sdds.plasma.homeds.styles.buttongroup.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsBasicButtonGroupVariationsCompose : ComposeStyleProvider<String, ButtonGroupStyle>() {

    override val variations: Map<String, @Composable () -> ButtonGroupStyle> =
        mapOf(
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

        )
}
