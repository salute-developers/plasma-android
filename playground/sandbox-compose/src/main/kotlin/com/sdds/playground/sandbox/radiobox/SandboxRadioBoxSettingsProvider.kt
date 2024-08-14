package com.sdds.playground.sandbox.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

internal object SandboxRadioBoxSettingsProvider {
    @Composable
    fun labelTextStyleFor(size: SandboxRadioBox.Size): TextStyle =
        when (size) {
            SandboxRadioBox.Size.M -> StylesSaluteTheme.typography.bodyMNormal
            SandboxRadioBox.Size.S -> StylesSaluteTheme.typography.bodySNormal
        }

    @Composable
    fun descriptionTextStyleFor(size: SandboxRadioBox.Size): TextStyle =
        when (size) {
            SandboxRadioBox.Size.M -> StylesSaluteTheme.typography.bodySNormal
            SandboxRadioBox.Size.S -> StylesSaluteTheme.typography.bodyXsNormal
        }
}
