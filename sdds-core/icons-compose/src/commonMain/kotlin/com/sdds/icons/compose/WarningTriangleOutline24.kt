package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WarningTriangleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WarningTriangleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.134 6.5 c 0.385 -0.667 1.347 -0.667 1.732 0.0 L 18.928 17.0 c 0.385 0.667 -0.096 1.5 -0.866 1.5 H 5.938 c -0.77 0.0 -1.251 -0.833 -0.866 -1.5 l 6.062 -10.5 Z M 6.804 17.0 L 12.0 8.0 l 5.196 9.0 H 6.804 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.835 5.75 c 0.962 -1.667 3.368 -1.667 4.33 0.0 l 6.062 10.5 c 0.962 1.667 -0.24 3.75 -2.165 3.75 H 5.938 c -1.925 0.0 -3.127 -2.083 -2.165 -3.75 l 6.062 -10.5 Z m 3.464 0.5 l 6.062 10.5 c 0.578 1.0 -0.144 2.25 -1.299 2.25 H 5.938 c -1.155 0.0 -1.877 -1.25 -1.3 -2.25 l 6.063 -10.5 c 0.577 -1.0 2.02 -1.0 2.598 0.0 Z")
        )
    }.build()
}
