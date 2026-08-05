package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Battery40Outline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Battery40Outline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 3.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 4.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 1.045 c 0.524 0.044 0.914 0.131 1.253 0.304 c 0.602 0.307 1.091 0.796 1.398 1.398 C 18.0 6.432 18.0 7.327 18.0 9.12 v 7.76 c 0.0 1.792 0.0 2.688 -0.349 3.373 c -0.307 0.602 -0.796 1.091 -1.398 1.398 C 15.568 22.0 14.673 22.0 12.88 22.0 h -1.76 c -1.792 0.0 -2.688 0.0 -3.373 -0.349 c -0.602 -0.307 -1.091 -0.796 -1.398 -1.398 C 6.0 19.568 6.0 18.673 6.0 16.88 V 9.12 c 0.0 -1.792 0.0 -2.688 0.349 -3.373 c 0.307 -0.602 0.796 -1.091 1.398 -1.398 C 8.086 4.176 8.476 4.089 9.0 4.045 V 3.0 Z m 0.5 2.5 c -1.105 0.0 -2.0 0.895 -2.0 2.0 v 11.0 c 0.0 1.105 0.895 2.0 2.0 2.0 h 5.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 v -11.0 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 h -5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 19.5 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 v -0.5 C 8.5 18.224 8.723 18.0 9.0 18.0 h 6.0 c 0.276 0.0 0.5 0.224 0.5 0.5 V 19.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 14.9 c -0.277 0.0 -0.5 -0.223 -0.5 -0.5 v -0.5 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 h 6.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 0.5 c 0.0 0.277 -0.224 0.5 -0.5 0.5 H 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 17.2 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 v -0.5 c 0.0 -0.276 0.223 -0.5 0.5 -0.5 h 6.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 9.0 Z")
        )
    }.build()
}
