package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowAdd36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowAdd36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 18.0 c 4.694 0.0 8.5 3.806 8.5 8.5 S 31.194 35.0 26.5 35.0 S 18.0 31.194 18.0 26.5 s 3.806 -8.5 8.5 -8.5 Z m 0.001 3.113 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 3.887 h -3.887 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 3.887 v 3.886 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 V 27.25 h 3.886 l 0.077 -0.004 c 0.378 -0.039 0.673 -0.358 0.673 -0.746 s -0.295 -0.707 -0.673 -0.746 l -0.077 -0.004 H 27.25 v -3.887 c 0.0 -0.413 -0.336 -0.75 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.75 6.0 C 30.65 6.0 33.0 8.35 33.0 11.25 v 7.653 c -1.199 -1.027 -2.643 -1.774 -4.233 -2.142 c 1.155 -0.417 1.983 -1.52 1.983 -2.82 v -2.824 c 0.0 -1.656 -1.343 -3.0 -3.0 -3.0 H 8.25 c -1.657 0.0 -3.0 1.344 -3.0 3.0 v 2.824 c 0.0 1.657 1.343 3.0 3.0 3.0 h 15.304 c -1.4 0.432 -2.67 1.163 -3.733 2.118 H 8.25 c -1.657 0.0 -3.0 1.343 -3.0 3.0 v 2.824 c 0.0 1.657 1.343 3.0 3.0 3.0 h 8.348 c 0.101 0.734 0.28 1.443 0.533 2.117 H 8.25 C 5.35 30.0 3.0 27.65 3.0 24.75 v -13.5 C 3.0 8.35 5.35 6.0 8.25 6.0 h 19.5 Z")
        )
    }.build()
}
