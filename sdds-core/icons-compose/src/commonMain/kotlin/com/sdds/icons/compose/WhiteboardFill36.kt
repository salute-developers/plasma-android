package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WhiteboardFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WhiteboardFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.125 6.0 C 4.847 6.0 3.0 7.847 3.0 10.125 v 15.75 C 3.0 28.153 4.847 30.0 7.125 30.0 h 21.75 C 31.153 30.0 33.0 28.153 33.0 25.875 v -15.75 C 33.0 7.847 31.153 6.0 28.875 6.0 H 7.125 Z m 15.129 4.625 c -0.828 0.0 -1.622 0.329 -2.207 0.914 l -2.004 2.004 l -0.002 0.002 l -5.517 5.543 c -0.663 0.666 -1.145 1.492 -1.398 2.397 l -0.839 2.995 c -0.097 0.347 0.0 0.72 0.253 0.975 c 0.254 0.255 0.626 0.355 0.973 0.26 l 2.972 -0.81 c 0.924 -0.253 1.765 -0.741 2.442 -1.418 l 7.534 -7.534 c 0.585 -0.585 0.914 -1.379 0.914 -2.207 c 0.0 -1.723 -1.398 -3.121 -3.121 -3.121 Z m -0.793 2.328 c 0.21 -0.21 0.495 -0.328 0.793 -0.328 c 0.619 0.0 1.12 0.502 1.12 1.121 c 0.0 0.298 -0.117 0.583 -0.327 0.793 l -1.016 1.016 c -0.186 -0.312 -0.416 -0.643 -0.68 -0.907 c -0.263 -0.264 -0.594 -0.493 -0.906 -0.679 l 1.016 -1.016 Z m -0.93 4.027 l 0.025 0.05 l -5.043 5.043 c -0.43 0.43 -0.966 0.741 -1.554 0.902 l -1.27 0.346 l 0.363 -1.297 c 0.161 -0.576 0.467 -1.101 0.89 -1.525 l 5.03 -5.055 l 0.048 0.024 c 0.383 0.193 0.734 0.41 0.918 0.594 c 0.183 0.183 0.4 0.535 0.594 0.918 Z")
        )
    }.build()
}
