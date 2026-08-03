package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.214 5.314 c -0.449 -1.08 -1.979 -1.08 -2.428 0.0 l -3.178 7.64 l -8.248 0.661 c -1.166 0.094 -1.639 1.549 -0.75 2.31 l 6.284 5.383 l -1.92 8.048 c -0.271 1.138 0.966 2.037 1.965 1.427 L 18.0 26.47 l 7.061 4.314 c 0.999 0.61 2.236 -0.29 1.965 -1.428 l -1.92 -8.048 l 6.284 -5.383 c 0.889 -0.761 0.416 -2.216 -0.75 -2.31 l -8.248 -0.661 l -3.178 -7.64 Z")
        )
    }.build()
}
