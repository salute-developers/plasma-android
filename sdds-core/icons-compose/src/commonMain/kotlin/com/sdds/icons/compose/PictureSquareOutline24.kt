package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PictureSquareOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PictureSquareOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 2.0 c 2.21 0.0 4.0 1.79 4.0 4.0 v 12.0 c 0.0 2.14 -1.68 3.888 -3.794 3.995 L 18.0 22.0 H 6.0 l -0.206 -0.005 c -2.045 -0.104 -3.685 -1.744 -3.79 -3.789 L 2.0 18.0 V 6.0 c 0.0 -2.21 1.79 -4.0 4.0 -4.0 h 12.0 Z m -1.38 11.142 c -0.485 -0.522 -1.247 -0.522 -1.731 0.0 l -3.837 4.134 l -0.005 0.005 L 8.005 20.5 H 18.0 c 1.38 0.0 2.5 -1.12 2.5 -2.5 v -0.68 c -0.017 -0.016 -0.034 -0.032 -0.05 -0.05 l -3.83 -4.128 Z m -8.004 2.695 c -0.484 -0.522 -1.245 -0.522 -1.73 0.0 L 3.793 19.17 c 0.412 0.775 1.218 1.305 2.151 1.326 l 0.012 -0.013 l 3.519 -3.723 l -0.858 -0.924 Z M 6.0 3.5 C 4.62 3.5 3.5 4.62 3.5 6.0 v 11.28 l 2.287 -2.464 c 1.078 -1.161 2.85 -1.161 3.929 0.0 l 0.785 0.847 l 3.288 -3.542 c 1.078 -1.162 2.85 -1.161 3.929 0.0 l 2.782 2.997 V 6.0 c 0.0 -1.38 -1.12 -2.5 -2.5 -2.5 H 6.0 Z M 7.75 6.0 C 8.716 6.0 9.5 6.784 9.5 7.75 S 8.716 9.5 7.75 9.5 S 6.0 8.716 6.0 7.75 S 6.784 6.0 7.75 6.0 Z")
        )
    }.build()
}
