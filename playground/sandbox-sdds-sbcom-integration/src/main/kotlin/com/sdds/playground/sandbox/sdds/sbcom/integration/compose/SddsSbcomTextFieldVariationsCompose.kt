package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.textfield.Default
import com.sdds.sbcom.styles.textfield.Error
import com.sdds.sbcom.styles.textfield.TextField

internal object SddsSbcomTextFieldVariationsCompose : ComposeStyleProvider<String, TextFieldStyle>() {
    override val variations: Map<String, @Composable () -> TextFieldStyle> =
        mapOf(
            "Default" to { TextField.Default.style() },
            "Error" to { TextField.Error.style() },
        )
}
