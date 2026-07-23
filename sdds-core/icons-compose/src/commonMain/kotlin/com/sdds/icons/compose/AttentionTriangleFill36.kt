package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AttentionTriangleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AttentionTriangleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.939 6.462 c -1.281 -2.283 -4.597 -2.283 -5.878 0.0 L 3.928 26.304 c -1.245 2.22 0.375 4.946 2.939 4.946 h 22.266 c 2.564 0.0 4.184 -2.727 2.94 -4.946 L 20.938 6.462 Z m -2.94 5.924 c 0.826 0.0 1.495 0.663 1.495 1.48 v 5.918 c 0.0 0.817 -0.669 1.48 -1.494 1.48 s -1.494 -0.663 -1.494 -1.48 v -5.918 c 0.0 -0.817 0.669 -1.48 1.494 -1.48 Z m 1.495 13.316 c 0.0 0.817 -0.669 1.48 -1.494 1.48 s -1.494 -0.663 -1.494 -1.48 s 0.669 -1.48 1.494 -1.48 s 1.494 0.663 1.494 1.48 Z")
        )
    }.build()
}
