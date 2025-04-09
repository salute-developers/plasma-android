package com.sdds.playground.sandbox.stylessalute.integration.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.chipgroup.Accent
import com.sdds.stylessalute.styles.chipgroup.ChipGroupWide
import com.sdds.stylessalute.styles.chipgroup.Default
import com.sdds.stylessalute.styles.chipgroup.L
import com.sdds.stylessalute.styles.chipgroup.M
import com.sdds.stylessalute.styles.chipgroup.Pilled
import com.sdds.stylessalute.styles.chipgroup.S
import com.sdds.stylessalute.styles.chipgroup.Secondary
import com.sdds.stylessalute.styles.chipgroup.Xs

internal object StylesSaluteChipGroupWideVariationsCompose :
    ComposeStyleProvider<String, ChipGroupStyle>() {

    override val variations: Map<String, @Composable () -> ChipGroupStyle> =
        mapOf(
            "LDefault" to { ChipGroupWide.L.Default.style() },
            "MDefault" to { ChipGroupWide.M.Default.style() },
            "SDefault" to { ChipGroupWide.S.Default.style() },
            "XsDefault" to { ChipGroupWide.Xs.Default.style() },

            "LDefaultPilled" to { ChipGroupWide.L.Pilled.Default.style() },
            "MDefaultPilled" to { ChipGroupWide.M.Pilled.Default.style() },
            "SDefaultPilled" to { ChipGroupWide.S.Pilled.Default.style() },
            "XsDefaultPilled" to { ChipGroupWide.Xs.Pilled.Default.style() },

            "LSecondary" to { ChipGroupWide.L.Secondary.style() },
            "MSecondary" to { ChipGroupWide.M.Secondary.style() },
            "SSecondary" to { ChipGroupWide.S.Secondary.style() },
            "XsSecondary" to { ChipGroupWide.Xs.Secondary.style() },

            "LSecondaryPilled" to { ChipGroupWide.L.Pilled.Secondary.style() },
            "MSecondaryPilled" to { ChipGroupWide.M.Pilled.Secondary.style() },
            "SSecondaryPilled" to { ChipGroupWide.S.Pilled.Secondary.style() },
            "XsSecondaryPilled" to { ChipGroupWide.Xs.Pilled.Secondary.style() },

            "LAccent" to { ChipGroupWide.L.Accent.style() },
            "MAccent" to { ChipGroupWide.M.Accent.style() },
            "SAccent" to { ChipGroupWide.S.Accent.style() },
            "XsAccent" to { ChipGroupWide.Xs.Accent.style() },

            "LAccentPilled" to { ChipGroupWide.L.Pilled.Accent.style() },
            "MAccentPilled" to { ChipGroupWide.M.Pilled.Accent.style() },
            "SAccentPilled" to { ChipGroupWide.S.Pilled.Accent.style() },
            "XsAccentPilled" to { ChipGroupWide.Xs.Pilled.Accent.style() },
        )
}
