package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GroupOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GroupOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.275 7.275 c -0.4 0.4 -0.4 1.05 0.0 1.45 l 1.744 1.744 c 0.4 0.4 1.05 0.4 1.45 0.0 l 1.744 -1.744 c 0.4 -0.4 0.4 -1.05 0.0 -1.45 L 4.469 5.531 c -0.4 -0.4 -1.05 -0.4 -1.45 0.0 L 1.275 7.275 Z m 0.707 0.743 c -0.01 -0.01 -0.01 -0.026 0.0 -0.036 l 1.744 -1.744 c 0.01 -0.01 0.026 -0.01 0.035 0.0 l 1.745 1.744 c 0.01 0.01 0.01 0.026 0.0 0.036 L 3.76 9.762 c -0.01 0.01 -0.025 0.01 -0.035 0.0 L 1.982 8.018 Z m 3.521 3.485 c -0.4 0.4 -0.4 1.05 0.0 1.45 l 1.744 1.744 c 0.4 0.4 1.05 0.4 1.45 0.0 l 1.744 -1.745 c 0.4 -0.4 0.4 -1.049 0.0 -1.45 L 8.697 9.76 c -0.4 -0.4 -1.05 -0.4 -1.45 0.0 l -1.744 1.744 Z m 0.707 0.742 c -0.01 -0.01 -0.01 -0.025 0.0 -0.035 l 1.745 -1.744 c 0.01 -0.01 0.025 -0.01 0.035 0.0 l 1.744 1.744 c 0.01 0.01 0.01 0.025 0.0 0.035 L 7.99 13.99 C 7.98 14.0 7.964 14.0 7.954 13.99 L 6.21 12.245 Z M 5.503 4.497 c -0.4 -0.4 -0.4 -1.049 0.0 -1.45 l 1.744 -1.743 c 0.4 -0.4 1.05 -0.4 1.45 0.0 l 1.744 1.744 c 0.4 0.4 0.4 1.049 0.0 1.45 L 8.697 6.24 c -0.4 0.4 -1.05 0.4 -1.45 0.0 L 5.503 4.497 Z M 6.21 3.755 C 6.2 3.765 6.2 3.78 6.21 3.79 l 1.745 1.744 c 0.01 0.01 0.025 0.01 0.035 0.0 L 9.734 3.79 c 0.01 -0.01 0.01 -0.025 0.0 -0.035 L 7.99 2.01 C 7.98 2.0 7.964 2.0 7.955 2.01 L 6.21 3.755 Z m 3.52 3.52 c -0.4 0.4 -0.4 1.05 0.0 1.45 l 1.744 1.744 c 0.4 0.4 1.05 0.4 1.45 0.0 l 1.744 -1.744 c 0.4 -0.4 0.4 -1.05 0.0 -1.45 l -1.744 -1.744 c -0.4 -0.4 -1.05 -0.4 -1.45 0.0 L 9.73 7.275 Z m 0.707 0.743 c -0.01 -0.01 -0.01 -0.026 0.0 -0.036 l 1.744 -1.744 c 0.01 -0.01 0.026 -0.01 0.035 0.0 l 1.745 1.744 c 0.01 0.01 0.01 0.026 0.0 0.036 l -1.745 1.744 c -0.01 0.01 -0.025 0.01 -0.035 0.0 l -1.744 -1.744 Z")
        )
    }.build()
}
