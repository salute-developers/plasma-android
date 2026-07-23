package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneCircleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneCircleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 17.875 C 5.0 10.765 10.764 5.0 17.875 5.0 c 7.11 0.0 12.875 5.764 12.875 12.875 c 0.0 7.11 -5.764 12.875 -12.875 12.875 C 10.765 30.75 5.0 24.986 5.0 17.875 Z M 17.875 3.0 C 9.66 3.0 3.0 9.66 3.0 17.875 S 9.66 32.75 17.875 32.75 S 32.75 26.09 32.75 17.875 S 26.09 3.0 17.875 3.0 Z m 8.195 11.094 c 0.397 -0.384 0.408 -1.017 0.024 -1.414 c -0.384 -0.397 -1.017 -0.408 -1.414 -0.024 l -10.167 9.828 l -3.443 -3.328 c -0.397 -0.384 -1.03 -0.373 -1.414 0.024 c -0.384 0.397 -0.373 1.03 0.024 1.414 l 4.138 4.0 c 0.388 0.375 1.002 0.375 1.39 0.0 l 10.862 -10.5 Z")
        )
    }.build()
}
