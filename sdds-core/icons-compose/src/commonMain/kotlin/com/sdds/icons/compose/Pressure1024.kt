package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Pressure1024: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Pressure1024",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.203 12.737 c 0.21 -0.224 0.536 -0.297 0.822 -0.184 c 0.287 0.113 0.475 0.39 0.475 0.697 v 8.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 9.0 21.664 9.0 21.25 v -6.104 L 7.797 16.43 c -0.283 0.302 -0.758 0.317 -1.06 0.034 c -0.302 -0.283 -0.317 -0.758 -0.034 -1.06 l 2.5 -2.667 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.75 12.5 c 0.966 0.0 1.75 0.784 1.75 1.75 v 6.0 c 0.0 0.967 -0.784 1.75 -1.75 1.75 h -2.0 C 12.784 22.0 12.0 21.217 12.0 20.25 v -6.0 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 h 2.0 Z m -2.0 1.5 c -0.138 0.0 -0.25 0.112 -0.25 0.25 v 6.0 c 0.0 0.138 0.112 0.25 0.25 0.25 h 2.0 c 0.138 0.0 0.25 -0.112 0.25 -0.25 v -6.0 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.015 2.0 c 1.51 0.0 2.735 1.225 2.735 2.735 c 0.0 1.511 -1.225 2.736 -2.735 2.736 H 6.25 v 2.78 C 6.25 10.663 5.914 11.0 5.5 11.0 s -0.75 -0.337 -0.75 -0.75 v -7.5 C 4.75 2.335 5.086 2.0 5.5 2.0 h 2.515 Z M 6.25 5.97 h 1.765 c 0.682 0.0 1.235 -0.552 1.235 -1.235 C 9.25 4.053 8.697 3.5 8.015 3.5 H 6.25 v 2.47 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.895 2.307 c 0.192 -0.262 0.53 -0.37 0.838 -0.27 c 0.309 0.101 0.517 0.389 0.517 0.713 v 7.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 5.04 l -1.395 1.903 C 16.213 7.136 15.989 7.25 15.75 7.25 s -0.463 -0.114 -0.604 -0.307 L 13.75 5.04 v 5.21 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -7.5 c 0.0 -0.324 0.208 -0.612 0.517 -0.713 c 0.308 -0.1 0.646 0.008 0.838 0.27 l 2.145 2.925 l 2.145 -2.925 Z")
        )
    }.build()
}
