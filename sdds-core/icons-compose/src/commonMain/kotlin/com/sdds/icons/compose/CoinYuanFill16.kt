package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinYuanFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinYuanFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.3 8.3 c 0.0 1.295 -0.39 2.499 -1.06 3.5 H 8.218 C 8.385 11.719 8.5 11.548 8.5 11.35 v -0.415 h 1.46 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 8.5 V 9.104 h 1.46 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 8.926 l 1.592 -2.43 c 0.152 -0.23 0.087 -0.54 -0.144 -0.692 c -0.23 -0.152 -0.54 -0.087 -0.692 0.144 L 8.0 7.692 L 6.318 5.126 C 6.167 4.895 5.857 4.83 5.626 4.982 C 5.395 5.133 5.33 5.443 5.482 5.674 l 1.592 2.43 H 6.04 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 7.5 v 0.83 H 6.04 c -0.276 0.0 -0.5 0.225 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 H 7.5 v 0.416 c 0.0 0.198 0.115 0.369 0.282 0.45 h -5.02 C 2.092 10.799 1.7 9.595 1.7 8.3 C 1.7 4.82 4.52 2.0 8.0 2.0 s 6.3 2.82 6.3 6.3 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.525 12.85 C 1.235 12.85 1.0 13.085 1.0 13.375 c 0.0 0.29 0.235 0.525 0.525 0.525 h 12.95 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 1.525 Z")
        )
    }.build()
}
