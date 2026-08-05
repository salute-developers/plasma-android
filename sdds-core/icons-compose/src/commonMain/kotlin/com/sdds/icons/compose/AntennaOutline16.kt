package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AntennaOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AntennaOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.731 4.75 c -0.395 0.0 -0.729 0.328 -0.729 0.75 c 0.0 0.421 0.334 0.75 0.73 0.75 c 0.395 0.0 0.729 -0.329 0.729 -0.75 c 0.0 -0.422 -0.334 -0.75 -0.73 -0.75 Z M 1.002 5.5 c 0.0 -0.959 0.767 -1.75 1.73 -1.75 c 0.962 0.0 1.729 0.791 1.729 1.75 c 0.0 0.958 -0.767 1.75 -1.73 1.75 c -0.962 0.0 -1.729 -0.792 -1.729 -1.75 Z M 8.0 4.75 c -0.395 0.0 -0.73 0.328 -0.73 0.75 c 0.0 0.421 0.335 0.75 0.73 0.75 c 0.395 0.0 0.73 -0.329 0.73 -0.75 c 0.0 -0.422 -0.335 -0.75 -0.73 -0.75 Z M 6.27 5.5 c 0.0 -0.959 0.767 -1.75 1.73 -1.75 S 9.73 4.541 9.73 5.5 c 0.0 0.958 -0.767 1.75 -1.73 1.75 S 6.27 6.457 6.27 5.5 Z m 6.268 0.0 c 0.0 -0.422 0.334 -0.75 0.73 -0.75 c 0.395 0.0 0.729 0.328 0.729 0.75 c 0.0 0.421 -0.334 0.75 -0.73 0.75 c -0.395 0.0 -0.729 -0.329 -0.729 -0.75 Z m 0.73 -1.75 c -0.963 0.0 -1.73 0.791 -1.73 1.75 c 0.0 0.958 0.767 1.75 1.73 1.75 c 0.962 0.0 1.729 -0.792 1.729 -1.75 c 0.0 -0.959 -0.767 -1.75 -1.73 -1.75 Z M 5.365 9.749 c -0.395 0.0 -0.73 0.328 -0.73 0.75 c 0.0 0.421 0.335 0.749 0.73 0.749 c 0.395 0.0 0.73 -0.328 0.73 -0.75 c 0.0 -0.421 -0.335 -0.75 -0.73 -0.75 Z m -1.73 0.75 c 0.0 -0.96 0.767 -1.75 1.73 -1.75 s 1.73 0.79 1.73 1.75 c 0.0 0.958 -0.767 1.749 -1.73 1.749 s -1.73 -0.791 -1.73 -1.75 Z m 6.268 0.0 c 0.0 -0.422 0.335 -0.75 0.73 -0.75 c 0.395 0.0 0.73 0.328 0.73 0.75 c 0.0 0.421 -0.335 0.749 -0.73 0.749 c -0.396 0.0 -0.73 -0.328 -0.73 -0.75 Z m 0.73 -1.75 c -0.963 0.0 -1.73 0.79 -1.73 1.75 c 0.0 0.958 0.767 1.749 1.73 1.749 s 1.73 -0.791 1.73 -1.75 c 0.0 -0.958 -0.768 -1.75 -1.73 -1.75 Z")
        )
    }.build()
}
