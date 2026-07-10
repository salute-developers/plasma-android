package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Refresh36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Refresh36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 5.0 C 10.82 5.0 5.0 10.82 5.0 18.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 C 3.0 9.716 9.716 3.0 18.0 3.0 c 5.558 0.0 10.409 3.023 13.0 7.512 v -3.4 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 s 1.0 0.447 1.0 1.0 v 5.444 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -1.075 h -0.045 h -4.324 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.447 -1.0 1.0 -1.0 h 2.737 C 27.053 7.638 22.833 5.0 18.0 5.0 Z m 14.0 12.0 c 0.552 0.0 1.0 0.448 1.0 1.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -5.558 0.0 -10.409 -3.023 -13.0 -7.512 v 3.4 c 0.0 0.553 -0.448 1.0 -1.0 1.0 s -1.0 -0.447 -1.0 -1.0 v -5.444 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 1.075 h 0.045 h 4.324 c 0.553 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.447 1.0 -1.0 1.0 H 6.707 C 8.947 28.362 13.167 31.0 18.0 31.0 c 7.18 0.0 13.0 -5.82 13.0 -13.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z")
        )
    }.build()
}
