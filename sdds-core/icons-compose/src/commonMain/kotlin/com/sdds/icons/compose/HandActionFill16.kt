package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HandActionFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HandActionFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 4.181 3.105 C 3.912 2.817 3.461 2.8 3.174 3.068 C 2.887 3.336 2.872 3.787 3.141 4.075 l 3.653 3.918 c 0.068 0.072 0.064 0.185 -0.008 0.252 c -0.072 0.067 -0.185 0.063 -0.252 -0.01 L 3.855 5.364 c -0.269 -0.289 -0.72 -0.306 -1.007 -0.038 c -0.287 0.268 -0.302 0.72 -0.033 1.008 l 3.044 3.264 C 5.926 9.67 5.923 9.782 5.851 9.85 C 5.779 9.916 5.666 9.912 5.599 9.84 L 4.138 8.273 c -0.27 -0.289 -0.72 -0.305 -1.008 -0.037 c -0.287 0.268 -0.302 0.719 -0.033 1.007 l 2.68 2.873 l 0.012 0.015 c 1.145 1.216 2.966 1.658 4.587 0.972 c 2.082 -0.88 3.049 -3.284 2.16 -5.37 l -1.609 -3.776 c -0.154 -0.363 -0.573 -0.533 -0.935 -0.38 L 9.933 3.605 c -0.25 0.158 -0.4 0.433 -0.31 0.712 c 0.087 0.275 0.148 0.49 0.204 0.69 l 0.817 1.915 c 0.034 0.08 0.005 0.172 -0.067 0.219 c -0.072 0.047 -0.168 0.035 -0.227 -0.028 L 6.213 2.676 c -0.27 -0.288 -0.72 -0.305 -1.008 -0.037 c -0.287 0.268 -0.302 0.719 -0.033 1.007 L 7.73 6.39 C 7.797 6.46 7.793 6.573 7.721 6.64 C 7.65 6.707 7.537 6.703 7.47 6.631 L 4.181 3.105 Z")
        )
    }.build()
}
