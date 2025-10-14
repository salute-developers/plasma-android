package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.buttongroup.Dense
import com.sdds.plasma.homeds.styles.buttongroup.IconButtonGroup
import com.sdds.plasma.homeds.styles.buttongroup.L
import com.sdds.plasma.homeds.styles.buttongroup.M
import com.sdds.plasma.homeds.styles.buttongroup.NoGap
import com.sdds.plasma.homeds.styles.buttongroup.Pilled
import com.sdds.plasma.homeds.styles.buttongroup.S
import com.sdds.plasma.homeds.styles.buttongroup.Segmented
import com.sdds.plasma.homeds.styles.buttongroup.Wide
import com.sdds.plasma.homeds.styles.buttongroup.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsIconButtonGroupVariationsCompose : ComposeStyleProvider<String, ButtonGroupStyle>() {
    override val variations: Map<String, @Composable () -> ButtonGroupStyle> =
        mapOf(
            "Xs" to { IconButtonGroup.Xs.style() },
            "Xs.Wide" to { IconButtonGroup.Xs.Wide.style() },
            "Xs.Wide.Pilled" to { IconButtonGroup.Xs.Wide.Pilled.style() },
            "Xs.Wide.Segmented" to { IconButtonGroup.Xs.Wide.Segmented.style() },
            "Xs.Dense" to { IconButtonGroup.Xs.Dense.style() },
            "Xs.Dense.Pilled" to { IconButtonGroup.Xs.Dense.Pilled.style() },
            "Xs.Dense.Segmented" to { IconButtonGroup.Xs.Dense.Segmented.style() },
            "Xs.NoGap" to { IconButtonGroup.Xs.NoGap.style() },
            "Xs.NoGap.Pilled" to { IconButtonGroup.Xs.NoGap.Pilled.style() },
            "Xs.NoGap.Segmented" to { IconButtonGroup.Xs.NoGap.Segmented.style() },
            "S" to { IconButtonGroup.S.style() },
            "S.Wide" to { IconButtonGroup.S.Wide.style() },
            "S.Wide.Pilled" to { IconButtonGroup.S.Wide.Pilled.style() },
            "S.Wide.Segmented" to { IconButtonGroup.S.Wide.Segmented.style() },
            "S.Dense" to { IconButtonGroup.S.Dense.style() },
            "S.Dense.Pilled" to { IconButtonGroup.S.Dense.Pilled.style() },
            "S.Dense.Segmented" to { IconButtonGroup.S.Dense.Segmented.style() },
            "S.NoGap" to { IconButtonGroup.S.NoGap.style() },
            "S.NoGap.Pilled" to { IconButtonGroup.S.NoGap.Pilled.style() },
            "S.NoGap.Segmented" to { IconButtonGroup.S.NoGap.Segmented.style() },
            "M" to { IconButtonGroup.M.style() },
            "M.Wide" to { IconButtonGroup.M.Wide.style() },
            "M.Wide.Pilled" to { IconButtonGroup.M.Wide.Pilled.style() },
            "M.Wide.Segmented" to { IconButtonGroup.M.Wide.Segmented.style() },
            "M.Dense" to { IconButtonGroup.M.Dense.style() },
            "M.Dense.Pilled" to { IconButtonGroup.M.Dense.Pilled.style() },
            "M.Dense.Segmented" to { IconButtonGroup.M.Dense.Segmented.style() },
            "M.NoGap" to { IconButtonGroup.M.NoGap.style() },
            "M.NoGap.Pilled" to { IconButtonGroup.M.NoGap.Pilled.style() },
            "M.NoGap.Segmented" to { IconButtonGroup.M.NoGap.Segmented.style() },
            "L" to { IconButtonGroup.L.style() },
            "L.Wide" to { IconButtonGroup.L.Wide.style() },
            "L.Wide.Pilled" to { IconButtonGroup.L.Wide.Pilled.style() },
            "L.Wide.Segmented" to { IconButtonGroup.L.Wide.Segmented.style() },
            "L.Dense" to { IconButtonGroup.L.Dense.style() },
            "L.Dense.Pilled" to { IconButtonGroup.L.Dense.Pilled.style() },
            "L.Dense.Segmented" to { IconButtonGroup.L.Dense.Segmented.style() },
            "L.NoGap" to { IconButtonGroup.L.NoGap.style() },
            "L.NoGap.Pilled" to { IconButtonGroup.L.NoGap.Pilled.style() },
            "L.NoGap.Segmented" to { IconButtonGroup.L.NoGap.Segmented.style() },
        )
}
