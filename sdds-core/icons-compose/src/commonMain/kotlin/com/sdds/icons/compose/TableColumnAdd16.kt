package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableColumnAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableColumnAdd16",
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
            pathData = addPathNodes("M 11.05 1.0 c 1.353 0.0 2.45 1.097 2.45 2.45 v 4.307 c -0.31 -0.11 -0.634 -0.186 -0.97 -0.226 v -4.08 c 0.0 -0.774 -0.627 -1.4 -1.4 -1.401 H 9.886 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 5.74 c -0.55 0.686 -0.9 1.536 -0.971 2.464 V 3.45 c 0.0 -0.773 -0.628 -1.4 -1.4 -1.4 H 4.87 c -0.773 0.0 -1.4 0.627 -1.4 1.4 v 9.1 c 0.0 0.773 0.627 1.4 1.4 1.4 h 1.244 c 0.773 0.0 1.4 -0.627 1.4 -1.4 v -0.204 C 7.593 13.362 8.007 14.284 8.647 15.0 H 4.95 c -1.353 0.0 -2.45 -1.097 -2.45 -2.45 v -9.1 C 2.5 2.097 3.597 1.0 4.95 1.0 h 6.1 Z")
        )
    }.build()
}
