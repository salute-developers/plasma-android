package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ViewPersonFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ViewPersonFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.697 2.5 H 4.303 c -0.471 0.0 -0.857 0.0 -1.17 0.025 c -0.324 0.026 -0.617 0.082 -0.89 0.219 C 1.813 2.958 1.465 3.3 1.247 3.72 c -0.14 0.269 -0.196 0.556 -0.222 0.875 C 1.0 4.902 1.0 5.28 1.0 5.744 v 4.512 c 0.0 0.463 0.0 0.841 0.026 1.15 c 0.026 0.318 0.083 0.605 0.222 0.874 c 0.218 0.42 0.566 0.762 0.994 0.977 c 0.274 0.136 0.567 0.192 0.89 0.218 c 0.314 0.025 0.7 0.025 1.17 0.025 h 7.395 c 0.471 0.0 0.857 0.0 1.17 -0.025 c 0.324 -0.026 0.617 -0.082 0.89 -0.218 c 0.429 -0.215 0.777 -0.557 0.995 -0.977 c 0.14 -0.269 0.196 -0.556 0.222 -0.875 C 15.0 11.098 15.0 10.72 15.0 10.256 V 5.744 c 0.0 -0.463 0.0 -0.842 -0.026 -1.15 c -0.026 -0.318 -0.083 -0.605 -0.222 -0.874 c -0.218 -0.42 -0.566 -0.762 -0.994 -0.976 c -0.274 -0.137 -0.567 -0.193 -0.89 -0.219 C 12.553 2.5 12.167 2.5 11.696 2.5 Z M 9.748 6.28 C 9.748 7.23 8.965 8.0 7.998 8.0 c -0.966 0.0 -1.75 -0.77 -1.75 -1.72 c 0.0 -0.949 0.784 -1.718 1.75 -1.718 c 0.967 0.0 1.75 0.77 1.75 1.718 Z m 1.42 3.43 c 0.224 0.158 0.356 0.436 0.326 0.721 c -0.016 0.154 -0.045 0.274 -0.095 0.38 c -0.102 0.216 -0.265 0.391 -0.466 0.501 c -0.228 0.125 -0.526 0.125 -1.123 0.125 H 6.186 c -0.597 0.0 -0.895 0.0 -1.123 -0.125 c -0.2 -0.11 -0.364 -0.285 -0.466 -0.5 c -0.05 -0.107 -0.079 -0.227 -0.095 -0.38 c -0.03 -0.286 0.102 -0.564 0.325 -0.722 c 0.91 -0.647 2.0 -1.023 3.171 -1.023 c 1.172 0.0 2.261 0.376 3.17 1.023 Z")
        )
    }.build()
}
