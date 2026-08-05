package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UsbAFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UsbAFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.2 5.841 C 1.0 6.287 1.0 6.858 1.0 8.0 s 0.0 1.713 0.2 2.159 c 0.229 0.507 0.634 0.912 1.141 1.14 C 2.787 11.5 3.358 11.5 4.5 11.5 h 7.0 c 1.142 0.0 1.713 0.0 2.159 -0.2 c 0.507 -0.229 0.912 -0.634 1.14 -1.141 C 15.0 9.713 15.0 9.142 15.0 8.0 s 0.0 -1.713 -0.2 -2.159 c -0.229 -0.507 -0.634 -0.912 -1.141 -1.14 C 13.213 4.5 12.642 4.5 11.5 4.5 h -7.0 c -1.142 0.0 -1.713 0.0 -2.159 0.2 C 1.834 4.93 1.43 5.334 1.201 5.841 Z m 2.425 2.534 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 8.75 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -8.75 Z")
        )
    }.build()
}
