package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HouseOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HouseOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.718 2.038 c 0.185 -0.05 0.38 -0.05 0.564 0.0 c 0.186 0.05 0.37 0.183 0.963 0.646 l 5.447 4.26 c 0.217 0.17 0.532 0.132 0.702 -0.085 c 0.17 -0.218 0.132 -0.532 -0.086 -0.702 L 9.783 1.835 C 9.305 1.46 8.95 1.183 8.545 1.073 c -0.357 -0.097 -0.733 -0.097 -1.09 0.0 c -0.406 0.11 -0.76 0.387 -1.238 0.762 L 0.692 6.157 C 0.474 6.327 0.436 6.64 0.606 6.859 c 0.17 0.217 0.485 0.256 0.702 0.086 l 5.447 -4.261 C 7.347 2.22 7.532 2.088 7.718 2.038 Z M 2.725 7.964 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 c -0.277 0.0 -0.5 0.224 -0.5 0.5 V 12.0 c 0.0 0.423 0.0 0.771 0.023 1.054 c 0.024 0.294 0.075 0.561 0.203 0.812 c 0.199 0.39 0.516 0.708 0.907 0.907 c 0.25 0.127 0.518 0.179 0.811 0.203 c 0.284 0.023 0.631 0.023 1.055 0.023 h 6.551 c 0.424 0.0 0.772 0.0 1.055 -0.023 c 0.293 -0.024 0.561 -0.076 0.812 -0.203 c 0.39 -0.2 0.708 -0.517 0.906 -0.907 c 0.128 -0.25 0.18 -0.518 0.204 -0.812 c 0.023 -0.283 0.023 -0.63 0.023 -1.054 V 7.964 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 c -0.277 0.0 -0.5 0.224 -0.5 0.5 v 4.015 c 0.0 0.45 0.0 0.756 -0.02 0.994 c -0.02 0.231 -0.054 0.353 -0.098 0.439 c -0.103 0.202 -0.267 0.367 -0.47 0.47 c -0.086 0.044 -0.207 0.078 -0.439 0.097 C 12.011 14.0 11.704 14.0 11.255 14.0 h -0.83 v -3.58 c 0.0 -1.34 -1.086 -2.425 -2.425 -2.425 c -1.34 0.0 -2.425 1.085 -2.425 2.425 v 3.58 h -0.83 c -0.45 0.0 -0.757 0.0 -0.994 -0.02 c -0.232 -0.019 -0.353 -0.053 -0.44 -0.097 c -0.202 -0.103 -0.366 -0.268 -0.47 -0.47 c -0.043 -0.086 -0.078 -0.208 -0.097 -0.44 c -0.019 -0.237 -0.02 -0.544 -0.02 -0.993 V 7.964 Z m 6.7 2.455 v 3.58 h -2.85 v -3.58 c 0.0 -0.787 0.638 -1.425 1.425 -1.425 s 1.425 0.638 1.425 1.425 Z")
        )
    }.build()
}
