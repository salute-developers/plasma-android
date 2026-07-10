package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowsMoveHoriz16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowsMoveHoriz16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.217 4.903 C 6.41 5.103 6.403 5.42 6.204 5.61 L 3.72 8.0 l 2.483 2.39 c 0.199 0.191 0.205 0.508 0.013 0.707 c -0.191 0.199 -0.508 0.205 -0.707 0.013 L 2.653 8.36 C 2.555 8.266 2.5 8.136 2.5 8.0 c 0.0 -0.136 0.055 -0.266 0.153 -0.36 L 5.51 4.89 c 0.2 -0.192 0.516 -0.186 0.707 0.013 Z m 3.566 0.0 C 9.974 4.704 10.29 4.698 10.49 4.89 l 2.857 2.75 C 13.445 7.734 13.5 7.864 13.5 8.0 c 0.0 0.136 -0.055 0.266 -0.153 0.36 l -2.857 2.75 c -0.2 0.192 -0.516 0.186 -0.707 -0.013 c -0.192 -0.2 -0.186 -0.516 0.013 -0.707 L 12.28 8.0 L 9.796 5.61 C 9.597 5.42 9.591 5.102 9.783 4.903 Z")
        )
    }.build()
}
