package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PauseFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PauseFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.245 6.729 C 9.0 7.209 9.0 7.839 9.0 9.1 v 17.8 c 0.0 1.26 0.0 1.89 0.245 2.372 c 0.216 0.423 0.56 0.767 0.984 0.983 c 0.48 0.245 1.11 0.245 2.371 0.245 h 0.3 c 1.26 0.0 1.89 0.0 2.371 -0.245 c 0.424 -0.216 0.768 -0.56 0.984 -0.983 C 16.5 28.79 16.5 28.16 16.5 26.9 V 9.1 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 C 14.79 5.5 14.16 5.5 12.9 5.5 h -0.3 c -1.26 0.0 -1.89 0.0 -2.371 0.245 C 9.805 5.961 9.46 6.305 9.245 6.73 Z m 17.51 22.543 C 27.0 28.79 27.0 28.16 27.0 26.9 V 9.1 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 C 25.29 5.5 24.66 5.5 23.4 5.5 h -0.3 c -1.26 0.0 -1.89 0.0 -2.372 0.245 c -0.423 0.216 -0.767 0.56 -0.983 0.984 C 19.5 7.209 19.5 7.839 19.5 9.1 v 17.8 c 0.0 1.26 0.0 1.89 0.245 2.372 c 0.216 0.423 0.56 0.767 0.983 0.983 C 21.21 30.5 21.84 30.5 23.1 30.5 h 0.3 c 1.26 0.0 1.89 0.0 2.372 -0.245 c 0.423 -0.216 0.767 -0.56 0.983 -0.983 Z")
        )
    }.build()
}
