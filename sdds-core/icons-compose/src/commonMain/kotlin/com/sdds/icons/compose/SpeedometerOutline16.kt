package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpeedometerOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpeedometerOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.025 8.0 C 2.025 4.7 4.7 2.025 8.0 2.025 S 13.975 4.7 13.975 8.0 S 11.3 13.975 8.0 13.975 S 2.025 11.3 2.025 8.0 Z M 8.0 1.025 C 4.148 1.025 1.025 4.148 1.025 8.0 c 0.0 3.852 3.123 6.975 6.975 6.975 c 3.852 0.0 6.975 -3.123 6.975 -6.975 c 0.0 -3.852 -3.123 -6.975 -6.975 -6.975 Z M 6.45 4.258 c 0.824 -0.341 1.737 -0.4 2.598 -0.17 C 9.315 4.159 9.59 4.0 9.66 3.734 c 0.072 -0.266 -0.086 -0.54 -0.353 -0.612 c -1.074 -0.288 -2.213 -0.213 -3.24 0.212 c -1.027 0.426 -1.885 1.178 -2.44 2.14 C 3.07 6.439 2.847 7.558 2.992 8.66 c 0.145 1.102 0.65 2.126 1.436 2.912 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 c -0.63 -0.63 -1.035 -1.452 -1.151 -2.335 c -0.117 -0.884 0.062 -1.782 0.507 -2.554 c 0.446 -0.772 1.134 -1.376 1.958 -1.717 Z m 5.815 2.081 c 0.267 -0.071 0.541 0.087 0.613 0.354 c 0.23 0.856 0.23 1.758 0.0 2.614 c -0.23 0.856 -0.68 1.637 -1.307 2.264 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.196 -0.195 -0.196 -0.512 0.0 -0.707 c 0.502 -0.503 0.864 -1.13 1.048 -1.816 c 0.184 -0.687 0.184 -1.41 0.0 -2.096 c -0.072 -0.267 0.087 -0.541 0.353 -0.613 Z m -0.767 -1.897 c -0.154 -0.13 -0.38 -0.128 -0.532 0.004 L 7.208 7.717 C 6.653 8.2 6.66 9.063 7.224 9.536 c 0.563 0.472 1.415 0.33 1.794 -0.3 l 2.568 -4.27 c 0.104 -0.172 0.067 -0.395 -0.088 -0.524 Z")
        )
    }.build()
}
