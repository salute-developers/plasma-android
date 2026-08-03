package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EarErrorFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EarErrorFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.39 7.719 C 12.952 7.577 12.485 7.5 12.0 7.5 c -2.485 0.0 -4.5 2.015 -4.5 4.5 c 0.0 0.811 0.215 1.572 0.59 2.229 C 7.5 14.711 6.752 15.0 5.938 15.0 C 4.038 15.0 2.5 13.433 2.5 11.5 c 0.0 -0.315 0.04 -0.62 0.118 -0.91 c 0.212 -0.807 0.299 -1.69 0.08 -2.495 C 2.57 7.619 2.5 7.118 2.5 6.6 C 2.5 3.507 4.962 1.0 8.0 1.0 s 5.5 2.507 5.5 5.6 c 0.0 0.383 -0.038 0.757 -0.11 1.119 Z M 7.664 3.142 C 8.3 3.078 8.944 3.197 9.517 3.485 c 0.573 0.288 1.055 0.733 1.391 1.283 c 0.265 0.435 0.432 0.92 0.49 1.424 c 0.032 0.274 -0.164 0.523 -0.439 0.555 c -0.274 0.032 -0.522 -0.165 -0.554 -0.44 c -0.042 -0.36 -0.161 -0.708 -0.35 -1.017 c -0.24 -0.393 -0.582 -0.708 -0.987 -0.911 c -0.405 -0.204 -0.856 -0.287 -1.304 -0.242 c -0.449 0.045 -0.876 0.217 -1.235 0.497 c -0.359 0.28 -0.634 0.658 -0.795 1.091 c -0.16 0.434 -0.198 0.905 -0.109 1.36 c 0.089 0.454 0.3 0.873 0.61 1.21 c 0.303 0.33 0.57 0.752 0.703 1.208 c 0.136 0.46 0.145 0.991 -0.13 1.476 l -0.436 0.768 c -0.136 0.24 -0.44 0.324 -0.681 0.188 c -0.24 -0.136 -0.325 -0.441 -0.188 -0.682 l 0.435 -0.767 c 0.105 -0.186 0.123 -0.421 0.04 -0.7 C 5.897 9.501 5.72 9.21 5.5 8.971 C 5.064 8.498 4.768 7.911 4.644 7.276 C 4.52 6.642 4.572 5.985 4.796 5.38 c 0.224 -0.606 0.61 -1.137 1.117 -1.533 c 0.507 -0.396 1.113 -0.64 1.75 -0.704 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.136 -0.357 -0.136 -0.494 0.0 c -0.137 0.137 -0.137 0.358 0.0 0.495 L 11.505 12.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.138 0.136 0.36 0.136 0.496 0.0 L 12.0 12.495 l 1.198 1.199 c 0.137 0.136 0.359 0.136 0.495 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 12.0 l 1.199 -1.199 c 0.136 -0.137 0.136 -0.358 0.0 -0.495 c -0.137 -0.136 -0.359 -0.136 -0.496 0.0 L 12.0 11.505 l -1.2 -1.199 Z")
        )
    }.build()
}
