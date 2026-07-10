package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.RombOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RombOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 9.035 1.128 L 9.047 1.14 l 5.78 5.78 c 0.111 0.111 0.215 0.215 0.295 0.309 c 0.086 0.102 0.174 0.225 0.225 0.383 c 0.073 0.223 0.073 0.464 0.0 0.688 c -0.051 0.158 -0.139 0.28 -0.225 0.382 c -0.08 0.094 -0.184 0.198 -0.294 0.31 l -5.793 5.791 c -0.11 0.111 -0.214 0.215 -0.308 0.295 c -0.102 0.086 -0.225 0.174 -0.383 0.225 c -0.224 0.073 -0.464 0.073 -0.688 0.0 c -0.158 -0.051 -0.28 -0.139 -0.383 -0.225 c -0.094 -0.08 -0.197 -0.184 -0.308 -0.295 L 1.172 8.991 c -0.11 -0.11 -0.214 -0.214 -0.294 -0.309 C 0.792 8.581 0.704 8.458 0.653 8.3 c -0.073 -0.224 -0.073 -0.465 0.0 -0.688 c 0.051 -0.158 0.139 -0.281 0.225 -0.383 c 0.08 -0.094 0.183 -0.198 0.295 -0.309 l 5.78 -5.78 l 0.012 -0.012 c 0.11 -0.11 0.214 -0.214 0.308 -0.294 c 0.102 -0.087 0.225 -0.174 0.383 -0.225 c 0.224 -0.073 0.464 -0.073 0.688 0.0 c 0.158 0.05 0.28 0.138 0.383 0.225 c 0.094 0.08 0.197 0.183 0.308 0.294 Z M 8.03 1.558 c -0.02 -0.005 -0.04 -0.005 -0.06 0.0 C 7.964 1.562 7.95 1.572 7.92 1.596 C 7.861 1.646 7.787 1.72 7.66 1.847 L 1.892 7.615 C 1.764 7.743 1.69 7.817 1.64 7.876 C 1.617 7.904 1.606 7.92 1.602 7.926 c -0.005 0.02 -0.005 0.04 0.0 0.06 l 0.038 0.05 c 0.05 0.058 0.124 0.133 0.252 0.26 l 5.768 5.768 c 0.127 0.127 0.201 0.201 0.26 0.251 c 0.029 0.024 0.044 0.035 0.05 0.039 c 0.02 0.005 0.04 0.005 0.06 0.0 c 0.006 -0.004 0.021 -0.015 0.05 -0.039 c 0.059 -0.05 0.133 -0.124 0.26 -0.25 l 5.768 -5.769 c 0.128 -0.127 0.201 -0.202 0.252 -0.26 l 0.038 -0.05 c 0.005 -0.02 0.005 -0.04 0.0 -0.06 c -0.004 -0.006 -0.015 -0.022 -0.038 -0.05 c -0.05 -0.059 -0.124 -0.133 -0.252 -0.26 L 8.34 1.846 c -0.127 -0.127 -0.201 -0.2 -0.26 -0.25 C 8.05 1.571 8.036 1.561 8.03 1.557 Z")
            )
        }
    }.build()
}
