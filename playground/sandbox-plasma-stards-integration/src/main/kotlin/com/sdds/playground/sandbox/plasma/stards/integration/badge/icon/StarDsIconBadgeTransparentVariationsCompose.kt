package com.sdds.playground.sandbox.plasma.stards.integration.badge.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeTransparent
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.badge.icon.Accent
import com.sdkit.star.designsystem.styles.badge.icon.Dark
import com.sdkit.star.designsystem.styles.badge.icon.Default
import com.sdkit.star.designsystem.styles.badge.icon.L
import com.sdkit.star.designsystem.styles.badge.icon.Light
import com.sdkit.star.designsystem.styles.badge.icon.M
import com.sdkit.star.designsystem.styles.badge.icon.Negative
import com.sdkit.star.designsystem.styles.badge.icon.Pilled
import com.sdkit.star.designsystem.styles.badge.icon.Positive
import com.sdkit.star.designsystem.styles.badge.icon.S
import com.sdkit.star.designsystem.styles.badge.icon.Warning
import com.sdkit.star.designsystem.styles.badge.icon.Xs

internal object StarDsIconBadgeTransparentVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "IconBadgeTransparentLDefault" to { IconBadgeTransparent.L.Default.style() },
            "IconBadgeTransparentMDefault" to { IconBadgeTransparent.M.Default.style() },
            "IconBadgeTransparentSDefault" to { IconBadgeTransparent.S.Default.style() },
            "IconBadgeTransparentXsDefault" to { IconBadgeTransparent.Xs.Default.style() },

            "IconBadgeTransparentLPilledDefault" to { IconBadgeTransparent.L.Pilled.Default.style() },
            "IconBadgeTransparentMPilledDefault" to { IconBadgeTransparent.M.Pilled.Default.style() },
            "IconBadgeTransparentSPilledDefault" to { IconBadgeTransparent.S.Pilled.Default.style() },
            "IconBadgeTransparentXsPilledDefault" to { IconBadgeTransparent.Xs.Pilled.Default.style() },

            "IconBadgeTransparentLAccent" to { IconBadgeTransparent.L.Accent.style() },
            "IconBadgeTransparentMAccent" to { IconBadgeTransparent.M.Accent.style() },
            "IconBadgeTransparentSAccent" to { IconBadgeTransparent.S.Accent.style() },
            "IconBadgeTransparentXsAccent" to { IconBadgeTransparent.Xs.Accent.style() },

            "IconBadgeTransparentLPilledAccent" to { IconBadgeTransparent.L.Pilled.Accent.style() },
            "IconBadgeTransparentMPilledAccent" to { IconBadgeTransparent.M.Pilled.Accent.style() },
            "IconBadgeTransparentSPilledAccent" to { IconBadgeTransparent.S.Pilled.Accent.style() },
            "IconBadgeTransparentXsPilledAccent" to { IconBadgeTransparent.Xs.Pilled.Accent.style() },

            "IconBadgeTransparentLPositive" to { IconBadgeTransparent.L.Positive.style() },
            "IconBadgeTransparentMPositive" to { IconBadgeTransparent.M.Positive.style() },
            "IconBadgeTransparentSPositive" to { IconBadgeTransparent.S.Positive.style() },
            "IconBadgeTransparentXsPositive" to { IconBadgeTransparent.Xs.Positive.style() },

            "IconBadgeTransparentLPilledPositive" to { IconBadgeTransparent.L.Pilled.Positive.style() },
            "IconBadgeTransparentMPilledPositive" to { IconBadgeTransparent.M.Pilled.Positive.style() },
            "IconBadgeTransparentSPilledPositive" to { IconBadgeTransparent.S.Pilled.Positive.style() },
            "IconBadgeTransparentXsPilledPositive" to { IconBadgeTransparent.Xs.Pilled.Positive.style() },

            "IconBadgeTransparentLNegative" to { IconBadgeTransparent.L.Negative.style() },
            "IconBadgeTransparentMNegative" to { IconBadgeTransparent.M.Negative.style() },
            "IconBadgeTransparentSNegative" to { IconBadgeTransparent.S.Negative.style() },
            "IconBadgeTransparentXsNegative" to { IconBadgeTransparent.Xs.Negative.style() },

            "IconBadgeTransparentLPilledNegative" to { IconBadgeTransparent.L.Pilled.Negative.style() },
            "IconBadgeTransparentMPilledNegative" to { IconBadgeTransparent.M.Pilled.Negative.style() },
            "IconBadgeTransparentSPilledNegative" to { IconBadgeTransparent.S.Pilled.Negative.style() },
            "IconBadgeTransparentXsPilledNegative" to { IconBadgeTransparent.Xs.Pilled.Negative.style() },

            "IconBadgeTransparentLWarning" to { IconBadgeTransparent.L.Warning.style() },
            "IconBadgeTransparentMWarning" to { IconBadgeTransparent.M.Warning.style() },
            "IconBadgeTransparentSWarning" to { IconBadgeTransparent.S.Warning.style() },
            "IconBadgeTransparentXsWarning" to { IconBadgeTransparent.Xs.Warning.style() },

            "IconBadgeTransparentLPilledWarning" to { IconBadgeTransparent.L.Pilled.Warning.style() },
            "IconBadgeTransparentMPilledWarning" to { IconBadgeTransparent.M.Pilled.Warning.style() },
            "IconBadgeTransparentSPilledWarning" to { IconBadgeTransparent.S.Pilled.Warning.style() },
            "IconBadgeTransparentXsPilledWarning" to { IconBadgeTransparent.Xs.Pilled.Warning.style() },

            "IconBadgeTransparentLDark" to { IconBadgeTransparent.L.Dark.style() },
            "IconBadgeTransparentMDark" to { IconBadgeTransparent.M.Dark.style() },
            "IconBadgeTransparentSDark" to { IconBadgeTransparent.S.Dark.style() },
            "IconBadgeTransparentXsDark" to { IconBadgeTransparent.Xs.Dark.style() },

            "IconBadgeTransparentLPilledDark" to { IconBadgeTransparent.L.Pilled.Dark.style() },
            "IconBadgeTransparentMPilledDark" to { IconBadgeTransparent.M.Pilled.Dark.style() },
            "IconBadgeTransparentSPilledDark" to { IconBadgeTransparent.S.Pilled.Dark.style() },
            "IconBadgeTransparentXsPilledDark" to { IconBadgeTransparent.Xs.Pilled.Dark.style() },

            "IconBadgeTransparentLLight" to { IconBadgeTransparent.L.Light.style() },
            "IconBadgeTransparentMLight" to { IconBadgeTransparent.M.Light.style() },
            "IconBadgeTransparentSLight" to { IconBadgeTransparent.S.Light.style() },
            "IconBadgeTransparentXsLight" to { IconBadgeTransparent.Xs.Light.style() },

            "IconBadgeTransparentLPilledLight" to { IconBadgeTransparent.L.Pilled.Light.style() },
            "IconBadgeTransparentMPilledLight" to { IconBadgeTransparent.M.Pilled.Light.style() },
            "IconBadgeTransparentSPilledLight" to { IconBadgeTransparent.S.Pilled.Light.style() },
            "IconBadgeTransparentXsPilledLight" to { IconBadgeTransparent.Xs.Pilled.Light.style() },
        )
}
