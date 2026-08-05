package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShuffleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShuffleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.22 4.22 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 2.5 2.5 c 0.293 0.293 0.293 0.767 0.0 1.06 l -2.5 2.5 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 L 19.44 8.0 H 17.0 c -1.142 0.0 -2.07 0.5 -2.956 1.353 c -0.744 0.716 -1.411 1.636 -2.117 2.647 c 0.706 1.011 1.373 1.93 2.117 2.647 C 14.929 15.5 15.858 16.0 17.0 16.0 h 2.44 l -1.22 -1.22 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.293 -0.293 0.767 -0.293 1.06 0.0 l 2.5 2.5 c 0.293 0.293 0.293 0.767 0.0 1.06 l -2.5 2.5 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 1.22 -1.22 H 17.0 c -1.654 0.0 -2.936 -0.75 -3.997 -1.772 c -0.723 -0.697 -1.373 -1.551 -1.99 -2.419 C 9.396 15.591 7.383 18.0 4.0 18.0 H 2.75 C 2.336 18.0 2.0 17.664 2.0 17.25 s 0.336 -0.75 0.75 -0.75 H 4.0 c 2.738 0.0 4.37 -2.024 6.1 -4.5 C 8.37 9.524 6.739 7.5 4.0 7.5 H 2.75 C 2.336 7.5 2.0 7.164 2.0 6.75 S 2.336 6.0 2.75 6.0 H 4.0 c 3.382 0.0 5.395 2.41 7.014 4.69 c 0.616 -0.867 1.266 -1.72 1.99 -2.418 C 14.063 7.25 15.345 6.5 17.0 6.5 h 2.44 l -1.22 -1.22 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
