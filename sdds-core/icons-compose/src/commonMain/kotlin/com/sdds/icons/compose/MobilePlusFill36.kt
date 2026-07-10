package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobilePlusFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobilePlusFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.9 3.0 h -4.5 c -1.89 0.0 -2.835 0.0 -3.557 0.368 c -0.635 0.323 -1.152 0.84 -1.475 1.475 C 9.0 5.565 9.0 6.51 9.0 8.4 v 19.2 c 0.0 1.89 0.0 2.835 0.368 3.557 c 0.323 0.635 0.84 1.152 1.475 1.475 C 11.565 33.0 12.51 33.0 14.4 33.0 h 7.2 c 1.89 0.0 2.835 0.0 3.557 -0.368 c 0.635 -0.323 1.152 -0.84 1.475 -1.475 C 27.0 30.435 27.0 29.49 27.0 27.6 v -8.112 c -0.166 0.008 -0.332 0.012 -0.5 0.012 c -5.523 0.0 -10.0 -4.477 -10.0 -10.0 c 0.0 -0.21 0.006 -0.418 0.02 -0.625 h -0.395 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 0.723 C 17.241 5.426 17.952 4.108 18.9 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 26.5 18.0 c 4.694 0.0 8.5 -3.806 8.5 -8.5 S 31.194 1.0 26.5 1.0 S 18.0 4.806 18.0 9.5 s 3.806 8.5 8.5 8.5 Z m 0.75 -13.136 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 s -0.75 0.335 -0.75 0.75 V 8.75 h -3.886 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 3.886 v 3.886 c 0.0 0.415 0.336 0.75 0.75 0.75 s 0.75 -0.335 0.75 -0.75 V 10.25 h 3.887 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 27.25 V 4.864 Z")
        )
    }.build()
}
