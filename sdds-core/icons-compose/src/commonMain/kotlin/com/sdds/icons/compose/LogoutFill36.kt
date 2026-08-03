package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LogoutFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LogoutFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.564 29.316 C 21.0 28.46 21.0 27.34 21.0 25.1 V 19.0 h -7.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 7.0 v -6.1 c 0.0 -2.24 0.0 -3.36 -0.436 -4.216 c -0.383 -0.753 -0.995 -1.365 -1.747 -1.748 C 17.96 4.5 16.84 4.5 14.6 4.5 h -2.2 c -2.24 0.0 -3.36 0.0 -4.216 0.436 C 7.432 5.319 6.82 5.931 6.436 6.684 C 6.0 7.54 6.0 8.66 6.0 10.9 v 14.2 c 0.0 2.24 0.0 3.36 0.436 4.216 c 0.384 0.753 0.996 1.364 1.749 1.748 C 9.04 31.5 10.16 31.5 12.4 31.5 h 2.2 c 2.24 0.0 3.36 0.0 4.217 -0.436 c 0.752 -0.384 1.364 -0.995 1.747 -1.748 Z M 21.0 17.0 h 6.063 l -2.867 -2.829 c -0.393 -0.388 -0.398 -1.02 -0.01 -1.414 c 0.388 -0.393 1.021 -0.397 1.414 -0.01 l 4.603 4.54 C 30.393 17.477 30.5 17.733 30.5 18.0 c 0.0 0.267 -0.108 0.524 -0.298 0.712 l -4.603 4.54 c -0.393 0.388 -1.026 0.384 -1.414 -0.01 c -0.388 -0.393 -0.383 -1.026 0.01 -1.414 L 27.063 19.0 H 21.0 v -2.0 Z")
        )
    }.build()
}
