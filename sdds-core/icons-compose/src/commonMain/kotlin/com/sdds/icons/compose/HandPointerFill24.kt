package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandPointerFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandPointerFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.998 4.013 c 0.0 -0.34 0.128 -0.581 0.31 -0.742 c 0.185 -0.164 0.44 -0.254 0.703 -0.257 c 0.262 -0.003 0.515 0.08 0.699 0.242 c 0.178 0.157 0.308 0.4 0.308 0.757 v 6.5 c 0.0 0.138 0.112 0.25 0.25 0.25 s 0.25 -0.113 0.25 -0.25 v -2.0 c 0.0 -0.448 0.143 -0.76 0.334 -0.96 c 0.193 -0.2 0.45 -0.3 0.708 -0.3 c 0.258 0.0 0.514 0.1 0.707 0.3 c 0.192 0.2 0.334 0.512 0.334 0.96 v 2.776 c 0.0 0.138 0.112 0.25 0.25 0.25 s 0.25 -0.112 0.25 -0.25 V 9.013 c 0.0 -0.519 0.449 -0.863 0.944 -0.857 c 0.24 0.003 0.472 0.091 0.644 0.275 c 0.172 0.182 0.306 0.481 0.306 0.945 v 2.637 c 0.0 0.138 0.112 0.25 0.25 0.25 c 0.139 0.0 0.25 -0.113 0.25 -0.25 v -1.5 c 0.0 -0.578 0.488 -0.941 1.016 -0.919 c 0.256 0.01 0.51 0.116 0.7 0.332 c 0.19 0.216 0.336 0.563 0.336 1.087 v 4.0 c 0.0 2.6 -2.07 4.64 -4.555 5.125 c -1.237 0.24 -2.566 0.091 -3.777 -0.565 c -1.209 -0.656 -2.315 -1.825 -3.093 -3.653 c -1.307 -3.49 -1.308 -3.492 -1.804 -4.98 l -0.002 -0.006 c -0.206 -0.619 0.098 -1.118 0.53 -1.32 c 0.215 -0.1 0.458 -0.123 0.682 -0.05 c 0.218 0.07 0.44 0.238 0.608 0.557 c 0.114 0.262 0.459 1.007 0.774 1.685 l 0.425 0.914 l 0.186 0.399 c 0.05 0.106 0.167 0.164 0.281 0.138 c 0.115 -0.025 0.196 -0.127 0.196 -0.245 V 4.013 Z")
        )
    }.build()
}
