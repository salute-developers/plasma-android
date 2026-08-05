package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StacksFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StacksFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 2.545 4.73 C 2.0 5.8 2.0 7.2 2.0 10.0 v 4.0 c 0.0 2.8 0.0 4.2 0.545 5.27 c 0.48 0.94 1.244 1.706 2.185 2.185 c 0.43 0.22 0.914 0.35 1.52 0.429 v -5.318 c 0.0 -1.651 0.0 -2.937 0.084 -3.968 c 0.086 -1.047 0.262 -1.897 0.652 -2.662 c 0.647 -1.27 1.68 -2.303 2.95 -2.95 c 0.765 -0.39 1.615 -0.566 2.662 -0.652 C 13.63 6.25 14.915 6.25 16.566 6.25 h 5.318 c -0.079 -0.606 -0.21 -1.09 -0.429 -1.52 c -0.48 -0.94 -1.244 -1.706 -2.185 -2.185 C 18.2 2.0 16.8 2.0 14.0 2.0 h -4.0 C 7.2 2.0 5.8 2.0 4.73 2.545 C 3.79 3.025 3.024 3.789 2.545 4.73 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 21.983 7.75 H 16.6 c -1.693 0.0 -2.917 0.0 -3.88 0.08 c -0.954 0.077 -1.585 0.228 -2.103 0.492 c -0.988 0.504 -1.791 1.307 -2.295 2.295 c -0.264 0.518 -0.415 1.15 -0.493 2.103 c -0.078 0.963 -0.079 2.188 -0.079 3.88 v 5.383 C 8.385 22.0 9.124 22.0 10.0 22.0 h 1.25 v -5.232 c 0.0 -0.813 0.0 -1.469 0.043 -2.0 c 0.045 -0.546 0.14 -1.026 0.366 -1.47 c 0.36 -0.706 0.933 -1.28 1.638 -1.64 c 0.445 -0.226 0.925 -0.32 1.471 -0.365 c 0.531 -0.043 1.187 -0.043 2.0 -0.043 H 22.0 V 10.0 c 0.0 -0.876 0.0 -1.615 -0.017 -2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 22.0 12.75 h -5.2 c -0.853 0.0 -1.447 0.0 -1.91 0.038 c -0.453 0.037 -0.714 0.107 -0.912 0.207 c -0.423 0.216 -0.767 0.56 -0.983 0.984 c -0.1 0.197 -0.17 0.458 -0.207 0.912 c -0.037 0.462 -0.038 1.056 -0.038 1.909 V 22.0 H 14.0 c 2.8 0.0 4.2 0.0 5.27 -0.545 c 0.94 -0.48 1.706 -1.244 2.185 -2.185 C 22.0 18.2 22.0 16.8 22.0 14.0 v -1.25 Z")
        )
    }.build()
}
