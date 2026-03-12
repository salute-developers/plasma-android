package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.iconbutton.Accent
import com.sdds.sbcom.styles.iconbutton.DangerTint
import com.sdds.sbcom.styles.iconbutton.IconButtonClear
import com.sdds.sbcom.styles.iconbutton.M
import com.sdds.sbcom.styles.iconbutton.S
import com.sdds.sbcom.styles.iconbutton.Xs

internal object SddsSbcomIconButtonClearVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {
    override val variations: Map<String, @Composable () -> ButtonStyle> =
        mapOf(
            "M.Accent" to { IconButtonClear.M.Accent.style() },
            "M.DangerTint" to { IconButtonClear.M.DangerTint.style() },
            "S.Accent" to { IconButtonClear.S.Accent.style() },
            "S.DangerTint" to { IconButtonClear.S.DangerTint.style() },
            "Xs.Accent" to { IconButtonClear.Xs.Accent.style() },
            "Xs.DangerTint" to { IconButtonClear.Xs.DangerTint.style() },
        )
}
