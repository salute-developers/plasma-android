package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KidsOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KidsOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 11.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 S 7.552 9.0 7.0 9.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 10.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.298 10.955 c -0.308 0.308 -0.676 0.552 -1.08 0.715 c -0.405 0.164 -0.838 0.244 -1.274 0.236 c -0.436 -0.007 -0.866 -0.102 -1.265 -0.28 c -0.398 -0.177 -0.757 -0.433 -1.055 -0.752 l -1.096 1.024 c 0.435 0.466 0.959 0.84 1.541 1.099 c 0.583 0.259 1.212 0.398 1.85 0.41 c 0.637 0.01 1.27 -0.107 1.86 -0.346 c 0.592 -0.24 1.129 -0.595 1.58 -1.045 l -1.06 -1.061 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.5 c -4.417 0.0 -8.129 3.014 -9.193 7.098 C 1.763 9.898 1.0 10.86 1.0 12.0 c 0.0 1.14 0.763 2.102 1.807 2.402 C 3.87 18.486 7.583 21.5 12.0 21.5 s 8.129 -3.014 9.193 -7.098 C 22.237 14.102 23.0 13.14 23.0 12.0 c 0.0 -1.14 -0.763 -2.102 -1.807 -2.402 C 20.13 5.514 16.417 2.5 12.0 2.5 Z m -7.84 7.9 C 4.9 6.75 8.13 4.0 12.0 4.0 c 3.87 0.0 7.1 2.749 7.84 6.4 l 0.117 0.576 l 0.587 0.025 C 21.075 11.023 21.5 11.462 21.5 12.0 s -0.425 0.977 -0.956 1.0 l -0.587 0.024 l -0.117 0.575 C 19.1 17.251 15.87 20.0 12.0 20.0 c -3.87 0.0 -7.1 -2.749 -7.84 -6.4 l -0.117 -0.576 l -0.587 -0.025 C 2.925 12.977 2.5 12.538 2.5 12.0 s 0.425 -0.977 0.956 -1.0 l 0.587 -0.024 l 0.117 -0.575 Z")
        )
    }.build()
}
