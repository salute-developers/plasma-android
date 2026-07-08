package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandPointerOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandPointerOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.673 2.25 c -0.19 0.0 -0.367 0.162 -0.367 0.393 v 6.78 c 0.0 0.244 -0.176 0.452 -0.416 0.493 C 5.65 9.957 5.415 9.82 5.334 9.59 L 4.462 7.126 c -0.074 -0.21 -0.287 -0.299 -0.465 -0.232 c -0.186 0.07 -0.3 0.294 -0.223 0.51 l 1.365 3.858 c 0.698 1.97 2.803 2.968 4.693 2.26 c 1.474 -0.552 2.405 -1.983 2.418 -3.527 l -0.001 -0.031 v -2.5 c 0.0 -0.23 -0.178 -0.393 -0.368 -0.393 s -0.368 0.162 -0.368 0.393 v 0.714 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 6.571 c 0.0 -0.23 -0.178 -0.393 -0.368 -0.393 S 9.777 6.341 9.777 6.571 v 1.071 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 5.857 c 0.0 -0.23 -0.178 -0.393 -0.368 -0.393 S 8.041 5.626 8.041 5.857 v 1.25 c 0.0 0.276 -0.223 0.5 -0.5 0.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 2.643 c 0.0 -0.23 -0.178 -0.393 -0.368 -0.393 Z m 1.368 2.265 V 2.643 c 0.0 -0.756 -0.599 -1.393 -1.368 -1.393 c -0.768 0.0 -1.367 0.637 -1.367 1.393 v 3.93 C 4.984 6.0 4.29 5.716 3.646 5.958 C 2.931 6.225 2.58 7.026 2.831 7.737 l 1.366 3.859 c 0.876 2.478 3.552 3.774 5.986 2.863 c 1.9 -0.711 3.067 -2.55 3.067 -4.495 L 13.25 9.93 V 7.464 c 0.0 -0.756 -0.6 -1.393 -1.368 -1.393 c -0.153 0.0 -0.299 0.025 -0.434 0.071 c -0.176 -0.553 -0.684 -0.964 -1.302 -0.964 c -0.175 0.0 -0.342 0.033 -0.494 0.094 c -0.216 -0.473 -0.684 -0.808 -1.242 -0.808 c -0.128 0.0 -0.251 0.018 -0.368 0.05 Z")
        )
    }.build()
}
