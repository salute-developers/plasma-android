package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowsMove36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowsMove36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.293 3.293 c 0.39 -0.39 1.024 -0.39 1.415 0.0 l 3.783 3.784 c 0.39 0.39 0.39 1.023 0.0 1.414 c -0.39 0.39 -1.023 0.39 -1.414 0.0 L 18.0 5.414 l -3.076 3.077 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 3.783 -3.784 Z M 21.026 18.0 c 0.0 1.671 -1.355 3.026 -3.026 3.026 c -1.672 0.0 -3.027 -1.355 -3.027 -3.026 c 0.0 -1.672 1.355 -3.027 3.027 -3.027 c 1.671 0.0 3.026 1.355 3.026 3.027 Z m 7.896 -4.491 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 c -0.39 0.39 -0.39 1.023 0.0 1.414 l 3.076 3.076 l -3.076 3.077 c -0.39 0.39 -0.39 1.023 0.0 1.414 c 0.39 0.39 1.023 0.39 1.414 0.0 l 3.784 -3.784 c 0.187 -0.187 0.292 -0.441 0.292 -0.707 c 0.0 -0.265 -0.105 -0.52 -0.292 -0.707 l -3.784 -3.783 Z m -15.412 14.0 c 0.39 -0.39 1.023 -0.39 1.414 0.0 L 18.0 30.585 l 3.077 -3.076 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.023 0.0 1.414 l -3.784 3.784 c -0.39 0.39 -1.023 0.39 -1.414 0.0 l -3.783 -3.784 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 Z M 8.49 14.923 c 0.391 -0.39 0.391 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.413 0.0 l -3.784 3.783 C 3.105 17.48 3.0 17.734 3.0 18.0 c 0.0 0.266 0.105 0.52 0.293 0.707 l 3.784 3.784 c 0.39 0.39 1.023 0.39 1.414 0.0 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 l -3.077 -3.077 l 3.077 -3.076 Z")
        )
    }.build()
}
