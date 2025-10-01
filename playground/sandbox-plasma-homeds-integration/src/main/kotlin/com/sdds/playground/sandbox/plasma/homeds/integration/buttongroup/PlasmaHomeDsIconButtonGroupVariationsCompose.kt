package com.sdds.playground.sandbox.plasma.homeds.integration.buttongroup

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

internal object PlasmaHomeDsIconButtonGroupVariationsCompose : ComposeStyleProvider<String, ButtonGroupStyle>() {

    override val variations: Map<String, @Composable () -> ButtonGroupStyle> =
        mapOf(
            "XsWidePilled" to { IconButtonGroup.Xs.Wide.Pilled.style() },
            "XsWideSegmented" to { IconButtonGroup.Xs.Wide.Segmented.style() },
            "XsDensePilled" to { IconButtonGroup.Xs.Dense.Pilled.style() },
            "XsDenseSegmented" to { IconButtonGroup.Xs.Dense.Segmented.style() },
            "XsNoGapPilled" to { IconButtonGroup.Xs.NoGap.Pilled.style() },
            "XsNoGapSegmented" to { IconButtonGroup.Xs.NoGap.Segmented.style() },

            "SWidePilled" to { IconButtonGroup.S.Wide.Pilled.style() },
            "SWideSegmented" to { IconButtonGroup.S.Wide.Segmented.style() },
            "SDensePilled" to { IconButtonGroup.S.Dense.Pilled.style() },
            "SDenseSegmented" to { IconButtonGroup.S.Dense.Segmented.style() },
            "SNoGapPilled" to { IconButtonGroup.S.NoGap.Pilled.style() },
            "SNoGapSegmented" to { IconButtonGroup.S.NoGap.Segmented.style() },

            "MWidePilled" to { IconButtonGroup.M.Wide.Pilled.style() },
            "MWideSegmented" to { IconButtonGroup.M.Wide.Segmented.style() },
            "MDensePilled" to { IconButtonGroup.M.Dense.Pilled.style() },
            "MDenseSegmented" to { IconButtonGroup.M.Dense.Segmented.style() },
            "MNoGapPilled" to { IconButtonGroup.M.NoGap.Pilled.style() },
            "MNoGapSegmented" to { IconButtonGroup.M.NoGap.Segmented.style() },

            "LWidePilled" to { IconButtonGroup.L.Wide.Pilled.style() },
            "LWideSegmented" to { IconButtonGroup.L.Wide.Segmented.style() },
            "LDensePilled" to { IconButtonGroup.L.Dense.Pilled.style() },
            "LDenseSegmented" to { IconButtonGroup.L.Dense.Segmented.style() },
            "LNoGapPilled" to { IconButtonGroup.L.NoGap.Pilled.style() },
            "LNoGapSegmented" to { IconButtonGroup.L.NoGap.Segmented.style() },
        )
}
