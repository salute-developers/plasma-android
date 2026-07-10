package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellErrorFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellErrorFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 6.5 c 0.0 3.038 -2.462 5.5 -5.5 5.5 S 12.0 9.538 12.0 6.5 S 14.462 1.0 17.5 1.0 S 23.0 3.462 23.0 6.5 Z m -7.975 -2.475 c 0.195 -0.195 0.512 -0.195 0.707 0.0 L 17.5 5.793 l 1.768 -1.768 c 0.195 -0.195 0.512 -0.195 0.707 0.0 c 0.195 0.195 0.195 0.512 0.0 0.707 L 18.207 6.5 l 1.768 1.768 c 0.195 0.195 0.195 0.512 0.0 0.707 c -0.195 0.195 -0.512 0.195 -0.707 0.0 L 17.5 7.207 l -1.768 1.768 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 L 16.793 6.5 l -1.768 -1.768 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.5 13.0 c 0.322 0.0 0.64 -0.024 0.95 -0.069 l 0.03 0.825 l 0.015 0.453 c 0.036 1.09 0.07 2.119 0.166 3.041 H 19.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -15.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 0.839 c 0.097 -0.922 0.13 -1.95 0.166 -3.041 l 0.015 -0.453 c 0.05 -1.496 0.122 -3.083 0.4 -4.523 c 0.278 -1.437 0.777 -2.819 1.751 -3.844 C 8.29 4.74 9.066 4.266 10.022 4.0 H 10.0 c 0.0 -0.263 0.052 -0.523 0.152 -0.765 c 0.1 -0.243 0.248 -0.463 0.434 -0.65 c 0.185 -0.185 0.406 -0.332 0.649 -0.433 C 11.477 2.052 11.737 2.0 12.0 2.0 c 0.237 0.0 0.472 0.042 0.694 0.124 C 11.64 3.28 11.0 4.814 11.0 6.5 c 0.0 3.59 2.91 6.5 6.5 6.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.17 20.0 c 0.412 1.165 1.524 2.0 2.83 2.0 s 2.417 -0.835 2.83 -2.0 H 9.17 Z")
        )
    }.build()
}
