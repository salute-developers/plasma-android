package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LineLinkToto36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LineLinkToto36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 28.405 5.07 l 4.074 4.075 c 0.188 0.187 0.293 0.441 0.293 0.707 c 0.0 0.265 -0.105 0.52 -0.293 0.707 l -4.157 4.157 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 2.425 -2.426 l -6.985 0.07 c -1.905 0.02 -3.445 1.56 -3.464 3.465 l -0.07 6.895 c -0.03 2.994 -2.45 5.414 -5.444 5.444 l -7.054 0.072 l 2.391 2.39 c 0.39 0.391 0.39 1.025 0.0 1.415 c -0.39 0.39 -1.024 0.39 -1.414 0.0 l -4.074 -4.074 c -0.39 -0.39 -0.39 -1.024 0.0 -1.414 l 4.157 -4.158 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 l -2.425 2.426 l 6.985 -0.07 c 1.905 -0.02 3.445 -1.56 3.464 -3.465 l 0.07 -6.895 c 0.03 -2.994 2.45 -5.414 5.444 -5.444 l 7.054 -0.071 l -2.391 -2.392 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 c 0.39 -0.39 1.024 -0.39 1.414 0.0 Z")
        )
    }.build()
}
