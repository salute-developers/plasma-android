package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.iconbadge.Accent
import com.sdds.plasma.giga.app.styles.iconbadge.Dark
import com.sdds.plasma.giga.app.styles.iconbadge.Default
import com.sdds.plasma.giga.app.styles.iconbadge.IconBadgeSolid
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

internal object PlasmaGigaAppIconBadgeSolidVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "L.Default" to { IconBadgeSolid.L.Default.style() },
            "L.Accent" to { IconBadgeSolid.L.Accent.style() },
            "L.Negative" to { IconBadgeSolid.L.Negative.style() },
            "L.Positive" to { IconBadgeSolid.L.Positive.style() },
            "L.Warning" to { IconBadgeSolid.L.Warning.style() },
            "L.Dark" to { IconBadgeSolid.L.Dark.style() },
            "L.Light" to { IconBadgeSolid.L.Light.style() },
            "L.Pilled.Default" to { IconBadgeSolid.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { IconBadgeSolid.L.Pilled.Accent.style() },
            "L.Pilled.Negative" to { IconBadgeSolid.L.Pilled.Negative.style() },
            "L.Pilled.Positive" to { IconBadgeSolid.L.Pilled.Positive.style() },
            "L.Pilled.Warning" to { IconBadgeSolid.L.Pilled.Warning.style() },
            "L.Pilled.Dark" to { IconBadgeSolid.L.Pilled.Dark.style() },
            "L.Pilled.Light" to { IconBadgeSolid.L.Pilled.Light.style() },
            "M.Default" to { IconBadgeSolid.M.Default.style() },
            "M.Accent" to { IconBadgeSolid.M.Accent.style() },
            "M.Negative" to { IconBadgeSolid.M.Negative.style() },
            "M.Positive" to { IconBadgeSolid.M.Positive.style() },
            "M.Warning" to { IconBadgeSolid.M.Warning.style() },
            "M.Dark" to { IconBadgeSolid.M.Dark.style() },
            "M.Light" to { IconBadgeSolid.M.Light.style() },
            "M.Pilled.Default" to { IconBadgeSolid.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { IconBadgeSolid.M.Pilled.Accent.style() },
            "M.Pilled.Negative" to { IconBadgeSolid.M.Pilled.Negative.style() },
            "M.Pilled.Positive" to { IconBadgeSolid.M.Pilled.Positive.style() },
            "M.Pilled.Warning" to { IconBadgeSolid.M.Pilled.Warning.style() },
            "M.Pilled.Dark" to { IconBadgeSolid.M.Pilled.Dark.style() },
            "M.Pilled.Light" to { IconBadgeSolid.M.Pilled.Light.style() },
            "S.Default" to { IconBadgeSolid.S.Default.style() },
            "S.Accent" to { IconBadgeSolid.S.Accent.style() },
            "S.Negative" to { IconBadgeSolid.S.Negative.style() },
            "S.Positive" to { IconBadgeSolid.S.Positive.style() },
            "S.Warning" to { IconBadgeSolid.S.Warning.style() },
            "S.Dark" to { IconBadgeSolid.S.Dark.style() },
            "S.Light" to { IconBadgeSolid.S.Light.style() },
            "S.Pilled.Default" to { IconBadgeSolid.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { IconBadgeSolid.S.Pilled.Accent.style() },
            "S.Pilled.Negative" to { IconBadgeSolid.S.Pilled.Negative.style() },
            "S.Pilled.Positive" to { IconBadgeSolid.S.Pilled.Positive.style() },
            "S.Pilled.Warning" to { IconBadgeSolid.S.Pilled.Warning.style() },
            "S.Pilled.Dark" to { IconBadgeSolid.S.Pilled.Dark.style() },
            "S.Pilled.Light" to { IconBadgeSolid.S.Pilled.Light.style() },
            "Xs.Default" to { IconBadgeSolid.Xs.Default.style() },
            "Xs.Accent" to { IconBadgeSolid.Xs.Accent.style() },
            "Xs.Negative" to { IconBadgeSolid.Xs.Negative.style() },
            "Xs.Positive" to { IconBadgeSolid.Xs.Positive.style() },
            "Xs.Warning" to { IconBadgeSolid.Xs.Warning.style() },
            "Xs.Dark" to { IconBadgeSolid.Xs.Dark.style() },
            "Xs.Light" to { IconBadgeSolid.Xs.Light.style() },
            "Xs.Pilled.Default" to { IconBadgeSolid.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { IconBadgeSolid.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Negative" to { IconBadgeSolid.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Positive" to { IconBadgeSolid.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Warning" to { IconBadgeSolid.Xs.Pilled.Warning.style() },
            "Xs.Pilled.Dark" to { IconBadgeSolid.Xs.Pilled.Dark.style() },
            "Xs.Pilled.Light" to { IconBadgeSolid.Xs.Pilled.Light.style() },
        )
}
