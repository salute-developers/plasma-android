package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudUploadOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudUploadOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 0.998 8.76 c 0.0 -1.983 1.259 -3.693 3.018 -4.177 c 0.597 -2.033 2.37 -3.546 4.509 -3.546 c 2.648 0.0 4.726 2.31 4.726 5.071 c 0.0 0.192 -0.01 0.38 -0.03 0.567 c 1.068 0.55 1.78 1.715 1.78 3.033 c 0.0 1.819 -1.372 3.366 -3.15 3.366 H 10.1 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 1.75 c 1.123 0.0 2.101 -0.997 2.101 -2.316 c 0.0 -1.061 -0.641 -1.926 -1.476 -2.213 c -0.246 -0.084 -0.393 -0.336 -0.346 -0.591 C 12.176 6.647 12.2 6.38 12.2 6.108 c 0.0 -2.26 -1.684 -4.021 -3.676 -4.021 c -1.47 0.0 -2.767 0.952 -3.35 2.362 c 1.08 0.043 2.044 0.54 2.738 1.307 C 8.108 5.97 8.09 6.303 7.876 6.497 C 7.661 6.692 7.33 6.676 7.135 6.461 C 6.59 5.859 5.842 5.497 5.024 5.497 c -0.167 0.0 -0.329 0.014 -0.487 0.043 c -1.383 0.25 -2.49 1.57 -2.49 3.22 c 0.0 1.843 1.371 3.264 2.977 3.264 h 0.875 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 H 5.024 c -2.262 0.0 -4.026 -1.971 -4.026 -4.314 Z m 7.36 -1.024 C 8.26 7.63 8.12 7.569 7.976 7.569 C 7.83 7.57 7.69 7.63 7.59 7.736 L 5.5 9.976 C 5.3 10.188 5.312 10.52 5.524 10.718 c 0.212 0.198 0.544 0.187 0.742 -0.025 L 7.45 9.426 v 5.015 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.234 0.525 -0.524 V 9.425 l 1.184 1.267 c 0.198 0.212 0.53 0.223 0.742 0.025 c 0.212 -0.198 0.223 -0.53 0.025 -0.742 L 8.36 7.736 Z")
        )
    }.build()
}
