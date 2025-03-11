package com.sdds.playground.sandbox.plasma.stards.integration.badge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeSolid
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.badge.Accent
import com.sdkit.star.designsystem.styles.badge.Dark
import com.sdkit.star.designsystem.styles.badge.Default
import com.sdkit.star.designsystem.styles.badge.L
import com.sdkit.star.designsystem.styles.badge.Light
import com.sdkit.star.designsystem.styles.badge.M
import com.sdkit.star.designsystem.styles.badge.Negative
import com.sdkit.star.designsystem.styles.badge.Pilled
import com.sdkit.star.designsystem.styles.badge.Positive
import com.sdkit.star.designsystem.styles.badge.S
import com.sdkit.star.designsystem.styles.badge.Warning
import com.sdkit.star.designsystem.styles.badge.Xs

internal object StarDsBadgeSolidVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "BadgeSolidLDefault" to { BadgeSolid.L.Default.style() },
            "BadgeSolidMDefault" to { BadgeSolid.M.Default.style() },
            "BadgeSolidSDefault" to { BadgeSolid.S.Default.style() },
            "BadgeSolidXsDefault" to { BadgeSolid.Xs.Default.style() },

            "BadgeSolidLPilledDefault" to { BadgeSolid.L.Pilled.Default.style() },
            "BadgeSolidMPilledDefault" to { BadgeSolid.M.Pilled.Default.style() },
            "BadgeSolidSPilledDefault" to { BadgeSolid.S.Pilled.Default.style() },
            "BadgeSolidXsPilledDefault" to { BadgeSolid.Xs.Pilled.Default.style() },

            "BadgeSolidLAccent" to { BadgeSolid.L.Accent.style() },
            "BadgeSolidMAccent" to { BadgeSolid.M.Accent.style() },
            "BadgeSolidSAccent" to { BadgeSolid.S.Accent.style() },
            "BadgeSolidXsAccent" to { BadgeSolid.Xs.Accent.style() },

            "BadgeSolidLPilledAccent" to { BadgeSolid.L.Pilled.Accent.style() },
            "BadgeSolidMPilledAccent" to { BadgeSolid.M.Pilled.Accent.style() },
            "BadgeSolidSPilledAccent" to { BadgeSolid.S.Pilled.Accent.style() },
            "BadgeSolidXsPilledAccent" to { BadgeSolid.Xs.Pilled.Accent.style() },

            "BadgeSolidLPositive" to { BadgeSolid.L.Positive.style() },
            "BadgeSolidMPositive" to { BadgeSolid.M.Positive.style() },
            "BadgeSolidSPositive" to { BadgeSolid.S.Positive.style() },
            "BadgeSolidXsPositive" to { BadgeSolid.Xs.Positive.style() },

            "BadgeSolidLPilledPositive" to { BadgeSolid.L.Pilled.Positive.style() },
            "BadgeSolidMPilledPositive" to { BadgeSolid.M.Pilled.Positive.style() },
            "BadgeSolidSPilledPositive" to { BadgeSolid.S.Pilled.Positive.style() },
            "BadgeSolidXsPilledPositive" to { BadgeSolid.Xs.Pilled.Positive.style() },

            "BadgeSolidLNegative" to { BadgeSolid.L.Negative.style() },
            "BadgeSolidMNegative" to { BadgeSolid.M.Negative.style() },
            "BadgeSolidSNegative" to { BadgeSolid.S.Negative.style() },
            "BadgeSolidXsNegative" to { BadgeSolid.Xs.Negative.style() },

            "BadgeSolidLPilledNegative" to { BadgeSolid.L.Pilled.Negative.style() },
            "BadgeSolidMPilledNegative" to { BadgeSolid.M.Pilled.Negative.style() },
            "BadgeSolidSPilledNegative" to { BadgeSolid.S.Pilled.Negative.style() },
            "BadgeSolidXsPilledPNegative" to { BadgeSolid.Xs.Pilled.Negative.style() },

            "BadgeSolidLWarning" to { BadgeSolid.L.Warning.style() },
            "BadgeSolidMWarning" to { BadgeSolid.M.Warning.style() },
            "BadgeSolidSWarning" to { BadgeSolid.S.Warning.style() },
            "BadgeSolidXsWarning" to { BadgeSolid.Xs.Warning.style() },

            "BadgeSolidLPilledWarning" to { BadgeSolid.L.Pilled.Warning.style() },
            "BadgeSolidMPilledWarning" to { BadgeSolid.M.Pilled.Warning.style() },
            "BadgeSolidSPilledWarning" to { BadgeSolid.S.Pilled.Warning.style() },
            "BadgeSolidXsPilledPWarning" to { BadgeSolid.Xs.Pilled.Warning.style() },

            "BadgeSolidLDark" to { BadgeSolid.L.Dark.style() },
            "BadgeSolidMDark" to { BadgeSolid.M.Dark.style() },
            "BadgeSolidSDark" to { BadgeSolid.S.Dark.style() },
            "BadgeSolidXsDark" to { BadgeSolid.Xs.Dark.style() },

            "BadgeSolidLPilledDark" to { BadgeSolid.L.Pilled.Dark.style() },
            "BadgeSolidMPilledDark" to { BadgeSolid.M.Pilled.Dark.style() },
            "BadgeSolidSPilledDark" to { BadgeSolid.S.Pilled.Dark.style() },
            "BadgeSolidXsPilledPDark" to { BadgeSolid.Xs.Pilled.Dark.style() },

            "BadgeSolidLLight" to { BadgeSolid.L.Light.style() },
            "BadgeSolidMLight" to { BadgeSolid.M.Light.style() },
            "BadgeSolidSLight" to { BadgeSolid.S.Light.style() },
            "BadgeSolidXsLight" to { BadgeSolid.Xs.Light.style() },

            "BadgeSolidLPilledLight" to { BadgeSolid.L.Pilled.Light.style() },
            "BadgeSolidMPilledLight" to { BadgeSolid.M.Pilled.Light.style() },
            "BadgeSolidSPilledLight" to { BadgeSolid.S.Pilled.Light.style() },
            "BadgeSolidXsPilledLight" to { BadgeSolid.Xs.Pilled.Light.style() },
        )
}
