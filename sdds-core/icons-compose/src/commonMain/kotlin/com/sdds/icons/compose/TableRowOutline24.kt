package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableRowOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableRowOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.204 12.71 C 21.213 12.814 22.0 13.666 22.0 14.7 v 1.9 l -0.01 0.205 c -0.096 0.941 -0.845 1.69 -1.786 1.785 L 20.0 18.6 H 4.0 l -0.204 -0.01 c -0.941 -0.096 -1.69 -0.844 -1.785 -1.785 L 2.0 16.6 v -1.9 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 16.0 l 0.204 0.01 Z M 4.0 14.2 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 1.9 c 0.0 0.276 0.224 0.5 0.5 0.5 h 16.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -1.9 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.204 5.411 C 21.213 5.513 22.0 6.365 22.0 7.401 v 1.9 l -0.01 0.204 c -0.096 0.941 -0.845 1.69 -1.786 1.785 L 20.0 11.3 H 4.0 l -0.204 -0.01 c -0.941 -0.095 -1.69 -0.844 -1.785 -1.785 L 2.0 9.3 V 7.4 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 h 16.0 l 0.204 0.01 Z M 4.0 6.901 c -0.276 0.0 -0.5 0.223 -0.5 0.5 v 1.9 c 0.0 0.276 0.224 0.5 0.5 0.5 h 16.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 V 7.4 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 H 4.0 Z")
        )
    }.build()
}
