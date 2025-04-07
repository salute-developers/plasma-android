package com.sdds.playground.sandbox.plasma.giga.app.integration.badge.icon

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.iconbadge.Accent
import com.sdds.plasma.giga.app.styles.iconbadge.Dark
import com.sdds.plasma.giga.app.styles.iconbadge.Default
import com.sdds.plasma.giga.app.styles.iconbadge.IconBadgeClear
import com.sdds.plasma.giga.app.styles.iconbadge.L
import com.sdds.plasma.giga.app.styles.iconbadge.Light
import com.sdds.plasma.giga.app.styles.iconbadge.M
import com.sdds.plasma.giga.app.styles.iconbadge.Negative
import com.sdds.plasma.giga.app.styles.iconbadge.Pilled
import com.sdds.plasma.giga.app.styles.iconbadge.Positive
import com.sdds.plasma.giga.app.styles.iconbadge.S
import com.sdds.plasma.giga.app.styles.iconbadge.Warning
import com.sdds.plasma.giga.app.styles.iconbadge.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppIconBadgeClearVariationsCompose :
    ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "IconBadgeClearLDefault" to { IconBadgeClear.L.Default.style() },
            "IconBadgeClearMDefault" to { IconBadgeClear.M.Default.style() },
            "IconBadgeClearSDefault" to { IconBadgeClear.S.Default.style() },
            "IconBadgeClearXsDefault" to { IconBadgeClear.Xs.Default.style() },

            "IconBadgeClearLPilledDefault" to { IconBadgeClear.L.Pilled.Default.style() },
            "IconBadgeClearMPilledDefault" to { IconBadgeClear.M.Pilled.Default.style() },
            "IconBadgeClearSPilledDefault" to { IconBadgeClear.S.Pilled.Default.style() },
            "IconBadgeClearXsPilledDefault" to { IconBadgeClear.Xs.Pilled.Default.style() },

            "IconBadgeClearLAccent" to { IconBadgeClear.L.Accent.style() },
            "IconBadgeClearMAccent" to { IconBadgeClear.M.Accent.style() },
            "IconBadgeClearSAccent" to { IconBadgeClear.S.Accent.style() },
            "IconBadgeClearXsAccent" to { IconBadgeClear.Xs.Accent.style() },

            "IconBadgeClearLPilledAccent" to { IconBadgeClear.L.Pilled.Accent.style() },
            "IconBadgeClearMPilledAccent" to { IconBadgeClear.M.Pilled.Accent.style() },
            "IconBadgeClearSPilledAccent" to { IconBadgeClear.S.Pilled.Accent.style() },
            "IconBadgeClearXsPilledAccent" to { IconBadgeClear.Xs.Pilled.Accent.style() },

            "IconBadgeClearLPositive" to { IconBadgeClear.L.Positive.style() },
            "IconBadgeClearMPositive" to { IconBadgeClear.M.Positive.style() },
            "IconBadgeClearSPositive" to { IconBadgeClear.S.Positive.style() },
            "IconBadgeClearXsPositive" to { IconBadgeClear.Xs.Positive.style() },

            "IconBadgeClearLPilledPositive" to { IconBadgeClear.L.Pilled.Positive.style() },
            "IconBadgeClearMPilledPositive" to { IconBadgeClear.M.Pilled.Positive.style() },
            "IconBadgeClearSPilledPositive" to { IconBadgeClear.S.Pilled.Positive.style() },
            "IconBadgeClearXsPilledPositive" to { IconBadgeClear.Xs.Pilled.Positive.style() },

            "IconBadgeClearLNegative" to { IconBadgeClear.L.Negative.style() },
            "IconBadgeClearMNegative" to { IconBadgeClear.M.Negative.style() },
            "IconBadgeClearSNegative" to { IconBadgeClear.S.Negative.style() },
            "IconBadgeClearXsNegative" to { IconBadgeClear.Xs.Negative.style() },

            "IconBadgeClearLPilledNegative" to { IconBadgeClear.L.Pilled.Negative.style() },
            "IconBadgeClearMPilledNegative" to { IconBadgeClear.M.Pilled.Negative.style() },
            "IconBadgeClearSPilledNegative" to { IconBadgeClear.S.Pilled.Negative.style() },
            "IconBadgeClearXsPilledNegative" to { IconBadgeClear.Xs.Pilled.Negative.style() },

            "IconBadgeClearLWarning" to { IconBadgeClear.L.Warning.style() },
            "IconBadgeClearMWarning" to { IconBadgeClear.M.Warning.style() },
            "IconBadgeClearSWarning" to { IconBadgeClear.S.Warning.style() },
            "IconBadgeClearXsWarning" to { IconBadgeClear.Xs.Warning.style() },

            "IconBadgeClearLPilledWarning" to { IconBadgeClear.L.Pilled.Warning.style() },
            "IconBadgeClearMPilledWarning" to { IconBadgeClear.M.Pilled.Warning.style() },
            "IconBadgeClearSPilledWarning" to { IconBadgeClear.S.Pilled.Warning.style() },
            "IconBadgeClearXsPilledWarning" to { IconBadgeClear.Xs.Pilled.Warning.style() },

            "IconBadgeClearLDark" to { IconBadgeClear.L.Dark.style() },
            "IconBadgeClearMDark" to { IconBadgeClear.M.Dark.style() },
            "IconBadgeClearSDark" to { IconBadgeClear.S.Dark.style() },
            "IconBadgeClearXsDark" to { IconBadgeClear.Xs.Dark.style() },

            "IconBadgeClearLPilledDark" to { IconBadgeClear.L.Pilled.Dark.style() },
            "IconBadgeClearMPilledDark" to { IconBadgeClear.M.Pilled.Dark.style() },
            "IconBadgeClearSPilledDark" to { IconBadgeClear.S.Pilled.Dark.style() },
            "IconBadgeClearXsPilledDark" to { IconBadgeClear.Xs.Pilled.Dark.style() },

            "IconBadgeClearLLight" to { IconBadgeClear.L.Light.style() },
            "IconBadgeClearMLight" to { IconBadgeClear.M.Light.style() },
            "IconBadgeClearSLight" to { IconBadgeClear.S.Light.style() },
            "IconBadgeClearXsLight" to { IconBadgeClear.Xs.Light.style() },

            "IconBadgeClearLPilledLight" to { IconBadgeClear.L.Pilled.Light.style() },
            "IconBadgeClearMPilledLight" to { IconBadgeClear.M.Pilled.Light.style() },
            "IconBadgeClearSPilledLight" to { IconBadgeClear.S.Pilled.Light.style() },
            "IconBadgeClearXsPilledLight" to { IconBadgeClear.Xs.Pilled.Light.style() },
        )
}
