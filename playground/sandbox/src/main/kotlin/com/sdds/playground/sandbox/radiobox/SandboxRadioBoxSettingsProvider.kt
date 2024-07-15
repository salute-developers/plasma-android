package com.sdds.playground.sandbox.radiobox

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

internal object SandboxRadioBoxSettingsProvider {
    @Composable
    fun getDimensionsFor(size: SandboxRadioBox.Size): SandboxRadioBox.Dimensions =
        when (size) {
            SandboxRadioBox.Size.M -> SandboxRadioBox.Dimensions(
                baseSize = 10.dp,
                verticalSpacing = 2.dp,
                horizontalSpacing = 10.dp,
            )

            SandboxRadioBox.Size.S -> SandboxRadioBox.Dimensions(
                baseSize = 8.dp,
                verticalSpacing = 2.dp,
                horizontalSpacing = 8.dp,
            )
        }

    @Composable
    fun labelTextStyleFor(size: SandboxRadioBox.Size): TextStyle =
        when (size) {
            SandboxRadioBox.Size.M -> DefaultTheme.typography.bodyMNormal
            SandboxRadioBox.Size.S -> DefaultTheme.typography.bodySNormal
        }

    @Composable
    fun descriptionTextStyleFor(size: SandboxRadioBox.Size): TextStyle =
        when (size) {
            SandboxRadioBox.Size.M -> DefaultTheme.typography.bodySNormal
            SandboxRadioBox.Size.S -> DefaultTheme.typography.bodyXsNormal
        }
}
