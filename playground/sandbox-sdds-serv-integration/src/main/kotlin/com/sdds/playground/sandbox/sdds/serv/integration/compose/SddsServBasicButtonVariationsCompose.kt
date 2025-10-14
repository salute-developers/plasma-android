package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.basicbutton.Accent
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Black
import com.sdds.serv.styles.basicbutton.Clear
import com.sdds.serv.styles.basicbutton.Dark
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.Negative
import com.sdds.serv.styles.basicbutton.Positive
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Secondary
import com.sdds.serv.styles.basicbutton.Warning
import com.sdds.serv.styles.basicbutton.White
import com.sdds.serv.styles.basicbutton.Xl
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.styles.basicbutton.Xxs

internal object SddsServBasicButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "Xl.Default" to { BasicButton.Xl.Default.style() },
            "Xl.Secondary" to { BasicButton.Xl.Secondary.style() },
            "Xl.Accent" to { BasicButton.Xl.Accent.style() },
            "Xl.Positive" to { BasicButton.Xl.Positive.style() },
            "Xl.Negative" to { BasicButton.Xl.Negative.style() },
            "Xl.Warning" to { BasicButton.Xl.Warning.style() },
            "Xl.Clear" to { BasicButton.Xl.Clear.style() },
            "Xl.Dark" to { BasicButton.Xl.Dark.style() },
            "Xl.Black" to { BasicButton.Xl.Black.style() },
            "Xl.White" to { BasicButton.Xl.White.style() },
            "L.Default" to { BasicButton.L.Default.style() },
            "L.Secondary" to { BasicButton.L.Secondary.style() },
            "L.Accent" to { BasicButton.L.Accent.style() },
            "L.Positive" to { BasicButton.L.Positive.style() },
            "L.Negative" to { BasicButton.L.Negative.style() },
            "L.Warning" to { BasicButton.L.Warning.style() },
            "L.Clear" to { BasicButton.L.Clear.style() },
            "L.Dark" to { BasicButton.L.Dark.style() },
            "L.Black" to { BasicButton.L.Black.style() },
            "L.White" to { BasicButton.L.White.style() },
            "M.Default" to { BasicButton.M.Default.style() },
            "M.Secondary" to { BasicButton.M.Secondary.style() },
            "M.Accent" to { BasicButton.M.Accent.style() },
            "M.Positive" to { BasicButton.M.Positive.style() },
            "M.Negative" to { BasicButton.M.Negative.style() },
            "M.Warning" to { BasicButton.M.Warning.style() },
            "M.Clear" to { BasicButton.M.Clear.style() },
            "M.Dark" to { BasicButton.M.Dark.style() },
            "M.Black" to { BasicButton.M.Black.style() },
            "M.White" to { BasicButton.M.White.style() },
            "S.Default" to { BasicButton.S.Default.style() },
            "S.Secondary" to { BasicButton.S.Secondary.style() },
            "S.Accent" to { BasicButton.S.Accent.style() },
            "S.Positive" to { BasicButton.S.Positive.style() },
            "S.Negative" to { BasicButton.S.Negative.style() },
            "S.Warning" to { BasicButton.S.Warning.style() },
            "S.Clear" to { BasicButton.S.Clear.style() },
            "S.Dark" to { BasicButton.S.Dark.style() },
            "S.Black" to { BasicButton.S.Black.style() },
            "S.White" to { BasicButton.S.White.style() },
            "Xs.Default" to { BasicButton.Xs.Default.style() },
            "Xs.Secondary" to { BasicButton.Xs.Secondary.style() },
            "Xs.Accent" to { BasicButton.Xs.Accent.style() },
            "Xs.Positive" to { BasicButton.Xs.Positive.style() },
            "Xs.Negative" to { BasicButton.Xs.Negative.style() },
            "Xs.Warning" to { BasicButton.Xs.Warning.style() },
            "Xs.Clear" to { BasicButton.Xs.Clear.style() },
            "Xs.Dark" to { BasicButton.Xs.Dark.style() },
            "Xs.Black" to { BasicButton.Xs.Black.style() },
            "Xs.White" to { BasicButton.Xs.White.style() },
            "Xxs.Default" to { BasicButton.Xxs.Default.style() },
            "Xxs.Secondary" to { BasicButton.Xxs.Secondary.style() },
            "Xxs.Accent" to { BasicButton.Xxs.Accent.style() },
            "Xxs.Positive" to { BasicButton.Xxs.Positive.style() },
            "Xxs.Negative" to { BasicButton.Xxs.Negative.style() },
            "Xxs.Warning" to { BasicButton.Xxs.Warning.style() },
            "Xxs.Clear" to { BasicButton.Xxs.Clear.style() },
            "Xxs.Dark" to { BasicButton.Xxs.Dark.style() },
            "Xxs.Black" to { BasicButton.Xxs.Black.style() },
            "Xxs.White" to { BasicButton.Xxs.White.style() },
        )
}
