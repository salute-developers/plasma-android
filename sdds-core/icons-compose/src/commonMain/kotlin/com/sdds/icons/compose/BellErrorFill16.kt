package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellErrorFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellErrorFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.55 1.111 L 8.537 1.107 C 8.368 1.037 8.186 1.0 8.002 1.0 C 7.818 1.0 7.636 1.036 7.466 1.107 C 7.296 1.177 7.14 1.28 7.01 1.41 S 6.778 1.694 6.708 1.864 C 6.638 2.034 6.6 2.216 6.6 2.4 h 0.113 C 6.006 2.58 5.437 2.918 4.989 3.39 C 4.31 4.102 3.963 5.064 3.769 6.068 C 3.574 7.074 3.525 8.183 3.489 9.23 L 3.48 9.547 c -0.025 0.772 -0.05 1.5 -0.119 2.153 H 2.75 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 10.503 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -0.61 c -0.07 -0.652 -0.094 -1.38 -0.119 -2.153 l -0.01 -0.317 c -0.009 -0.25 -0.018 -0.502 -0.03 -0.756 C 12.325 8.491 12.164 8.5 12.0 8.5 C 9.515 8.5 7.5 6.485 7.5 4.0 c 0.0 -1.1 0.394 -2.107 1.05 -2.889 Z m -2.53 12.49 C 6.308 14.415 7.086 15.0 8.001 15.0 s 1.693 -0.585 1.981 -1.4 H 6.02 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.137 -0.357 -0.137 -0.494 0.0 s -0.137 0.358 0.0 0.495 L 11.505 4.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.138 0.137 0.36 0.137 0.496 0.0 L 12.0 4.495 l 1.198 1.199 c 0.137 0.137 0.359 0.137 0.495 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 4.0 l 1.199 -1.199 c 0.136 -0.137 0.136 -0.358 0.0 -0.495 c -0.137 -0.137 -0.359 -0.137 -0.496 0.0 L 12.0 3.505 l -1.2 -1.199 Z")
        )
    }.build()
}
