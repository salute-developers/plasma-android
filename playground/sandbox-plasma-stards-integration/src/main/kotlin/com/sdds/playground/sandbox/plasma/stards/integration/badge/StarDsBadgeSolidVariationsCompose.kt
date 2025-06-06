package com.sdds.playground.sandbox.plasma.stards.integration.badge

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.badge.Accent
import com.sdkit.star.designsystem.styles.badge.BadgeSolid
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
            "LDefault" to { BadgeSolid.L.Default.style() },
            "MDefault" to { BadgeSolid.M.Default.style() },
            "SDefault" to { BadgeSolid.S.Default.style() },
            "XsDefault" to { BadgeSolid.Xs.Default.style() },

            "LPilledDefault" to { BadgeSolid.L.Pilled.Default.style() },
            "MPilledDefault" to { BadgeSolid.M.Pilled.Default.style() },
            "SPilledDefault" to { BadgeSolid.S.Pilled.Default.style() },
            "XsPilledDefault" to { BadgeSolid.Xs.Pilled.Default.style() },

            "LAccent" to { BadgeSolid.L.Accent.style() },
            "MAccent" to { BadgeSolid.M.Accent.style() },
            "SAccent" to { BadgeSolid.S.Accent.style() },
            "XsAccent" to { BadgeSolid.Xs.Accent.style() },

            "LPilledAccent" to { BadgeSolid.L.Pilled.Accent.style() },
            "MPilledAccent" to { BadgeSolid.M.Pilled.Accent.style() },
            "SPilledAccent" to { BadgeSolid.S.Pilled.Accent.style() },
            "XsPilledAccent" to { BadgeSolid.Xs.Pilled.Accent.style() },

            "LPositive" to { BadgeSolid.L.Positive.style() },
            "MPositive" to { BadgeSolid.M.Positive.style() },
            "SPositive" to { BadgeSolid.S.Positive.style() },
            "XsPositive" to { BadgeSolid.Xs.Positive.style() },

            "LPilledPositive" to { BadgeSolid.L.Pilled.Positive.style() },
            "MPilledPositive" to { BadgeSolid.M.Pilled.Positive.style() },
            "SPilledPositive" to { BadgeSolid.S.Pilled.Positive.style() },
            "XsPilledPositive" to { BadgeSolid.Xs.Pilled.Positive.style() },

            "LNegative" to { BadgeSolid.L.Negative.style() },
            "MNegative" to { BadgeSolid.M.Negative.style() },
            "SNegative" to { BadgeSolid.S.Negative.style() },
            "XsNegative" to { BadgeSolid.Xs.Negative.style() },

            "LPilledNegative" to { BadgeSolid.L.Pilled.Negative.style() },
            "MPilledNegative" to { BadgeSolid.M.Pilled.Negative.style() },
            "SPilledNegative" to { BadgeSolid.S.Pilled.Negative.style() },
            "XsPilledPNegative" to { BadgeSolid.Xs.Pilled.Negative.style() },

            "LWarning" to { BadgeSolid.L.Warning.style() },
            "MWarning" to { BadgeSolid.M.Warning.style() },
            "SWarning" to { BadgeSolid.S.Warning.style() },
            "XsWarning" to { BadgeSolid.Xs.Warning.style() },

            "LPilledWarning" to { BadgeSolid.L.Pilled.Warning.style() },
            "MPilledWarning" to { BadgeSolid.M.Pilled.Warning.style() },
            "SPilledWarning" to { BadgeSolid.S.Pilled.Warning.style() },
            "XsPilledPWarning" to { BadgeSolid.Xs.Pilled.Warning.style() },

            "LDark" to { BadgeSolid.L.Dark.style() },
            "MDark" to { BadgeSolid.M.Dark.style() },
            "SDark" to { BadgeSolid.S.Dark.style() },
            "XsDark" to { BadgeSolid.Xs.Dark.style() },

            "LPilledDark" to { BadgeSolid.L.Pilled.Dark.style() },
            "MPilledDark" to { BadgeSolid.M.Pilled.Dark.style() },
            "SPilledDark" to { BadgeSolid.S.Pilled.Dark.style() },
            "XsPilledPDark" to { BadgeSolid.Xs.Pilled.Dark.style() },

            "LLight" to { BadgeSolid.L.Light.style() },
            "MLight" to { BadgeSolid.M.Light.style() },
            "SLight" to { BadgeSolid.S.Light.style() },
            "XsLight" to { BadgeSolid.Xs.Light.style() },

            "LPilledLight" to { BadgeSolid.L.Pilled.Light.style() },
            "MPilledLight" to { BadgeSolid.M.Pilled.Light.style() },
            "SPilledLight" to { BadgeSolid.S.Pilled.Light.style() },
            "XsPilledLight" to { BadgeSolid.Xs.Pilled.Light.style() },
        )
}
