package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloseCircleOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloseCircleOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 7.998 C 2.0 4.685 4.685 2.0 7.998 2.0 s 5.998 2.685 5.998 5.998 s -2.685 5.998 -5.998 5.998 S 2.0 11.311 2.0 7.998 Z M 7.998 1.0 C 4.133 1.0 1.0 4.133 1.0 7.998 s 3.133 6.998 6.998 6.998 s 6.998 -3.133 6.998 -6.998 S 11.863 1.0 7.998 1.0 Z M 5.543 4.834 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 c -0.195 0.196 -0.195 0.512 0.0 0.708 l 2.456 2.456 l -2.456 2.456 c -0.195 0.196 -0.195 0.512 0.0 0.708 c 0.195 0.195 0.512 0.195 0.707 0.0 l 2.456 -2.457 l 2.457 2.457 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 L 8.707 7.998 l 2.456 -2.456 c 0.195 -0.196 0.195 -0.512 0.0 -0.708 c -0.195 -0.195 -0.512 -0.195 -0.707 0.0 L 7.999 7.291 L 5.543 4.834 Z")
        )
    }.build()
}
