package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothSignal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothSignal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.285 1.049 c 0.174 -0.083 0.38 -0.059 0.53 0.063 l 4.0 3.25 C 9.932 4.457 10.0 4.599 10.0 4.75 c 0.0 0.15 -0.068 0.293 -0.185 0.388 L 6.293 8.0 l 3.522 2.862 C 9.932 10.957 10.0 11.099 10.0 11.25 c 0.0 0.15 -0.068 0.293 -0.185 0.388 l -4.0 3.25 c -0.15 0.122 -0.356 0.146 -0.53 0.063 C 5.111 14.87 5.0 14.694 5.0 14.5 V 9.05 l -3.185 2.588 c -0.214 0.174 -0.529 0.142 -0.703 -0.073 c -0.174 -0.214 -0.142 -0.529 0.073 -0.703 L 4.707 8.0 L 1.185 5.138 C 0.97 4.964 0.938 4.65 1.112 4.435 C 1.286 4.22 1.601 4.188 1.815 4.362 L 5.0 6.95 V 1.5 c 0.0 -0.193 0.111 -0.369 0.285 -0.451 Z M 6.0 9.05 l 2.707 2.2 L 6.0 13.45 v -4.4 Z m 0.0 -2.1 v -4.4 l 2.707 2.2 L 6.0 6.95 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.134 3.16 c 0.188 -0.203 0.505 -0.214 0.707 -0.026 c 0.682 0.636 1.225 1.392 1.596 2.228 C 14.808 6.197 15.0 7.094 15.0 8.0 c 0.0 0.906 -0.192 1.803 -0.563 2.639 c -0.371 0.835 -0.914 1.591 -1.596 2.227 c -0.202 0.188 -0.518 0.177 -0.707 -0.025 c -0.188 -0.202 -0.177 -0.518 0.025 -0.707 c 0.586 -0.546 1.05 -1.193 1.364 -1.902 C 13.838 9.523 14.0 8.765 14.0 8.0 c 0.0 -0.765 -0.162 -1.523 -0.477 -2.232 c -0.315 -0.71 -0.778 -1.356 -1.364 -1.902 c -0.202 -0.188 -0.213 -0.505 -0.025 -0.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.153 5.14 c 0.198 -0.191 0.515 -0.186 0.707 0.013 c 0.362 0.375 0.649 0.82 0.844 1.308 C 12.9 6.95 13.0 7.472 13.0 8.0 s -0.1 1.05 -0.296 1.539 c -0.195 0.488 -0.482 0.933 -0.844 1.308 c -0.192 0.199 -0.509 0.205 -0.707 0.013 c -0.199 -0.192 -0.205 -0.509 -0.013 -0.707 c 0.272 -0.281 0.488 -0.616 0.636 -0.986 C 11.924 8.797 12.0 8.401 12.0 8.0 s -0.076 -0.798 -0.224 -1.167 c -0.148 -0.37 -0.364 -0.705 -0.636 -0.986 c -0.192 -0.198 -0.186 -0.515 0.013 -0.707 Z")
        )
    }.build()
}
