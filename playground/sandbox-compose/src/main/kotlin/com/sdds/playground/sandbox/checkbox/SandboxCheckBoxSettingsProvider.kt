package com.sdds.playground.sandbox.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

internal object SandboxCheckBoxSettingsProvider {

    @Composable
    fun labelTextStyleFor(size: SandboxCheckBox.Size): TextStyle =
        when (size) {
            SandboxCheckBox.Size.M -> SddsServTheme.typography.bodyMNormal
            SandboxCheckBox.Size.S -> SddsServTheme.typography.bodySNormal
        }

    @Composable
    fun descriptionTextStyleFor(size: SandboxCheckBox.Size): TextStyle =
        when (size) {
            SandboxCheckBox.Size.M -> SddsServTheme.typography.bodySNormal
            SandboxCheckBox.Size.S -> SddsServTheme.typography.bodyXsNormal
        }
}
