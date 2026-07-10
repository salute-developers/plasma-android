package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudUploadFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudUploadFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 17.81 c 0.0 -3.812 2.757 -7.013 6.486 -7.914 L 9.492 9.88 C 9.552 9.875 9.61 9.864 9.67 9.848 c 1.555 -0.42 3.193 -0.413 4.744 0.024 c 1.551 0.436 2.958 1.285 4.073 2.457 c 0.381 0.4 1.014 0.416 1.414 0.036 c 0.4 -0.381 0.416 -1.014 0.035 -1.414 c -1.362 -1.432 -3.082 -2.47 -4.98 -3.004 c -1.413 -0.398 -2.885 -0.505 -4.33 -0.322 c 1.804 -2.633 4.935 -4.375 8.498 -4.375 c 5.592 0.0 10.125 4.293 10.125 9.589 c 0.0 0.335 -0.018 0.667 -0.054 0.994 C 31.447 14.87 33.0 17.055 33.0 19.586 c 0.0 3.53 -3.022 6.393 -6.75 6.393 H 19.0 v 5.768 l -2.0 0.001 v -5.77 h -5.375 C 6.862 25.979 3.0 22.323 3.0 17.81 Z m 14.0 8.169 h 2.0 v -5.387 l 2.79 2.817 c 0.388 0.393 1.021 0.396 1.413 0.007 c 0.393 -0.388 0.396 -1.021 0.008 -1.414 l -4.5 -4.546 c -0.188 -0.19 -0.444 -0.296 -0.711 -0.296 c -0.267 0.0 -0.523 0.107 -0.71 0.296 l -4.5 4.546 c -0.39 0.393 -0.386 1.026 0.007 1.414 c 0.392 0.389 1.025 0.386 1.414 -0.007 L 17.0 20.592 v 5.387 Z m 2.0 5.768 c 0.0 0.553 -0.448 1.001 -1.0 1.001 s -1.0 -0.447 -1.0 -1.0 h 2.0 Z")
        )
    }.build()
}
