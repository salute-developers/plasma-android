package com.sdds.playground.sandbox.plasma.homeds.integration.compose

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

internal object PlasmaHomedsBasicButtonGroupVariationsCompose : ComposeStyleProvider<String, ButtonGroupStyle>() {
    override val variations: Map<String, @Composable () -> ButtonGroupStyle> =
        mapOf(
            "Xs" to { BasicButtonGroup.Xs.style() },
            "Xs.Wide" to { BasicButtonGroup.Xs.Wide.style() },
            "Xs.Wide.Default" to { BasicButtonGroup.Xs.Wide.Default.style() },
            "Xs.Wide.Segmented" to { BasicButtonGroup.Xs.Wide.Segmented.style() },
            "Xs.Dense" to { BasicButtonGroup.Xs.Dense.style() },
            "Xs.Dense.Default" to { BasicButtonGroup.Xs.Dense.Default.style() },
            "Xs.Dense.Segmented" to { BasicButtonGroup.Xs.Dense.Segmented.style() },
            "Xs.NoGap" to { BasicButtonGroup.Xs.NoGap.style() },
            "Xs.NoGap.Default" to { BasicButtonGroup.Xs.NoGap.Default.style() },
            "Xs.NoGap.Segmented" to { BasicButtonGroup.Xs.NoGap.Segmented.style() },
            "S" to { BasicButtonGroup.S.style() },
            "S.Wide" to { BasicButtonGroup.S.Wide.style() },
            "S.Wide.Default" to { BasicButtonGroup.S.Wide.Default.style() },
            "S.Wide.Segmented" to { BasicButtonGroup.S.Wide.Segmented.style() },
            "S.Dense" to { BasicButtonGroup.S.Dense.style() },
            "S.Dense.Default" to { BasicButtonGroup.S.Dense.Default.style() },
            "S.Dense.Segmented" to { BasicButtonGroup.S.Dense.Segmented.style() },
            "S.NoGap" to { BasicButtonGroup.S.NoGap.style() },
            "S.NoGap.Default" to { BasicButtonGroup.S.NoGap.Default.style() },
            "S.NoGap.Segmented" to { BasicButtonGroup.S.NoGap.Segmented.style() },
            "M" to { BasicButtonGroup.M.style() },
            "M.Wide" to { BasicButtonGroup.M.Wide.style() },
            "M.Wide.Default" to { BasicButtonGroup.M.Wide.Default.style() },
            "M.Wide.Segmented" to { BasicButtonGroup.M.Wide.Segmented.style() },
            "M.Dense" to { BasicButtonGroup.M.Dense.style() },
            "M.Dense.Default" to { BasicButtonGroup.M.Dense.Default.style() },
            "M.Dense.Segmented" to { BasicButtonGroup.M.Dense.Segmented.style() },
            "M.NoGap" to { BasicButtonGroup.M.NoGap.style() },
            "M.NoGap.Default" to { BasicButtonGroup.M.NoGap.Default.style() },
            "M.NoGap.Segmented" to { BasicButtonGroup.M.NoGap.Segmented.style() },
        )
}
