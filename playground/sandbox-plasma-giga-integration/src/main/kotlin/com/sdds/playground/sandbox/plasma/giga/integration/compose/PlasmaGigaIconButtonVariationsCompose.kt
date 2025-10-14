package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.iconbutton.Accent
import com.sdds.plasma.giga.styles.iconbutton.Black
import com.sdds.plasma.giga.styles.iconbutton.Clear
import com.sdds.plasma.giga.styles.iconbutton.Dark
import com.sdds.plasma.giga.styles.iconbutton.Default
import com.sdds.plasma.giga.styles.iconbutton.IconButton
import com.sdds.plasma.giga.styles.iconbutton.L
import com.sdds.plasma.giga.styles.iconbutton.M
import com.sdds.plasma.giga.styles.iconbutton.Negative
import com.sdds.plasma.giga.styles.iconbutton.Pilled
import com.sdds.plasma.giga.styles.iconbutton.Positive
import com.sdds.plasma.giga.styles.iconbutton.S
import com.sdds.plasma.giga.styles.iconbutton.Secondary
import com.sdds.plasma.giga.styles.iconbutton.Warning
import com.sdds.plasma.giga.styles.iconbutton.White
import com.sdds.plasma.giga.styles.iconbutton.Xl
import com.sdds.plasma.giga.styles.iconbutton.Xs
import com.sdds.plasma.giga.styles.iconbutton.Xxs
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaIconButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "Xl.Default" to { IconButton.Xl.Default.style() },
            "Xl.Secondary" to { IconButton.Xl.Secondary.style() },
            "Xl.Accent" to { IconButton.Xl.Accent.style() },
            "Xl.Positive" to { IconButton.Xl.Positive.style() },
            "Xl.Negative" to { IconButton.Xl.Negative.style() },
            "Xl.Warning" to { IconButton.Xl.Warning.style() },
            "Xl.Clear" to { IconButton.Xl.Clear.style() },
            "Xl.Dark" to { IconButton.Xl.Dark.style() },
            "Xl.Black" to { IconButton.Xl.Black.style() },
            "Xl.White" to { IconButton.Xl.White.style() },
            "Xl.Pilled.Default" to { IconButton.Xl.Pilled.Default.style() },
            "Xl.Pilled.Secondary" to { IconButton.Xl.Pilled.Secondary.style() },
            "Xl.Pilled.Accent" to { IconButton.Xl.Pilled.Accent.style() },
            "Xl.Pilled.Positive" to { IconButton.Xl.Pilled.Positive.style() },
            "Xl.Pilled.Negative" to { IconButton.Xl.Pilled.Negative.style() },
            "Xl.Pilled.Warning" to { IconButton.Xl.Pilled.Warning.style() },
            "Xl.Pilled.Clear" to { IconButton.Xl.Pilled.Clear.style() },
            "Xl.Pilled.Dark" to { IconButton.Xl.Pilled.Dark.style() },
            "Xl.Pilled.Black" to { IconButton.Xl.Pilled.Black.style() },
            "Xl.Pilled.White" to { IconButton.Xl.Pilled.White.style() },
            "L.Default" to { IconButton.L.Default.style() },
            "L.Secondary" to { IconButton.L.Secondary.style() },
            "L.Accent" to { IconButton.L.Accent.style() },
            "L.Positive" to { IconButton.L.Positive.style() },
            "L.Negative" to { IconButton.L.Negative.style() },
            "L.Warning" to { IconButton.L.Warning.style() },
            "L.Clear" to { IconButton.L.Clear.style() },
            "L.Dark" to { IconButton.L.Dark.style() },
            "L.Black" to { IconButton.L.Black.style() },
            "L.White" to { IconButton.L.White.style() },
            "L.Pilled.Default" to { IconButton.L.Pilled.Default.style() },
            "L.Pilled.Secondary" to { IconButton.L.Pilled.Secondary.style() },
            "L.Pilled.Accent" to { IconButton.L.Pilled.Accent.style() },
            "L.Pilled.Positive" to { IconButton.L.Pilled.Positive.style() },
            "L.Pilled.Negative" to { IconButton.L.Pilled.Negative.style() },
            "L.Pilled.Warning" to { IconButton.L.Pilled.Warning.style() },
            "L.Pilled.Clear" to { IconButton.L.Pilled.Clear.style() },
            "L.Pilled.Dark" to { IconButton.L.Pilled.Dark.style() },
            "L.Pilled.Black" to { IconButton.L.Pilled.Black.style() },
            "L.Pilled.White" to { IconButton.L.Pilled.White.style() },
            "M.Default" to { IconButton.M.Default.style() },
            "M.Secondary" to { IconButton.M.Secondary.style() },
            "M.Accent" to { IconButton.M.Accent.style() },
            "M.Positive" to { IconButton.M.Positive.style() },
            "M.Negative" to { IconButton.M.Negative.style() },
            "M.Warning" to { IconButton.M.Warning.style() },
            "M.Clear" to { IconButton.M.Clear.style() },
            "M.Dark" to { IconButton.M.Dark.style() },
            "M.Black" to { IconButton.M.Black.style() },
            "M.White" to { IconButton.M.White.style() },
            "M.Pilled.Default" to { IconButton.M.Pilled.Default.style() },
            "M.Pilled.Secondary" to { IconButton.M.Pilled.Secondary.style() },
            "M.Pilled.Accent" to { IconButton.M.Pilled.Accent.style() },
            "M.Pilled.Positive" to { IconButton.M.Pilled.Positive.style() },
            "M.Pilled.Negative" to { IconButton.M.Pilled.Negative.style() },
            "M.Pilled.Warning" to { IconButton.M.Pilled.Warning.style() },
            "M.Pilled.Clear" to { IconButton.M.Pilled.Clear.style() },
            "M.Pilled.Dark" to { IconButton.M.Pilled.Dark.style() },
            "M.Pilled.Black" to { IconButton.M.Pilled.Black.style() },
            "M.Pilled.White" to { IconButton.M.Pilled.White.style() },
            "S.Default" to { IconButton.S.Default.style() },
            "S.Secondary" to { IconButton.S.Secondary.style() },
            "S.Accent" to { IconButton.S.Accent.style() },
            "S.Positive" to { IconButton.S.Positive.style() },
            "S.Negative" to { IconButton.S.Negative.style() },
            "S.Warning" to { IconButton.S.Warning.style() },
            "S.Clear" to { IconButton.S.Clear.style() },
            "S.Dark" to { IconButton.S.Dark.style() },
            "S.Black" to { IconButton.S.Black.style() },
            "S.White" to { IconButton.S.White.style() },
            "S.Pilled.Default" to { IconButton.S.Pilled.Default.style() },
            "S.Pilled.Secondary" to { IconButton.S.Pilled.Secondary.style() },
            "S.Pilled.Accent" to { IconButton.S.Pilled.Accent.style() },
            "S.Pilled.Positive" to { IconButton.S.Pilled.Positive.style() },
            "S.Pilled.Negative" to { IconButton.S.Pilled.Negative.style() },
            "S.Pilled.Warning" to { IconButton.S.Pilled.Warning.style() },
            "S.Pilled.Clear" to { IconButton.S.Pilled.Clear.style() },
            "S.Pilled.Dark" to { IconButton.S.Pilled.Dark.style() },
            "S.Pilled.Black" to { IconButton.S.Pilled.Black.style() },
            "S.Pilled.White" to { IconButton.S.Pilled.White.style() },
            "Xs.Default" to { IconButton.Xs.Default.style() },
            "Xs.Secondary" to { IconButton.Xs.Secondary.style() },
            "Xs.Accent" to { IconButton.Xs.Accent.style() },
            "Xs.Positive" to { IconButton.Xs.Positive.style() },
            "Xs.Negative" to { IconButton.Xs.Negative.style() },
            "Xs.Warning" to { IconButton.Xs.Warning.style() },
            "Xs.Clear" to { IconButton.Xs.Clear.style() },
            "Xs.Dark" to { IconButton.Xs.Dark.style() },
            "Xs.Black" to { IconButton.Xs.Black.style() },
            "Xs.White" to { IconButton.Xs.White.style() },
            "Xs.Pilled.Default" to { IconButton.Xs.Pilled.Default.style() },
            "Xs.Pilled.Secondary" to { IconButton.Xs.Pilled.Secondary.style() },
            "Xs.Pilled.Accent" to { IconButton.Xs.Pilled.Accent.style() },
            "Xs.Pilled.Positive" to { IconButton.Xs.Pilled.Positive.style() },
            "Xs.Pilled.Negative" to { IconButton.Xs.Pilled.Negative.style() },
            "Xs.Pilled.Warning" to { IconButton.Xs.Pilled.Warning.style() },
            "Xs.Pilled.Clear" to { IconButton.Xs.Pilled.Clear.style() },
            "Xs.Pilled.Dark" to { IconButton.Xs.Pilled.Dark.style() },
            "Xs.Pilled.Black" to { IconButton.Xs.Pilled.Black.style() },
            "Xs.Pilled.White" to { IconButton.Xs.Pilled.White.style() },
            "Xxs.Default" to { IconButton.Xxs.Default.style() },
            "Xxs.Secondary" to { IconButton.Xxs.Secondary.style() },
            "Xxs.Accent" to { IconButton.Xxs.Accent.style() },
            "Xxs.Positive" to { IconButton.Xxs.Positive.style() },
            "Xxs.Negative" to { IconButton.Xxs.Negative.style() },
            "Xxs.Warning" to { IconButton.Xxs.Warning.style() },
            "Xxs.Clear" to { IconButton.Xxs.Clear.style() },
            "Xxs.Dark" to { IconButton.Xxs.Dark.style() },
            "Xxs.Black" to { IconButton.Xxs.Black.style() },
            "Xxs.White" to { IconButton.Xxs.White.style() },
            "Xxs.Pilled.Default" to { IconButton.Xxs.Pilled.Default.style() },
            "Xxs.Pilled.Secondary" to { IconButton.Xxs.Pilled.Secondary.style() },
            "Xxs.Pilled.Accent" to { IconButton.Xxs.Pilled.Accent.style() },
            "Xxs.Pilled.Positive" to { IconButton.Xxs.Pilled.Positive.style() },
            "Xxs.Pilled.Negative" to { IconButton.Xxs.Pilled.Negative.style() },
            "Xxs.Pilled.Warning" to { IconButton.Xxs.Pilled.Warning.style() },
            "Xxs.Pilled.Clear" to { IconButton.Xxs.Pilled.Clear.style() },
            "Xxs.Pilled.Dark" to { IconButton.Xxs.Pilled.Dark.style() },
            "Xxs.Pilled.Black" to { IconButton.Xxs.Pilled.Black.style() },
            "Xxs.Pilled.White" to { IconButton.Xxs.Pilled.White.style() },
        )
}
