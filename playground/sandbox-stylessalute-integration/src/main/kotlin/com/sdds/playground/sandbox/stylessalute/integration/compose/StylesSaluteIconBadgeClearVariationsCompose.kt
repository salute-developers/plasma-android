package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.iconbadge.Accent
import com.sdds.stylessalute.styles.iconbadge.Dark
import com.sdds.stylessalute.styles.iconbadge.Default
import com.sdds.stylessalute.styles.iconbadge.IconBadgeClear
import com.sdds.stylessalute.styles.iconbadge.L
import com.sdds.stylessalute.styles.iconbadge.Light
import com.sdds.stylessalute.styles.iconbadge.M
import com.sdds.stylessalute.styles.iconbadge.Negative
import com.sdds.stylessalute.styles.iconbadge.Pilled
import com.sdds.stylessalute.styles.iconbadge.Positive
import com.sdds.stylessalute.styles.iconbadge.S
import com.sdds.stylessalute.styles.iconbadge.Warning
import com.sdds.stylessalute.styles.iconbadge.Xs

internal object StylesSaluteIconBadgeClearVariationsCompose : ComposeStyleProvider<String, BadgeStyle>() {
    override val variations: Map<String, @Composable () -> BadgeStyle> =
        mapOf(
            "L.Default" to { IconBadgeClear.L.Default.style() },
            "L.Accent" to { IconBadgeClear.L.Accent.style() },
            "L.Negative" to { IconBadgeClear.L.Negative.style() },
            "L.Positive" to { IconBadgeClear.L.Positive.style() },
            "L.Warning" to { IconBadgeClear.L.Warning.style() },
            "L.Dark" to { IconBadgeClear.L.Dark.style() },
            "L.Light" to { IconBadgeClear.L.Light.style() },
            "L.Pilled.Default" to { IconBadgeClear.L.Pilled.Default.style() },
            "L.Pilled.Accent" to { IconBadgeClear.L.Pilled.Accent.style() },
            "L.Pilled.Negative" to { IconBadgeClear.L.Pilled.Negative.style() },
            "L.Pilled.Positive" to { IconBadgeClear.L.Pilled.Positive.style() },
            "L.Pilled.Warning" to { IconBadgeClear.L.Pilled.Warning.style() },
            "L.Pilled.Dark" to { IconBadgeClear.L.Pilled.Dark.style() },
            "L.Pilled.Light" to { IconBadgeClear.L.Pilled.Light.style() },
            "M.Default" to { IconBadgeClear.M.Default.style() },
            "M.Accent" to { IconBadgeClear.M.Accent.style() },
            "M.Negative" to { IconBadgeClear.M.Negative.style() },
            "M.Positive" to { IconBadgeClear.M.Positive.style() },
            "M.Warning" to { IconBadgeClear.M.Warning.style() },
            "M.Dark" to { IconBadgeClear.M.Dark.style() },
            "M.Light" to { IconBadgeClear.M.Light.style() },
            "M.Pilled.Default" to { IconBadgeClear.M.Pilled.Default.style() },
            "M.Pilled.Accent" to { IconBadgeClear.M.Pilled.Accent.style() },
            "M.Pilled.Negative" to { IconBadgeClear.M.Pilled.Negative.style() },
            "M.Pilled.Positive" to { IconBadgeClear.M.Pilled.Positive.style() },
            "M.Pilled.Warning" to { IconBadgeClear.M.Pilled.Warning.style() },
            "M.Pilled.Dark" to { IconBadgeClear.M.Pilled.Dark.style() },
            "M.Pilled.Light" to { IconBadgeClear.M.Pilled.Light.style() },
            "S.Default" to { IconBadgeClear.S.Default.style() },
            "S.Accent" to { IconBadgeClear.S.Accent.style() },
            "S.Negative" to { IconBadgeClear.S.Negative.style() },
            "S.Positive" to { IconBadgeClear.S.Positive.style() },
            "S.Warning" to { IconBadgeClear.S.Warning.style() },
            "S.Dark" to { IconBadgeClear.S.Dark.style() },
            "S.Light" to { IconBadgeClear.S.Light.style() },
            "S.Pilled.Default" to { IconBadgeClear.S.Pilled.Default.style() },
            "S.Pilled.Accent" to { IconBadgeClear.S.Pilled.Accent.style() },
            "S.Pilled.Negative" to { IconBadgeClear.S.Pilled.Negative.style() },
            "S.Pilled.Positive" to { IconBadgeClear.S.Pilled.Positive.style() },
            "S.Pilled.Warning" to { IconBadgeClear.S.Pilled.Warning.style() },
            "S.Pilled.Dark" to { IconBadgeClear.S.Pilled.Dark.style() },
            "S.Pilled.Light" to { IconBadgeClear.S.Pilled.Light.style() },
            "Xs.Default" to { IconBadgeClear.Xs.Default.style() },
            "Xs.Accent" to { IconBadgeClear.Xs.Accent.style() },
            "Xs.Negative" to { IconBadgeClear.Xs.Negative.style() },
            "Xs.Positive" to { IconBadgeClear.Xs.Positive.style() },
            "Xs.Warning" to { IconBadgeClear.Xs.Warning.style() },
            "Xs.Dark" to { IconBadgeClear.Xs.Dark.style() },
            "Xs.Light" to { IconBadgeClear.Xs.Light.style() },
            "Xs.Pilled.Default" to { IconBadgeClear.Xs.Pilled.Default.style() },
            "Xs.Pilled.Accent" to { IconBadgeClear.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Negative" to { IconBadgeClear.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Positive" to { IconBadgeClear.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Warning" to { IconBadgeClear.Xs.Pilled.Warning.style() },
            "Xs.Pilled.Dark" to { IconBadgeClear.Xs.Pilled.Dark.style() },
            "Xs.Pilled.Light" to { IconBadgeClear.Xs.Pilled.Light.style() },
        )
}
