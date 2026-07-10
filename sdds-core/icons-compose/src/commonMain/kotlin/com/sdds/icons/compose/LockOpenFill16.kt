package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LockOpenFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LockOpenFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.925 4.101 c 0.0 -1.125 0.901 -2.038 2.012 -2.038 c 1.112 0.0 2.013 0.913 2.013 2.038 v 3.456 c 0.0 0.294 0.235 0.532 0.525 0.532 c 0.29 0.0 0.525 -0.238 0.525 -0.532 V 4.101 C 15.0 2.388 13.629 1.0 11.937 1.0 c -1.69 0.0 -3.062 1.388 -3.062 3.101 v 2.393 H 4.303 c -0.471 0.0 -0.857 0.0 -1.17 0.026 c -0.324 0.026 -0.617 0.084 -0.89 0.225 c -0.429 0.22 -0.777 0.573 -0.995 1.007 c -0.14 0.277 -0.196 0.573 -0.222 0.902 C 1.0 8.97 1.0 9.36 1.0 9.838 v 1.817 c 0.0 0.478 0.0 0.868 0.026 1.185 c 0.026 0.329 0.083 0.625 0.222 0.902 c 0.218 0.434 0.566 0.786 0.994 1.007 c 0.274 0.141 0.567 0.198 0.89 0.225 C 3.447 15.0 3.833 15.0 4.304 15.0 h 4.594 c 0.471 0.0 0.857 0.0 1.17 -0.026 c 0.324 -0.027 0.617 -0.084 0.89 -0.225 c 0.429 -0.221 0.777 -0.573 0.995 -1.007 c 0.14 -0.277 0.196 -0.574 0.222 -0.902 c 0.026 -0.317 0.026 -0.707 0.026 -1.185 V 9.26 c 0.0 -0.427 0.0 -0.734 -0.063 -1.0 c -0.2 -0.843 -0.85 -1.5 -1.68 -1.703 c -0.158 -0.038 -0.33 -0.053 -0.532 -0.06 V 4.102 Z M 6.6 12.164 c 0.773 0.0 1.4 -0.635 1.4 -1.418 C 8.0 9.963 7.373 9.33 6.6 9.33 c -0.773 0.0 -1.4 0.634 -1.4 1.417 s 0.627 1.418 1.4 1.418 Z")
        )
    }.build()
}
