package com.sdds.playground.sandbox.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

internal object SandboxRadioBoxSettingsProvider {
    @Composable
    fun labelTextStyleFor(size: SandboxRadioBox.Size): TextStyle =
        when (size) {
            SandboxRadioBox.Size.M -> SddsServTheme.typography.bodyMNormal
            SandboxRadioBox.Size.S -> SddsServTheme.typography.bodySNormal
        }

    @Composable
    fun descriptionTextStyleFor(size: SandboxRadioBox.Size): TextStyle =
        when (size) {
            SandboxRadioBox.Size.M -> SddsServTheme.typography.bodySNormal
            SandboxRadioBox.Size.S -> SddsServTheme.typography.bodyXsNormal
        }
}
