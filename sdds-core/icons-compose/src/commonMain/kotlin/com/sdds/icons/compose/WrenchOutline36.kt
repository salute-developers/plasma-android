package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WrenchOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WrenchOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.533 5.482 c 2.573 -2.573 6.387 -3.144 9.51 -1.72 c 0.3 0.136 0.512 0.41 0.57 0.733 c 0.058 0.322 -0.045 0.653 -0.277 0.884 l -3.891 3.892 c -0.195 0.195 -0.195 0.512 0.0 0.707 l 1.578 1.578 c 0.196 0.196 0.512 0.196 0.707 0.0 l 3.891 -3.89 c 0.232 -0.232 0.563 -0.336 0.885 -0.277 c 0.323 0.058 0.596 0.27 0.732 0.569 c 1.424 3.124 0.853 6.937 -1.72 9.51 c -2.182 2.182 -5.257 2.924 -8.046 2.23 L 10.95 31.222 c -1.704 1.704 -4.467 1.704 -6.171 0.0 c -1.705 -1.704 -1.705 -4.467 0.0 -6.17 l 11.524 -11.525 c -0.693 -2.788 0.05 -5.863 2.231 -8.045 Z m 7.235 -0.363 c -2.043 -0.397 -4.24 0.196 -5.82 1.777 c -1.787 1.787 -2.313 4.358 -1.573 6.609 c 0.118 0.358 0.024 0.752 -0.242 1.02 L 6.192 26.464 c -0.923 0.923 -0.923 2.42 0.0 3.343 s 2.42 0.923 3.342 0.0 l 11.94 -11.94 c 0.268 -0.267 0.662 -0.361 1.02 -0.243 c 2.251 0.74 4.823 0.215 6.61 -1.572 c 1.58 -1.58 2.174 -3.776 1.777 -5.819 l -2.736 2.737 c -0.976 0.976 -2.56 0.976 -3.536 0.0 l -1.578 -1.579 c -0.977 -0.976 -0.977 -2.56 0.0 -3.536 l 2.737 -2.737 Z")
        )
    }.build()
}
