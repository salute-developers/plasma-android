package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChoiceOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChoiceOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.965 1.75 c -0.67 0.0 -1.215 0.544 -1.215 1.215 V 6.09 c 0.0 0.671 0.544 1.216 1.215 1.216 H 6.09 c 0.671 0.0 1.216 -0.545 1.216 -1.216 V 2.965 c 0.0 -0.67 -0.545 -1.215 -1.216 -1.215 H 2.965 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.91 1.75 c -0.671 0.0 -1.216 0.544 -1.216 1.215 V 6.09 c 0.0 0.671 0.545 1.216 1.216 1.216 h 3.125 c 0.67 0.0 1.215 -0.545 1.215 -1.216 V 2.965 c 0.0 -0.67 -0.544 -1.215 -1.215 -1.215 H 9.91 Z M 9.736 2.965 c 0.0 -0.096 0.078 -0.173 0.174 -0.173 h 3.125 c 0.096 0.0 0.173 0.077 0.173 0.173 V 6.09 c 0.0 0.096 -0.077 0.174 -0.173 0.174 H 9.91 c -0.096 0.0 -0.174 -0.078 -0.174 -0.174 V 2.965 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.694 9.91 c 0.0 -0.671 0.545 -1.216 1.216 -1.216 h 3.125 c 0.67 0.0 1.215 0.545 1.215 1.216 v 3.125 c 0.0 0.67 -0.544 1.215 -1.215 1.215 H 9.91 c -0.671 0.0 -1.216 -0.544 -1.216 -1.215 V 9.91 Z M 9.91 9.736 c -0.096 0.0 -0.174 0.078 -0.174 0.174 v 3.125 c 0.0 0.096 0.078 0.173 0.174 0.173 h 3.125 c 0.096 0.0 0.173 -0.077 0.173 -0.173 V 9.91 c 0.0 -0.096 -0.077 -0.174 -0.173 -0.174 H 9.91 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.965 8.694 c -0.67 0.0 -1.215 0.545 -1.215 1.216 v 3.125 c 0.0 0.67 0.544 1.215 1.215 1.215 H 6.09 c 0.671 0.0 1.216 -0.544 1.216 -1.215 V 9.91 c 0.0 -0.671 -0.545 -1.216 -1.216 -1.216 H 2.965 Z M 2.792 9.91 c 0.0 -0.096 0.077 -0.174 0.173 -0.174 H 6.09 c 0.096 0.0 0.174 0.078 0.174 0.174 v 3.125 c 0.0 0.096 -0.078 0.173 -0.174 0.173 H 2.965 c -0.096 0.0 -0.173 -0.077 -0.173 -0.173 V 9.91 Z")
        )
    }.build()
}
