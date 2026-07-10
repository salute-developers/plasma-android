package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeClosedFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeClosedFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.622 7.553 l -2.29 2.29 c 0.27 0.665 0.417 1.391 0.417 2.152 c 0.0 3.176 -2.574 5.75 -5.75 5.75 c -0.76 0.0 -1.487 -0.148 -2.152 -0.416 L 8.47 18.706 c 1.114 0.35 2.3 0.539 3.529 0.539 c 4.23 0.0 7.938 -2.236 10.006 -5.588 l 0.015 -0.024 c 0.2 -0.325 0.361 -0.585 0.463 -1.035 c 0.042 -0.188 0.055 -0.416 0.055 -0.603 s -0.013 -0.415 -0.055 -0.603 c -0.102 -0.45 -0.262 -0.71 -0.463 -1.035 l -0.015 -0.024 c -0.645 -1.047 -1.451 -1.985 -2.383 -2.78 Z M 4.04 21.016 c -0.294 0.288 -0.765 0.286 -1.056 -0.005 c -0.293 -0.293 -0.293 -0.768 0.0 -1.061 l 2.606 -2.606 c -1.454 -0.948 -2.684 -2.21 -3.596 -3.687 l -0.016 -0.025 c -0.2 -0.324 -0.36 -0.584 -0.462 -1.034 c -0.042 -0.189 -0.055 -0.416 -0.055 -0.603 s 0.013 -0.415 0.055 -0.603 c 0.101 -0.45 0.262 -0.71 0.462 -1.035 l 0.016 -0.024 C 4.06 6.98 7.768 4.745 11.999 4.745 c 1.808 0.0 3.521 0.408 5.051 1.138 l 2.904 -2.904 c 0.293 -0.292 0.768 -0.292 1.06 0.0 c 0.292 0.292 0.293 0.763 0.006 1.056 L 21.015 4.04 L 4.044 21.01 l -0.005 0.006 Z m 7.212 -5.091 c 0.242 0.046 0.492 0.07 0.748 0.07 c 2.21 0.0 4.0 -1.791 4.0 -4.0 c 0.0 -0.256 -0.024 -0.506 -0.07 -0.748 l -4.678 4.678 Z m 0.748 -9.68 c 1.317 0.0 2.531 0.443 3.501 1.188 l -1.253 1.253 C 13.607 8.25 12.833 7.995 12.0 7.995 c -2.21 0.0 -4.0 1.79 -4.0 4.0 c 0.0 0.833 0.255 1.607 0.691 2.248 l -1.253 1.253 c -0.745 -0.97 -1.188 -2.184 -1.188 -3.501 c 0.0 -3.176 2.574 -5.75 5.75 -5.75 Z")
        )
    }.build()
}
