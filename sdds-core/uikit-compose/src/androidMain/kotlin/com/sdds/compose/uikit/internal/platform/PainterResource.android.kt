package com.sdds.compose.uikit.internal.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

@Composable
internal actual fun painterResource(id: Int): Painter {
    return androidx.compose.ui.res.painterResource(id)
}
