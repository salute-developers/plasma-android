package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ClipPlus36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ClipPlus36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.276 7.361 c -3.466 -3.466 -9.086 -3.466 -12.552 0.0 L 4.057 19.028 c -0.39 0.39 -0.39 1.024 0.0 1.415 c 0.39 0.39 1.024 0.39 1.414 0.0 L 17.14 8.775 c 2.684 -2.684 7.037 -2.684 9.722 0.0 c 2.128 2.128 2.57 5.304 1.325 7.866 c 0.676 0.115 1.33 0.298 1.953 0.541 c 1.413 -3.246 0.792 -7.165 -1.863 -9.82 Z m -10.84 23.37 c -0.31 -0.663 -0.55 -1.366 -0.708 -2.1 l -0.426 0.426 c -1.067 1.068 -2.746 1.22 -3.988 0.36 c -1.603 -1.11 -1.81 -3.4 -0.431 -4.78 L 22.442 14.08 c 0.39 -0.39 0.39 -1.024 0.0 -1.415 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 l -10.56 10.56 c -2.26 2.26 -1.921 6.017 0.708 7.837 c 1.93 1.337 4.506 1.183 6.26 -0.33 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 35.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 c 0.0 -4.695 -3.806 -8.5 -8.5 -8.5 c -4.695 0.0 -8.5 3.805 -8.5 8.5 c 0.0 4.694 3.805 8.5 8.5 8.5 Z m 0.75 -13.137 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 3.887 h -3.886 c -0.415 0.0 -0.75 0.336 -0.75 0.75 s 0.335 0.75 0.75 0.75 h 3.886 v 3.886 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 V 27.25 h 3.886 c 0.415 0.0 0.75 -0.336 0.75 -0.75 s -0.335 -0.75 -0.75 -0.75 H 27.25 v -3.887 Z")
        )
    }.build()
}
