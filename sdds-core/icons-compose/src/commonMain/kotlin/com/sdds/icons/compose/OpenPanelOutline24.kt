package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.OpenPanelOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "OpenPanelOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.0 c 0.0 -1.11 0.89 -2.0 2.0 -2.0 h 5.0 c 1.1 0.0 2.0 0.89 2.0 2.0 v 10.0 c 0.0 1.1 -0.9 2.0 -2.0 2.0 H 4.0 c -1.11 0.0 -2.0 -0.9 -2.0 -2.0 V 7.0 Z m 13.0 -2.0 c -1.11 0.0 -2.0 0.89 -2.0 2.0 v 10.0 c 0.0 1.1 0.89 2.0 2.0 2.0 h 5.0 c 1.1 0.0 2.0 -0.9 2.0 -2.0 V 7.0 c 0.0 -1.11 -0.9 -2.0 -2.0 -2.0 h -5.0 Z M 3.5 7.0 c 0.0 -0.28 0.22 -0.5 0.5 -0.5 h 5.0 c 0.27 0.0 0.5 0.22 0.5 0.5 v 10.0 c 0.0 0.27 -0.23 0.5 -0.5 0.5 H 4.0 c -0.28 0.0 -0.5 -0.23 -0.5 -0.5 V 7.0 Z M 15.0 6.5 c -0.28 0.0 -0.5 0.22 -0.5 0.5 v 10.0 c 0.0 0.27 0.22 0.5 0.5 0.5 h 5.0 c 0.27 0.0 0.5 -0.23 0.5 -0.5 V 7.0 c 0.0 -0.28 -0.23 -0.5 -0.5 -0.5 h -5.0 Z M 7.51 8.28 l -3.18 3.18 c -0.3 0.3 -0.3 0.77 0.0 1.07 l 3.18 3.18 c 0.48 0.48 1.29 0.14 1.29 -0.53 V 8.81 c 0.0 -0.67 -0.81 -1.01 -1.29 -0.53 Z m 8.97 0.0 l 3.18 3.18 c 0.3 0.3 0.3 0.77 0.0 1.07 l -3.18 3.18 c -0.48 0.48 -1.29 0.14 -1.29 -0.53 V 8.81 c 0.0 -0.67 0.81 -1.01 1.29 -0.53 Z")
        )
    }.build()
}
