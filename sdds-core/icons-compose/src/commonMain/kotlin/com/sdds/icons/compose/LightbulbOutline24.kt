package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LightbulbOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LightbulbOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.97 9.97 c 0.293 -0.293 0.767 -0.293 1.06 0.0 L 12.0 11.94 l 1.97 -1.97 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 l -2.28 2.28 v 2.19 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -2.19 l -2.28 -2.28 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.5 9.5 C 4.5 5.358 7.858 2.0 12.0 2.0 c 4.142 0.0 7.5 3.358 7.5 7.5 c 0.0 2.255 -0.996 4.278 -2.57 5.652 c -0.287 0.25 -0.475 0.533 -0.544 0.82 l -0.224 0.925 C 15.863 18.131 14.759 19.0 13.489 19.0 h -2.978 c -1.27 0.0 -2.374 -0.869 -2.673 -2.103 l -0.224 -0.926 c -0.07 -0.286 -0.257 -0.568 -0.544 -0.82 C 5.496 13.779 4.5 11.756 4.5 9.5 Z m 7.5 -6.0 c -3.314 0.0 -6.0 2.686 -6.0 6.0 c 0.0 1.804 0.795 3.42 2.056 4.522 c 0.452 0.394 0.854 0.93 1.016 1.596 l 0.224 0.926 c 0.136 0.561 0.638 0.956 1.215 0.956 h 2.978 c 0.577 0.0 1.08 -0.395 1.215 -0.956 l 0.224 -0.926 c 0.162 -0.667 0.564 -1.202 1.016 -1.596 C 17.205 12.92 18.0 11.304 18.0 9.5 c 0.0 -3.314 -2.686 -6.0 -6.0 -6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.5 20.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 9.086 22.0 9.5 22.0 h 5.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -5.0 Z")
        )
    }.build()
}
