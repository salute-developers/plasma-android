package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MovementOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MovementOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.963 4.281 c 0.494 0.044 0.866 0.347 1.104 0.648 c 0.45 0.57 0.962 0.784 1.417 0.77 c 0.461 -0.014 0.958 -0.265 1.367 -0.81 c 0.165 -0.22 0.48 -0.265 0.7 -0.1 c 0.22 0.167 0.265 0.48 0.1 0.701 c -0.555 0.74 -1.316 1.183 -2.136 1.208 c -0.403 0.012 -0.799 -0.078 -1.17 -0.263 l -2.062 3.24 l 0.03 0.024 c 0.946 0.757 1.44 1.535 1.718 2.324 c 0.267 0.756 0.336 1.537 0.443 2.186 c 0.044 0.272 -0.14 0.53 -0.412 0.574 c -0.273 0.045 -0.53 -0.14 -0.575 -0.412 c -0.123 -0.75 -0.17 -1.37 -0.398 -2.015 c -0.213 -0.603 -0.59 -1.216 -1.371 -1.85 c -0.701 -0.356 -1.224 -0.742 -1.546 -1.192 C 5.823 8.827 5.733 8.3 5.848 7.756 C 5.956 7.24 6.244 6.724 6.606 6.209 C 6.8 5.935 7.022 5.649 7.266 5.35 C 6.864 5.424 6.475 5.538 6.118 5.696 C 5.296 6.061 4.672 6.643 4.4 7.45 C 4.311 7.711 4.027 7.852 3.766 7.763 C 3.504 7.675 3.364 7.391 3.452 7.13 c 0.383 -1.136 1.251 -1.899 2.26 -2.347 c 1.004 -0.446 2.176 -0.596 3.25 -0.502 Z M 8.646 5.263 C 8.156 5.836 7.74 6.334 7.425 6.784 c -0.338 0.48 -0.532 0.862 -0.599 1.178 c -0.06 0.286 -0.017 0.525 0.158 0.77 c 0.097 0.135 0.24 0.278 0.44 0.43 L 9.54 5.84 C 9.451 5.75 9.365 5.653 9.283 5.55 C 9.14 5.368 8.994 5.288 8.876 5.277 C 8.8 5.27 8.723 5.267 8.646 5.263 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.484 10.512 c 0.154 -0.229 0.464 -0.291 0.694 -0.138 c 0.23 0.153 0.291 0.463 0.138 0.693 c -0.356 0.535 -0.763 1.062 -1.358 1.387 c -0.613 0.334 -1.353 0.417 -2.306 0.226 c -0.27 -0.054 -0.446 -0.318 -0.392 -0.588 c 0.054 -0.27 0.317 -0.446 0.588 -0.392 c 0.797 0.16 1.282 0.067 1.632 -0.124 c 0.367 -0.2 0.661 -0.549 1.004 -1.064 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.45 1.2 c 0.715 0.0 1.295 0.58 1.295 1.295 S 11.165 3.79 10.45 3.79 S 9.155 3.21 9.155 2.495 S 9.735 1.2 10.45 1.2 Z")
        )
    }.build()
}
