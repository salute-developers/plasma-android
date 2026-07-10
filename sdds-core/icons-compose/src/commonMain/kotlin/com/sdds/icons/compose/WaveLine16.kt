package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WaveLine16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WaveLine16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.885 7.477 c -0.48 0.655 -1.177 1.14 -2.185 1.14 C 1.313 8.616 1.0 8.3 1.0 7.911 c 0.0 -0.389 0.313 -0.704 0.7 -0.704 c 0.48 0.0 0.788 -0.198 1.058 -0.566 c 0.3 -0.41 0.517 -0.99 0.75 -1.685 l 0.069 -0.202 c 0.2 -0.6 0.426 -1.28 0.749 -1.814 C 4.708 2.307 5.306 1.75 6.25 1.75 c 0.629 0.0 1.095 0.33 1.405 0.776 c 0.291 0.417 0.468 0.958 0.588 1.51 c 0.233 1.066 0.31 2.45 0.382 3.766 l 0.008 0.159 c 0.078 1.406 0.158 2.722 0.39 3.687 c 0.115 0.483 0.253 0.807 0.396 0.996 c 0.121 0.162 0.218 0.197 0.331 0.197 c 0.154 0.0 0.347 -0.072 0.598 -0.593 c 0.211 -0.438 0.372 -1.002 0.56 -1.662 l 0.117 -0.406 c 0.227 -0.785 0.51 -1.678 0.974 -2.374 c 0.49 -0.735 1.222 -1.302 2.301 -1.302 c 0.387 0.0 0.7 0.315 0.7 0.704 c 0.0 0.389 -0.313 0.704 -0.7 0.704 c -0.496 0.0 -0.836 0.225 -1.139 0.679 c -0.328 0.491 -0.56 1.183 -0.792 1.983 l -0.104 0.364 c -0.186 0.657 -0.388 1.367 -0.658 1.925 c -0.322 0.668 -0.874 1.387 -1.857 1.387 c -0.63 0.0 -1.113 -0.311 -1.448 -0.756 c -0.313 -0.417 -0.508 -0.96 -0.64 -1.517 C 7.393 10.863 7.31 9.406 7.234 8.04 L 7.231 7.954 C 7.155 6.576 7.084 5.29 6.876 4.338 C 6.77 3.851 6.642 3.525 6.51 3.335 C 6.397 3.175 6.321 3.158 6.25 3.158 c -0.28 0.0 -0.493 0.125 -0.728 0.515 c -0.236 0.39 -0.412 0.914 -0.625 1.551 L 4.835 5.41 C 4.61 6.078 4.334 6.864 3.885 7.477 Z")
        )
    }.build()
}
