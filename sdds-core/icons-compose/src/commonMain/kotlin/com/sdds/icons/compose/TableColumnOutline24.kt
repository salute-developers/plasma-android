package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableColumnOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableColumnOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.3 20.0 l -0.01 0.204 c -0.095 0.941 -0.844 1.69 -1.785 1.785 L 9.3 22.0 H 7.4 c -1.105 0.0 -2.0 -0.895 -2.0 -2.0 V 4.0 l 0.01 -0.204 C 5.513 2.787 6.365 2.0 7.401 2.0 h 1.9 l 0.204 0.01 c 0.941 0.097 1.69 0.845 1.785 1.786 L 11.3 4.0 v 16.0 Z M 9.8 4.0 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 H 7.4 C 7.124 3.5 6.9 3.724 6.9 4.0 v 16.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 1.9 c 0.277 0.0 0.5 -0.224 0.5 -0.5 V 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.6 20.0 l -0.01 0.204 c -0.096 0.941 -0.844 1.69 -1.785 1.785 L 16.6 22.0 h -1.9 c -1.105 0.0 -2.0 -0.895 -2.0 -2.0 V 4.0 l 0.01 -0.204 C 12.813 2.787 13.665 2.0 14.7 2.0 h 1.9 l 0.204 0.01 c 0.941 0.096 1.69 0.845 1.785 1.786 L 18.6 4.0 v 16.0 Z M 17.1 4.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -1.9 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 16.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 1.9 c 0.276 0.0 0.5 -0.224 0.5 -0.5 V 4.0 Z")
        )
    }.build()
}
