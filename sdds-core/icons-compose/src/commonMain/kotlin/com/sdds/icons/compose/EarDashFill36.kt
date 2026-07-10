package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EarDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EarDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.263 10.85 C 29.739 12.145 30.0 13.543 30.0 15.0 c 0.0 4.565 -2.55 8.535 -6.302 10.564 c -1.596 0.862 -2.86 2.33 -3.813 3.872 C 18.563 31.575 16.198 33.0 13.5 33.0 c -1.787 0.0 -3.43 -0.625 -4.718 -1.669 l 20.48 -20.48 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 c 3.717 0.0 7.04 1.69 9.24 4.345 l 3.053 -3.052 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 6.25 31.163 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 1.632 -1.633 c -0.304 -0.814 -0.47 -1.696 -0.47 -2.616 c 0.0 -0.66 0.086 -1.301 0.246 -1.911 c 0.46 -1.754 0.651 -3.679 0.175 -5.429 C 6.146 17.153 6.0 16.094 6.0 15.0 C 6.0 8.373 11.373 3.0 18.0 3.0 Z m 3.262 5.386 c -1.235 -0.61 -2.616 -0.86 -3.986 -0.726 c -1.37 0.135 -2.674 0.652 -3.766 1.49 c -1.092 0.837 -1.928 1.964 -2.412 3.252 c -0.485 1.289 -0.6 2.687 -0.332 4.037 c 0.269 1.35 0.91 2.597 1.851 3.602 c 0.317 0.338 0.586 0.738 0.778 1.148 l 1.474 -1.473 c -0.234 -0.38 -0.503 -0.732 -0.793 -1.042 c -0.685 -0.732 -1.153 -1.642 -1.349 -2.625 c -0.195 -0.984 -0.112 -2.004 0.242 -2.943 c 0.353 -0.938 0.963 -1.76 1.758 -2.37 c 0.796 -0.611 1.747 -0.986 2.746 -1.085 c 0.998 -0.098 2.004 0.085 2.904 0.529 c 0.87 0.428 1.604 1.085 2.13 1.897 l 1.44 -1.438 c -0.7 -0.954 -1.62 -1.728 -2.685 -2.253 Z")
        )
    }.build()
}
