package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.iconbadge.Accent
import com.sdds.serv.styles.iconbadge.Dark
import com.sdds.serv.styles.iconbadge.Default
import com.sdds.serv.styles.iconbadge.IconBadgeTransparent
import com.sdds.serv.styles.iconbadge.L
import com.sdds.serv.styles.iconbadge.Light
import com.sdds.serv.styles.iconbadge.M
import com.sdds.serv.styles.iconbadge.Negative
import com.sdds.serv.styles.iconbadge.Pilled
import com.sdds.serv.styles.iconbadge.Positive
import com.sdds.serv.styles.iconbadge.S
import com.sdds.serv.styles.iconbadge.Warning
import com.sdds.serv.styles.iconbadge.Xs

internal object SddsServIconBadgeTransparentVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "L.Default" to { IconBadgeTransparent.L.Default.style() },
            "L.Accent" to { IconBadgeTransparent.L.Accent.style() },
            "L.Negative" to { IconBadgeTransparent.L.Negative.style() },
            "L.Positive" to { IconBadgeTransparent.L.Positive.style() },
            "L.Warning" to { IconBadgeTransparent.L.Warning.style() },
            "L.Dark" to { IconBadgeTransparent.L.Dark.style() },
            "L.Light" to { IconBadgeTransparent.L.Light.style() },
            "L.Pilled.Default" to { IconBadgeTransparent.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { IconBadgeTransparent.L.Pilled.Accent.style() },
            "L.Pilled.Negative" to { IconBadgeTransparent.L.Pilled.Negative.style() },
            "L.Pilled.Positive" to { IconBadgeTransparent.L.Pilled.Positive.style() },
            "L.Pilled.Warning" to { IconBadgeTransparent.L.Pilled.Warning.style() },
            "L.Pilled.Dark" to { IconBadgeTransparent.L.Pilled.Dark.style() },
            "L.Pilled.Light" to { IconBadgeTransparent.L.Pilled.Light.style() },
            "M.Default" to { IconBadgeTransparent.M.Default.style() },
            "M.Accent" to { IconBadgeTransparent.M.Accent.style() },
            "M.Negative" to { IconBadgeTransparent.M.Negative.style() },
            "M.Positive" to { IconBadgeTransparent.M.Positive.style() },
            "M.Warning" to { IconBadgeTransparent.M.Warning.style() },
            "M.Dark" to { IconBadgeTransparent.M.Dark.style() },
            "M.Light" to { IconBadgeTransparent.M.Light.style() },
            "M.Pilled.Default" to { IconBadgeTransparent.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { IconBadgeTransparent.M.Pilled.Accent.style() },
            "M.Pilled.Negative" to { IconBadgeTransparent.M.Pilled.Negative.style() },
            "M.Pilled.Positive" to { IconBadgeTransparent.M.Pilled.Positive.style() },
            "M.Pilled.Warning" to { IconBadgeTransparent.M.Pilled.Warning.style() },
            "M.Pilled.Dark" to { IconBadgeTransparent.M.Pilled.Dark.style() },
            "M.Pilled.Light" to { IconBadgeTransparent.M.Pilled.Light.style() },
            "S.Default" to { IconBadgeTransparent.S.Default.style() },
            "S.Accent" to { IconBadgeTransparent.S.Accent.style() },
            "S.Negative" to { IconBadgeTransparent.S.Negative.style() },
            "S.Positive" to { IconBadgeTransparent.S.Positive.style() },
            "S.Warning" to { IconBadgeTransparent.S.Warning.style() },
            "S.Dark" to { IconBadgeTransparent.S.Dark.style() },
            "S.Light" to { IconBadgeTransparent.S.Light.style() },
            "S.Pilled.Default" to { IconBadgeTransparent.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { IconBadgeTransparent.S.Pilled.Accent.style() },
            "S.Pilled.Negative" to { IconBadgeTransparent.S.Pilled.Negative.style() },
            "S.Pilled.Positive" to { IconBadgeTransparent.S.Pilled.Positive.style() },
            "S.Pilled.Warning" to { IconBadgeTransparent.S.Pilled.Warning.style() },
            "S.Pilled.Dark" to { IconBadgeTransparent.S.Pilled.Dark.style() },
            "S.Pilled.Light" to { IconBadgeTransparent.S.Pilled.Light.style() },
            "Xs.Default" to { IconBadgeTransparent.Xs.Default.style() },
            "Xs.Accent" to { IconBadgeTransparent.Xs.Accent.style() },
            "Xs.Negative" to { IconBadgeTransparent.Xs.Negative.style() },
            "Xs.Positive" to { IconBadgeTransparent.Xs.Positive.style() },
            "Xs.Warning" to { IconBadgeTransparent.Xs.Warning.style() },
            "Xs.Dark" to { IconBadgeTransparent.Xs.Dark.style() },
            "Xs.Light" to { IconBadgeTransparent.Xs.Light.style() },
            "Xs.Pilled.Default" to { IconBadgeTransparent.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { IconBadgeTransparent.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Negative" to { IconBadgeTransparent.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Positive" to { IconBadgeTransparent.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Warning" to { IconBadgeTransparent.Xs.Pilled.Warning.style() },
            "Xs.Pilled.Dark" to { IconBadgeTransparent.Xs.Pilled.Dark.style() },
            "Xs.Pilled.Light" to { IconBadgeTransparent.Xs.Pilled.Light.style() },
        )
}
