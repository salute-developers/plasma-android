package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelOffFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelOffFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.546 6.63 c 0.0 1.725 -0.774 3.359 -2.108 4.451 L 14.5 13.5 c -0.29 0.237 -0.459 0.593 -0.459 0.968 v 5.302 c 0.0 0.334 -0.222 0.63 -0.544 0.721 l -2.583 0.98 c -0.226 0.064 -0.47 0.02 -0.657 -0.122 c -0.188 -0.142 -0.299 -0.364 -0.299 -0.6 v -4.554 l 9.588 -9.588 v 0.024 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.44 2.47 c 0.293 -0.293 0.768 -0.293 1.061 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 L 3.531 20.5 c -0.293 0.294 -0.768 0.294 -1.061 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 6.444 -6.445 l -2.311 -1.914 c -1.335 -1.092 -2.109 -2.726 -2.109 -4.45 V 3.75 C 4.494 3.336 4.83 3.0 5.244 3.0 h 13.552 c 0.036 0.0 0.071 0.003 0.105 0.008 l 0.54 -0.538 Z m -6.69 3.78 C 12.336 6.25 12.0 6.586 12.0 7.0 s 0.336 0.75 0.75 0.75 h 1.41 l 1.5 -1.5 h -2.91 Z")
        )
    }.build()
}
