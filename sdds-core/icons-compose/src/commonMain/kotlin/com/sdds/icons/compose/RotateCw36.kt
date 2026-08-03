package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RotateCw36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RotateCw36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 5.0 C 10.82 5.0 5.0 10.82 5.0 18.0 s 5.82 13.0 13.0 13.0 c 5.385 0.0 10.008 -3.274 11.98 -7.945 c 0.216 -0.508 0.802 -0.747 1.311 -0.532 c 0.509 0.215 0.747 0.802 0.532 1.31 C 29.548 29.219 24.217 33.0 18.0 33.0 C 9.716 33.0 3.0 26.284 3.0 18.0 C 3.0 9.716 9.716 3.0 18.0 3.0 c 5.558 0.0 10.409 3.023 13.0 7.512 v -3.4 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 s 1.0 0.447 1.0 1.0 v 5.444 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -5.444 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.447 -1.0 1.0 -1.0 h 2.737 C 27.053 7.638 22.833 5.0 18.0 5.0 Z")
        )
    }.build()
}
