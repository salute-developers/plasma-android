package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DashboardOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DashboardOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.653 11.008 C 10.41 11.085 11.0 11.723 11.0 12.5 v 8.0 c 0.0 0.777 -0.59 1.415 -1.347 1.492 L 9.5 22.0 h -6.0 c -0.777 0.0 -1.415 -0.59 -1.492 -1.347 L 2.0 20.5 v -8.0 C 2.0 11.672 2.672 11.0 3.5 11.0 h 6.0 l 0.153 0.008 Z M 3.5 20.5 h 6.0 v -8.0 h -6.0 v 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.653 15.008 C 21.41 15.085 22.0 15.723 22.0 16.5 v 4.0 l -0.008 0.153 c -0.072 0.706 -0.633 1.268 -1.339 1.34 L 20.5 22.0 h -6.0 c -0.777 0.0 -1.415 -0.59 -1.492 -1.347 L 13.0 20.5 v -4.0 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 h 6.0 l 0.153 0.008 Z M 14.5 20.5 h 6.0 v -4.0 h -6.0 v 4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.653 2.008 C 21.41 2.085 22.0 2.723 22.0 3.5 v 8.0 c 0.0 0.777 -0.59 1.415 -1.347 1.492 L 20.5 13.0 h -6.0 c -0.777 0.0 -1.415 -0.59 -1.492 -1.347 L 13.0 11.5 v -8.0 C 13.0 2.672 13.672 2.0 14.5 2.0 h 6.0 l 0.153 0.008 Z M 14.5 11.5 h 6.0 v -8.0 h -6.0 v 8.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.653 2.008 C 10.41 2.085 11.0 2.723 11.0 3.5 v 4.0 l -0.008 0.153 C 10.92 8.36 10.36 8.921 9.653 8.993 L 9.5 9.0 h -6.0 C 2.723 9.0 2.085 8.41 2.008 7.653 L 2.0 7.5 v -4.0 C 2.0 2.672 2.672 2.0 3.5 2.0 h 6.0 l 0.153 0.008 Z M 3.5 7.5 h 6.0 v -4.0 h -6.0 v 4.0 Z")
        )
    }.build()
}
