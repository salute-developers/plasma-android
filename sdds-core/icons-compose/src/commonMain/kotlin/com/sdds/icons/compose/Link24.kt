package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Link24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Link24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.28 18.718 c -1.562 -1.562 -1.562 -4.095 0.0 -5.657 l 1.944 -1.944 c 0.293 -0.293 0.293 -0.768 0.0 -1.061 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -1.945 1.945 c -2.148 2.147 -2.148 5.63 0.0 7.778 c 2.148 2.148 5.63 2.148 7.778 0.0 l 1.945 -1.945 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 l -1.945 1.944 c -1.562 1.562 -4.095 1.562 -5.657 0.0 Z m 4.773 -12.551 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.06 0.0 l 1.945 -1.944 c 1.562 -1.562 4.095 -1.562 5.657 0.0 c 1.562 1.562 1.562 4.095 0.0 5.657 l -1.945 1.944 c -0.293 0.293 -0.293 0.768 0.0 1.061 c 0.293 0.293 0.768 0.293 1.061 0.0 l 1.945 -1.944 c 2.147 -2.148 2.147 -5.63 0.0 -7.779 c -2.148 -2.148 -5.63 -2.148 -7.779 0.0 l -1.944 1.945 Z m -2.475 9.192 c -0.293 0.293 -0.293 0.768 0.0 1.061 c 0.293 0.293 0.768 0.293 1.06 0.0 l 7.779 -7.778 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.06 0.0 l -7.78 7.777 Z")
        )
    }.build()
}
