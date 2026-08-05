package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DeviceShareFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DeviceShareFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.697 2.4 H 4.303 c -0.471 0.0 -0.857 0.0 -1.17 0.025 c -0.324 0.026 -0.617 0.083 -0.89 0.222 c -0.429 0.218 -0.777 0.567 -0.995 0.995 c -0.14 0.273 -0.196 0.566 -0.222 0.89 C 1.0 4.846 1.0 5.231 1.0 5.702 v 4.594 c 0.0 0.472 0.0 0.857 0.026 1.17 c 0.026 0.325 0.083 0.618 0.222 0.891 c 0.218 0.428 0.566 0.776 0.994 0.995 c 0.274 0.139 0.567 0.195 0.89 0.222 c 0.314 0.025 0.7 0.025 1.17 0.025 h 7.395 c 0.471 0.0 0.857 0.0 1.17 -0.025 c 0.324 -0.027 0.617 -0.083 0.89 -0.223 c 0.429 -0.218 0.777 -0.566 0.995 -0.994 c 0.14 -0.273 0.196 -0.566 0.222 -0.89 C 15.0 11.153 15.0 10.767 15.0 10.297 V 5.701 c 0.0 -0.471 0.0 -0.856 -0.026 -1.17 c -0.026 -0.324 -0.083 -0.617 -0.222 -0.89 c -0.218 -0.428 -0.566 -0.777 -0.994 -0.995 c -0.274 -0.139 -0.567 -0.196 -0.89 -0.222 c -0.314 -0.026 -0.7 -0.026 -1.171 -0.026 Z m -5.622 7.784 c -0.268 0.188 -0.637 0.168 -0.871 -0.067 c -0.288 -0.288 -0.268 -0.77 0.06 -1.004 c 0.77 -0.556 1.715 -0.884 2.74 -0.884 c 1.024 0.0 1.968 0.328 2.739 0.884 c 0.321 0.24 0.348 0.716 0.06 1.004 c -0.235 0.235 -0.603 0.248 -0.87 0.06 C 9.39 9.796 8.72 9.569 8.002 9.569 c -0.716 0.0 -1.386 0.228 -1.928 0.616 Z m -2.726 -2.98 C 4.615 6.173 6.235 5.55 8.003 5.55 c 1.768 0.0 3.39 0.623 4.648 1.66 c 0.308 0.255 0.335 0.717 0.054 0.999 c -0.241 0.24 -0.623 0.26 -0.884 0.046 c -1.032 -0.85 -2.364 -1.366 -3.818 -1.366 c -1.453 0.0 -2.786 0.516 -3.824 1.36 c -0.26 0.214 -0.643 0.194 -0.884 -0.047 C 3.014 7.92 3.041 7.458 3.35 7.204 Z")
        )
    }.build()
}
