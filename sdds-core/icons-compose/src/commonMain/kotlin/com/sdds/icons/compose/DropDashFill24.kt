package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropDashFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropDashFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.688 2.182 c 0.322 -0.243 0.773 -0.243 1.095 0.0 l 0.166 0.13 l 0.36 0.293 c 0.2 0.167 0.416 0.353 0.642 0.556 c 0.862 0.771 1.723 1.64 2.528 2.59 c 0.146 0.173 0.288 0.345 0.427 0.518 l 3.284 -3.285 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.294 0.293 0.294 0.768 0.0 1.061 L 4.28 21.015 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 1.985 -1.985 c -0.618 -1.095 -0.97 -2.35 -0.97 -3.684 c 0.0 -2.892 1.417 -5.773 3.756 -8.534 c 0.806 -0.95 1.667 -1.82 2.528 -2.591 c 0.227 -0.203 0.442 -0.389 0.642 -0.556 l 0.195 -0.16 l 0.332 -0.263 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.165 20.253 L 18.63 8.787 c 1.027 1.81 1.604 3.652 1.604 5.499 c 0.0 4.26 -3.582 7.714 -8.0 7.714 c -1.924 0.0 -3.69 -0.655 -5.07 -1.747 Z")
        )
    }.build()
}
