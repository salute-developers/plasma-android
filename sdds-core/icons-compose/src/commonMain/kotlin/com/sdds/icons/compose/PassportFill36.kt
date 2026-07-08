package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PassportFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PassportFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.0 13.5 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 s -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 s 3.0 -1.343 3.0 -3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.368 4.843 C 6.0 5.565 6.0 6.51 6.0 8.4 v 19.2 c 0.0 1.89 0.0 2.835 0.368 3.557 c 0.323 0.635 0.84 1.152 1.475 1.475 C 8.565 33.0 9.51 33.0 11.4 33.0 h 13.2 c 1.89 0.0 2.835 0.0 3.557 -0.368 c 0.635 -0.323 1.152 -0.84 1.475 -1.475 C 30.0 30.435 30.0 29.49 30.0 27.6 V 8.4 c 0.0 -1.89 0.0 -2.835 -0.368 -3.557 c -0.323 -0.635 -0.84 -1.152 -1.475 -1.475 C 27.435 3.0 26.49 3.0 24.6 3.0 H 11.4 C 9.51 3.0 8.565 3.0 7.843 3.368 C 7.208 3.69 6.69 4.208 6.368 4.843 Z m 6.007 16.907 c -0.621 0.0 -1.125 0.504 -1.125 1.125 S 11.754 24.0 12.375 24.0 h 11.25 c 0.621 0.0 1.125 -0.504 1.125 -1.125 s -0.504 -1.125 -1.125 -1.125 h -11.25 Z M 18.0 8.25 c 2.9 0.0 5.25 2.35 5.25 5.25 S 20.9 18.75 18.0 18.75 s -5.25 -2.35 -5.25 -5.25 S 15.1 8.25 18.0 8.25 Z m -2.625 18.0 c -0.621 0.0 -1.125 0.504 -1.125 1.125 s 0.504 1.125 1.125 1.125 h 5.25 c 0.621 0.0 1.125 -0.504 1.125 -1.125 s -0.504 -1.125 -1.125 -1.125 h -5.25 Z")
        )
    }.build()
}
