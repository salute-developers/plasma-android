package com.sdds.playground.sandbox.plasma.stards.integration.badge.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.iconbadge.Accent
import com.sdkit.star.designsystem.styles.iconbadge.Dark
import com.sdkit.star.designsystem.styles.iconbadge.Default
import com.sdkit.star.designsystem.styles.iconbadge.IconBadgeTransparent
import com.sdkit.star.designsystem.styles.iconbadge.L
import com.sdkit.star.designsystem.styles.iconbadge.Light
import com.sdkit.star.designsystem.styles.iconbadge.M
import com.sdkit.star.designsystem.styles.iconbadge.Negative
import com.sdkit.star.designsystem.styles.iconbadge.Pilled
import com.sdkit.star.designsystem.styles.iconbadge.Positive
import com.sdkit.star.designsystem.styles.iconbadge.S
import com.sdkit.star.designsystem.styles.iconbadge.Warning
import com.sdkit.star.designsystem.styles.iconbadge.Xs

internal object StarDsIconBadgeTransparentVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "LDefault" to { IconBadgeTransparent.L.Default.style() },
            "MDefault" to { IconBadgeTransparent.M.Default.style() },
            "SDefault" to { IconBadgeTransparent.S.Default.style() },
            "XsDefault" to { IconBadgeTransparent.Xs.Default.style() },

            "LPilledDefault" to { IconBadgeTransparent.L.Pilled.Default.style() },
            "MPilledDefault" to { IconBadgeTransparent.M.Pilled.Default.style() },
            "SPilledDefault" to { IconBadgeTransparent.S.Pilled.Default.style() },
            "XsPilledDefault" to { IconBadgeTransparent.Xs.Pilled.Default.style() },

            "LAccent" to { IconBadgeTransparent.L.Accent.style() },
            "MAccent" to { IconBadgeTransparent.M.Accent.style() },
            "SAccent" to { IconBadgeTransparent.S.Accent.style() },
            "XsAccent" to { IconBadgeTransparent.Xs.Accent.style() },

            "LPilledAccent" to { IconBadgeTransparent.L.Pilled.Accent.style() },
            "MPilledAccent" to { IconBadgeTransparent.M.Pilled.Accent.style() },
            "SPilledAccent" to { IconBadgeTransparent.S.Pilled.Accent.style() },
            "XsPilledAccent" to { IconBadgeTransparent.Xs.Pilled.Accent.style() },

            "LPositive" to { IconBadgeTransparent.L.Positive.style() },
            "MPositive" to { IconBadgeTransparent.M.Positive.style() },
            "SPositive" to { IconBadgeTransparent.S.Positive.style() },
            "XsPositive" to { IconBadgeTransparent.Xs.Positive.style() },

            "LPilledPositive" to { IconBadgeTransparent.L.Pilled.Positive.style() },
            "MPilledPositive" to { IconBadgeTransparent.M.Pilled.Positive.style() },
            "SPilledPositive" to { IconBadgeTransparent.S.Pilled.Positive.style() },
            "XsPilledPositive" to { IconBadgeTransparent.Xs.Pilled.Positive.style() },

            "LNegative" to { IconBadgeTransparent.L.Negative.style() },
            "MNegative" to { IconBadgeTransparent.M.Negative.style() },
            "SNegative" to { IconBadgeTransparent.S.Negative.style() },
            "XsNegative" to { IconBadgeTransparent.Xs.Negative.style() },

            "LPilledNegative" to { IconBadgeTransparent.L.Pilled.Negative.style() },
            "MPilledNegative" to { IconBadgeTransparent.M.Pilled.Negative.style() },
            "SPilledNegative" to { IconBadgeTransparent.S.Pilled.Negative.style() },
            "XsPilledNegative" to { IconBadgeTransparent.Xs.Pilled.Negative.style() },

            "LWarning" to { IconBadgeTransparent.L.Warning.style() },
            "MWarning" to { IconBadgeTransparent.M.Warning.style() },
            "SWarning" to { IconBadgeTransparent.S.Warning.style() },
            "XsWarning" to { IconBadgeTransparent.Xs.Warning.style() },

            "LPilledWarning" to { IconBadgeTransparent.L.Pilled.Warning.style() },
            "MPilledWarning" to { IconBadgeTransparent.M.Pilled.Warning.style() },
            "SPilledWarning" to { IconBadgeTransparent.S.Pilled.Warning.style() },
            "XsPilledWarning" to { IconBadgeTransparent.Xs.Pilled.Warning.style() },

            "LDark" to { IconBadgeTransparent.L.Dark.style() },
            "MDark" to { IconBadgeTransparent.M.Dark.style() },
            "SDark" to { IconBadgeTransparent.S.Dark.style() },
            "XsDark" to { IconBadgeTransparent.Xs.Dark.style() },

            "LPilledDark" to { IconBadgeTransparent.L.Pilled.Dark.style() },
            "MPilledDark" to { IconBadgeTransparent.M.Pilled.Dark.style() },
            "SPilledDark" to { IconBadgeTransparent.S.Pilled.Dark.style() },
            "XsPilledDark" to { IconBadgeTransparent.Xs.Pilled.Dark.style() },

            "LLight" to { IconBadgeTransparent.L.Light.style() },
            "MLight" to { IconBadgeTransparent.M.Light.style() },
            "SLight" to { IconBadgeTransparent.S.Light.style() },
            "XsLight" to { IconBadgeTransparent.Xs.Light.style() },

            "LPilledLight" to { IconBadgeTransparent.L.Pilled.Light.style() },
            "MPilledLight" to { IconBadgeTransparent.M.Pilled.Light.style() },
            "SPilledLight" to { IconBadgeTransparent.S.Pilled.Light.style() },
            "XsPilledLight" to { IconBadgeTransparent.Xs.Pilled.Light.style() },
        )
}
