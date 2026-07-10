package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WindowMaximize36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WindowMaximize36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.5 11.5 c 0.0 -3.314 2.686 -6.0 6.0 -6.0 h 13.0 c 3.314 0.0 6.0 2.686 6.0 6.0 v 13.0 c 0.0 3.314 -2.686 6.0 -6.0 6.0 h -13.0 c -3.314 0.0 -6.0 -2.686 -6.0 -6.0 v -13.0 Z m 2.0 2.0 v 11.0 c 0.0 2.21 1.79 4.0 4.0 4.0 h 13.0 c 2.21 0.0 4.0 -1.79 4.0 -4.0 v -11.0 h -21.0 Z")
        )
    }.build()
}
