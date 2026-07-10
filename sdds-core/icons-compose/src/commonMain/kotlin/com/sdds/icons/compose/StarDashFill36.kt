package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.162 5.707 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -7.74 7.74 l -2.794 -6.718 c -0.449 -1.08 -1.979 -1.08 -2.428 0.0 l -3.178 7.64 l -8.248 0.661 c -1.166 0.094 -1.638 1.549 -0.75 2.31 l 6.284 5.383 l -0.576 2.414 l -6.026 6.026 c -0.39 0.39 -0.39 1.023 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 31.162 5.707 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.939 30.785 c -0.626 0.382 -1.345 0.171 -1.729 -0.319 l 17.19 -17.19 l 4.24 0.34 c 1.166 0.094 1.639 1.549 0.75 2.31 l -6.284 5.383 l 1.92 8.049 c 0.271 1.137 -0.966 2.037 -1.965 1.427 L 18.0 26.472 l -7.061 4.313 Z")
        )
    }.build()
}
