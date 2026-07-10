package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HourglassFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HourglassFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.83 1.0 h 0.076 h 6.188 h 0.075 c 0.405 0.0 0.719 0.0 0.99 0.083 c 0.603 0.187 1.076 0.668 1.26 1.283 C 13.5 2.641 13.5 2.961 13.5 3.373 V 3.45 c 0.0 1.177 -0.708 2.218 -1.448 2.996 C 11.42 7.11 10.702 7.65 10.185 8.0 c 0.517 0.35 1.235 0.89 1.867 1.554 c 0.74 0.779 1.448 1.819 1.448 2.996 v 0.077 c 0.0 0.413 0.0 0.732 -0.082 1.007 c -0.183 0.615 -0.656 1.097 -1.26 1.283 C 11.888 15.001 11.575 15.0 11.17 15.0 h -0.075 h -6.188 h -0.075 c -0.406 0.0 -0.719 0.0 -0.99 -0.083 c -0.603 -0.186 -1.076 -0.668 -1.26 -1.283 C 2.5 13.359 2.5 13.04 2.5 12.627 V 12.55 c 0.0 -1.177 0.708 -2.217 1.448 -2.996 C 4.58 8.89 5.298 8.35 5.815 8.0 C 5.298 7.65 4.58 7.11 3.948 6.446 C 3.208 5.668 2.5 4.627 2.5 3.45 V 3.373 c 0.0 -0.412 0.0 -0.732 0.081 -1.007 c 0.184 -0.615 0.657 -1.096 1.26 -1.283 C 4.113 0.999 4.426 1.0 4.832 1.0 Z")
        )
    }.build()
}
