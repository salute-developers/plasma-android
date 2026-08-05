package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TelegramFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TelegramFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.904 7.199 s 2.504 -0.974 2.295 1.39 c -0.07 0.974 -0.626 4.384 -1.182 8.07 c -0.835 5.218 -1.74 10.923 -1.74 10.923 c -0.001 0.02 -0.147 1.6 -1.32 1.877 c -1.183 0.279 -3.131 -0.973 -3.48 -1.251 c -0.278 -0.21 -5.217 -3.34 -7.026 -4.87 c -0.487 -0.418 -1.043 -1.252 0.07 -2.226 c 2.504 -2.296 5.496 -5.148 7.304 -6.957 c 0.835 -0.835 1.67 -2.782 -1.808 -0.417 c -4.912 3.39 -9.755 6.573 -9.809 6.608 c 0.0 0.0 -1.113 0.696 -3.2 0.07 c -2.087 -0.626 -4.522 -1.46 -4.522 -1.46 s -1.67 -1.044 1.182 -2.158 c 0.0 0.0 12.035 -4.938 16.21 -6.677 c 1.593 -0.693 6.982 -2.904 7.026 -2.922 Z")
        )
    }.build()
}
