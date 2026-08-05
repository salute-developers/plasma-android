package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KidsOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KidsOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.3 c -3.112 0.0 -5.731 2.105 -6.477 4.963 C 0.792 6.464 0.25 7.129 0.25 7.925 c 0.0 0.797 0.542 1.462 1.273 1.663 C 2.27 12.445 4.888 14.55 8.0 14.55 c 3.111 0.0 5.73 -2.105 6.476 -4.962 c 0.732 -0.201 1.274 -0.866 1.274 -1.663 c 0.0 -0.796 -0.542 -1.461 -1.274 -1.662 C 13.731 3.405 11.112 1.3 8.0 1.3 Z M 2.424 6.802 C 2.95 4.237 5.244 2.3 8.0 2.3 s 5.05 1.937 5.575 4.502 l 0.079 0.383 l 0.39 0.016 c 0.397 0.017 0.706 0.339 0.706 0.724 c 0.0 0.385 -0.309 0.708 -0.706 0.725 l -0.39 0.016 l -0.079 0.383 c -0.525 2.564 -2.82 4.5 -5.575 4.5 c -2.756 0.0 -5.05 -1.936 -5.576 -4.5 L 2.346 8.666 L 1.956 8.65 C 1.558 8.633 1.25 8.31 1.25 7.925 c 0.0 -0.385 0.308 -0.707 0.705 -0.724 l 0.39 -0.017 l 0.08 -0.382 Z m 2.04 0.422 c 0.39 0.0 0.707 -0.313 0.707 -0.7 c 0.0 -0.386 -0.317 -0.7 -0.707 -0.7 c -0.391 0.0 -0.708 0.314 -0.708 0.7 c 0.0 0.387 0.317 0.7 0.708 0.7 Z m 7.78 -0.7 c 0.0 0.387 -0.317 0.7 -0.707 0.7 c -0.391 0.0 -0.708 -0.313 -0.708 -0.7 c 0.0 -0.386 0.317 -0.7 0.708 -0.7 c 0.39 0.0 0.707 0.314 0.707 0.7 Z M 9.646 7.212 c -0.221 0.219 -0.484 0.39 -0.774 0.507 c -0.29 0.115 -0.6 0.172 -0.912 0.167 c -0.312 -0.005 -0.62 -0.073 -0.905 -0.198 C 6.769 7.562 6.512 7.38 6.299 7.155 L 5.565 7.834 C 5.87 8.157 6.238 8.417 6.646 8.597 c 0.409 0.18 0.85 0.276 1.297 0.284 c 0.447 0.007 0.891 -0.074 1.306 -0.24 c 0.414 -0.166 0.791 -0.413 1.107 -0.726 l -0.71 -0.703 Z")
        )
    }.build()
}
