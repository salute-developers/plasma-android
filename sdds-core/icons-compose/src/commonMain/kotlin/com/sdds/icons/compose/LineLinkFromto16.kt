package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LineLinkFromto16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LineLinkFromto16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.84 1.94 c 0.195 -0.195 0.512 -0.195 0.707 0.0 l 1.896 1.897 c 0.094 0.094 0.147 0.221 0.147 0.354 c 0.0 0.132 -0.053 0.26 -0.147 0.353 l -1.962 1.962 c -0.195 0.195 -0.511 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 l 1.088 -1.088 L 9.64 4.766 C 8.776 4.78 8.08 5.476 8.065 6.338 L 8.013 9.47 c -0.024 1.402 -1.154 2.532 -2.556 2.556 L 3.74 12.054 C 3.567 12.63 3.033 13.05 2.4 13.05 c -0.773 0.0 -1.4 -0.627 -1.4 -1.4 c 0.0 -0.773 0.627 -1.4 1.4 -1.4 c 0.56 0.0 1.042 0.33 1.266 0.805 l 1.774 -0.03 c 0.863 -0.014 1.558 -0.71 1.573 -1.572 l 0.052 -3.131 C 7.09 4.92 8.22 3.79 9.621 3.766 l 3.282 -0.056 l -1.063 -1.063 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 Z")
        )
    }.build()
}
