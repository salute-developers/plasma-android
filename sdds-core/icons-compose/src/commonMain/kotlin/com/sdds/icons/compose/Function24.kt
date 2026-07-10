package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Function24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Function24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.989 4.974 c 0.291 -1.967 2.473 -2.976 4.14 -1.915 l 0.794 0.504 c 0.348 0.223 0.456 0.69 0.239 1.042 c -0.217 0.353 -0.677 0.46 -1.027 0.237 l -0.791 -0.505 c -0.758 -0.482 -1.75 -0.023 -1.882 0.871 l -0.953 6.434 h 2.447 c 0.414 0.0 0.75 0.335 0.75 0.75 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -2.67 l -0.87 5.878 c -0.267 1.81 -2.164 2.852 -3.813 2.094 l -1.261 -0.58 c -0.376 -0.174 -0.545 -0.621 -0.377 -1.0 c 0.167 -0.38 0.609 -0.548 0.984 -0.376 l 1.262 0.58 c 0.749 0.344 1.611 -0.129 1.733 -0.95 l 0.836 -5.646 H 6.768 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 h 2.234 l 0.987 -6.668 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.352 13.536 c 0.235 -0.341 0.699 -0.423 1.036 -0.182 c 0.337 0.24 0.42 0.711 0.186 1.052 l -1.791 2.602 l 2.106 3.061 c 0.235 0.341 0.152 0.813 -0.185 1.053 c -0.338 0.24 -0.802 0.159 -1.036 -0.183 l -1.795 -2.608 l -1.795 2.608 c -0.235 0.342 -0.699 0.423 -1.036 0.183 c -0.338 -0.24 -0.42 -0.712 -0.186 -1.053 l 2.106 -3.061 l -1.79 -2.602 c -0.235 -0.34 -0.152 -0.812 0.185 -1.053 c 0.338 -0.24 0.801 -0.158 1.036 0.183 l 1.48 2.15 l 1.48 -2.15 Z")
        )
    }.build()
}
