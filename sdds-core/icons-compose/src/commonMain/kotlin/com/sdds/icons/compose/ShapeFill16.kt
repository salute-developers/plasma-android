package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShapeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShapeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.688 10.083 H 13.2 c 0.58 0.0 1.05 0.47 1.05 1.05 V 13.2 c 0.0 0.58 -0.47 1.05 -1.05 1.05 h -2.066 c -0.58 0.0 -1.05 -0.47 -1.051 -1.05 v -0.512 H 5.917 V 13.2 c 0.0 0.58 -0.47 1.05 -1.05 1.05 H 2.8 c -0.58 0.0 -1.05 -0.47 -1.05 -1.05 v -2.066 c 0.0 -0.58 0.47 -1.05 1.05 -1.051 h 0.513 V 5.917 H 2.8 c -0.58 0.0 -1.05 -0.471 -1.05 -1.05 V 2.8 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 h 2.066 c 0.58 0.0 1.05 0.47 1.051 1.05 v 0.513 h 4.166 V 2.8 c 0.0 -0.58 0.471 -1.05 1.05 -1.05 H 13.2 c 0.58 0.0 1.05 0.47 1.05 1.05 v 2.066 c 0.0 0.58 -0.47 1.05 -1.05 1.051 h -0.512 v 4.166 Z m -7.822 0.0 c 0.58 0.0 1.051 0.47 1.051 1.05 v 0.555 h 4.166 v -0.554 c 0.0 -0.58 0.47 -1.051 1.05 -1.051 h 0.555 V 5.917 h -0.554 c -0.58 0.0 -1.051 -0.47 -1.051 -1.05 V 4.312 H 5.917 v 0.553 c 0.0 0.58 -0.47 1.051 -1.05 1.051 H 4.312 v 4.166 h 0.553 Z")
        )
    }.build()
}
