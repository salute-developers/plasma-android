package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LoginFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LoginFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.582 4.5 c 2.596 0.0 3.895 0.0 4.887 0.505 c 0.872 0.444 1.582 1.154 2.026 2.026 C 31.0 8.023 31.0 9.321 31.0 11.918 v 12.164 c 0.0 2.596 0.0 3.895 -0.505 4.887 c -0.444 0.872 -1.154 1.582 -2.026 2.026 c -0.992 0.505 -2.29 0.505 -4.887 0.505 h -3.164 c -2.596 0.0 -3.895 0.0 -4.887 -0.505 c -0.872 -0.444 -1.582 -1.154 -2.026 -2.026 C 13.0 27.977 13.0 26.679 13.0 24.082 v -5.059 h 9.546 l -3.21 3.22 c -0.389 0.391 -0.388 1.024 0.003 1.414 c 0.391 0.39 1.024 0.39 1.414 -0.002 l 4.91 -4.927 l 0.067 -0.075 c 0.32 -0.392 0.297 -0.97 -0.068 -1.336 l -4.91 -4.926 c -0.389 -0.39 -1.022 -0.392 -1.413 -0.002 s -0.392 1.023 -0.002 1.414 l 3.21 3.22 H 13.0 v -5.105 c 0.0 -2.597 0.0 -3.895 0.505 -4.887 c 0.444 -0.872 1.154 -1.582 2.026 -2.026 C 16.523 4.5 17.821 4.5 20.418 4.5 h 3.164 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 17.023 v 2.0 H 6.41 c -0.553 0.0 -1.0 -0.447 -1.0 -1.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 H 13.0 Z")
        )
    }.build()
}
