package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HouseFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HouseFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.718 2.038 c 0.185 -0.05 0.38 -0.05 0.564 0.0 c 0.185 0.05 0.37 0.182 0.96 0.643 l 5.45 4.253 c 0.218 0.17 0.532 0.131 0.702 -0.086 c 0.17 -0.218 0.131 -0.532 -0.086 -0.702 L 9.78 1.832 c -0.477 -0.373 -0.83 -0.65 -1.236 -0.76 c -0.356 -0.096 -0.732 -0.096 -1.088 0.0 c -0.405 0.11 -0.759 0.387 -1.236 0.76 L 0.692 6.146 C 0.475 6.316 0.436 6.63 0.606 6.848 c 0.17 0.217 0.484 0.256 0.702 0.086 l 5.45 -4.253 c 0.59 -0.46 0.775 -0.593 0.96 -0.643 Z m 0.058 1.098 c 0.147 -0.04 0.302 -0.04 0.449 0.0 C 8.398 3.182 8.542 3.294 8.63 3.362 l 0.025 0.02 l 4.994 3.81 l 0.032 0.024 c 0.13 0.098 0.268 0.204 0.373 0.343 c 0.09 0.122 0.158 0.259 0.2 0.405 C 14.3 8.132 14.3 8.307 14.3 8.471 v 0.04 v 3.445 c 0.0 0.425 0.0 0.776 -0.023 1.062 c -0.024 0.298 -0.076 0.57 -0.206 0.827 c -0.2 0.398 -0.522 0.722 -0.917 0.925 c -0.255 0.13 -0.526 0.182 -0.822 0.207 C 12.048 15.0 11.7 15.0 11.277 15.0 H 4.724 c -0.423 0.0 -0.772 0.0 -1.056 -0.023 c -0.295 -0.025 -0.566 -0.077 -0.821 -0.207 c -0.395 -0.203 -0.716 -0.527 -0.918 -0.925 c -0.13 -0.256 -0.181 -0.53 -0.205 -0.827 C 1.7 12.732 1.7 12.381 1.7 11.955 V 8.513 V 8.47 c 0.0 -0.164 0.0 -0.339 0.047 -0.507 c 0.041 -0.146 0.109 -0.283 0.2 -0.405 C 2.05 7.419 2.19 7.314 2.32 7.216 L 2.352 7.19 l 4.993 -3.809 l 0.026 -0.02 c 0.087 -0.068 0.232 -0.18 0.405 -0.226 Z M 5.9 10.052 c 0.0 -1.16 0.94 -2.1 2.1 -2.1 c 1.16 0.0 2.1 0.94 2.1 2.1 v 3.892 H 5.9 v -3.892 Z")
        )
    }.build()
}
