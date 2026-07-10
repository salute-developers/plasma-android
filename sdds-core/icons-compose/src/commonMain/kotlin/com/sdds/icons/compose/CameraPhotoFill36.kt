package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraPhotoFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraPhotoFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.754 5.5 h 2.492 c 0.8 0.0 1.47 0.0 2.016 0.044 c 0.57 0.047 1.105 0.147 1.61 0.403 c 0.777 0.394 1.408 1.022 1.803 1.794 c 0.2 0.389 0.406 0.692 0.614 0.888 c 0.192 0.18 0.34 0.23 0.478 0.23 h 0.155 c 1.01 0.0 1.836 0.0 2.508 0.054 c 0.695 0.056 1.322 0.177 1.908 0.474 c 0.918 0.465 1.663 1.207 2.13 2.12 c 0.3 0.583 0.42 1.207 0.477 1.899 C 33.0 14.074 33.0 14.896 33.0 15.9 v 7.556 c 0.0 1.005 0.0 1.827 -0.055 2.495 c -0.057 0.692 -0.178 1.316 -0.476 1.9 c -0.468 0.912 -1.213 1.654 -2.13 2.12 c -0.587 0.296 -1.214 0.417 -1.91 0.473 c -0.67 0.055 -1.497 0.055 -2.507 0.055 H 10.078 c -1.01 0.0 -1.836 0.0 -2.508 -0.055 c -0.694 -0.056 -1.322 -0.177 -1.908 -0.474 c -0.917 -0.465 -1.663 -1.207 -2.13 -2.12 c -0.3 -0.583 -0.42 -1.207 -0.477 -1.899 C 3.0 25.284 3.0 24.462 3.0 23.457 v -7.556 c 0.0 -1.005 0.0 -1.827 0.055 -2.495 c 0.057 -0.692 0.178 -1.316 0.476 -1.9 c 0.468 -0.912 1.214 -1.654 2.13 -2.12 c 0.587 -0.296 1.215 -0.417 1.91 -0.473 c 0.67 -0.055 1.497 -0.055 2.507 -0.055 h 0.155 c 0.138 0.0 0.286 -0.049 0.478 -0.23 c 0.208 -0.195 0.415 -0.498 0.614 -0.887 c 0.395 -0.772 1.026 -1.4 1.802 -1.794 c 0.506 -0.256 1.041 -0.356 1.611 -0.403 C 15.284 5.5 15.953 5.5 16.754 5.5 Z M 18.0 14.088 c -2.698 0.0 -4.875 2.174 -4.875 4.845 c 0.0 2.67 2.177 4.845 4.875 4.845 s 4.875 -2.174 4.875 -4.845 c 0.0 -2.67 -2.177 -4.845 -4.875 -4.845 Z m -7.125 4.845 c 0.0 -3.924 3.195 -7.095 7.125 -7.095 s 7.125 3.171 7.125 7.095 S 21.93 26.028 18.0 26.028 s -7.125 -3.171 -7.125 -7.095 Z M 28.5 14.829 c 0.828 0.0 1.5 -0.668 1.5 -1.493 c 0.0 -0.824 -0.672 -1.492 -1.5 -1.492 S 27.0 12.512 27.0 13.336 c 0.0 0.825 0.672 1.493 1.5 1.493 Z")
        )
    }.build()
}
