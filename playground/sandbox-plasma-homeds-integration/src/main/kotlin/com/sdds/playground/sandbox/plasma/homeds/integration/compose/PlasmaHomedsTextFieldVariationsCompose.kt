package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.textfield.Default
import com.sdds.plasma.homeds.styles.textfield.Error
import com.sdds.plasma.homeds.styles.textfield.InnerLabel
import com.sdds.plasma.homeds.styles.textfield.L
import com.sdds.plasma.homeds.styles.textfield.M
import com.sdds.plasma.homeds.styles.textfield.RequiredEnd
import com.sdds.plasma.homeds.styles.textfield.RequiredStart
import com.sdds.plasma.homeds.styles.textfield.S
import com.sdds.plasma.homeds.styles.textfield.TextField
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsTextFieldVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {
    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "S.Default" to { TextField.S.Default.style() },
            "S.Error" to { TextField.S.Error.style() },
            "S.RequiredStart.Default" to { TextField.S.RequiredStart.Default.style() },
            "S.RequiredStart.Error" to { TextField.S.RequiredStart.Error.style() },
            "S.RequiredEnd.Default" to { TextField.S.RequiredEnd.Default.style() },
            "S.RequiredEnd.Error" to { TextField.S.RequiredEnd.Error.style() },
            "S.InnerLabel.Default" to { TextField.S.InnerLabel.Default.style() },
            "S.InnerLabel.Error" to { TextField.S.InnerLabel.Error.style() },
            "S.InnerLabel.RequiredStart.Default" to { TextField.S.InnerLabel.RequiredStart.Default.style() },
            "S.InnerLabel.RequiredStart.Error" to { TextField.S.InnerLabel.RequiredStart.Error.style() },
            "S.InnerLabel.RequiredEnd.Default" to { TextField.S.InnerLabel.RequiredEnd.Default.style() },
            "S.InnerLabel.RequiredEnd.Error" to { TextField.S.InnerLabel.RequiredEnd.Error.style() },
            "M.Default" to { TextField.M.Default.style() },
            "M.Error" to { TextField.M.Error.style() },
            "M.RequiredStart.Default" to { TextField.M.RequiredStart.Default.style() },
            "M.RequiredStart.Error" to { TextField.M.RequiredStart.Error.style() },
            "M.RequiredEnd.Default" to { TextField.M.RequiredEnd.Default.style() },
            "M.RequiredEnd.Error" to { TextField.M.RequiredEnd.Error.style() },
            "M.InnerLabel.Default" to { TextField.M.InnerLabel.Default.style() },
            "M.InnerLabel.Error" to { TextField.M.InnerLabel.Error.style() },
            "M.InnerLabel.RequiredStart.Default" to { TextField.M.InnerLabel.RequiredStart.Default.style() },
            "M.InnerLabel.RequiredStart.Error" to { TextField.M.InnerLabel.RequiredStart.Error.style() },
            "M.InnerLabel.RequiredEnd.Default" to { TextField.M.InnerLabel.RequiredEnd.Default.style() },
            "M.InnerLabel.RequiredEnd.Error" to { TextField.M.InnerLabel.RequiredEnd.Error.style() },
            "L.Default" to { TextField.L.Default.style() },
            "L.Error" to { TextField.L.Error.style() },
            "L.RequiredStart.Default" to { TextField.L.RequiredStart.Default.style() },
            "L.RequiredStart.Error" to { TextField.L.RequiredStart.Error.style() },
            "L.RequiredEnd.Default" to { TextField.L.RequiredEnd.Default.style() },
            "L.RequiredEnd.Error" to { TextField.L.RequiredEnd.Error.style() },
            "L.InnerLabel.Default" to { TextField.L.InnerLabel.Default.style() },
            "L.InnerLabel.Error" to { TextField.L.InnerLabel.Error.style() },
            "L.InnerLabel.RequiredStart.Default" to { TextField.L.InnerLabel.RequiredStart.Default.style() },
            "L.InnerLabel.RequiredStart.Error" to { TextField.L.InnerLabel.RequiredStart.Error.style() },
            "L.InnerLabel.RequiredEnd.Default" to { TextField.L.InnerLabel.RequiredEnd.Default.style() },
            "L.InnerLabel.RequiredEnd.Error" to { TextField.L.InnerLabel.RequiredEnd.Error.style() },
        )
}
