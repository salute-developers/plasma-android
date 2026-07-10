package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowsMoveVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowsMoveVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.361 2.653 C 8.267 2.555 8.137 2.5 8.001 2.5 c -0.136 0.0 -0.266 0.055 -0.36 0.153 L 4.89 5.51 C 4.698 5.709 4.704 6.025 4.903 6.217 c 0.2 0.191 0.516 0.185 0.707 -0.013 L 8.001 3.72 l 2.391 2.482 c 0.192 0.2 0.508 0.205 0.707 0.014 c 0.2 -0.192 0.205 -0.508 0.014 -0.707 L 8.36 2.653 Z m -2.75 7.142 C 5.418 9.595 5.101 9.59 4.902 9.78 C 4.704 9.973 4.698 10.29 4.89 10.488 l 2.751 2.857 c 0.094 0.098 0.224 0.153 0.36 0.153 c 0.136 0.0 0.266 -0.055 0.36 -0.153 l 2.752 -2.857 c 0.191 -0.198 0.185 -0.515 -0.014 -0.707 c -0.199 -0.191 -0.515 -0.185 -0.707 0.014 l -2.39 2.482 L 5.61 9.796 Z")
        )
    }.build()
}
