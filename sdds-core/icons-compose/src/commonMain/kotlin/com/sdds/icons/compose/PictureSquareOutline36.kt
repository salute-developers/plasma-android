package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PictureSquareOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PictureSquareOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.0 3.0 c 3.314 0.0 6.0 2.686 6.0 6.0 v 18.0 c 0.0 3.21 -2.521 5.832 -5.691 5.992 L 27.0 33.0 H 9.0 l -0.309 -0.008 c -3.068 -0.155 -5.528 -2.615 -5.683 -5.683 L 3.0 27.0 V 9.0 c 0.0 -3.314 2.686 -6.0 6.0 -6.0 h 18.0 Z m -1.98 16.627 c -0.777 -0.836 -2.002 -0.836 -2.778 0.0 l -5.756 6.202 l -0.006 0.007 L 11.6 31.0 H 27.0 c 2.21 0.0 4.0 -1.79 4.0 -4.0 v -0.994 c -0.084 -0.049 -0.164 -0.11 -0.233 -0.186 l -5.747 -6.193 Z M 13.016 23.67 c -0.777 -0.837 -2.002 -0.837 -2.778 0.0 l -4.793 5.164 c 0.649 1.255 1.941 2.121 3.44 2.163 c 0.039 -0.065 0.085 -0.127 0.138 -0.183 l 5.36 -5.671 l -1.367 -1.473 Z M 9.0 5.0 C 6.79 5.0 5.0 6.79 5.0 9.0 v 17.374 l 3.772 -4.064 c 1.568 -1.69 4.143 -1.69 5.71 0.0 l 1.27 1.369 l 5.023 -5.412 c 1.568 -1.69 4.143 -1.69 5.71 0.0 L 31.0 23.13 V 9.0 c 0.0 -2.21 -1.79 -4.0 -4.0 -4.0 H 9.0 Z m 2.625 4.0 c 1.45 0.0 2.625 1.175 2.625 2.625 s -1.175 2.625 -2.625 2.625 S 9.0 13.075 9.0 11.625 S 10.175 9.0 11.625 9.0 Z")
        )
    }.build()
}
