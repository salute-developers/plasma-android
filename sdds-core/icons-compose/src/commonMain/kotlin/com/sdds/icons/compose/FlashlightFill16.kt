package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlashlightFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlashlightFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.686 10.868 l -3.017 2.929 c -0.412 0.4 -1.068 0.395 -1.474 -0.01 l -1.137 -1.14 c -0.414 -0.414 -0.41 -1.087 0.01 -1.495 l 2.994 -2.908 l 2.624 2.624 Z m -1.989 -0.717 c -0.17 -0.17 -0.447 -0.17 -0.618 0.0 l -0.89 0.891 l -0.057 0.07 c -0.112 0.17 -0.093 0.4 0.057 0.55 c 0.149 0.148 0.379 0.167 0.548 0.056 l 0.07 -0.057 l 0.89 -0.89 c 0.17 -0.171 0.171 -0.449 0.0 -0.62 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.208 9.139 l -0.676 0.675 c -0.095 0.095 -0.21 0.168 -0.335 0.213 l -0.13 0.037 l -1.58 0.316 c -0.079 0.016 -0.157 0.04 -0.231 0.07 L 5.488 7.681 c 0.008 -0.018 0.018 -0.036 0.025 -0.054 l 0.053 -0.189 l 0.312 -1.565 C 5.913 5.698 6.0 5.536 6.128 5.409 l 0.674 -0.676 l 4.406 4.406 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.862 3.675 c 0.232 -0.232 0.61 -0.232 0.842 0.0 l 3.564 3.563 c 0.232 0.232 0.231 0.61 0.0 0.842 l -0.566 0.565 l -4.405 -4.406 l 0.565 -0.564 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.053 5.273 c 0.302 0.0 0.548 0.246 0.548 0.548 c 0.0 0.303 -0.246 0.549 -0.548 0.55 h -1.097 c -0.302 0.0 -0.548 -0.247 -0.548 -0.55 c 0.0 -0.302 0.246 -0.548 0.548 -0.548 h 1.097 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.568 1.757 c 0.214 -0.214 0.561 -0.214 0.775 0.0 c 0.214 0.214 0.214 0.561 0.0 0.775 L 13.246 3.63 c -0.214 0.214 -0.561 0.214 -0.775 0.0 c -0.214 -0.214 -0.214 -0.561 0.0 -0.775 l 1.097 -1.097 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.278 0.5 c 0.303 0.0 0.548 0.245 0.548 0.548 v 1.097 c 0.0 0.302 -0.245 0.547 -0.548 0.547 c -0.302 0.0 -0.547 -0.245 -0.547 -0.547 V 1.048 c 0.0 -0.303 0.245 -0.548 0.547 -0.548 Z")
        )
    }.build()
}
