package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinListFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinListFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.193 2.617 C 8.508 2.185 9.125 2.125 9.49 2.49 L 12.094 5.1 C 12.46 5.466 12.4 6.084 11.97 6.4 L 9.35 8.322 C 9.082 8.519 8.902 8.814 8.853 9.14 L 8.49 11.528 c -0.15 0.986 -1.355 1.412 -2.043 0.722 l -1.515 -1.518 l -2.704 2.71 L 1.0 13.687 l 0.246 -1.232 l 2.703 -2.71 L 2.355 8.15 c -0.688 -0.69 -0.263 -1.898 0.72 -2.047 l 2.383 -0.363 C 5.784 5.69 6.08 5.51 6.275 5.241 l 1.918 -2.624 Z m 5.094 1.776 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 1.216 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 h -1.216 Z m -2.955 8.36 c -0.277 0.0 -0.5 0.223 -0.5 0.5 c 0.0 0.275 0.223 0.5 0.5 0.5 h 3.997 c 0.277 0.0 0.5 -0.225 0.5 -0.5 c 0.0 -0.277 -0.223 -0.5 -0.5 -0.5 h -3.997 Z m 1.064 -3.68 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 h 2.607 c 0.277 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.223 0.5 -0.5 0.5 h -2.607 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
