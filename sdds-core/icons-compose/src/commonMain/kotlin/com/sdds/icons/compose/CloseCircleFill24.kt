package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloseCircleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloseCircleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z M 8.707 7.293 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 c -0.39 0.39 -0.39 1.024 0.0 1.414 L 10.586 12.0 l -3.293 3.293 c -0.39 0.39 -0.39 1.024 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 12.0 13.414 l 3.293 3.293 c 0.39 0.39 1.024 0.39 1.414 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 L 13.414 12.0 l 3.293 -3.293 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 L 12.0 10.586 L 8.707 7.293 Z")
        )
    }.build()
}
