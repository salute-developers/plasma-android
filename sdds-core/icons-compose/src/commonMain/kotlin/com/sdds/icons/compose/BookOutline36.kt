package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.833 28.345 h 15.913 c 1.657 0.0 3.0 -1.343 3.0 -3.0 V 6.25 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 H 10.75 c -2.485 0.0 -4.5 2.015 -4.5 4.5 v 21.72 c -0.003 0.084 -0.001 0.168 0.003 0.252 C 6.346 31.42 7.75 32.75 9.45 32.75 h 18.804 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 9.45 c -0.638 0.0 -1.164 -0.499 -1.199 -1.135 c -0.037 -0.688 0.51 -1.265 1.199 -1.265 h 1.286 c 0.033 0.0 0.065 -0.002 0.097 -0.005 Z m -2.583 -2.0 V 7.75 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 h 15.996 c 0.552 0.0 1.0 0.448 1.0 1.0 v 19.095 c 0.0 0.553 -0.448 1.0 -1.0 1.0 H 8.25 Z")
        )
    }.build()
}
