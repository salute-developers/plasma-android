package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NoiseCancellationFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NoiseCancellationFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.433 15.349 c 2.159 0.081 4.17 0.772 5.878 1.907 c 0.733 0.486 1.31 1.448 1.002 2.477 c -0.046 0.152 -0.103 0.298 -0.175 0.44 c -0.319 0.625 -0.827 1.133 -1.452 1.451 c -0.398 0.203 -0.825 0.285 -1.3 0.324 c -0.466 0.038 -1.042 0.038 -1.75 0.038 h -5.27 c -0.708 0.0 -1.284 0.0 -1.75 -0.038 c -0.476 -0.039 -0.904 -0.121 -1.302 -0.324 c -0.624 -0.318 -1.132 -0.827 -1.45 -1.451 c -0.072 -0.142 -0.13 -0.288 -0.176 -0.44 c -0.307 -1.03 0.269 -1.993 1.001 -2.48 c 1.823 -1.209 3.988 -1.912 6.31 -1.912 l 0.434 0.008 Z M 12.0 1.95 c 4.355 0.0 7.887 3.531 7.887 7.887 c 0.0 1.97 -0.724 3.774 -1.92 5.156 c -0.27 0.313 -0.744 0.347 -1.057 0.076 c -0.313 -0.27 -0.347 -0.744 -0.076 -1.057 c 0.968 -1.12 1.553 -2.579 1.553 -4.175 c 0.0 -3.527 -2.86 -6.387 -6.387 -6.387 c -3.527 0.0 -6.387 2.86 -6.387 6.387 c 0.0 1.596 0.585 3.055 1.553 4.175 c 0.27 0.313 0.237 0.787 -0.076 1.057 c -0.313 0.271 -0.787 0.237 -1.058 -0.076 c -1.195 -1.382 -1.92 -3.186 -1.92 -5.156 C 4.112 5.48 7.644 1.95 12.0 1.95 Z m 0.001 3.66 c 2.334 0.0 4.226 1.89 4.226 4.224 c 0.0 2.334 -1.892 4.226 -4.226 4.226 s -4.227 -1.893 -4.227 -4.226 c 0.001 -2.333 1.894 -4.224 4.227 -4.225 Z")
        )
    }.build()
}
