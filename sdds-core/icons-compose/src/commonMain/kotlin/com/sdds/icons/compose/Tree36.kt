package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Tree36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Tree36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.625 11.25 c 0.0 1.657 1.343 3.0 3.0 3.0 h 1.374 v 11.012 c 0.0 1.857 1.505 3.363 3.362 3.363 h 3.671 C 16.236 29.97 17.398 31.0 18.8 31.0 h 8.4 c 1.546 0.0 2.8 -1.253 2.8 -2.8 v -2.4 c 0.0 -1.546 -1.254 -2.8 -2.8 -2.8 h -8.4 c -1.546 0.0 -2.8 1.254 -2.8 2.8 v 0.825 h -3.64 c -0.751 0.0 -1.36 -0.61 -1.36 -1.363 L 10.998 19.0 H 16.0 v 0.2 c 0.0 1.547 1.254 2.8 2.8 2.8 h 8.4 c 1.546 0.0 2.8 -1.253 2.8 -2.8 v -2.4 c 0.0 -1.546 -1.254 -2.8 -2.8 -2.8 h -8.4 c -1.546 0.0 -2.8 1.254 -2.8 2.8 V 17.0 h -5.001 v -2.75 h 1.5 c 1.657 0.0 3.0 -1.343 3.0 -3.0 V 7.5 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 H 7.626 c -1.657 0.0 -3.0 1.343 -3.0 3.0 v 3.75 Z m 2.0 -3.75 v 3.75 c 0.0 0.552 0.448 1.0 1.0 1.0 H 12.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 V 7.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 7.625 c -0.552 0.0 -1.0 0.448 -1.0 1.0 Z M 27.2 16.0 h -8.4 c -0.442 0.0 -0.8 0.358 -0.8 0.8 v 2.4 c 0.0 0.442 0.358 0.8 0.8 0.8 h 8.4 c 0.442 0.0 0.8 -0.358 0.8 -0.8 v -2.4 c 0.0 -0.442 -0.358 -0.8 -0.8 -0.8 Z M 18.0 28.2 v -2.4 c 0.0 -0.442 0.358 -0.8 0.8 -0.8 h 8.4 c 0.442 0.0 0.8 0.358 0.8 0.8 v 2.4 c 0.0 0.442 -0.358 0.8 -0.8 0.8 h -8.4 c -0.442 0.0 -0.8 -0.358 -0.8 -0.8 Z")
        )
    }.build()
}
