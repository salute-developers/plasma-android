package com.sdds.playground.sandbox.checkbox.group

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.playground.sandbox.checkbox.SandboxCheckBox

internal object SandboxCheckBoxGroupSettingsProvider {

    @Composable
    fun indentFor(size: SandboxCheckBox.Size): Dp =
        when (size) {
            SandboxCheckBox.Size.M -> 36.dp
            SandboxCheckBox.Size.S -> 24.dp
        }

    @Composable
    fun verticalArrangementFor(size: SandboxCheckBox.Size): Arrangement.Vertical =
        when (size) {
            SandboxCheckBox.Size.M -> Arrangement.spacedBy(12.dp)
            SandboxCheckBox.Size.S -> Arrangement.spacedBy(10.dp)
        }
}
