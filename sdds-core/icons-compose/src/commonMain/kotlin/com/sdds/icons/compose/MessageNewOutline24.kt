package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageNewOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageNewOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.213 4.888 c -3.811 0.0 -6.9 3.089 -6.9 6.9 c 0.0 0.822 0.143 1.609 0.406 2.338 c 0.253 0.703 0.376 1.527 0.147 2.344 L 5.22 18.781 l 2.31 -0.647 c 0.818 -0.229 1.643 -0.105 2.345 0.148 c 0.73 0.262 1.516 0.406 2.339 0.406 c 3.792 0.0 6.87 -3.06 6.9 -6.845 c 0.546 -0.158 1.045 -0.43 1.468 -0.787 c 0.021 0.241 0.032 0.485 0.032 0.732 c 0.0 4.639 -3.761 8.4 -8.4 8.4 c -0.998 0.0 -1.957 -0.175 -2.847 -0.495 c -0.513 -0.185 -1.005 -0.234 -1.432 -0.115 L 5.431 20.28 c -1.042 0.292 -2.002 -0.668 -1.71 -1.71 l 0.7 -2.503 c 0.12 -0.426 0.071 -0.919 -0.114 -1.432 c -0.32 -0.89 -0.494 -1.848 -0.494 -2.846 c 0.0 -4.64 3.76 -8.4 8.4 -8.4 c 1.456 0.0 2.826 0.37 4.02 1.022 c -0.505 0.25 -0.95 0.603 -1.308 1.031 c -0.832 -0.356 -1.75 -0.553 -2.712 -0.553 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.125 10.475 c 1.45 0.0 2.625 -1.175 2.625 -2.625 s -1.175 -2.625 -2.625 -2.625 S 15.5 6.4 15.5 7.85 s 1.175 2.625 2.625 2.625 Z")
        )
    }.build()
}
