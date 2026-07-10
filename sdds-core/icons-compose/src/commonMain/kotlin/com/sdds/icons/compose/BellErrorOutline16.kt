package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BellErrorOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BellErrorOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m -1.2 -5.444 c -0.136 -0.137 -0.357 -0.137 -0.494 0.0 s -0.137 0.358 0.0 0.495 L 11.505 4.0 l -1.2 1.199 c -0.136 0.137 -0.136 0.358 0.0 0.495 c 0.138 0.137 0.36 0.137 0.496 0.0 L 12.0 4.495 l 1.198 1.199 c 0.137 0.137 0.359 0.137 0.495 0.0 c 0.137 -0.137 0.137 -0.358 0.0 -0.495 L 12.495 4.0 l 1.199 -1.199 c 0.136 -0.137 0.136 -0.358 0.0 -0.495 c -0.137 -0.137 -0.359 -0.137 -0.496 0.0 L 12.0 3.505 l -1.2 -1.199 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.484 8.474 c 0.012 0.254 0.021 0.507 0.03 0.756 l 0.01 0.317 c 0.025 0.772 0.05 1.5 0.119 2.153 h 0.61 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 2.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 0.61 c 0.07 -0.653 0.094 -1.38 0.119 -2.153 l 0.01 -0.317 c 0.036 -1.047 0.085 -2.156 0.28 -3.162 c 0.194 -1.004 0.542 -1.966 1.22 -2.678 c 0.448 -0.472 1.017 -0.81 1.725 -0.99 H 6.6 c 0.0 -0.184 0.037 -0.366 0.107 -0.536 C 6.778 1.694 6.88 1.54 7.01 1.41 s 0.285 -0.233 0.455 -0.303 C 7.636 1.037 7.818 1.0 8.002 1.0 c 0.184 0.0 0.366 0.036 0.536 0.107 L 8.549 1.11 C 8.043 1.716 7.692 2.456 7.56 3.27 c -0.863 0.077 -1.44 0.383 -1.846 0.81 C 5.226 4.592 4.93 5.336 4.751 6.257 c -0.178 0.92 -0.227 1.954 -0.262 3.007 l -0.01 0.321 c -0.024 0.72 -0.048 1.446 -0.114 2.115 h 7.273 c -0.066 -0.67 -0.09 -1.395 -0.113 -2.115 l -0.01 -0.321 c -0.01 -0.266 -0.02 -0.531 -0.032 -0.793 C 11.653 8.49 11.825 8.5 12.0 8.5 c 0.164 0.0 0.325 -0.009 0.484 -0.026 Z M 8.001 15.0 c -0.915 0.0 -1.693 -0.584 -1.981 -1.4 h 3.962 C 9.694 14.416 8.916 15.0 8.002 15.0 Z")
        )
    }.build()
}
