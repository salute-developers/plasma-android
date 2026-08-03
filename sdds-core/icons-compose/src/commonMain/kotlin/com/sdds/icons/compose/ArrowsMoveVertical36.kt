package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowsMoveVertical36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowsMoveVertical36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.707 6.793 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 l -6.0 6.0 c -0.39 0.39 -0.39 1.024 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 18.0 8.914 l 5.293 5.293 c 0.39 0.39 1.024 0.39 1.414 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 l -6.0 -6.0 Z m -6.0 15.0 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 c -0.39 0.39 -0.39 1.024 0.0 1.414 l 6.0 6.0 c 0.39 0.39 1.024 0.39 1.414 0.0 l 6.0 -6.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 L 18.0 27.086 l -5.293 -5.293 Z")
        )
    }.build()
}
