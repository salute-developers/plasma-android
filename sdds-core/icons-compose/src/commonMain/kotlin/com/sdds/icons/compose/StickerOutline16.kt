package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StickerOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StickerOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.975 2.046 L 6.948 2.051 C 4.135 2.557 2.0 5.019 2.0 7.978 C 2.0 11.304 4.696 14.0 8.022 14.0 c 2.96 0.0 5.42 -2.135 5.927 -4.948 l 0.005 -0.027 c -0.433 0.103 -0.885 0.158 -1.349 0.158 c -3.196 0.0 -5.788 -2.592 -5.788 -5.788 c 0.0 -0.464 0.055 -0.916 0.158 -1.349 Z m 1.0 0.127 c -0.103 0.39 -0.158 0.799 -0.158 1.222 c 0.0 2.644 2.144 4.788 4.788 4.788 c 0.423 0.0 0.832 -0.055 1.222 -0.157 c -0.078 -0.132 -0.177 -0.236 -0.462 -0.52 l -4.87 -4.87 C 8.21 2.35 8.105 2.25 7.975 2.172 Z m -1.19 -1.109 C 7.06 1.014 7.26 0.98 7.588 1.015 c 0.057 0.006 0.115 0.016 0.17 0.028 c 0.209 0.044 0.474 0.132 0.657 0.231 c 0.29 0.157 0.487 0.354 0.755 0.622 l 0.032 0.032 l 4.87 4.87 l 0.032 0.032 c 0.268 0.268 0.465 0.464 0.622 0.755 c 0.1 0.183 0.187 0.448 0.231 0.657 c 0.012 0.055 0.022 0.113 0.028 0.17 c 0.037 0.327 0.0 0.527 -0.05 0.804 l -0.002 0.013 C 14.343 12.51 11.473 15.0 8.023 15.0 C 4.143 15.0 1.0 11.856 1.0 7.978 c 0.0 -3.452 2.49 -6.32 5.771 -6.911 l 0.014 -0.003 Z")
        )
    }.build()
}
