package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AttentionTriangleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AttentionTriangleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.97 3.997 c -0.857 -1.543 -3.076 -1.543 -3.933 0.0 L 2.587 17.41 c -0.834 1.5 0.25 3.342 1.966 3.342 h 14.902 c 1.715 0.0 2.8 -1.843 1.966 -3.343 l -7.45 -13.41 Z m -1.966 4.004 c 0.552 0.0 1.0 0.448 1.0 1.0 v 4.0 c 0.0 0.553 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.447 -1.0 -1.0 v -4.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 Z m 1.0 9.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 s 0.447 -1.0 1.0 -1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 Z")
        )
    }.build()
}
