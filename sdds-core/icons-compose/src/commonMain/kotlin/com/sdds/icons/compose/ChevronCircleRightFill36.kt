package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronCircleRightFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronCircleRightFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 32.0 18.0 c 0.0 -7.732 -6.268 -14.0 -14.0 -14.0 S 4.0 10.268 4.0 18.0 s 6.268 14.0 14.0 14.0 s 14.0 -6.268 14.0 -14.0 Z m -17.507 6.76 c -0.39 0.39 -0.39 1.023 0.0 1.413 c 0.391 0.39 1.024 0.39 1.415 0.0 l 7.467 -7.467 c 0.39 -0.39 0.39 -1.023 0.0 -1.414 l -7.467 -7.467 c -0.39 -0.39 -1.024 -0.39 -1.415 0.0 c -0.39 0.39 -0.39 1.024 0.0 1.414 l 6.76 6.76 l -6.76 6.76 Z")
        )
    }.build()
}
