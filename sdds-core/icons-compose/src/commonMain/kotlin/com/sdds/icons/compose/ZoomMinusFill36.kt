package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ZoomMinusFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ZoomMinusFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.598 22.184 C 25.098 20.368 26.0 18.039 26.0 15.5 C 26.0 9.701 21.299 5.0 15.5 5.0 S 5.0 9.701 5.0 15.5 S 9.701 26.0 15.5 26.0 c 2.54 0.0 4.868 -0.901 6.684 -2.402 l 7.859 7.86 c 0.39 0.39 1.024 0.39 1.414 0.0 c 0.39 -0.391 0.39 -1.025 0.0 -1.415 l -7.859 -7.859 Z M 9.5 15.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 10.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -10.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
    }.build()
}
