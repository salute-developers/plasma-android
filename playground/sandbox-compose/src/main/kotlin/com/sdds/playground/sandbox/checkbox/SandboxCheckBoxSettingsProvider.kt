package com.sdds.playground.sandbox.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

internal object SandboxCheckBoxSettingsProvider {

    @Composable
    fun labelTextStyleFor(size: SandboxCheckBox.Size): TextStyle =
        when (size) {
            SandboxCheckBox.Size.M -> StylesSaluteTheme.typography.bodyMNormal
            SandboxCheckBox.Size.S -> StylesSaluteTheme.typography.bodySNormal
        }

    @Composable
    fun descriptionTextStyleFor(size: SandboxCheckBox.Size): TextStyle =
        when (size) {
            SandboxCheckBox.Size.M -> StylesSaluteTheme.typography.bodySNormal
            SandboxCheckBox.Size.S -> StylesSaluteTheme.typography.bodyXsNormal
        }
}
