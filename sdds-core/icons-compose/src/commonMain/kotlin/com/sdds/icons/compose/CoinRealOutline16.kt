package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRealOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRealOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 2.0 C 6.893 2.0 5.806 2.294 4.848 2.852 C 3.89 3.41 3.095 4.212 2.543 5.178 C 1.99 6.143 1.7 7.238 1.7 8.353 c 0.0 1.114 0.29 2.209 0.843 3.174 c 0.144 0.252 0.464 0.34 0.716 0.195 c 0.252 -0.144 0.34 -0.465 0.195 -0.716 C 2.993 10.199 2.75 9.284 2.75 8.353 c 0.0 -0.932 0.243 -1.847 0.704 -2.654 c 0.461 -0.806 1.125 -1.475 1.922 -1.94 C 6.175 3.294 7.08 3.05 8.0 3.05 c 0.92 0.0 1.825 0.245 2.623 0.71 c 0.798 0.465 1.461 1.134 1.922 1.94 c 0.462 0.807 0.705 1.722 0.705 2.654 c 0.0 0.931 -0.243 1.846 -0.705 2.653 c -0.144 0.251 -0.056 0.572 0.195 0.716 c 0.252 0.144 0.573 0.057 0.717 -0.195 c 0.552 -0.965 0.843 -2.06 0.843 -3.174 c 0.0 -1.115 -0.29 -2.21 -0.843 -3.175 c -0.553 -0.966 -1.348 -1.768 -2.306 -2.326 C 10.194 2.294 9.107 2.0 8.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.525 12.949 C 1.235 12.949 1.0 13.184 1.0 13.474 c 0.0 0.29 0.236 0.525 0.525 0.525 h 12.95 c 0.29 0.0 0.526 -0.235 0.526 -0.525 c 0.0 -0.29 -0.236 -0.525 -0.525 -0.525 H 1.526 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 5.7 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.318 C 7.413 5.2 8.3 6.087 8.3 7.182 c 0.0 0.803 -0.477 1.494 -1.162 1.806 l 1.104 2.077 c 0.13 0.244 0.037 0.547 -0.207 0.677 s -0.547 0.036 -0.676 -0.208 l -1.26 -2.37 H 5.5 V 11.3 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 5.7 Z m 1.0 2.465 h 0.818 c 0.542 0.0 0.982 -0.44 0.982 -0.983 C 7.3 6.64 6.86 6.2 6.318 6.2 H 5.5 v 1.965 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.75 5.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 9.75 4.724 9.75 5.0 v 0.527 C 9.14 5.735 8.7 6.314 8.7 6.995 V 7.1 c 0.0 0.856 0.694 1.55 1.55 1.55 c 0.304 0.0 0.55 0.246 0.55 0.55 v 0.105 c 0.0 0.304 -0.246 0.55 -0.55 0.55 H 9.433 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 9.75 V 11.3 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -0.527 c 0.61 -0.208 1.05 -0.787 1.05 -1.468 V 9.2 c 0.0 -0.856 -0.694 -1.55 -1.55 -1.55 c -0.304 0.0 -0.55 -0.246 -0.55 -0.55 V 6.995 c 0.0 -0.304 0.246 -0.55 0.55 -0.55 h 0.817 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 10.75 V 5.0 Z")
        )
    }.build()
}
