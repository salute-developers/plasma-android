package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CloudDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CloudDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.749 4.293 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.023 0.0 1.414 L 5.707 31.163 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 l 1.776 -1.777 C 4.193 26.39 3.0 24.022 3.0 21.375 c 0.0 -4.026 2.757 -7.406 6.486 -8.357 C 10.798 8.945 14.616 6.0 19.125 6.0 c 2.488 0.0 4.767 0.898 6.53 2.387 l 4.094 -4.094 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.133 11.497 c 0.714 1.387 1.117 2.96 1.117 4.628 c 0.0 0.354 -0.018 0.705 -0.054 1.05 C 31.447 18.27 33.0 20.578 33.0 23.25 c 0.0 3.728 -3.022 6.75 -6.75 6.75 H 11.625 c -0.62 0.0 -1.223 -0.066 -1.806 -0.19 l 18.314 -18.313 Z")
        )
    }.build()
}
