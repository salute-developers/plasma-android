package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowAdd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z m 0.001 1.355 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 1.695 H 9.954 c -0.193 0.0 -0.35 0.158 -0.35 0.351 c 0.0 0.193 0.157 0.35 0.35 0.35 h 1.695 v 1.695 c 0.0 0.193 0.158 0.35 0.351 0.35 c 0.193 -0.001 0.35 -0.157 0.35 -0.35 V 12.35 h 1.695 l 0.07 -0.007 c 0.16 -0.033 0.28 -0.174 0.28 -0.343 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 12.35 V 9.954 c 0.0 -0.193 -0.157 -0.349 -0.35 -0.35 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.55 2.5 C 13.903 2.5 15.0 3.597 15.0 4.95 v 3.696 c -0.716 -0.64 -1.638 -1.054 -2.654 -1.131 h 0.204 c 0.773 0.0 1.4 -0.628 1.4 -1.4 V 4.87 c 0.0 -0.773 -0.627 -1.4 -1.4 -1.4 h -9.1 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 1.244 c 0.0 0.773 0.627 1.4 1.4 1.4 h 8.204 c -0.928 0.071 -1.777 0.423 -2.463 0.971 h -5.74 c -0.774 0.0 -1.401 0.628 -1.401 1.4 v 1.245 c 0.0 0.773 0.627 1.4 1.4 1.4 h 4.082 c 0.04 0.336 0.116 0.66 0.226 0.97 H 3.45 C 2.097 13.5 1.0 12.403 1.0 11.05 v -6.1 C 1.0 3.597 2.097 2.5 3.45 2.5 h 9.1 Z")
        )
    }.build()
}
