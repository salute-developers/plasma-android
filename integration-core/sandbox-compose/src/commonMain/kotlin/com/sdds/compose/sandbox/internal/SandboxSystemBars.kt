package com.sdds.compose.sandbox.internal

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
internal expect fun SandboxSystemBars(
    backgroundColor: Color,
    darkTheme: Boolean,
)
