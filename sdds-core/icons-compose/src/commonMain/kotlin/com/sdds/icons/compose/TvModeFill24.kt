package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvModeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvModeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.53 4.0 C 3.408 4.0 3.275 4.0 3.16 4.01 c -0.13 0.01 -0.3 0.036 -0.477 0.126 c -0.236 0.12 -0.427 0.311 -0.547 0.547 C 2.046 4.859 2.02 5.03 2.01 5.16 C 2.0 5.275 2.0 5.408 2.0 5.53 v 9.94 c 0.0 0.122 0.0 0.255 0.01 0.37 c 0.01 0.13 0.036 0.3 0.126 0.477 c 0.12 0.236 0.311 0.427 0.547 0.547 c 0.176 0.09 0.348 0.116 0.478 0.127 C 3.275 17.0 3.408 17.0 3.53 17.0 h 16.94 c 0.122 0.0 0.255 0.0 0.37 -0.01 c 0.13 -0.01 0.3 -0.036 0.477 -0.126 c 0.236 -0.12 0.427 -0.311 0.547 -0.547 c 0.09 -0.176 0.116 -0.348 0.127 -0.478 C 22.0 15.725 22.0 15.592 22.0 15.47 V 5.53 c 0.0 -0.122 0.0 -0.255 -0.01 -0.37 c -0.01 -0.13 -0.036 -0.3 -0.126 -0.477 c -0.12 -0.236 -0.311 -0.427 -0.547 -0.547 c -0.176 -0.09 -0.348 -0.116 -0.477 -0.127 C 20.725 4.0 20.591 4.0 20.47 4.0 H 3.53 Z m 2.696 3.8 h 5.04 v 1.275 H 9.389 v 4.675 h -1.36 V 9.075 H 6.226 V 7.8 Z m 11.63 0.0 l -2.388 5.95 h -1.326 L 11.728 7.8 h 1.436 l 1.65 4.276 L 16.487 7.8 h 1.368 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 18.0 h 16.0 v 1.5 H 4.0 V 18.0 Z")
        )
    }.build()
}
