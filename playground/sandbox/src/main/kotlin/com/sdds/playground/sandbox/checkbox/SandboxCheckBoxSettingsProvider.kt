package com.sdds.playground.sandbox.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.dp
import com.sdds.playground.themebuilder.tokens.compose.DefaultTheme

internal object SandboxCheckBoxSettingsProvider {
    @Composable
    fun getDimensionsFor(size: SandboxCheckBox.Size): SandboxCheckBox.CheckBoxDimensions =
        when (size) {
            SandboxCheckBox.Size.M -> SandboxCheckBox.CheckBoxDimensions(
                controlRadius = 6.dp,
                verticalSpacing = 2.dp,
                horizontalSpacing = 10.dp,
            )

            SandboxCheckBox.Size.S -> SandboxCheckBox.CheckBoxDimensions(
                controlRadius = 4.dp,
                verticalSpacing = 2.dp,
                horizontalSpacing = 8.dp,
            )
        }

    @Composable
    fun labelTextStyleFor(size: SandboxCheckBox.Size): TextStyle =
        when (size) {
            SandboxCheckBox.Size.M -> DefaultTheme.typography.bodyMNormal
            SandboxCheckBox.Size.S -> DefaultTheme.typography.bodySNormal
        }

    @Composable
    fun descriptionTextStyleFor(size: SandboxCheckBox.Size): TextStyle =
        when (size) {
            SandboxCheckBox.Size.M -> DefaultTheme.typography.bodySNormal
            SandboxCheckBox.Size.S -> DefaultTheme.typography.bodyXsNormal
        }
}
