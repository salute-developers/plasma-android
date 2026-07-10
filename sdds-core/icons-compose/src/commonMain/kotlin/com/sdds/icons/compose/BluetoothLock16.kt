package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothLock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothLock16",
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
            pathData = addPathNodes("M 13.833 7.313 V 6.625 c 0.0 -0.76 -0.597 -1.375 -1.333 -1.375 s -1.333 0.616 -1.333 1.375 v 0.688 C 10.799 7.313 10.5 7.62 10.5 8.0 v 2.063 c 0.0 0.38 0.299 0.687 0.667 0.687 h 2.666 c 0.369 0.0 0.667 -0.308 0.667 -0.688 V 8.0 c 0.0 -0.38 -0.298 -0.687 -0.667 -0.687 Z m -2.0 -0.688 c 0.0 -0.38 0.299 -0.687 0.667 -0.687 c 0.368 0.0 0.666 0.308 0.666 0.687 v 0.688 h -1.333 V 6.625 Z")
        )
    }.build()
}
