package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RepeatCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RepeatCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.997 1.397 C 8.192 1.201 8.51 1.201 8.704 1.396 l 1.757 1.75 c 0.094 0.094 0.147 0.221 0.147 0.354 c 0.0 0.133 -0.053 0.26 -0.147 0.354 l -1.757 1.75 C 8.51 5.8 8.192 5.8 7.997 5.603 C 7.802 5.407 7.803 5.09 7.998 4.896 L 8.898 4.0 H 5.892 C 3.74 4.0 2.0 5.737 2.0 7.875 s 1.74 3.875 3.892 3.875 h 4.216 C 12.26 11.75 14.0 10.013 14.0 7.875 c 0.0 -0.873 -0.29 -1.677 -0.778 -2.324 c -0.166 -0.22 -0.122 -0.534 0.098 -0.7 c 0.221 -0.167 0.534 -0.123 0.7 0.098 C 14.636 5.763 15.0 6.777 15.0 7.875 c 0.0 2.694 -2.192 4.875 -4.892 4.875 H 5.892 C 3.192 12.75 1.0 10.57 1.0 7.875 C 1.0 5.181 3.192 3.0 5.892 3.0 h 3.006 l -0.9 -0.896 c -0.195 -0.195 -0.196 -0.511 0.0 -0.707 Z")
        )
    }.build()
}
