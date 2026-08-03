package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Mindmap24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Mindmap24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.5 7.747 h 2.596 C 16.428 9.042 17.604 10.0 19.003 10.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 c -1.397 0.0 -2.571 0.955 -2.905 2.247 H 13.5 c -1.243 0.0 -2.25 1.007 -2.25 2.25 v 2.753 H 7.905 C 7.572 9.956 6.398 9.0 5.0 9.0 c -1.657 0.0 -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 c 1.398 0.0 2.572 -0.956 2.905 -2.25 h 3.345 v 2.751 c 0.0 1.243 1.007 2.25 2.25 2.25 h 2.597 c 0.333 1.294 1.508 2.25 2.906 2.25 c 1.657 0.0 3.0 -1.343 3.0 -3.0 c 0.0 -1.656 -1.343 -3.0 -3.0 -3.0 c -1.398 0.0 -2.572 0.956 -2.906 2.25 H 13.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 V 8.497 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z M 19.003 5.5 c -0.829 0.0 -1.5 0.672 -1.5 1.5 s 0.671 1.5 1.5 1.5 c 0.828 0.0 1.5 -0.672 1.5 -1.5 s -0.672 -1.5 -1.5 -1.5 Z M 6.5 12.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 S 3.5 11.172 3.5 12.0 s 0.672 1.5 1.5 1.5 s 1.5 -0.672 1.5 -1.5 Z m 11.003 5.002 c 0.0 -0.829 0.671 -1.5 1.5 -1.5 c 0.828 0.0 1.5 0.671 1.5 1.5 c 0.0 0.828 -0.672 1.5 -1.5 1.5 c -0.829 0.0 -1.5 -0.672 -1.5 -1.5 Z")
        )
    }.build()
}
