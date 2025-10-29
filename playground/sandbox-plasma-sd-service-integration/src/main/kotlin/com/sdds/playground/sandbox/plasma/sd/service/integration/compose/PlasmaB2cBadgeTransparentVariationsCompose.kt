package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.badge.Accent
import com.sdds.plasma.sd.service.styles.badge.BadgeTransparent
import com.sdds.plasma.sd.service.styles.badge.Dark
import com.sdds.plasma.sd.service.styles.badge.Default
import com.sdds.plasma.sd.service.styles.badge.L
import com.sdds.plasma.sd.service.styles.badge.Light
import com.sdds.plasma.sd.service.styles.badge.M
import com.sdds.plasma.sd.service.styles.badge.Negative
import com.sdds.plasma.sd.service.styles.badge.Pilled
import com.sdds.plasma.sd.service.styles.badge.Positive
import com.sdds.plasma.sd.service.styles.badge.S
import com.sdds.plasma.sd.service.styles.badge.Warning
import com.sdds.plasma.sd.service.styles.badge.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cBadgeTransparentVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "L.Default" to { BadgeTransparent.L.Default.style() },
            "L.Accent" to { BadgeTransparent.L.Accent.style() },
            "L.Negative" to { BadgeTransparent.L.Negative.style() },
            "L.Positive" to { BadgeTransparent.L.Positive.style() },
            "L.Warning" to { BadgeTransparent.L.Warning.style() },
            "L.Dark" to { BadgeTransparent.L.Dark.style() },
            "L.Light" to { BadgeTransparent.L.Light.style() },
            "L.Pilled.Default" to { BadgeTransparent.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { BadgeTransparent.L.Pilled.Accent.style() },
            "L.Pilled.Negative" to { BadgeTransparent.L.Pilled.Negative.style() },
            "L.Pilled.Positive" to { BadgeTransparent.L.Pilled.Positive.style() },
            "L.Pilled.Warning" to { BadgeTransparent.L.Pilled.Warning.style() },
            "L.Pilled.Dark" to { BadgeTransparent.L.Pilled.Dark.style() },
            "L.Pilled.Light" to { BadgeTransparent.L.Pilled.Light.style() },
            "M.Default" to { BadgeTransparent.M.Default.style() },
            "M.Accent" to { BadgeTransparent.M.Accent.style() },
            "M.Negative" to { BadgeTransparent.M.Negative.style() },
            "M.Positive" to { BadgeTransparent.M.Positive.style() },
            "M.Warning" to { BadgeTransparent.M.Warning.style() },
            "M.Dark" to { BadgeTransparent.M.Dark.style() },
            "M.Light" to { BadgeTransparent.M.Light.style() },
            "M.Pilled.Default" to { BadgeTransparent.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { BadgeTransparent.M.Pilled.Accent.style() },
            "M.Pilled.Negative" to { BadgeTransparent.M.Pilled.Negative.style() },
            "M.Pilled.Positive" to { BadgeTransparent.M.Pilled.Positive.style() },
            "M.Pilled.Warning" to { BadgeTransparent.M.Pilled.Warning.style() },
            "M.Pilled.Dark" to { BadgeTransparent.M.Pilled.Dark.style() },
            "M.Pilled.Light" to { BadgeTransparent.M.Pilled.Light.style() },
            "S.Default" to { BadgeTransparent.S.Default.style() },
            "S.Accent" to { BadgeTransparent.S.Accent.style() },
            "S.Negative" to { BadgeTransparent.S.Negative.style() },
            "S.Positive" to { BadgeTransparent.S.Positive.style() },
            "S.Warning" to { BadgeTransparent.S.Warning.style() },
            "S.Dark" to { BadgeTransparent.S.Dark.style() },
            "S.Light" to { BadgeTransparent.S.Light.style() },
            "S.Pilled.Default" to { BadgeTransparent.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { BadgeTransparent.S.Pilled.Accent.style() },
            "S.Pilled.Negative" to { BadgeTransparent.S.Pilled.Negative.style() },
            "S.Pilled.Positive" to { BadgeTransparent.S.Pilled.Positive.style() },
            "S.Pilled.Warning" to { BadgeTransparent.S.Pilled.Warning.style() },
            "S.Pilled.Dark" to { BadgeTransparent.S.Pilled.Dark.style() },
            "S.Pilled.Light" to { BadgeTransparent.S.Pilled.Light.style() },
            "Xs.Default" to { BadgeTransparent.Xs.Default.style() },
            "Xs.Accent" to { BadgeTransparent.Xs.Accent.style() },
            "Xs.Negative" to { BadgeTransparent.Xs.Negative.style() },
            "Xs.Positive" to { BadgeTransparent.Xs.Positive.style() },
            "Xs.Warning" to { BadgeTransparent.Xs.Warning.style() },
            "Xs.Dark" to { BadgeTransparent.Xs.Dark.style() },
            "Xs.Light" to { BadgeTransparent.Xs.Light.style() },
            "Xs.Pilled.Default" to { BadgeTransparent.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { BadgeTransparent.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Negative" to { BadgeTransparent.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Positive" to { BadgeTransparent.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Warning" to { BadgeTransparent.Xs.Pilled.Warning.style() },
            "Xs.Pilled.Dark" to { BadgeTransparent.Xs.Pilled.Dark.style() },
            "Xs.Pilled.Light" to { BadgeTransparent.Xs.Pilled.Light.style() },
        )
}
