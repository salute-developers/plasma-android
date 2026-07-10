package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2TopLOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2TopLOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.25 2.0 C 3.007 2.0 2.0 3.007 2.0 4.25 v 4.5 C 2.0 9.993 3.007 11.0 4.25 11.0 h 4.5 C 9.993 11.0 11.0 9.993 11.0 8.75 v -4.5 C 11.0 3.007 9.993 2.0 8.75 2.0 h -4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.75 3.0 C 14.784 3.0 14.0 3.784 14.0 4.75 v 3.5 C 14.0 9.216 14.784 10.0 15.75 10.0 h 3.5 C 20.216 10.0 21.0 9.216 21.0 8.25 v -3.5 C 21.0 3.784 20.216 3.0 19.25 3.0 h -3.5 Z M 15.5 4.75 c 0.0 -0.138 0.112 -0.25 0.25 -0.25 h 3.5 c 0.138 0.0 0.25 0.112 0.25 0.25 v 3.5 c 0.0 0.138 -0.112 0.25 -0.25 0.25 h -3.5 c -0.138 0.0 -0.25 -0.112 -0.25 -0.25 v -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.0 15.75 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 h 3.5 c 0.966 0.0 1.75 0.784 1.75 1.75 v 3.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -3.5 C 14.784 21.0 14.0 20.216 14.0 19.25 v -3.5 Z m 1.75 -0.25 c -0.138 0.0 -0.25 0.112 -0.25 0.25 v 3.5 c 0.0 0.138 0.112 0.25 0.25 0.25 h 3.5 c 0.138 0.0 0.25 -0.112 0.25 -0.25 v -3.5 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 h -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.75 14.0 C 3.784 14.0 3.0 14.784 3.0 15.75 v 3.5 C 3.0 20.216 3.784 21.0 4.75 21.0 h 3.5 C 9.216 21.0 10.0 20.216 10.0 19.25 v -3.5 C 10.0 14.784 9.216 14.0 8.25 14.0 h -3.5 Z M 4.5 15.75 c 0.0 -0.138 0.112 -0.25 0.25 -0.25 h 3.5 c 0.138 0.0 0.25 0.112 0.25 0.25 v 3.5 c 0.0 0.138 -0.112 0.25 -0.25 0.25 h -3.5 c -0.138 0.0 -0.25 -0.112 -0.25 -0.25 v -3.5 Z")
        )
    }.build()
}
