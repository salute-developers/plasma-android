package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CalendarFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CalendarFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.0 2.5 c 0.414 0.0 0.75 0.336 0.75 0.75 v 1.256 c 0.29 0.008 0.534 0.03 0.759 0.084 c 1.188 0.285 2.116 1.213 2.401 2.401 C 21.0 7.367 21.0 7.801 21.0 8.403 v 8.378 c 0.0 0.674 0.0 1.225 -0.036 1.672 c -0.038 0.463 -0.12 0.882 -0.319 1.273 c -0.311 0.611 -0.808 1.108 -1.42 1.42 c -0.39 0.199 -0.809 0.28 -1.272 0.318 c -0.447 0.036 -0.998 0.036 -1.672 0.036 H 7.72 c -0.674 0.0 -1.225 0.0 -1.672 -0.036 c -0.463 -0.038 -0.882 -0.12 -1.273 -0.319 c -0.611 -0.311 -1.108 -0.808 -1.42 -1.42 c -0.199 -0.39 -0.28 -0.809 -0.317 -1.272 C 3.001 18.006 3.0 17.455 3.0 16.781 V 8.403 c 0.0 -0.602 0.0 -1.036 0.09 -1.412 C 3.375 5.803 4.303 4.875 5.49 4.59 c 0.225 -0.054 0.47 -0.075 0.759 -0.084 V 3.25 C 6.25 2.836 6.586 2.5 7.0 2.5 s 0.75 0.336 0.75 0.75 V 4.5 h 8.5 V 3.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z m -12.5 8.0 v 6.25 c 0.0 0.712 0.0 1.202 0.031 1.581 c 0.03 0.37 0.086 0.57 0.16 0.714 c 0.167 0.33 0.436 0.597 0.765 0.765 c 0.144 0.073 0.343 0.129 0.713 0.159 C 6.549 19.999 7.038 20.0 7.75 20.0 h 8.5 c 0.712 0.0 1.202 0.0 1.581 -0.031 c 0.37 -0.03 0.57 -0.086 0.714 -0.16 c 0.329 -0.167 0.597 -0.435 0.764 -0.764 c 0.074 -0.144 0.13 -0.344 0.16 -0.714 c 0.03 -0.38 0.031 -0.869 0.031 -1.581 V 10.5 h -15.0 Z")
        )
    }.build()
}
