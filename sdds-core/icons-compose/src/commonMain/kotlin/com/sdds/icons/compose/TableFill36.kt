package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.82 4.5 h 4.14 c 1.94 0.0 3.5 1.56 3.5 3.5 v 4.15 h -7.64 V 4.5 Z m -15.81 0.0 h 4.15 v 7.65 H 4.51 V 8.0 c 0.0 -1.94 1.57 -3.5 3.5 -3.5 Z m 6.15 0.0 h 7.66 v 7.65 h -7.66 V 4.5 Z m -9.65 9.65 h 7.65 v 7.65 H 4.51 v -7.65 Z M 14.0 14.0 h 8.0 l -0.18 7.8 h -7.66 L 14.0 14.0 Z m 17.46 0.15 v 7.65 h -7.64 v -7.65 h 7.64 Z M 8.01 31.45 c -1.93 0.0 -3.5 -1.57 -3.5 -3.5 v -4.16 h 7.65 v 7.66 H 8.01 Z m 6.15 -7.66 h 7.66 v 7.66 h -7.66 v -7.66 Z m 17.3 0.0 v 4.16 c 0.0 1.93 -1.56 3.5 -3.5 3.5 h -4.14 v -7.66 h 7.64 Z")
        )
    }.build()
}
