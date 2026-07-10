package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShapeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShapeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.75 15.0 h 0.75 c 0.828 0.0 1.5 0.672 1.5 1.5 v 3.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 h -3.0 c -0.828 0.0 -1.5 -0.672 -1.5 -1.5 v -0.75 H 9.0 v 0.75 C 9.0 20.328 8.328 21.0 7.5 21.0 h -3.0 C 3.672 21.0 3.0 20.328 3.0 19.5 v -3.0 C 3.0 15.672 3.672 15.0 4.5 15.0 h 0.75 V 9.0 H 4.5 C 3.672 9.0 3.0 8.328 3.0 7.5 v -3.0 C 3.0 3.672 3.672 3.0 4.5 3.0 h 3.0 C 8.328 3.0 9.0 3.672 9.0 4.5 v 0.75 h 6.0 V 4.5 C 15.0 3.672 15.672 3.0 16.5 3.0 h 3.0 C 20.328 3.0 21.0 3.672 21.0 4.5 v 3.0 C 21.0 8.328 20.328 9.0 19.5 9.0 h -0.75 v 6.0 Z M 7.5 15.0 C 8.328 15.0 9.0 15.672 9.0 16.5 v 0.75 h 6.0 V 16.5 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 h 0.75 V 9.0 H 16.5 C 15.672 9.0 15.0 8.328 15.0 7.5 V 6.75 H 9.0 V 7.5 C 9.0 8.328 8.328 9.0 7.5 9.0 H 6.75 v 6.0 H 7.5 Z m -3.0 4.5 h 3.0 v -3.0 h -3.0 v 3.0 Z m 12.0 0.0 h 3.0 v -3.0 h -3.0 v 3.0 Z m -12.0 -12.0 h 3.0 v -3.0 h -3.0 v 3.0 Z m 12.0 0.0 h 3.0 v -3.0 h -3.0 v 3.0 Z")
        )
    }.build()
}
