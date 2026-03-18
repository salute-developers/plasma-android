package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.basicbutton.AccentFilled
import com.sdds.sbcom.styles.basicbutton.AccentGrey
import com.sdds.sbcom.styles.basicbutton.AccentWhite
import com.sdds.sbcom.styles.basicbutton.BasicButton
import com.sdds.sbcom.styles.basicbutton.DangerTint
import com.sdds.sbcom.styles.basicbutton.M
import com.sdds.sbcom.styles.basicbutton.Primary
import com.sdds.sbcom.styles.basicbutton.S
import com.sdds.sbcom.styles.basicbutton.Xs
import com.sdds.sbcom.styles.basicbutton.Xxs

internal object SddsSbcomBasicButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "M.Primary" to { BasicButton.M.Primary.style() },
            "M.AccentFilled" to { BasicButton.M.AccentFilled.style() },
            "M.AccentWhite" to { BasicButton.M.AccentWhite.style() },
            "M.AccentGrey" to { BasicButton.M.AccentGrey.style() },
            "M.DangerTint" to { BasicButton.M.DangerTint.style() },
            "S.Primary" to { BasicButton.S.Primary.style() },
            "S.AccentFilled" to { BasicButton.S.AccentFilled.style() },
            "S.AccentWhite" to { BasicButton.S.AccentWhite.style() },
            "S.AccentGrey" to { BasicButton.S.AccentGrey.style() },
            "S.DangerTint" to { BasicButton.S.DangerTint.style() },
            "Xs.Primary" to { BasicButton.Xs.Primary.style() },
            "Xs.AccentFilled" to { BasicButton.Xs.AccentFilled.style() },
            "Xs.AccentWhite" to { BasicButton.Xs.AccentWhite.style() },
            "Xs.AccentGrey" to { BasicButton.Xs.AccentGrey.style() },
            "Xs.DangerTint" to { BasicButton.Xs.DangerTint.style() },
            "Xxs.Primary" to { BasicButton.Xxs.Primary.style() },
            "Xxs.AccentFilled" to { BasicButton.Xxs.AccentFilled.style() },
            "Xxs.AccentWhite" to { BasicButton.Xxs.AccentWhite.style() },
            "Xxs.AccentGrey" to { BasicButton.Xxs.AccentGrey.style() },
            "Xxs.DangerTint" to { BasicButton.Xxs.DangerTint.style() },
        )
}
