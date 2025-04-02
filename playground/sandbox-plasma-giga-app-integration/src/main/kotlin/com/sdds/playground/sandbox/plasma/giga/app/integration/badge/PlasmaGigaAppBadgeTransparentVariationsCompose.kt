package com.sdds.playground.sandbox.plasma.giga.app.integration.badge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.badge.Accent
import com.sdds.plasma.giga.app.styles.badge.BadgeTransparent
import com.sdds.plasma.giga.app.styles.badge.Dark
import com.sdds.plasma.giga.app.styles.badge.Default
import com.sdds.plasma.giga.app.styles.badge.L
import com.sdds.plasma.giga.app.styles.badge.Light
import com.sdds.plasma.giga.app.styles.badge.M
import com.sdds.plasma.giga.app.styles.badge.Negative
import com.sdds.plasma.giga.app.styles.badge.Pilled
import com.sdds.plasma.giga.app.styles.badge.Positive
import com.sdds.plasma.giga.app.styles.badge.S
import com.sdds.plasma.giga.app.styles.badge.Warning
import com.sdds.plasma.giga.app.styles.badge.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppBadgeTransparentVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "BadgeTransparentLDefault" to { BadgeTransparent.L.Default.style() },
            "BadgeTransparentMDefault" to { BadgeTransparent.M.Default.style() },
            "BadgeTransparentSDefault" to { BadgeTransparent.S.Default.style() },
            "BadgeTransparentXsDefault" to { BadgeTransparent.Xs.Default.style() },

            "BadgeTransparentLPilledDefault" to { BadgeTransparent.L.Pilled.Default.style() },
            "BadgeTransparentMPilledDefault" to { BadgeTransparent.M.Pilled.Default.style() },
            "BadgeTransparentSPilledDefault" to { BadgeTransparent.S.Pilled.Default.style() },
            "BadgeTransparentXsPilledDefault" to { BadgeTransparent.Xs.Pilled.Default.style() },

            "BadgeTransparentLAccent" to { BadgeTransparent.L.Accent.style() },
            "BadgeTransparentMAccent" to { BadgeTransparent.M.Accent.style() },
            "BadgeTransparentSAccent" to { BadgeTransparent.S.Accent.style() },
            "BadgeTransparentXsAccent" to { BadgeTransparent.Xs.Accent.style() },

            "BadgeTransparentLPilledAccent" to { BadgeTransparent.L.Pilled.Accent.style() },
            "BadgeTransparentMPilledAccent" to { BadgeTransparent.M.Pilled.Accent.style() },
            "BadgeTransparentSPilledAccent" to { BadgeTransparent.S.Pilled.Accent.style() },
            "BadgeTransparentXsPilledAccent" to { BadgeTransparent.Xs.Pilled.Accent.style() },

            "BadgeTransparentLPositive" to { BadgeTransparent.L.Positive.style() },
            "BadgeTransparentMPositive" to { BadgeTransparent.M.Positive.style() },
            "BadgeTransparentSPositive" to { BadgeTransparent.S.Positive.style() },
            "BadgeTransparentXsPositive" to { BadgeTransparent.Xs.Positive.style() },

            "BadgeTransparentLPilledPositive" to { BadgeTransparent.L.Pilled.Positive.style() },
            "BadgeTransparentMPilledPositive" to { BadgeTransparent.M.Pilled.Positive.style() },
            "BadgeTransparentSPilledPositive" to { BadgeTransparent.S.Pilled.Positive.style() },
            "BadgeTransparentXsPilledPositive" to { BadgeTransparent.Xs.Pilled.Positive.style() },

            "BadgeTransparentLNegative" to { BadgeTransparent.L.Negative.style() },
            "BadgeTransparentMNegative" to { BadgeTransparent.M.Negative.style() },
            "BadgeTransparentSNegative" to { BadgeTransparent.S.Negative.style() },
            "BadgeTransparentXsNegative" to { BadgeTransparent.Xs.Negative.style() },

            "BadgeTransparentLPilledNegative" to { BadgeTransparent.L.Pilled.Negative.style() },
            "BadgeTransparentMPilledNegative" to { BadgeTransparent.M.Pilled.Negative.style() },
            "BadgeTransparentSPilledNegative" to { BadgeTransparent.S.Pilled.Negative.style() },
            "BadgeTransparentXsPilledPNegative" to { BadgeTransparent.Xs.Pilled.Negative.style() },

            "BadgeTransparentLWarning" to { BadgeTransparent.L.Warning.style() },
            "BadgeTransparentMWarning" to { BadgeTransparent.M.Warning.style() },
            "BadgeTransparentSWarning" to { BadgeTransparent.S.Warning.style() },
            "BadgeTransparentXsWarning" to { BadgeTransparent.Xs.Warning.style() },

            "BadgeTransparentLPilledWarning" to { BadgeTransparent.L.Pilled.Warning.style() },
            "BadgeTransparentMPilledWarning" to { BadgeTransparent.M.Pilled.Warning.style() },
            "BadgeTransparentSPilledWarning" to { BadgeTransparent.S.Pilled.Warning.style() },
            "BadgeTransparentXsPilledPWarning" to { BadgeTransparent.Xs.Pilled.Warning.style() },

            "BadgeTransparentLDark" to { BadgeTransparent.L.Dark.style() },
            "BadgeTransparentMDark" to { BadgeTransparent.M.Dark.style() },
            "BadgeTransparentSDark" to { BadgeTransparent.S.Dark.style() },
            "BadgeTransparentXsDark" to { BadgeTransparent.Xs.Dark.style() },

            "BadgeTransparentLPilledDark" to { BadgeTransparent.L.Pilled.Dark.style() },
            "BadgeTransparentMPilledDark" to { BadgeTransparent.M.Pilled.Dark.style() },
            "BadgeTransparentSPilledDark" to { BadgeTransparent.S.Pilled.Dark.style() },
            "BadgeTransparentXsPilledPDark" to { BadgeTransparent.Xs.Pilled.Dark.style() },

            "BadgeTransparentLLight" to { BadgeTransparent.L.Light.style() },
            "BadgeTransparentMLight" to { BadgeTransparent.M.Light.style() },
            "BadgeTransparentSLight" to { BadgeTransparent.S.Light.style() },
            "BadgeTransparentXsLight" to { BadgeTransparent.Xs.Light.style() },

            "BadgeTransparentLPilledLight" to { BadgeTransparent.L.Pilled.Light.style() },
            "BadgeTransparentMPilledLight" to { BadgeTransparent.M.Pilled.Light.style() },
            "BadgeTransparentSPilledLight" to { BadgeTransparent.S.Pilled.Light.style() },
            "BadgeTransparentXsPilledLight" to { BadgeTransparent.Xs.Pilled.Light.style() },
        )
}
