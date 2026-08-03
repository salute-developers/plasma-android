package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VkFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VkFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.54 4.36 c 6.11 0.0 9.165 0.0 11.063 1.916 C 31.5 8.193 31.5 11.28 31.5 17.45 v 1.091 c 0.0 6.17 0.0 9.256 -1.898 11.173 c -1.897 1.917 -4.953 1.916 -11.062 1.916 h -1.08 c -6.11 0.0 -9.165 0.0 -11.063 -1.916 C 4.5 27.796 4.5 24.71 4.5 18.54 v -1.09 c 0.0 -6.171 0.0 -9.257 1.897 -11.174 C 8.295 4.36 11.351 4.36 17.46 4.36 h 1.08 Z m -9.483 8.293 c 0.146 7.09 3.655 11.352 9.81 11.352 h 0.348 v -4.057 c 2.261 0.227 3.97 1.898 4.657 4.057 h 3.195 c -0.877 -3.227 -3.184 -5.01 -4.624 -5.692 c 1.44 -0.841 3.466 -2.887 3.95 -5.66 H 23.49 c -0.63 2.25 -2.498 4.295 -4.275 4.489 v -4.489 h -2.902 v 7.864 c -1.8 -0.455 -4.073 -2.66 -4.174 -7.864 H 9.057 Z")
        )
    }.build()
}
