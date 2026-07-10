package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbDiodeFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbDiodeFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 3.0 C 11.373 3.0 6.0 8.373 6.0 15.0 c 0.0 3.472 1.476 6.6 3.83 8.79 c 0.732 0.68 1.678 0.96 2.566 0.96 h 11.208 c 0.888 0.0 1.834 -0.28 2.565 -0.96 C 28.524 21.6 30.0 18.472 30.0 15.0 c 0.0 -6.627 -5.373 -12.0 -12.0 -12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.625 27.75 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 h 10.5 c 0.621 0.0 1.125 0.504 1.125 1.125 s -0.504 1.125 -1.125 1.125 h -10.5 c -0.621 0.0 -1.125 -0.504 -1.125 -1.125 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.125 31.875 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 h 7.5 c 0.621 0.0 1.125 0.504 1.125 1.125 S 22.371 33.0 21.75 33.0 h -7.5 c -0.621 0.0 -1.125 -0.504 -1.125 -1.125 Z")
        )
    }.build()
}
