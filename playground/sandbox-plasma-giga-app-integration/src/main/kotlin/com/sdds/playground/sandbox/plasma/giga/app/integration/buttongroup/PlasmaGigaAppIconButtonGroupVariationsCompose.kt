package com.sdds.playground.sandbox.plasma.giga.app.integration.buttongroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.buttongroup.Default
import com.sdds.plasma.giga.app.styles.buttongroup.Dense
import com.sdds.plasma.giga.app.styles.buttongroup.IconButtonGroup
import com.sdds.plasma.giga.app.styles.buttongroup.L
import com.sdds.plasma.giga.app.styles.buttongroup.M
import com.sdds.plasma.giga.app.styles.buttongroup.NoGap
import com.sdds.plasma.giga.app.styles.buttongroup.Pilled
import com.sdds.plasma.giga.app.styles.buttongroup.S
import com.sdds.plasma.giga.app.styles.buttongroup.Segmented
import com.sdds.plasma.giga.app.styles.buttongroup.Wide
import com.sdds.plasma.giga.app.styles.buttongroup.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppIconButtonGroupVariationsCompose : ComposeStyleProvider<String, ButtonGroupStyle>() {

    override val variations: Map<String, @Composable () -> ButtonGroupStyle> =
        mapOf(
            "XsWideDefault" to { IconButtonGroup.Xs.Wide.Default.style() },
            "XsWidePilled" to { IconButtonGroup.Xs.Wide.Pilled.style() },
            "XsWideSegmented" to { IconButtonGroup.Xs.Wide.Segmented.style() },
            "XsDenseDefault" to { IconButtonGroup.Xs.Dense.Default.style() },
            "XsDensePilled" to { IconButtonGroup.Xs.Dense.Pilled.style() },
            "XsDenseSegmented" to { IconButtonGroup.Xs.Dense.Segmented.style() },
            "XsNoGapDefault" to { IconButtonGroup.Xs.NoGap.Default.style() },
            "XsNoGapPilled" to { IconButtonGroup.Xs.NoGap.Pilled.style() },
            "XsNoGapSegmented" to { IconButtonGroup.Xs.NoGap.Segmented.style() },

            "SWideDefault" to { IconButtonGroup.S.Wide.Default.style() },
            "SWidePilled" to { IconButtonGroup.S.Wide.Pilled.style() },
            "SWideSegmented" to { IconButtonGroup.S.Wide.Segmented.style() },
            "SDenseDefault" to { IconButtonGroup.S.Dense.Default.style() },
            "SDensePilled" to { IconButtonGroup.S.Dense.Pilled.style() },
            "SDenseSegmented" to { IconButtonGroup.S.Dense.Segmented.style() },
            "SNoGapDefault" to { IconButtonGroup.S.NoGap.Default.style() },
            "SNoGapPilled" to { IconButtonGroup.S.NoGap.Pilled.style() },
            "SNoGapSegmented" to { IconButtonGroup.S.NoGap.Segmented.style() },

            "MWideDefault" to { IconButtonGroup.M.Wide.Default.style() },
            "MWidePilled" to { IconButtonGroup.M.Wide.Pilled.style() },
            "MWideSegmented" to { IconButtonGroup.M.Wide.Segmented.style() },
            "MDenseDefault" to { IconButtonGroup.M.Dense.Default.style() },
            "MDensePilled" to { IconButtonGroup.M.Dense.Pilled.style() },
            "MDenseSegmented" to { IconButtonGroup.M.Dense.Segmented.style() },
            "MNoGapDefault" to { IconButtonGroup.M.NoGap.Default.style() },
            "MNoGapPilled" to { IconButtonGroup.M.NoGap.Pilled.style() },
            "MNoGapSegmented" to { IconButtonGroup.M.NoGap.Segmented.style() },

            "LWideDefault" to { IconButtonGroup.L.Wide.Default.style() },
            "LWidePilled" to { IconButtonGroup.L.Wide.Pilled.style() },
            "LWideSegmented" to { IconButtonGroup.L.Wide.Segmented.style() },
            "LDenseDefault" to { IconButtonGroup.L.Dense.Default.style() },
            "LDensePilled" to { IconButtonGroup.L.Dense.Pilled.style() },
            "LDenseSegmented" to { IconButtonGroup.L.Dense.Segmented.style() },
            "LNoGapDefault" to { IconButtonGroup.L.NoGap.Default.style() },
            "LNoGapPilled" to { IconButtonGroup.L.NoGap.Pilled.style() },
            "LNoGapSegmented" to { IconButtonGroup.L.NoGap.Segmented.style() },
        )
}
