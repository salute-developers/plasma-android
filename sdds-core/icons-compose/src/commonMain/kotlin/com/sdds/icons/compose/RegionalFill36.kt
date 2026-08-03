package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RegionalFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RegionalFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.34 3.29 c 0.392 0.388 0.395 1.021 0.006 1.414 c -0.743 0.75 -1.333 1.641 -1.736 2.623 C 10.207 8.308 10.0 9.36 10.0 10.424 c 0.0 1.063 0.207 2.115 0.61 3.096 c 0.403 0.982 0.993 1.873 1.736 2.623 c 0.39 0.393 0.386 1.026 -0.006 1.415 c -0.393 0.388 -1.026 0.385 -1.414 -0.007 c -0.928 -0.937 -1.664 -2.048 -2.166 -3.271 C 8.258 13.057 8.0 11.747 8.0 10.424 S 8.258 7.79 8.76 6.568 c 0.502 -1.223 1.238 -2.335 2.166 -3.272 c 0.388 -0.392 1.021 -0.395 1.414 -0.006 Z m 12.734 0.006 c -0.388 -0.392 -1.022 -0.395 -1.414 -0.006 c -0.392 0.388 -0.395 1.021 -0.006 1.414 c 0.743 0.75 1.333 1.641 1.736 2.623 C 25.793 8.308 26.0 9.36 26.0 10.424 c 0.0 1.063 -0.207 2.115 -0.61 3.096 c -0.403 0.982 -0.993 1.873 -1.736 2.623 c -0.39 0.393 -0.386 1.026 0.006 1.415 c 0.392 0.388 1.026 0.385 1.414 -0.007 c 0.928 -0.937 1.664 -2.048 2.166 -3.271 c 0.502 -1.223 0.76 -2.533 0.76 -3.856 s -0.258 -2.634 -0.76 -3.856 c -0.502 -1.223 -1.237 -2.335 -2.166 -3.272 Z m -6.539 12.78 C 18.359 16.093 18.18 16.1 18.0 16.1 c -0.18 0.0 -0.357 -0.008 -0.533 -0.025 l -2.551 9.172 l 4.915 -4.51 l -1.296 -4.662 Z m -2.992 -0.544 c -1.876 -0.92 -3.168 -2.862 -3.168 -5.109 c 0.0 -3.135 2.518 -5.677 5.625 -5.677 s 5.625 2.542 5.625 5.677 c 0.0 2.246 -1.291 4.187 -3.166 5.108 l 4.505 16.2 c 0.148 0.532 -0.164 1.084 -0.696 1.231 c -0.532 0.148 -1.083 -0.163 -1.231 -0.695 L 20.432 22.9 l -6.53 5.992 l -0.939 3.375 c -0.148 0.532 -0.699 0.843 -1.231 0.695 c -0.532 -0.148 -0.843 -0.699 -0.695 -1.231 l 4.505 -16.199 Z")
        )
    }.build()
}
