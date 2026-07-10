package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DropFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DropFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.453 2.182 c 0.321 -0.243 0.773 -0.243 1.094 0.0 l 0.167 0.13 l 0.36 0.293 c 0.2 0.167 0.415 0.353 0.642 0.556 c 0.862 0.771 1.723 1.64 2.528 2.59 C 18.584 8.514 20.0 11.395 20.0 14.287 C 20.0 18.546 16.418 22.0 12.0 22.0 s -8.0 -3.454 -8.0 -7.714 c 0.0 -2.892 1.416 -5.773 3.756 -8.534 c 0.806 -0.95 1.667 -1.82 2.528 -2.591 c 0.227 -0.203 0.442 -0.389 0.642 -0.556 l 0.195 -0.16 l 0.332 -0.263 Z")
        )
    }.build()
}
