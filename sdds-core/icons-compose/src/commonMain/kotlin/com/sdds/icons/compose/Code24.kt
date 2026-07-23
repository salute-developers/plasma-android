package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Code24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Code24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.782 3.532 c 0.12 -0.396 0.54 -0.62 0.936 -0.5 s 0.62 0.54 0.5 0.936 l -5.0 16.5 c -0.12 0.396 -0.54 0.62 -0.936 0.5 s -0.62 -0.54 -0.5 -0.936 l 5.0 -16.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.47 7.97 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.768 0.0 1.06 L 4.56 12.0 l 2.97 2.97 c 0.293 0.293 0.293 0.768 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 L 3.11 12.672 c -0.37 -0.37 -0.37 -0.973 0.0 -1.344 L 6.47 7.97 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.47 7.97 c 0.293 -0.293 0.768 -0.293 1.06 0.0 l 3.359 3.358 c 0.37 0.371 0.37 0.973 0.0 1.344 L 17.53 16.03 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 L 19.44 12.0 l -2.97 -2.97 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
