package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PoopFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PoopFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.44 2.193 c 0.174 -0.255 0.59 -0.262 0.742 0.005 c 0.324 0.57 0.624 1.01 0.892 1.404 c 0.681 1.002 1.152 1.694 1.258 3.401 c -0.128 -0.014 -0.265 -0.027 -0.41 -0.04 c -0.908 -0.086 -2.136 -0.2 -3.607 -0.863 l -0.3 -0.137 c -0.59 -0.27 -1.227 -0.564 -1.947 -0.723 c 0.307 -0.547 0.867 -0.927 1.478 -1.342 c 0.655 -0.445 1.37 -0.93 1.895 -1.705 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.154 5.71 c -0.89 0.22 -1.27 0.718 -1.399 1.218 c -0.097 0.38 -0.056 0.79 0.073 1.138 C 2.999 8.08 3.17 8.118 3.339 8.185 c 5.018 2.006 6.867 1.082 8.287 0.371 c 0.53 -0.265 1.0 -0.5 1.554 -0.542 c -0.01 -0.125 -0.035 -0.198 -0.057 -0.239 c -0.021 -0.04 -0.049 -0.071 -0.101 -0.102 c -0.142 -0.082 -0.391 -0.133 -0.877 -0.181 l -0.271 -0.026 C 10.96 7.38 9.656 7.259 8.104 6.56 L 7.81 6.426 C 6.714 5.925 5.608 5.42 4.154 5.71 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.15 8.654 c 3.606 1.442 5.693 1.431 7.187 0.99 c 0.61 -0.18 1.109 -0.431 1.527 -0.64 l 0.233 -0.117 c 0.476 -0.232 0.84 -0.374 1.257 -0.374 c 0.417 0.0 0.713 0.136 0.921 0.334 c 0.216 0.205 0.37 0.507 0.437 0.876 c 0.137 0.747 -0.1 1.65 -0.675 2.24 c -1.93 1.728 -4.67 2.228 -7.154 1.976 c -1.24 -0.127 -2.39 -0.438 -3.31 -0.858 C 2.64 12.655 2.0 12.143 1.703 11.653 C 1.05 10.568 1.195 9.698 1.565 9.182 c 0.388 -0.54 1.038 -0.747 1.585 -0.528 Z")
        )
    }.build()
}
