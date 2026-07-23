package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageRequestOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageRequestOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.66 9.654 c 0.89 -2.78 3.497 -4.792 6.571 -4.792 c 3.81 0.0 6.9 3.09 6.9 6.9 c 0.0 3.811 -3.09 6.9 -6.9 6.9 c -0.822 0.0 -1.609 -0.143 -2.338 -0.406 c -0.703 -0.253 -1.527 -0.376 -2.345 -0.147 l -2.31 0.647 l 0.696 -2.486 c 0.197 -0.703 0.094 -1.413 -0.14 -2.016 c -0.15 -0.386 -0.584 -0.578 -0.97 -0.429 c -0.386 0.15 -0.578 0.585 -0.428 0.97 c 0.149 0.385 0.182 0.755 0.093 1.07 l -0.75 2.679 c -0.291 1.042 0.669 2.002 1.71 1.71 l 2.504 -0.7 c 0.426 -0.12 0.919 -0.071 1.431 0.114 c 0.89 0.32 1.85 0.494 2.847 0.494 c 4.64 0.0 8.4 -3.76 8.4 -8.4 c 0.0 -4.639 -3.76 -8.4 -8.4 -8.4 c -3.745 0.0 -6.916 2.45 -8.0 5.834 c -0.127 0.394 0.09 0.817 0.485 0.943 c 0.394 0.126 0.817 -0.09 0.943 -0.485 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.363 9.53 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 c 0.293 -0.293 0.768 -0.293 1.061 0.0 l 2.975 2.974 c 0.14 0.141 0.22 0.332 0.22 0.53 c 0.0 0.2 -0.08 0.39 -0.22 0.531 l -2.975 2.975 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.294 -0.293 -0.294 -0.768 0.0 -1.06 l 1.694 -1.695 h -6.69 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 6.69 L 9.363 9.53 Z")
        )
    }.build()
}
