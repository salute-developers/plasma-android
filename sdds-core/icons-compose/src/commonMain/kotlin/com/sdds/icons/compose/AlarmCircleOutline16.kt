package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AlarmCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AlarmCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.105 0.898 C 4.299 1.094 4.298 1.41 4.102 1.605 l -2.5 2.483 C 1.406 4.282 1.09 4.28 0.895 4.085 C 0.701 3.89 0.702 3.573 0.898 3.378 l 2.5 -2.483 C 3.593 0.701 3.91 0.702 4.105 0.898 Z m 7.79 0.0 c 0.194 -0.196 0.51 -0.197 0.707 -0.003 l 2.5 2.483 c 0.196 0.195 0.197 0.511 0.002 0.707 c -0.194 0.196 -0.511 0.197 -0.707 0.003 l -2.5 -2.483 C 11.701 1.41 11.7 1.094 11.895 0.898 Z M 7.999 2.66 c -2.948 0.0 -5.333 2.373 -5.333 5.293 c 0.0 1.461 0.596 2.783 1.56 3.742 c 0.966 0.959 2.3 1.552 3.773 1.552 c 1.31 0.0 2.508 -0.468 3.436 -1.244 c 1.162 -0.973 1.898 -2.426 1.898 -4.05 c 0.0 -2.92 -2.385 -5.293 -5.334 -5.293 Z M 1.666 7.953 c 0.0 -3.479 2.839 -6.293 6.333 -6.293 c 3.495 0.0 6.334 2.814 6.334 6.293 c 0.0 1.738 -0.71 3.31 -1.853 4.448 l 0.998 0.991 c 0.196 0.195 0.197 0.511 0.002 0.707 c -0.194 0.196 -0.51 0.197 -0.707 0.003 l -1.058 -1.052 c -1.044 0.753 -2.328 1.197 -3.716 1.197 c -1.568 0.0 -3.004 -0.567 -4.11 -1.506 l -1.37 1.36 C 2.321 14.297 2.005 14.296 1.81 14.1 c -0.194 -0.196 -0.193 -0.512 0.003 -0.707 l 1.365 -1.356 c -0.943 -1.098 -1.513 -2.524 -1.513 -4.083 Z M 7.971 4.97 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 3.336 c 0.0 0.373 0.302 0.675 0.675 0.675 h 2.3 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 7.97 V 4.969 Z")
        )
    }.build()
}
