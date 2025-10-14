package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.badge.Accent
import com.sdds.plasma.sd.service.styles.badge.BadgeClear
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

internal object PlasmaB2cBadgeClearVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "L.Default" to { BadgeClear.L.Default.style() },
            "L.Accent" to { BadgeClear.L.Accent.style() },
            "L.Negative" to { BadgeClear.L.Negative.style() },
            "L.Positive" to { BadgeClear.L.Positive.style() },
            "L.Warning" to { BadgeClear.L.Warning.style() },
            "L.Dark" to { BadgeClear.L.Dark.style() },
            "L.Light" to { BadgeClear.L.Light.style() },
            "L.Pilled.Default" to { BadgeClear.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { BadgeClear.L.Pilled.Accent.style() },
            "L.Pilled.Negative" to { BadgeClear.L.Pilled.Negative.style() },
            "L.Pilled.Positive" to { BadgeClear.L.Pilled.Positive.style() },
            "L.Pilled.Warning" to { BadgeClear.L.Pilled.Warning.style() },
            "L.Pilled.Dark" to { BadgeClear.L.Pilled.Dark.style() },
            "L.Pilled.Light" to { BadgeClear.L.Pilled.Light.style() },
            "M.Default" to { BadgeClear.M.Default.style() },
            "M.Accent" to { BadgeClear.M.Accent.style() },
            "M.Negative" to { BadgeClear.M.Negative.style() },
            "M.Positive" to { BadgeClear.M.Positive.style() },
            "M.Warning" to { BadgeClear.M.Warning.style() },
            "M.Dark" to { BadgeClear.M.Dark.style() },
            "M.Light" to { BadgeClear.M.Light.style() },
            "M.Pilled.Default" to { BadgeClear.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { BadgeClear.M.Pilled.Accent.style() },
            "M.Pilled.Negative" to { BadgeClear.M.Pilled.Negative.style() },
            "M.Pilled.Positive" to { BadgeClear.M.Pilled.Positive.style() },
            "M.Pilled.Warning" to { BadgeClear.M.Pilled.Warning.style() },
            "M.Pilled.Dark" to { BadgeClear.M.Pilled.Dark.style() },
            "M.Pilled.Light" to { BadgeClear.M.Pilled.Light.style() },
            "S.Default" to { BadgeClear.S.Default.style() },
            "S.Accent" to { BadgeClear.S.Accent.style() },
            "S.Negative" to { BadgeClear.S.Negative.style() },
            "S.Positive" to { BadgeClear.S.Positive.style() },
            "S.Warning" to { BadgeClear.S.Warning.style() },
            "S.Dark" to { BadgeClear.S.Dark.style() },
            "S.Light" to { BadgeClear.S.Light.style() },
            "S.Pilled.Default" to { BadgeClear.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { BadgeClear.S.Pilled.Accent.style() },
            "S.Pilled.Negative" to { BadgeClear.S.Pilled.Negative.style() },
            "S.Pilled.Positive" to { BadgeClear.S.Pilled.Positive.style() },
            "S.Pilled.Warning" to { BadgeClear.S.Pilled.Warning.style() },
            "S.Pilled.Dark" to { BadgeClear.S.Pilled.Dark.style() },
            "S.Pilled.Light" to { BadgeClear.S.Pilled.Light.style() },
            "Xs.Default" to { BadgeClear.Xs.Default.style() },
            "Xs.Accent" to { BadgeClear.Xs.Accent.style() },
            "Xs.Negative" to { BadgeClear.Xs.Negative.style() },
            "Xs.Positive" to { BadgeClear.Xs.Positive.style() },
            "Xs.Warning" to { BadgeClear.Xs.Warning.style() },
            "Xs.Dark" to { BadgeClear.Xs.Dark.style() },
            "Xs.Light" to { BadgeClear.Xs.Light.style() },
            "Xs.Pilled.Default" to { BadgeClear.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { BadgeClear.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Negative" to { BadgeClear.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Positive" to { BadgeClear.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Warning" to { BadgeClear.Xs.Pilled.Warning.style() },
            "Xs.Pilled.Dark" to { BadgeClear.Xs.Pilled.Dark.style() },
            "Xs.Pilled.Light" to { BadgeClear.Xs.Pilled.Light.style() },
        )
}
