package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DataBaseOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DataBaseOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.0 c 3.48 0.0 6.3 1.567 6.3 3.5 v 7.135 l -0.01 0.1 l -0.01 0.037 C 14.03 13.578 11.314 15.0 8.0 15.0 c -3.315 0.0 -6.031 -1.422 -6.28 -3.229 c -0.004 -0.012 -0.008 -0.023 -0.01 -0.036 l -0.01 -0.1 V 4.5 C 1.7 2.567 4.52 1.0 8.0 1.0 Z m 5.3 8.89 c -1.121 0.968 -3.075 1.61 -5.3 1.61 c -2.225 0.0 -4.18 -0.642 -5.3 -1.61 v 1.61 c 0.0 0.438 0.332 1.046 1.331 1.6 C 4.996 13.638 6.397 14.0 8.0 14.0 c 1.602 0.0 3.004 -0.363 3.97 -0.9 c 0.936 -0.52 1.286 -1.086 1.326 -1.516 L 13.3 11.5 V 9.89 Z m 0.0 -3.5 C 12.179 7.359 10.225 8.0 8.0 8.0 C 5.775 8.0 3.82 7.358 2.7 6.39 V 8.0 c 0.0 0.438 0.332 1.045 1.331 1.6 c 0.965 0.537 2.366 0.9 3.969 0.9 c 1.602 0.0 3.004 -0.363 3.97 -0.9 c 0.936 -0.52 1.286 -1.086 1.326 -1.516 L 13.3 8.0 V 6.39 Z M 8.0 2.0 C 6.397 2.0 4.996 2.363 4.03 2.9 C 3.031 3.454 2.7 4.061 2.7 4.5 c 0.0 0.438 0.332 1.045 1.331 1.6 C 4.996 6.638 6.397 7.0 8.0 7.0 c 1.602 0.0 3.004 -0.363 3.97 -0.9 c 0.998 -0.554 1.33 -1.162 1.33 -1.6 c 0.0 -0.438 -0.332 -1.046 -1.33 -1.6 C 11.004 2.362 9.601 2.0 8.0 2.0 Z")
        )
    }.build()
}
