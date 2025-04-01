package com.sdds.playground.sandbox.sdds.serv.integration.badge.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.iconbadge.Accent
import com.sdds.serv.styles.iconbadge.Dark
import com.sdds.serv.styles.iconbadge.Default
import com.sdds.serv.styles.iconbadge.IconBadgeSolid
import com.sdds.serv.styles.iconbadge.L
import com.sdds.serv.styles.iconbadge.Light
import com.sdds.serv.styles.iconbadge.M
import com.sdds.serv.styles.iconbadge.Negative
import com.sdds.serv.styles.iconbadge.Pilled
import com.sdds.serv.styles.iconbadge.Positive
import com.sdds.serv.styles.iconbadge.S
import com.sdds.serv.styles.iconbadge.Warning
import com.sdds.serv.styles.iconbadge.Xs

internal object SddsServIconBadgeSolidVariationsCompose :
    ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "IconBadgeSolidLDefault" to { IconBadgeSolid.L.Default.style() },
            "IconBadgeSolidMDefault" to { IconBadgeSolid.M.Default.style() },
            "IconBadgeSolidSDefault" to { IconBadgeSolid.S.Default.style() },
            "IconBadgeSolidXsDefault" to { IconBadgeSolid.Xs.Default.style() },

            "IconBadgeSolidLPilledDefault" to { IconBadgeSolid.L.Pilled.Default.style() },
            "IconBadgeSolidMPilledDefault" to { IconBadgeSolid.M.Pilled.Default.style() },
            "IconBadgeSolidSPilledDefault" to { IconBadgeSolid.S.Pilled.Default.style() },
            "IconBadgeSolidXsPilledDefault" to { IconBadgeSolid.Xs.Pilled.Default.style() },

            "IconBadgeSolidLAccent" to { IconBadgeSolid.L.Accent.style() },
            "IconBadgeSolidMAccent" to { IconBadgeSolid.M.Accent.style() },
            "IconBadgeSolidSAccent" to { IconBadgeSolid.S.Accent.style() },
            "IconBadgeSolidXsAccent" to { IconBadgeSolid.Xs.Accent.style() },

            "IconBadgeSolidLPilledAccent" to { IconBadgeSolid.L.Pilled.Accent.style() },
            "IconBadgeSolidMPilledAccent" to { IconBadgeSolid.M.Pilled.Accent.style() },
            "IconBadgeSolidSPilledAccent" to { IconBadgeSolid.S.Pilled.Accent.style() },
            "IconBadgeSolidXsPilledAccent" to { IconBadgeSolid.Xs.Pilled.Accent.style() },

            "IconBadgeSolidLPositive" to { IconBadgeSolid.L.Positive.style() },
            "IconBadgeSolidMPositive" to { IconBadgeSolid.M.Positive.style() },
            "IconBadgeSolidSPositive" to { IconBadgeSolid.S.Positive.style() },
            "IconBadgeSolidXsPositive" to { IconBadgeSolid.Xs.Positive.style() },

            "IconBadgeSolidLPilledPositive" to { IconBadgeSolid.L.Pilled.Positive.style() },
            "IconBadgeSolidMPilledPositive" to { IconBadgeSolid.M.Pilled.Positive.style() },
            "IconBadgeSolidSPilledPositive" to { IconBadgeSolid.S.Pilled.Positive.style() },
            "IconBadgeSolidXsPilledPositive" to { IconBadgeSolid.Xs.Pilled.Positive.style() },

            "IconBadgeSolidLNegative" to { IconBadgeSolid.L.Negative.style() },
            "IconBadgeSolidMNegative" to { IconBadgeSolid.M.Negative.style() },
            "IconBadgeSolidSNegative" to { IconBadgeSolid.S.Negative.style() },
            "IconBadgeSolidXsNegative" to { IconBadgeSolid.Xs.Negative.style() },

            "IconBadgeSolidLPilledNegative" to { IconBadgeSolid.L.Pilled.Negative.style() },
            "IconBadgeSolidMPilledNegative" to { IconBadgeSolid.M.Pilled.Negative.style() },
            "IconBadgeSolidSPilledNegative" to { IconBadgeSolid.S.Pilled.Negative.style() },
            "IconBadgeSolidXsPilledNegative" to { IconBadgeSolid.Xs.Pilled.Negative.style() },

            "IconBadgeSolidLWarning" to { IconBadgeSolid.L.Warning.style() },
            "IconBadgeSolidMWarning" to { IconBadgeSolid.M.Warning.style() },
            "IconBadgeSolidSWarning" to { IconBadgeSolid.S.Warning.style() },
            "IconBadgeSolidXsWarning" to { IconBadgeSolid.Xs.Warning.style() },

            "IconBadgeSolidLPilledWarning" to { IconBadgeSolid.L.Pilled.Warning.style() },
            "IconBadgeSolidMPilledWarning" to { IconBadgeSolid.M.Pilled.Warning.style() },
            "IconBadgeSolidSPilledWarning" to { IconBadgeSolid.S.Pilled.Warning.style() },
            "IconBadgeSolidXsPilledWarning" to { IconBadgeSolid.Xs.Pilled.Warning.style() },

            "IconBadgeSolidLDark" to { IconBadgeSolid.L.Dark.style() },
            "IconBadgeSolidMDark" to { IconBadgeSolid.M.Dark.style() },
            "IconBadgeSolidSDark" to { IconBadgeSolid.S.Dark.style() },
            "IconBadgeSolidXsDark" to { IconBadgeSolid.Xs.Dark.style() },

            "IconBadgeSolidLPilledDark" to { IconBadgeSolid.L.Pilled.Dark.style() },
            "IconBadgeSolidMPilledDark" to { IconBadgeSolid.M.Pilled.Dark.style() },
            "IconBadgeSolidSPilledDark" to { IconBadgeSolid.S.Pilled.Dark.style() },
            "IconBadgeSolidXsPilledDark" to { IconBadgeSolid.Xs.Pilled.Dark.style() },

            "IconBadgeSolidLLight" to { IconBadgeSolid.L.Light.style() },
            "IconBadgeSolidMLight" to { IconBadgeSolid.M.Light.style() },
            "IconBadgeSolidSLight" to { IconBadgeSolid.S.Light.style() },
            "IconBadgeSolidXsLight" to { IconBadgeSolid.Xs.Light.style() },

            "IconBadgeSolidLPilledLight" to { IconBadgeSolid.L.Pilled.Light.style() },
            "IconBadgeSolidMPilledLight" to { IconBadgeSolid.M.Pilled.Light.style() },
            "IconBadgeSolidSPilledLight" to { IconBadgeSolid.S.Pilled.Light.style() },
            "IconBadgeSolidXsPilledLight" to { IconBadgeSolid.Xs.Pilled.Light.style() },
        )
}
