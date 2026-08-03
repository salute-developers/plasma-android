package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlaskOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlaskOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.25 2.0 C 15.664 2.0 16.0 2.336 16.0 2.75 S 15.664 3.5 15.25 3.5 H 15.0 v 5.248 l 0.008 0.123 c 0.015 0.122 0.053 0.241 0.111 0.35 l 5.293 9.83 C 21.13 20.385 20.165 22.0 18.652 22.0 H 5.349 l -0.14 -0.005 c -1.386 -0.093 -2.258 -1.553 -1.683 -2.817 l 0.062 -0.126 l 5.293 -9.83 c 0.059 -0.11 0.096 -0.229 0.111 -0.35 L 9.0 8.747 V 3.5 H 8.75 C 8.336 3.5 8.0 3.164 8.0 2.75 S 8.336 2.0 8.75 2.0 h 6.5 Z M 10.5 8.748 c 0.0 0.414 -0.102 0.821 -0.299 1.186 l -5.293 9.829 C 4.73 20.096 4.971 20.5 5.348 20.5 h 13.304 c 0.378 0.0 0.62 -0.404 0.44 -0.737 L 13.8 9.933 C 13.603 9.57 13.5 9.163 13.5 8.749 V 3.5 h -3.0 v 5.248 Z")
        )
    }.build()
}
