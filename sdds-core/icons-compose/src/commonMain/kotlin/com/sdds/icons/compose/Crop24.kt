package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Crop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Crop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.75 2.0 C 6.164 2.0 6.5 2.336 6.5 2.75 V 5.0 H 16.0 l 0.154 0.004 C 17.74 5.084 19.0 6.394 19.0 8.0 v 9.5 h 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 S 21.664 19.0 21.25 19.0 H 19.0 v 2.25 l -0.004 0.077 C 18.958 21.705 18.638 22.0 18.25 22.0 s -0.707 -0.295 -0.746 -0.673 L 17.5 21.25 V 19.0 H 8.0 c -1.605 0.0 -2.916 -1.26 -2.996 -2.846 L 5.0 16.0 V 6.5 H 2.75 C 2.336 6.5 2.0 6.164 2.0 5.75 S 2.336 5.0 2.75 5.0 H 5.0 V 2.75 C 5.0 2.336 5.336 2.0 5.75 2.0 Z M 6.5 16.0 c 0.0 0.828 0.672 1.5 1.5 1.5 h 9.5 V 8.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 H 6.5 V 16.0 Z")
        )
    }.build()
}
