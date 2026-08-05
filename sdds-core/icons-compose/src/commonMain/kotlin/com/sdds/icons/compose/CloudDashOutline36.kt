package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudDashOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudDashOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.749 4.293 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.023 0.0 1.414 L 5.707 31.163 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 1.762 -1.763 C 4.187 26.411 3.0 24.051 3.0 21.414 c 0.0 -4.032 2.773 -7.415 6.515 -8.338 C 10.798 8.977 14.617 6.0 19.135 6.0 c 2.484 0.0 4.758 0.9 6.514 2.392 l 4.1 -4.1 Z M 19.135 8.0 c -3.795 0.0 -6.984 2.625 -7.849 6.168 c -0.095 0.388 -0.412 0.683 -0.806 0.749 C 7.371 15.437 5.0 18.147 5.0 21.414 c 0.0 2.086 0.968 3.944 2.477 5.15 l 16.75 -16.75 C 22.837 8.681 21.065 8.0 19.135 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.117 11.512 c 0.703 1.377 1.099 2.938 1.099 4.591 c 0.0 0.387 -0.021 0.77 -0.064 1.146 C 31.426 18.316 33.0 20.629 33.0 23.31 C 33.0 27.003 30.013 30.0 26.324 30.0 H 11.567 c -0.602 0.0 -1.19 -0.062 -1.756 -0.18 L 11.63 28.0 h 14.694 C 28.904 28.0 31.0 25.903 31.0 23.31 c 0.0 -2.095 -1.37 -3.87 -3.26 -4.471 c -0.486 -0.154 -0.777 -0.648 -0.678 -1.148 c 0.101 -0.512 0.154 -1.043 0.154 -1.588 c 0.0 -1.092 -0.215 -2.133 -0.606 -3.084 l 1.507 -1.507 Z")
        )
    }.build()
}
