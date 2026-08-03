package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Plasma24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Plasma24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.5 c -4.694 0.0 -8.5 3.806 -8.5 8.5 c 0.0 2.096 0.758 4.014 2.016 5.496 c -0.28 -0.751 -0.433 -1.564 -0.433 -2.413 c 0.0 -3.82 3.097 -6.916 6.917 -6.916 s 6.917 3.096 6.917 6.916 c 0.0 0.849 -0.153 1.662 -0.433 2.413 c 1.257 -1.482 2.016 -3.4 2.016 -5.496 c 0.0 -4.694 -3.806 -8.5 -8.5 -8.5 Z m 3.743 15.499 c 1.031 -0.986 1.674 -2.376 1.674 -3.916 c 0.0 -2.991 -2.426 -5.416 -5.417 -5.416 c -2.992 0.0 -5.417 2.425 -5.417 5.416 c 0.0 1.54 0.643 2.93 1.674 3.916 c -0.059 -0.268 -0.09 -0.546 -0.09 -0.832 c 0.0 -2.117 1.716 -3.834 3.833 -3.834 s 3.833 1.717 3.833 3.834 c 0.0 0.285 -0.031 0.564 -0.09 0.832 Z M 12.0 20.5 c 1.289 0.0 2.333 -1.045 2.333 -2.333 c 0.0 -1.289 -1.044 -2.334 -2.333 -2.334 c -1.289 0.0 -2.333 1.045 -2.333 2.334 c 0.0 1.288 1.044 2.333 2.333 2.333 Z m 0.0 1.5 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z")
        )
    }.build()
}
