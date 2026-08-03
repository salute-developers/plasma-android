package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.876 17.23 H 5.753 V 5.0 c 0.0 -0.828 0.672 -1.5 1.5 -1.5 H 18.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 12.73 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 7.936 H 7.91 H 7.876 Z m 0.005 1.5 H 18.0 c 1.104 0.0 2.0 -0.895 2.0 -2.0 V 4.0 c 0.0 -1.105 -0.896 -2.0 -2.0 -2.0 H 7.253 c -1.657 0.0 -3.0 1.343 -3.0 3.0 v 14.374 C 4.25 19.41 4.25 19.447 4.25 19.484 v 0.01 v 0.012 c 0.003 1.238 1.006 2.24 2.244 2.244 H 19.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 6.498 c -0.413 -0.001 -0.747 -0.335 -0.748 -0.748 v -0.014 c 0.001 -0.41 0.332 -0.744 0.743 -0.748 l 1.388 -0.01 Z")
        )
    }.build()
}
