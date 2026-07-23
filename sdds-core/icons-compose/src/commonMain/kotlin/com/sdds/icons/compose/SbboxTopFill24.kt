package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxTopFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxTopFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 10.8 c 0.0 -0.98 0.0 -1.47 0.19 -1.844 c 0.169 -0.33 0.436 -0.597 0.766 -0.765 C 2.33 8.0 2.82 8.0 3.8 8.0 h 16.4 c 0.98 0.0 1.47 0.0 1.845 0.19 c 0.329 0.169 0.596 0.436 0.764 0.766 C 23.0 9.33 23.0 9.82 23.0 10.8 v 1.4 c 0.0 0.98 0.0 1.47 -0.19 1.845 c -0.168 0.329 -0.436 0.597 -0.765 0.764 C 21.67 15.0 21.18 15.0 20.2 15.0 H 3.8 c -0.98 0.0 -1.47 0.0 -1.844 -0.19 c -0.33 -0.168 -0.597 -0.436 -0.765 -0.766 C 1.0 13.67 1.0 13.18 1.0 12.2 v -1.4 Z m 12.75 0.7 c 0.0 0.966 -0.784 1.75 -1.75 1.75 s -1.75 -0.784 -1.75 -1.75 s 0.784 -1.75 1.75 -1.75 s 1.75 0.784 1.75 1.75 Z m -9.25 -2.0 H 3.0 v 4.0 h 1.5 v -4.0 Z m 16.5 0.0 v 4.0 h -1.5 v -4.0 H 21.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 16.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 5.586 17.5 6.0 17.5 h 12.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 18.414 16.0 18.0 16.0 H 6.0 Z")
        )
    }.build()
}
