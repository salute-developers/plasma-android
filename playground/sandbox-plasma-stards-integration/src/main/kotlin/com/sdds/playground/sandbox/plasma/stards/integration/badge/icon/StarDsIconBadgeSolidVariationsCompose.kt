package com.sdds.playground.sandbox.plasma.stards.integration.badge.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.iconbadge.Accent
import com.sdkit.star.designsystem.styles.iconbadge.Dark
import com.sdkit.star.designsystem.styles.iconbadge.Default
import com.sdkit.star.designsystem.styles.iconbadge.IconBadgeSolid
import com.sdkit.star.designsystem.styles.iconbadge.L
import com.sdkit.star.designsystem.styles.iconbadge.Light
import com.sdkit.star.designsystem.styles.iconbadge.M
import com.sdkit.star.designsystem.styles.iconbadge.Negative
import com.sdkit.star.designsystem.styles.iconbadge.Pilled
import com.sdkit.star.designsystem.styles.iconbadge.Positive
import com.sdkit.star.designsystem.styles.iconbadge.S
import com.sdkit.star.designsystem.styles.iconbadge.Warning
import com.sdkit.star.designsystem.styles.iconbadge.Xs

internal object StarDsIconBadgeSolidVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "LDefault" to { IconBadgeSolid.L.Default.style() },
            "MDefault" to { IconBadgeSolid.M.Default.style() },
            "SDefault" to { IconBadgeSolid.S.Default.style() },
            "XsDefault" to { IconBadgeSolid.Xs.Default.style() },

            "LPilledDefault" to { IconBadgeSolid.L.Pilled.Default.style() },
            "MPilledDefault" to { IconBadgeSolid.M.Pilled.Default.style() },
            "SPilledDefault" to { IconBadgeSolid.S.Pilled.Default.style() },
            "XsPilledDefault" to { IconBadgeSolid.Xs.Pilled.Default.style() },

            "LAccent" to { IconBadgeSolid.L.Accent.style() },
            "MAccent" to { IconBadgeSolid.M.Accent.style() },
            "SAccent" to { IconBadgeSolid.S.Accent.style() },
            "XsAccent" to { IconBadgeSolid.Xs.Accent.style() },

            "LPilledAccent" to { IconBadgeSolid.L.Pilled.Accent.style() },
            "MPilledAccent" to { IconBadgeSolid.M.Pilled.Accent.style() },
            "SPilledAccent" to { IconBadgeSolid.S.Pilled.Accent.style() },
            "XsPilledAccent" to { IconBadgeSolid.Xs.Pilled.Accent.style() },

            "LPositive" to { IconBadgeSolid.L.Positive.style() },
            "MPositive" to { IconBadgeSolid.M.Positive.style() },
            "SPositive" to { IconBadgeSolid.S.Positive.style() },
            "XsPositive" to { IconBadgeSolid.Xs.Positive.style() },

            "LPilledPositive" to { IconBadgeSolid.L.Pilled.Positive.style() },
            "MPilledPositive" to { IconBadgeSolid.M.Pilled.Positive.style() },
            "SPilledPositive" to { IconBadgeSolid.S.Pilled.Positive.style() },
            "XsPilledPositive" to { IconBadgeSolid.Xs.Pilled.Positive.style() },

            "LNegative" to { IconBadgeSolid.L.Negative.style() },
            "MNegative" to { IconBadgeSolid.M.Negative.style() },
            "SNegative" to { IconBadgeSolid.S.Negative.style() },
            "XsNegative" to { IconBadgeSolid.Xs.Negative.style() },

            "LPilledNegative" to { IconBadgeSolid.L.Pilled.Negative.style() },
            "MPilledNegative" to { IconBadgeSolid.M.Pilled.Negative.style() },
            "SPilledNegative" to { IconBadgeSolid.S.Pilled.Negative.style() },
            "XsPilledNegative" to { IconBadgeSolid.Xs.Pilled.Negative.style() },

            "LWarning" to { IconBadgeSolid.L.Warning.style() },
            "MWarning" to { IconBadgeSolid.M.Warning.style() },
            "SWarning" to { IconBadgeSolid.S.Warning.style() },
            "XsWarning" to { IconBadgeSolid.Xs.Warning.style() },

            "LPilledWarning" to { IconBadgeSolid.L.Pilled.Warning.style() },
            "MPilledWarning" to { IconBadgeSolid.M.Pilled.Warning.style() },
            "SPilledWarning" to { IconBadgeSolid.S.Pilled.Warning.style() },
            "XsPilledWarning" to { IconBadgeSolid.Xs.Pilled.Warning.style() },

            "LDark" to { IconBadgeSolid.L.Dark.style() },
            "MDark" to { IconBadgeSolid.M.Dark.style() },
            "SDark" to { IconBadgeSolid.S.Dark.style() },
            "XsDark" to { IconBadgeSolid.Xs.Dark.style() },

            "LPilledDark" to { IconBadgeSolid.L.Pilled.Dark.style() },
            "MPilledDark" to { IconBadgeSolid.M.Pilled.Dark.style() },
            "SPilledDark" to { IconBadgeSolid.S.Pilled.Dark.style() },
            "XsPilledDark" to { IconBadgeSolid.Xs.Pilled.Dark.style() },

            "LLight" to { IconBadgeSolid.L.Light.style() },
            "MLight" to { IconBadgeSolid.M.Light.style() },
            "SLight" to { IconBadgeSolid.S.Light.style() },
            "XsLight" to { IconBadgeSolid.Xs.Light.style() },

            "LPilledLight" to { IconBadgeSolid.L.Pilled.Light.style() },
            "MPilledLight" to { IconBadgeSolid.M.Pilled.Light.style() },
            "SPilledLight" to { IconBadgeSolid.S.Pilled.Light.style() },
            "XsPilledLight" to { IconBadgeSolid.Xs.Pilled.Light.style() },
        )
}
