package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MoneybagOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MoneybagOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.6 4.5 c -0.364 0.0 -0.7 0.198 -0.875 0.516 C 7.548 5.334 7.559 5.723 7.752 6.03 l 3.876 6.18 c -3.163 1.57 -5.588 4.475 -6.465 8.084 l -0.17 0.696 c -1.3 5.351 2.753 10.508 8.26 10.508 h 9.496 c 5.507 0.0 9.56 -5.157 8.26 -10.508 l -0.17 -0.696 c -0.877 -3.609 -3.302 -6.515 -6.465 -8.083 l 3.876 -6.18 c 0.193 -0.309 0.203 -0.698 0.027 -1.016 c -0.176 -0.318 -0.51 -0.516 -0.875 -0.516 H 8.6 Z m 5.066 7.197 L 10.407 6.5 h 15.188 l -3.259 5.197 h -8.67 Z m -0.47 2.0 c -2.978 1.215 -5.294 3.799 -6.09 7.07 l -0.169 0.696 C 5.942 25.555 9.042 29.5 13.253 29.5 h 9.496 c 4.212 0.0 7.311 -3.944 6.316 -8.036 l -0.17 -0.695 c -0.795 -3.273 -3.111 -5.856 -6.088 -7.07 h -9.611 Z")
        )
    }.build()
}
