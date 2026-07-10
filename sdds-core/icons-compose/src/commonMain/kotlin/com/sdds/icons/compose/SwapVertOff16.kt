package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVertOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVertOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.443 2.354 c 0.196 -0.196 0.196 -0.512 0.0 -0.708 c -0.195 -0.195 -0.511 -0.195 -0.707 0.0 L 11.81 3.572 v -0.57 c 0.0 -0.275 -0.224 -0.5 -0.5 -0.5 s -0.5 0.225 -0.5 0.5 v 1.57 l -5.624 5.625 V 4.232 l 1.583 1.62 c 0.193 0.198 0.51 0.202 0.707 0.01 c 0.197 -0.194 0.201 -0.51 0.008 -0.708 l -2.44 -2.5 C 4.95 2.56 4.821 2.505 4.686 2.505 c -0.134 0.0 -0.263 0.055 -0.357 0.15 l -2.44 2.5 c -0.194 0.198 -0.19 0.514 0.008 0.707 c 0.197 0.193 0.514 0.19 0.707 -0.008 l 1.582 -1.621 v 6.965 l -2.33 2.329 c -0.194 0.195 -0.194 0.512 0.0 0.707 c 0.196 0.195 0.513 0.195 0.708 0.0 l 11.88 -11.88 Z m -3.633 9.418 V 7.396 l 1.0 -1.0 v 5.376 l 1.583 -1.62 c 0.193 -0.198 0.51 -0.202 0.707 -0.01 c 0.197 0.194 0.201 0.51 0.008 0.708 l -2.44 2.499 c -0.094 0.096 -0.223 0.15 -0.358 0.15 c -0.134 0.0 -0.263 -0.054 -0.357 -0.15 l -2.44 -2.5 c -0.194 -0.197 -0.19 -0.513 0.008 -0.706 c 0.197 -0.193 0.514 -0.19 0.707 0.008 l 1.582 1.62 Z")
        )
    }.build()
}
