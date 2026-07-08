package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RulerOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RulerOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.851 3.796 c -0.988 -0.974 -2.561 -0.985 -3.523 -0.023 L 3.78 25.327 c -0.96 0.96 -0.951 2.532 0.021 3.52 L 7.27 32.37 c 0.984 1.0 2.579 1.022 3.55 0.049 l 21.588 -21.616 c 0.97 -0.972 0.948 -2.563 -0.049 -3.547 l -3.507 -3.46 Z m -2.095 1.406 c 0.193 -0.193 0.508 -0.19 0.705 0.004 l 3.507 3.46 c 0.2 0.197 0.204 0.515 0.01 0.71 L 9.39 30.99 c -0.194 0.195 -0.513 0.19 -0.71 -0.01 L 5.213 27.46 c -0.195 -0.197 -0.197 -0.512 -0.004 -0.704 l 1.477 -1.478 l 1.868 1.869 c 0.39 0.39 1.024 0.39 1.415 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.415 L 8.1 23.864 l 2.866 -2.867 l 1.87 1.869 c 0.39 0.39 1.023 0.39 1.413 0.0 c 0.391 -0.39 0.391 -1.024 0.0 -1.414 l -1.869 -1.87 l 2.867 -2.868 l 1.87 1.87 c 0.39 0.39 1.024 0.39 1.414 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 l -1.87 -1.87 l 2.867 -2.867 l 1.87 1.87 c 0.392 0.39 1.025 0.39 1.415 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 l -1.87 -1.87 l 2.865 -2.867 l 1.87 1.871 c 0.391 0.39 1.024 0.39 1.415 0.0 c 0.39 -0.39 0.39 -1.023 0.0 -1.414 l -1.871 -1.871 l 1.534 -1.535 Z")
        )
    }.build()
}
