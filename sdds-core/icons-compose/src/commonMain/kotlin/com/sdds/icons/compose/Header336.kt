package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header336: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header336",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.0 19.074 V 26.0 h 2.25 V 10.0 H 16.0 v 6.427 h -5.285 V 10.0 H 8.5 v 16.0 h 2.215 v -6.926 H 16.0 Z m 3.846 -7.512 C 20.498 10.803 21.956 10.0 23.972 10.0 c 2.782 0.022 4.28 1.517 4.28 3.972 c 0.0 1.852 -0.903 3.124 -2.284 3.704 c 1.784 0.38 2.782 1.607 2.782 3.727 c 0.0 2.589 -1.631 4.552 -4.913 4.597 c -2.053 0.0 -3.53 -0.915 -4.087 -1.584 v -2.968 c 0.844 1.138 2.284 1.919 4.049 1.896 c 1.785 -0.022 2.725 -0.87 2.725 -2.231 c 0.0 -1.473 -0.787 -2.21 -2.86 -2.21 H 22.15 v -2.008 h 1.113 c 1.765 0.0 2.744 -0.67 2.744 -2.164 c 0.0 -1.428 -0.787 -2.075 -2.36 -2.075 c -1.65 0.044 -2.917 0.691 -3.8 1.874 v -2.968 Z")
        )
    }.build()
}
