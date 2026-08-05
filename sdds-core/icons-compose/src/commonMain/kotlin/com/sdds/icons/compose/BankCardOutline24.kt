package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BankCardOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BankCardOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.281 4.0 c 0.674 0.0 1.225 0.0 1.672 0.036 c 0.463 0.038 0.882 0.12 1.273 0.318 c 0.611 0.312 1.108 0.809 1.42 1.42 c 0.199 0.391 0.28 0.81 0.318 1.273 C 22.0 7.494 22.0 8.045 22.0 8.719 v 6.562 c 0.0 0.674 0.0 1.225 -0.036 1.672 c -0.038 0.463 -0.12 0.882 -0.319 1.273 c -0.311 0.611 -0.808 1.108 -1.42 1.42 c -0.39 0.199 -0.809 0.28 -1.272 0.318 C 18.506 20.0 17.955 20.0 17.281 20.0 H 6.72 c -0.674 0.0 -1.225 0.0 -1.672 -0.036 c -0.463 -0.038 -0.882 -0.12 -1.273 -0.319 c -0.61 -0.311 -1.108 -0.808 -1.42 -1.42 c -0.199 -0.39 -0.28 -0.809 -0.318 -1.272 C 2.0 16.506 2.0 15.955 2.0 15.281 V 8.72 c 0.0 -0.674 0.0 -1.225 0.036 -1.672 c 0.038 -0.463 0.12 -0.882 0.318 -1.273 c 0.312 -0.61 0.809 -1.108 1.42 -1.42 c 0.391 -0.199 0.81 -0.28 1.273 -0.318 C 5.494 4.0 6.045 4.0 6.719 4.0 H 17.28 Z M 3.5 11.5 v 3.75 c 0.0 0.712 0.0 1.202 0.031 1.581 c 0.03 0.37 0.086 0.57 0.16 0.714 c 0.167 0.329 0.435 0.597 0.764 0.765 C 4.6 18.383 4.8 18.439 5.17 18.469 c 0.38 0.03 0.869 0.031 1.581 0.031 h 10.5 c 0.712 0.0 1.202 0.0 1.581 -0.031 c 0.37 -0.03 0.57 -0.086 0.714 -0.16 c 0.329 -0.167 0.597 -0.435 0.765 -0.764 c 0.073 -0.144 0.129 -0.344 0.159 -0.714 c 0.03 -0.38 0.031 -0.869 0.031 -1.581 V 11.5 h -17.0 Z m 3.25 -6.0 c -0.712 0.0 -1.202 0.0 -1.581 0.031 c -0.37 0.03 -0.57 0.086 -0.714 0.16 C 4.126 5.857 3.858 6.125 3.69 6.454 C 3.617 6.6 3.562 6.8 3.531 7.17 C 3.501 7.549 3.5 8.038 3.5 8.75 v 0.5 h 17.0 v -0.5 c 0.0 -0.712 0.0 -1.202 -0.031 -1.581 c -0.03 -0.37 -0.086 -0.57 -0.16 -0.714 c -0.167 -0.329 -0.435 -0.597 -0.764 -0.765 C 19.4 5.617 19.2 5.562 18.83 5.531 C 18.451 5.501 17.962 5.5 17.25 5.5 H 6.75 Z")
        )
    }.build()
}
