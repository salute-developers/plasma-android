package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRialFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRialFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.3 8.3 c 0.0 1.295 -0.39 2.499 -1.06 3.5 h -2.33 c 0.198 -0.149 0.26 -0.425 0.135 -0.646 L 9.813 8.977 c 0.76 -0.304 1.297 -1.047 1.297 -1.915 C 11.11 5.923 10.187 5.0 9.048 5.0 H 7.466 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 5.9 c 0.0 0.164 0.078 0.309 0.2 0.4 H 5.67 c 0.121 -0.091 0.2 -0.236 0.2 -0.4 V 5.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 5.9 c 0.0 0.164 0.079 0.309 0.2 0.4 H 2.762 C 2.092 10.799 1.7 9.595 1.7 8.3 C 1.7 4.82 4.52 2.0 8.0 2.0 s 6.3 2.82 6.3 6.3 Z m -6.534 3.5 c 0.121 -0.091 0.2 -0.236 0.2 -0.4 V 9.124 h 0.78 l 1.429 2.522 c 0.035 0.062 0.081 0.114 0.135 0.154 H 7.766 Z m 1.262 -3.676 H 7.966 V 6.0 h 1.082 c 0.587 0.0 1.062 0.475 1.062 1.062 c 0.0 0.586 -0.475 1.062 -1.062 1.062 H 9.047 h -0.01 h -0.009 Z M 1.525 12.85 C 1.235 12.85 1.0 13.085 1.0 13.375 c 0.0 0.29 0.235 0.525 0.525 0.525 h 12.95 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 1.525 Z")
        )
    }.build()
}
