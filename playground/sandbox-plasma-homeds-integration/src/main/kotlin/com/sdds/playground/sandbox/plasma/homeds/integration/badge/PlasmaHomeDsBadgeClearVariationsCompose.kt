package com.sdds.playground.sandbox.plasma.homeds.integration.badge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.badge.Accent
import com.sdds.plasma.homeds.styles.badge.BadgeClear
import com.sdds.plasma.homeds.styles.badge.Dark
import com.sdds.plasma.homeds.styles.badge.Default
import com.sdds.plasma.homeds.styles.badge.L
import com.sdds.plasma.homeds.styles.badge.Light
import com.sdds.plasma.homeds.styles.badge.M
import com.sdds.plasma.homeds.styles.badge.Negative
import com.sdds.plasma.homeds.styles.badge.Pilled
import com.sdds.plasma.homeds.styles.badge.Positive
import com.sdds.plasma.homeds.styles.badge.S
import com.sdds.plasma.homeds.styles.badge.Warning
import com.sdds.plasma.homeds.styles.badge.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomeDsBadgeClearVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "BadgeClearLDefault" to { BadgeClear.L.Default.style() },
            "BadgeClearMDefault" to { BadgeClear.M.Default.style() },
            "BadgeClearSDefault" to { BadgeClear.S.Default.style() },
            "BadgeClearXsDefault" to { BadgeClear.Xs.Default.style() },

            "BadgeClearLPilledDefault" to { BadgeClear.L.Pilled.Default.style() },
            "BadgeClearMPilledDefault" to { BadgeClear.M.Pilled.Default.style() },
            "BadgeClearSPilledDefault" to { BadgeClear.S.Pilled.Default.style() },
            "BadgeClearXsPilledDefault" to { BadgeClear.Xs.Pilled.Default.style() },

            "BadgeClearLAccent" to { BadgeClear.L.Accent.style() },
            "BadgeClearMAccent" to { BadgeClear.M.Accent.style() },
            "BadgeClearSAccent" to { BadgeClear.S.Accent.style() },
            "BadgeClearXsAccent" to { BadgeClear.Xs.Accent.style() },

            "BadgeClearLPilledAccent" to { BadgeClear.L.Pilled.Accent.style() },
            "BadgeClearMPilledAccent" to { BadgeClear.M.Pilled.Accent.style() },
            "BadgeClearSPilledAccent" to { BadgeClear.S.Pilled.Accent.style() },
            "BadgeClearXsPilledAccent" to { BadgeClear.Xs.Pilled.Accent.style() },

            "BadgeClearLPositive" to { BadgeClear.L.Positive.style() },
            "BadgeClearMPositive" to { BadgeClear.M.Positive.style() },
            "BadgeClearSPositive" to { BadgeClear.S.Positive.style() },
            "BadgeClearXsPositive" to { BadgeClear.Xs.Positive.style() },

            "BadgeClearLPilledPositive" to { BadgeClear.L.Pilled.Positive.style() },
            "BadgeClearMPilledPositive" to { BadgeClear.M.Pilled.Positive.style() },
            "BadgeClearSPilledPositive" to { BadgeClear.S.Pilled.Positive.style() },
            "BadgeClearXsPilledPositive" to { BadgeClear.Xs.Pilled.Positive.style() },

            "BadgeClearLNegative" to { BadgeClear.L.Negative.style() },
            "BadgeClearMNegative" to { BadgeClear.M.Negative.style() },
            "BadgeClearSNegative" to { BadgeClear.S.Negative.style() },
            "BadgeClearXsNegative" to { BadgeClear.Xs.Negative.style() },

            "BadgeClearLPilledNegative" to { BadgeClear.L.Pilled.Negative.style() },
            "BadgeClearMPilledNegative" to { BadgeClear.M.Pilled.Negative.style() },
            "BadgeClearSPilledNegative" to { BadgeClear.S.Pilled.Negative.style() },
            "BadgeClearXsPilledPNegative" to { BadgeClear.Xs.Pilled.Negative.style() },

            "BadgeClearLWarning" to { BadgeClear.L.Warning.style() },
            "BadgeClearMWarning" to { BadgeClear.M.Warning.style() },
            "BadgeClearSWarning" to { BadgeClear.S.Warning.style() },
            "BadgeClearXsWarning" to { BadgeClear.Xs.Warning.style() },

            "BadgeClearLPilledWarning" to { BadgeClear.L.Pilled.Warning.style() },
            "BadgeClearMPilledWarning" to { BadgeClear.M.Pilled.Warning.style() },
            "BadgeClearSPilledWarning" to { BadgeClear.S.Pilled.Warning.style() },
            "BadgeClearXsPilledPWarning" to { BadgeClear.Xs.Pilled.Warning.style() },

            "BadgeClearLDark" to { BadgeClear.L.Dark.style() },
            "BadgeClearMDark" to { BadgeClear.M.Dark.style() },
            "BadgeClearSDark" to { BadgeClear.S.Dark.style() },
            "BadgeClearXsDark" to { BadgeClear.Xs.Dark.style() },

            "BadgeClearLPilledDark" to { BadgeClear.L.Pilled.Dark.style() },
            "BadgeClearMPilledDark" to { BadgeClear.M.Pilled.Dark.style() },
            "BadgeClearSPilledDark" to { BadgeClear.S.Pilled.Dark.style() },
            "BadgeClearXsPilledPDark" to { BadgeClear.Xs.Pilled.Dark.style() },

            "BadgeClearLLight" to { BadgeClear.L.Light.style() },
            "BadgeClearMLight" to { BadgeClear.M.Light.style() },
            "BadgeClearSLight" to { BadgeClear.S.Light.style() },
            "BadgeClearXsLight" to { BadgeClear.Xs.Light.style() },

            "BadgeClearLPilledLight" to { BadgeClear.L.Pilled.Light.style() },
            "BadgeClearMPilledLight" to { BadgeClear.M.Pilled.Light.style() },
            "BadgeClearSPilledLight" to { BadgeClear.S.Pilled.Light.style() },
            "BadgeClearXsPilledLight" to { BadgeClear.Xs.Pilled.Light.style() },
        )
}
