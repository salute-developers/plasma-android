package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TaskHorizFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TaskHorizFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.662 29.469 C 6.705 30.0 8.07 30.0 10.8 30.0 h 14.4 c 2.73 0.0 4.095 0.0 5.138 -0.531 c 0.918 -0.468 1.663 -1.213 2.13 -2.13 C 33.0 26.294 33.0 24.93 33.0 22.2 v -8.4 c 0.0 -2.73 0.0 -4.095 -0.531 -5.138 c -0.468 -0.917 -1.213 -1.663 -2.13 -2.13 C 29.294 6.0 27.93 6.0 25.2 6.0 H 10.8 C 8.07 6.0 6.705 6.0 5.662 6.531 C 4.745 7.0 3.999 7.745 3.532 8.661 C 3.0 9.706 3.0 11.07 3.0 13.8 v 8.4 c 0.0 2.73 0.0 4.095 0.531 5.138 c 0.468 0.918 1.214 1.663 2.13 2.13 Z m 19.045 -14.512 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 l -7.543 7.543 l -3.043 -3.043 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 c -0.39 0.39 -0.39 1.024 0.0 1.414 l 3.75 3.75 c 0.39 0.39 1.024 0.39 1.414 0.0 l 8.25 -8.25 Z")
        )
    }.build()
}
