package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.badge.Accent
import com.sdds.plasma.giga.app.styles.badge.BadgeSolid
import com.sdds.plasma.giga.app.styles.badge.Dark
import com.sdds.plasma.giga.app.styles.badge.Default
import com.sdds.plasma.giga.app.styles.badge.L
import com.sdds.plasma.giga.app.styles.badge.Light
import com.sdds.plasma.giga.app.styles.badge.M
import com.sdds.plasma.giga.app.styles.badge.Negative
import com.sdds.plasma.giga.app.styles.badge.Pilled
import com.sdds.plasma.giga.app.styles.badge.Positive
import com.sdds.plasma.giga.app.styles.badge.S
import com.sdds.plasma.giga.app.styles.badge.Warning
import com.sdds.plasma.giga.app.styles.badge.Xs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppBadgeSolidVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "L.Default" to { BadgeSolid.L.Default.style() },
            "L.Accent" to { BadgeSolid.L.Accent.style() },
            "L.Negative" to { BadgeSolid.L.Negative.style() },
            "L.Positive" to { BadgeSolid.L.Positive.style() },
            "L.Warning" to { BadgeSolid.L.Warning.style() },
            "L.Dark" to { BadgeSolid.L.Dark.style() },
            "L.Light" to { BadgeSolid.L.Light.style() },
            "L.Pilled.Default" to { BadgeSolid.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { BadgeSolid.L.Pilled.Accent.style() },
            "L.Pilled.Negative" to { BadgeSolid.L.Pilled.Negative.style() },
            "L.Pilled.Positive" to { BadgeSolid.L.Pilled.Positive.style() },
            "L.Pilled.Warning" to { BadgeSolid.L.Pilled.Warning.style() },
            "L.Pilled.Dark" to { BadgeSolid.L.Pilled.Dark.style() },
            "L.Pilled.Light" to { BadgeSolid.L.Pilled.Light.style() },
            "M.Default" to { BadgeSolid.M.Default.style() },
            "M.Accent" to { BadgeSolid.M.Accent.style() },
            "M.Negative" to { BadgeSolid.M.Negative.style() },
            "M.Positive" to { BadgeSolid.M.Positive.style() },
            "M.Warning" to { BadgeSolid.M.Warning.style() },
            "M.Dark" to { BadgeSolid.M.Dark.style() },
            "M.Light" to { BadgeSolid.M.Light.style() },
            "M.Pilled.Default" to { BadgeSolid.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { BadgeSolid.M.Pilled.Accent.style() },
            "M.Pilled.Negative" to { BadgeSolid.M.Pilled.Negative.style() },
            "M.Pilled.Positive" to { BadgeSolid.M.Pilled.Positive.style() },
            "M.Pilled.Warning" to { BadgeSolid.M.Pilled.Warning.style() },
            "M.Pilled.Dark" to { BadgeSolid.M.Pilled.Dark.style() },
            "M.Pilled.Light" to { BadgeSolid.M.Pilled.Light.style() },
            "S.Default" to { BadgeSolid.S.Default.style() },
            "S.Accent" to { BadgeSolid.S.Accent.style() },
            "S.Negative" to { BadgeSolid.S.Negative.style() },
            "S.Positive" to { BadgeSolid.S.Positive.style() },
            "S.Warning" to { BadgeSolid.S.Warning.style() },
            "S.Dark" to { BadgeSolid.S.Dark.style() },
            "S.Light" to { BadgeSolid.S.Light.style() },
            "S.Pilled.Default" to { BadgeSolid.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { BadgeSolid.S.Pilled.Accent.style() },
            "S.Pilled.Negative" to { BadgeSolid.S.Pilled.Negative.style() },
            "S.Pilled.Positive" to { BadgeSolid.S.Pilled.Positive.style() },
            "S.Pilled.Warning" to { BadgeSolid.S.Pilled.Warning.style() },
            "S.Pilled.Dark" to { BadgeSolid.S.Pilled.Dark.style() },
            "S.Pilled.Light" to { BadgeSolid.S.Pilled.Light.style() },
            "Xs.Default" to { BadgeSolid.Xs.Default.style() },
            "Xs.Accent" to { BadgeSolid.Xs.Accent.style() },
            "Xs.Negative" to { BadgeSolid.Xs.Negative.style() },
            "Xs.Positive" to { BadgeSolid.Xs.Positive.style() },
            "Xs.Warning" to { BadgeSolid.Xs.Warning.style() },
            "Xs.Dark" to { BadgeSolid.Xs.Dark.style() },
            "Xs.Light" to { BadgeSolid.Xs.Light.style() },
            "Xs.Pilled.Default" to { BadgeSolid.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { BadgeSolid.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Negative" to { BadgeSolid.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Positive" to { BadgeSolid.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Warning" to { BadgeSolid.Xs.Pilled.Warning.style() },
            "Xs.Pilled.Dark" to { BadgeSolid.Xs.Pilled.Dark.style() },
            "Xs.Pilled.Light" to { BadgeSolid.Xs.Pilled.Light.style() },
        )
}
