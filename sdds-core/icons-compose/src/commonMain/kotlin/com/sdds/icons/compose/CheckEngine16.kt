package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CheckEngine16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CheckEngine16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.722 3.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 4.514 c 0.276 0.0 0.5 0.224 0.5 0.5 S 10.012 4.0 9.736 4.0 H 8.0 v 0.75 h 2.014 c 0.314 0.0 0.57 0.255 0.57 0.57 v 0.83 h 1.166 c 0.315 0.0 0.57 0.255 0.57 0.57 v 0.83 h 0.273 l 0.487 -0.738 c 0.226 -0.34 0.726 -0.34 0.951 0.0 l 0.625 0.945 C 14.717 7.85 14.75 7.959 14.75 8.07 v 2.408 c 0.0 0.112 -0.033 0.221 -0.094 0.314 l -0.625 0.945 c -0.225 0.34 -0.725 0.34 -0.95 0.0 L 12.592 11.0 H 12.32 v 1.18 c 0.0 0.315 -0.255 0.57 -0.57 0.57 H 7.678 c -0.13 0.0 -0.257 -0.045 -0.358 -0.126 L 5.74 11.35 H 3.556 c -0.314 0.0 -0.57 -0.255 -0.57 -0.57 V 9.0 H 2.25 v 1.85 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 6.3 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 V 8.0 h 0.736 V 6.37 c 0.0 -0.315 0.256 -0.57 0.57 -0.57 h 0.82 V 5.32 c 0.0 -0.315 0.254 -0.57 0.57 -0.57 H 7.0 V 4.0 H 5.222 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.653 2.25 h 4.209 v 0.83 c 0.0 0.315 0.255 0.57 0.57 0.57 h 1.166 v 0.893 c 0.0 0.28 0.227 0.507 0.507 0.507 h 1.03 c 0.17 0.0 0.33 -0.085 0.423 -0.227 l 0.276 -0.417 L 13.75 8.2 v 2.15 l -0.194 0.294 l -0.276 -0.417 C 13.187 10.085 13.028 10.0 12.858 10.0 h -1.031 c -0.28 0.0 -0.507 0.227 -0.507 0.507 v 1.243 H 7.83 l -1.58 -1.274 c -0.101 -0.081 -0.228 -0.126 -0.358 -0.126 H 3.986 V 6.8 h 0.82 c 0.314 0.0 0.57 -0.255 0.57 -0.57 V 5.75 Z")
        )
    }.build()
}
