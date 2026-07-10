package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarLightFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarLightFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 18.572 1.893 c 0.335 0.244 0.41 0.713 0.166 1.048 l -2.102 2.893 C 16.393 6.17 15.924 6.244 15.59 6.0 c -0.335 -0.243 -0.41 -0.712 -0.166 -1.047 l 2.102 -2.894 c 0.243 -0.335 0.712 -0.41 1.047 -0.166 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 5.367 1.893 C 5.703 1.65 6.172 1.724 6.415 2.06 l 2.102 2.894 C 8.761 5.288 8.687 5.757 8.351 6.0 C 8.016 6.244 7.547 6.17 7.304 5.834 L 5.2 2.941 C 4.958 2.606 5.033 2.137 5.368 1.893 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 6.115 12.883 c 0.128 0.394 -0.088 0.817 -0.482 0.945 l -3.401 1.106 c -0.394 0.128 -0.817 -0.088 -0.945 -0.482 s 0.088 -0.817 0.481 -0.945 l 3.402 -1.105 c 0.394 -0.128 0.817 0.087 0.945 0.481 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 17.825 12.883 c 0.128 -0.394 0.551 -0.61 0.945 -0.481 l 3.401 1.105 c 0.394 0.128 0.61 0.551 0.482 0.945 c -0.128 0.394 -0.551 0.61 -0.945 0.482 l -3.401 -1.106 c -0.394 -0.128 -0.61 -0.55 -0.482 -0.945 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 11.97 17.137 c 0.414 0.0 0.75 0.336 0.75 0.75 v 3.577 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -3.577 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 11.035 3.164 c 0.39 -0.764 1.48 -0.764 1.87 0.0 l 1.958 3.835 l 4.253 0.677 c 0.846 0.134 1.183 1.172 0.578 1.779 l -3.043 3.047 l 0.67 4.254 c 0.134 0.846 -0.749 1.488 -1.513 1.099 l -3.838 -1.953 l -3.838 1.953 c -0.764 0.389 -1.647 -0.253 -1.514 -1.1 l 0.671 -4.253 l -3.043 -3.047 C 3.64 8.848 3.978 7.81 4.824 7.675 L 9.077 7.0 l 1.958 -3.835 Z")
        )
    }.build()
}
