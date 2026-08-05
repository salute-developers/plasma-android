package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RulerFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RulerFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.06 1.353 c -0.48 -0.473 -1.254 -0.47 -1.73 0.006 l -9.97 9.966 c -0.477 0.477 -0.48 1.248 -0.007 1.728 l 1.556 1.58 c 0.478 0.487 1.262 0.49 1.744 0.007 l 9.988 -9.994 c 0.481 -0.482 0.478 -1.263 -0.007 -1.74 L 13.06 1.352 Z M 8.615 5.377 l 0.893 0.892 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.196 -0.195 0.196 -0.511 0.0 -0.707 L 9.322 4.67 L 8.615 5.377 Z m -5.953 5.949 l 0.893 0.892 c 0.195 0.196 0.512 0.196 0.707 0.0 c 0.196 -0.195 0.196 -0.511 0.0 -0.707 L 3.37 10.62 l -0.707 0.707 Z m 1.984 -1.983 l 0.893 0.893 c 0.196 0.195 0.512 0.195 0.708 0.0 c 0.195 -0.196 0.195 -0.512 0.0 -0.707 L 5.354 8.636 L 4.646 9.343 Z m 2.879 -1.091 L 6.632 7.36 l 0.707 -0.707 l 0.893 0.892 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 Z m 3.968 -3.965 L 10.6 3.394 l 0.708 -0.707 L 12.2 3.58 c 0.195 0.195 0.195 0.511 0.0 0.707 c -0.196 0.195 -0.512 0.195 -0.708 0.0 Z")
        )
    }.build()
}
