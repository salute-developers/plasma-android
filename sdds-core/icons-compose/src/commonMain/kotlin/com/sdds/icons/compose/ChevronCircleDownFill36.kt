package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronCircleDownFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronCircleDownFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 32.0 c 7.732 0.0 14.0 -6.268 14.0 -14.0 S 25.732 4.0 18.0 4.0 S 4.0 10.268 4.0 18.0 s 6.268 14.0 14.0 14.0 Z m -6.76 -17.507 c -0.39 -0.39 -1.023 -0.39 -1.413 0.0 c -0.39 0.391 -0.39 1.024 0.0 1.415 l 7.467 7.467 c 0.39 0.39 1.023 0.39 1.414 0.0 l 7.467 -7.467 c 0.39 -0.39 0.39 -1.024 0.0 -1.415 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 L 18.0 21.253 l -6.76 -6.76 Z")
        )
    }.build()
}
