package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.608 1.77 c 0.0 -0.288 0.236 -0.52 0.527 -0.52 c 1.595 0.0 2.68 0.731 3.365 1.637 c 0.083 0.11 0.16 0.221 0.232 0.335 c 0.012 -0.053 0.026 -0.105 0.04 -0.156 c 0.111 -0.423 0.272 -0.848 0.509 -1.18 C 8.52 1.55 8.89 1.25 9.405 1.25 c 0.291 0.0 0.527 0.232 0.527 0.52 c 0.0 0.286 -0.236 0.518 -0.527 0.518 c -0.047 0.0 -0.135 0.018 -0.263 0.197 C 9.01 2.669 8.89 2.958 8.791 3.329 c -0.133 0.5 -0.207 1.08 -0.241 1.59 c 0.115 -0.04 0.233 -0.085 0.362 -0.133 L 9.27 4.653 c 0.613 -0.222 1.39 -0.466 2.247 -0.46 c 0.752 0.004 1.508 0.298 2.073 0.894 c 0.567 0.599 0.91 1.467 0.91 2.567 c 0.0 2.526 -0.734 4.287 -1.651 5.428 c -0.456 0.567 -0.955 0.979 -1.426 1.25 c -0.46 0.266 -0.926 0.418 -1.315 0.418 c -0.663 0.0 -1.11 -0.225 -1.447 -0.415 l -0.062 -0.034 C 8.29 14.125 8.17 14.058 8.0 14.058 c -0.168 0.0 -0.288 0.067 -0.6 0.243 l -0.06 0.034 c -0.337 0.19 -0.785 0.415 -1.448 0.415 c -0.39 0.0 -0.856 -0.152 -1.315 -0.418 c -0.47 -0.271 -0.97 -0.683 -1.426 -1.25 C 2.234 11.942 1.5 10.18 1.5 7.654 c 0.0 -1.1 0.343 -1.968 0.91 -2.567 c 0.556 -0.587 1.297 -0.88 2.038 -0.894 c -0.215 -0.218 -0.397 -0.47 -0.535 -0.771 c -0.21 -0.46 -0.305 -1.0 -0.305 -1.653 Z m 3.64 2.86 l -0.27 -0.127 l -0.39 -0.183 C 6.11 4.093 5.747 3.903 5.463 3.69 C 5.189 3.488 5.0 3.271 4.873 2.994 C 4.793 2.817 4.73 2.602 4.696 2.33 c 0.906 0.138 1.529 0.608 1.96 1.178 C 6.923 3.861 7.116 4.255 7.25 4.63 Z")
        )
    }.build()
}
