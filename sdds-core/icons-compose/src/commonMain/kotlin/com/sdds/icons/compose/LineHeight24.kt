package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LineHeight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LineHeight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 20.25 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 4.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 S 3.586 20.25 4.0 20.25 h 16.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 19.0 h -1.985 l -1.233 -3.52 H 9.1 L 7.883 19.0 H 6.0 l 4.896 -14.0 h 2.14 L 18.0 19.0 Z m -8.234 -5.48 h 4.33 l -2.173 -6.26 l -2.157 6.26 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 S 20.414 3.75 20.0 3.75 H 4.0 C 3.586 3.75 3.25 3.414 3.25 3.0 S 3.586 2.25 4.0 2.25 h 16.0 Z")
        )
    }.build()
}
