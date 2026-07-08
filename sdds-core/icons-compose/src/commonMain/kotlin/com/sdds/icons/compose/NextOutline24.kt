package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NextOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NextOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.28 13.92 c 1.442 -0.877 1.442 -2.97 0.0 -3.846 L 6.42 4.081 C 4.919 3.169 3.0 4.249 3.0 6.004 V 17.99 c 0.0 1.755 1.92 2.834 3.419 1.923 l 9.861 -5.993 Z m -0.779 -2.564 c 0.48 0.292 0.48 0.99 0.0 1.282 L 5.64 18.63 c -0.5 0.304 -1.14 -0.056 -1.14 -0.64 V 6.003 c 0.0 -0.585 0.64 -0.945 1.14 -0.641 l 9.861 5.993 Z M 21.0 4.996 c 0.0 -0.413 -0.336 -0.75 -0.75 -0.75 s -0.75 0.337 -0.75 0.75 v 14.5 c 0.0 0.415 0.336 0.75 0.75 0.75 S 21.0 19.912 21.0 19.497 v -14.5 Z")
        )
    }.build()
}
