package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVertOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVertOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.015 4.045 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.06 0.0 L 17.5 5.437 V 5.0 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 16.0 4.586 16.0 5.0 v 1.938 l -8.0 8.0 V 6.811 l 2.22 2.22 c 0.293 0.292 0.768 0.292 1.06 0.0 c 0.293 -0.294 0.293 -0.768 0.0 -1.061 l -3.5 -3.5 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 l -3.5 3.5 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.768 0.293 1.06 0.0 L 6.5 6.81 v 9.628 l -3.516 3.517 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.292 0.293 0.767 0.293 1.06 0.0 l 2.458 -2.457 v 0.001 L 8.0 17.062 V 17.06 l 8.0 -8.0 v 0.002 l 1.5 -1.5 V 7.56 l 3.515 -3.515 Z M 16.0 17.189 v -6.006 l 1.5 -1.5 v 7.506 l 2.22 -2.22 c 0.293 -0.292 0.768 -0.292 1.06 0.0 c 0.293 0.294 0.293 0.768 0.0 1.061 l -3.5 3.5 c -0.292 0.293 -0.767 0.293 -1.06 0.0 l -3.5 -3.5 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.768 -0.293 1.06 0.0 L 16.0 17.19 Z")
        )
    }.build()
}
