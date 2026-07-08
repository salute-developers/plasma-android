package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SpeedometerFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SpeedometerFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 6.45 4.258 c 0.824 -0.34 1.737 -0.4 2.598 -0.17 c 0.267 0.071 0.541 -0.087 0.613 -0.354 c 0.071 -0.266 -0.087 -0.54 -0.354 -0.612 c -1.074 -0.288 -2.212 -0.213 -3.24 0.212 C 5.04 3.76 4.182 4.512 3.627 5.475 C 3.07 6.438 2.848 7.557 2.993 8.659 c 0.145 1.102 0.65 2.126 1.436 2.912 c 0.195 0.195 0.512 0.195 0.707 0.0 c 0.195 -0.195 0.195 -0.512 0.0 -0.707 c -0.63 -0.63 -1.035 -1.451 -1.151 -2.335 c -0.117 -0.884 0.062 -1.782 0.508 -2.554 c 0.445 -0.772 1.133 -1.376 1.957 -1.717 Z m 5.816 2.081 c 0.266 -0.071 0.54 0.087 0.612 0.354 c 0.23 0.856 0.23 1.758 0.0 2.614 c -0.23 0.856 -0.68 1.637 -1.307 2.264 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.196 -0.195 -0.196 -0.512 0.0 -0.707 c 0.502 -0.503 0.864 -1.13 1.048 -1.816 c 0.184 -0.686 0.184 -1.41 0.0 -2.096 c -0.072 -0.267 0.087 -0.541 0.354 -0.613 Z m -0.768 -1.897 c -0.154 -0.13 -0.38 -0.128 -0.532 0.005 l -3.758 3.27 C 6.653 8.2 6.66 9.063 7.224 9.536 c 0.563 0.473 1.415 0.33 1.794 -0.3 l 2.568 -4.27 c 0.104 -0.172 0.067 -0.395 -0.088 -0.524 Z")
        )
    }.build()
}
