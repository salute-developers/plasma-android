package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 0.88 6.854 C 2.35 4.542 4.99 3.0 8.0 3.0 s 5.65 1.542 7.12 3.854 l 0.012 0.017 c 0.142 0.224 0.257 0.403 0.329 0.713 C 15.49 7.714 15.5 7.871 15.5 8.0 c 0.0 0.13 -0.01 0.286 -0.04 0.416 c -0.071 0.31 -0.186 0.49 -0.328 0.713 L 15.12 9.146 C 13.649 11.458 11.01 13.0 8.0 13.0 c -3.01 0.0 -5.65 -1.542 -7.12 -3.854 L 0.867 9.13 C 0.726 8.905 0.611 8.726 0.54 8.416 C 0.51 8.286 0.5 8.129 0.5 8.0 c 0.0 -0.13 0.01 -0.286 0.04 -0.416 c 0.071 -0.31 0.186 -0.49 0.328 -0.713 L 0.88 6.854 Z M 3.907 8.0 C 3.908 5.81 5.74 4.034 8.0 4.034 S 12.092 5.81 12.092 8.0 c 0.0 2.19 -1.832 3.966 -4.092 3.966 S 3.908 10.19 3.908 8.0 Z M 8.0 10.759 c 1.572 0.0 2.847 -1.235 2.847 -2.759 c 0.0 -1.524 -1.275 -2.759 -2.847 -2.759 S 5.153 6.476 5.153 8.0 c 0.0 1.524 1.275 2.759 2.847 2.759 Z")
        )
    }.build()
}
