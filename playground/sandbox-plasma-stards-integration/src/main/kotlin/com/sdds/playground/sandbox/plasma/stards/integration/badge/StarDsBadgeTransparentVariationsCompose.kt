package com.sdds.playground.sandbox.plasma.stards.integration.badge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.badge.Accent
import com.sdkit.star.designsystem.styles.badge.BadgeTransparent
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

internal object StarDsBadgeTransparentVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "LDefault" to { BadgeTransparent.L.Default.style() },
            "MDefault" to { BadgeTransparent.M.Default.style() },
            "SDefault" to { BadgeTransparent.S.Default.style() },
            "XsDefault" to { BadgeTransparent.Xs.Default.style() },

            "LPilledDefault" to { BadgeTransparent.L.Pilled.Default.style() },
            "MPilledDefault" to { BadgeTransparent.M.Pilled.Default.style() },
            "SPilledDefault" to { BadgeTransparent.S.Pilled.Default.style() },
            "XsPilledDefault" to { BadgeTransparent.Xs.Pilled.Default.style() },

            "LAccent" to { BadgeTransparent.L.Accent.style() },
            "MAccent" to { BadgeTransparent.M.Accent.style() },
            "SAccent" to { BadgeTransparent.S.Accent.style() },
            "XsAccent" to { BadgeTransparent.Xs.Accent.style() },

            "LPilledAccent" to { BadgeTransparent.L.Pilled.Accent.style() },
            "MPilledAccent" to { BadgeTransparent.M.Pilled.Accent.style() },
            "SPilledAccent" to { BadgeTransparent.S.Pilled.Accent.style() },
            "XsPilledAccent" to { BadgeTransparent.Xs.Pilled.Accent.style() },

            "LPositive" to { BadgeTransparent.L.Positive.style() },
            "MPositive" to { BadgeTransparent.M.Positive.style() },
            "SPositive" to { BadgeTransparent.S.Positive.style() },
            "XsPositive" to { BadgeTransparent.Xs.Positive.style() },

            "LPilledPositive" to { BadgeTransparent.L.Pilled.Positive.style() },
            "MPilledPositive" to { BadgeTransparent.M.Pilled.Positive.style() },
            "SPilledPositive" to { BadgeTransparent.S.Pilled.Positive.style() },
            "XsPilledPositive" to { BadgeTransparent.Xs.Pilled.Positive.style() },

            "LNegative" to { BadgeTransparent.L.Negative.style() },
            "MNegative" to { BadgeTransparent.M.Negative.style() },
            "SNegative" to { BadgeTransparent.S.Negative.style() },
            "XsNegative" to { BadgeTransparent.Xs.Negative.style() },

            "LPilledNegative" to { BadgeTransparent.L.Pilled.Negative.style() },
            "MPilledNegative" to { BadgeTransparent.M.Pilled.Negative.style() },
            "SPilledNegative" to { BadgeTransparent.S.Pilled.Negative.style() },
            "XsPilledPNegative" to { BadgeTransparent.Xs.Pilled.Negative.style() },

            "LWarning" to { BadgeTransparent.L.Warning.style() },
            "MWarning" to { BadgeTransparent.M.Warning.style() },
            "SWarning" to { BadgeTransparent.S.Warning.style() },
            "XsWarning" to { BadgeTransparent.Xs.Warning.style() },

            "LPilledWarning" to { BadgeTransparent.L.Pilled.Warning.style() },
            "MPilledWarning" to { BadgeTransparent.M.Pilled.Warning.style() },
            "SPilledWarning" to { BadgeTransparent.S.Pilled.Warning.style() },
            "XsPilledPWarning" to { BadgeTransparent.Xs.Pilled.Warning.style() },

            "LDark" to { BadgeTransparent.L.Dark.style() },
            "MDark" to { BadgeTransparent.M.Dark.style() },
            "SDark" to { BadgeTransparent.S.Dark.style() },
            "XsDark" to { BadgeTransparent.Xs.Dark.style() },

            "LPilledDark" to { BadgeTransparent.L.Pilled.Dark.style() },
            "MPilledDark" to { BadgeTransparent.M.Pilled.Dark.style() },
            "SPilledDark" to { BadgeTransparent.S.Pilled.Dark.style() },
            "XsPilledPDark" to { BadgeTransparent.Xs.Pilled.Dark.style() },

            "LLight" to { BadgeTransparent.L.Light.style() },
            "MLight" to { BadgeTransparent.M.Light.style() },
            "SLight" to { BadgeTransparent.S.Light.style() },
            "XsLight" to { BadgeTransparent.Xs.Light.style() },

            "LPilledLight" to { BadgeTransparent.L.Pilled.Light.style() },
            "MPilledLight" to { BadgeTransparent.M.Pilled.Light.style() },
            "SPilledLight" to { BadgeTransparent.S.Pilled.Light.style() },
            "XsPilledLight" to { BadgeTransparent.Xs.Pilled.Light.style() },
        )
}
