package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PreviousOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PreviousOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.604 20.787 c -2.1 -1.262 -2.1 -4.308 0.0 -5.571 l 14.972 -8.997 C 28.742 4.918 31.5 6.478 31.5 9.005 v 17.993 c 0.0 2.528 -2.758 4.088 -4.924 2.786 l -14.972 -8.997 Z m 1.03 -3.857 c -0.808 0.486 -0.808 1.657 0.0 2.143 l 14.972 8.997 c 0.833 0.5 1.894 -0.1 1.894 -1.072 V 9.005 c 0.0 -0.972 -1.06 -1.572 -1.894 -1.071 L 12.635 16.93 Z M 4.503 7.516 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 21.722 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 7.516 Z")
        )
    }.build()
}
