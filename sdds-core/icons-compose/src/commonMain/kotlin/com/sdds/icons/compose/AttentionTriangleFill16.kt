package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AttentionTriangleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AttentionTriangleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.368 2.558 c -0.596 -1.077 -2.14 -1.077 -2.736 0.0 l -5.183 9.36 c -0.58 1.046 0.175 2.332 1.368 2.332 h 10.366 c 1.193 0.0 1.947 -1.286 1.368 -2.333 l -5.183 -9.36 Z M 8.0 5.352 c 0.384 0.0 0.696 0.312 0.696 0.698 V 8.84 C 8.696 9.227 8.384 9.54 8.0 9.54 c -0.384 0.0 -0.696 -0.312 -0.696 -0.698 V 6.05 c 0.0 -0.386 0.312 -0.698 0.696 -0.698 Z m 0.696 6.281 c 0.0 0.385 -0.312 0.698 -0.696 0.698 c -0.384 0.0 -0.696 -0.313 -0.696 -0.698 c 0.0 -0.385 0.312 -0.698 0.696 -0.698 c 0.384 0.0 0.696 0.313 0.696 0.698 Z")
        )
    }.build()
}
