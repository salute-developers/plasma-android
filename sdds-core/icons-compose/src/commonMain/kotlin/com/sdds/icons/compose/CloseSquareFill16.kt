package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloseSquareFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloseSquareFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.025 1.75 c -1.256 0.0 -2.275 1.019 -2.275 2.275 v 7.95 c 0.0 1.256 1.019 2.275 2.275 2.275 h 7.95 c 1.256 0.0 2.275 -1.019 2.275 -2.275 v -7.95 c 0.0 -1.256 -1.019 -2.275 -2.275 -2.275 h -7.95 Z m 7.29 2.936 c 0.203 0.203 0.203 0.533 0.0 0.736 L 8.737 8.0 l 2.578 2.578 c 0.203 0.204 0.203 0.534 0.0 0.737 c -0.204 0.203 -0.534 0.203 -0.737 0.0 L 8.0 8.737 l -2.578 2.578 c -0.203 0.203 -0.533 0.203 -0.737 0.0 c -0.203 -0.204 -0.203 -0.533 0.0 -0.737 L 7.263 8.0 L 4.685 5.422 c -0.203 -0.203 -0.203 -0.533 0.0 -0.736 c 0.204 -0.204 0.534 -0.204 0.737 0.0 L 8.0 7.264 l 2.578 -2.578 c 0.203 -0.204 0.533 -0.204 0.737 0.0 Z")
        )
    }.build()
}
