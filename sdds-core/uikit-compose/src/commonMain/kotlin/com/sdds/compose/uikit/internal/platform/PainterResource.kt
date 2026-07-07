package com.sdds.compose.uikit.internal.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

@Composable
internal expect fun painterResource(id: Int): Painter
