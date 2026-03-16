package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.iconbutton.AccentFilled
import com.sdds.sbcom.styles.iconbutton.AccentGrey
import com.sdds.sbcom.styles.iconbutton.DangerTint
import com.sdds.sbcom.styles.iconbutton.IconButton
import com.sdds.sbcom.styles.iconbutton.M
import com.sdds.sbcom.styles.iconbutton.S
import com.sdds.sbcom.styles.iconbutton.Xs

internal object SddsSbcomIconButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "M.AccentFilled" to { IconButton.M.AccentFilled.style() },
            "M.AccentGrey" to { IconButton.M.AccentGrey.style() },
            "M.DangerTint" to { IconButton.M.DangerTint.style() },
            "S.AccentFilled" to { IconButton.S.AccentFilled.style() },
            "S.AccentGrey" to { IconButton.S.AccentGrey.style() },
            "S.DangerTint" to { IconButton.S.DangerTint.style() },
            "Xs.AccentFilled" to { IconButton.Xs.AccentFilled.style() },
            "Xs.AccentGrey" to { IconButton.Xs.AccentGrey.style() },
            "Xs.DangerTint" to { IconButton.Xs.DangerTint.style() },
        )
}
