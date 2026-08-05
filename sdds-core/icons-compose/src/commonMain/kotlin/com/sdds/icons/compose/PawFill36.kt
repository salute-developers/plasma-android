package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PawFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PawFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.067 8.153 c 0.0 -1.876 1.517 -3.403 3.396 -3.403 c 1.878 0.0 3.395 1.527 3.395 3.403 c 0.0 1.876 -1.517 3.403 -3.395 3.403 c -1.88 0.0 -3.396 -1.527 -3.396 -3.403 Z m -3.421 4.15 c -1.88 0.0 -3.396 1.527 -3.396 3.403 c 0.0 1.876 1.517 3.403 3.396 3.403 s 3.395 -1.527 3.395 -3.403 c 0.0 -1.876 -1.516 -3.403 -3.395 -3.403 Z m 15.384 3.774 c -1.91 -3.022 -6.141 -3.022 -8.051 0.0 l -4.614 7.3 c -2.063 3.263 0.05 7.871 4.026 7.871 h 9.228 c 3.974 0.0 6.088 -4.608 4.025 -7.871 l -4.614 -7.3 Z m 7.323 -3.774 c -1.88 0.0 -3.396 1.527 -3.396 3.403 c 0.0 1.876 1.517 3.403 3.396 3.403 s 3.395 -1.527 3.395 -3.403 c 0.0 -1.876 -1.516 -3.403 -3.395 -3.403 Z M 19.15 8.153 c 0.0 -1.876 1.517 -3.403 3.396 -3.403 c 1.878 0.0 3.395 1.527 3.395 3.403 c 0.0 1.876 -1.517 3.403 -3.395 3.403 c -1.88 0.0 -3.396 -1.527 -3.396 -3.403 Z")
        )
    }.build()
}
