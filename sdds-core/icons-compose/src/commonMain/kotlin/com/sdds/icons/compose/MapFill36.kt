package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MapFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MapFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 33.0 7.125 c 0.0 -0.345 -0.158 -0.67 -0.428 -0.883 c -0.271 -0.214 -0.625 -0.291 -0.96 -0.21 l -8.517 2.043 c -0.35 0.084 -0.419 0.098 -0.481 0.104 c -0.072 0.006 -0.145 0.006 -0.216 -0.001 c -0.063 -0.007 -0.132 -0.021 -0.48 -0.108 l -7.343 -1.836 c -0.267 -0.067 -0.502 -0.126 -0.746 -0.15 c -0.216 -0.022 -0.432 -0.023 -0.648 -0.003 c -0.245 0.022 -0.48 0.079 -0.747 0.143 L 3.862 8.281 C 3.357 8.402 3.0 8.855 3.0 9.375 v 19.5 c 0.0 0.345 0.158 0.67 0.428 0.884 c 0.271 0.213 0.624 0.29 0.96 0.21 l 8.517 -2.044 c 0.35 -0.084 0.419 -0.098 0.481 -0.104 c 0.072 -0.006 0.145 -0.006 0.216 0.001 c 0.063 0.006 0.132 0.021 0.48 0.108 l 7.343 1.836 c 0.267 0.067 0.502 0.126 0.746 0.15 c 0.216 0.022 0.432 0.023 0.648 0.003 c 0.245 -0.022 0.48 -0.079 0.747 -0.143 l 8.572 -2.057 C 32.643 27.597 33.0 27.145 33.0 26.625 v -19.5 Z m -18.5 2.25 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 15.0 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -15.0 Z m 9.0 2.25 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 15.0 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -15.0 Z")
        )
    }.build()
}
