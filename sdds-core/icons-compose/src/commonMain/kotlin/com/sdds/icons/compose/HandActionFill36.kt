package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandActionFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandActionFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.7 7.596 c -0.57 -0.612 -1.523 -0.65 -2.128 -0.086 C 7.968 8.074 7.94 9.027 8.51 9.638 l 7.745 8.306 c 0.142 0.153 0.135 0.39 -0.016 0.532 c -0.151 0.14 -0.39 0.131 -0.532 -0.022 l -5.68 -6.09 c -0.57 -0.612 -1.522 -0.65 -2.127 -0.086 c -0.605 0.564 -0.633 1.517 -0.063 2.128 l 6.454 6.921 c 0.143 0.153 0.136 0.391 -0.015 0.532 c -0.152 0.141 -0.39 0.132 -0.532 -0.021 l -3.098 -3.322 c -0.57 -0.612 -1.523 -0.65 -2.128 -0.086 c -0.605 0.564 -0.633 1.517 -0.062 2.128 l 5.68 6.09 l 0.026 0.033 c 2.428 2.578 6.276 3.525 9.696 2.088 c 4.39 -1.845 6.414 -6.919 4.522 -11.332 l -3.426 -7.992 c -0.329 -0.768 -1.214 -1.13 -1.978 -0.81 c -0.045 0.02 -0.089 0.04 -0.131 0.064 c -0.525 0.33 -0.836 0.91 -0.647 1.498 c 0.185 0.573 0.314 1.022 0.433 1.438 l 1.746 4.074 c 0.072 0.168 0.014 0.363 -0.139 0.462 c -0.152 0.099 -0.355 0.073 -0.48 -0.062 l -8.771 -9.405 c -0.57 -0.612 -1.523 -0.65 -2.128 -0.086 c -0.605 0.564 -0.633 1.517 -0.062 2.128 l 5.421 5.814 c 0.143 0.153 0.136 0.391 -0.015 0.532 c -0.152 0.141 -0.39 0.132 -0.532 -0.021 L 10.7 7.596 Z")
        )
    }.build()
}
