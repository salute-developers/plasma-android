package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookOpenFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookOpenFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.756 2.4 c 1.042 0.0 1.855 0.258 2.453 0.636 C 7.392 3.152 7.49 3.366 7.49 3.59 l -0.002 9.303 c 0.0 0.392 -0.19 0.47 -0.44 0.176 c -0.343 -0.404 -0.974 -0.89 -2.292 -0.89 c -1.108 0.0 -1.817 0.287 -2.235 0.577 c -0.21 0.146 -0.346 0.293 -0.425 0.405 C 2.0 13.296 2.024 13.326 2.024 13.244 c 0.0 0.197 -0.23 0.356 -0.512 0.356 C 1.229 13.6 1.0 13.44 1.0 13.244 v -8.22 L 1.003 5.02 C 1.01 4.903 1.039 4.788 1.07 4.695 C 1.11 4.58 1.165 4.453 1.236 4.321 C 1.38 4.058 1.594 3.758 1.892 3.474 C 2.494 2.898 3.427 2.4 4.756 2.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.244 2.4 c 2.527 0.0 3.705 1.508 3.754 2.596 L 15.0 4.998 v 8.246 c 0.0 0.196 -0.23 0.355 -0.512 0.356 c -0.283 0.0 -0.512 -0.16 -0.512 -0.356 c 0.0 0.082 0.024 0.052 -0.072 -0.084 c -0.079 -0.112 -0.215 -0.259 -0.425 -0.405 c -0.417 -0.29 -1.127 -0.577 -2.235 -0.577 c -1.316 0.0 -1.95 0.485 -2.294 0.888 c -0.25 0.294 -0.438 0.218 -0.438 -0.174 L 8.51 3.609 c 0.0 -0.235 0.11 -0.457 0.308 -0.57 C 9.464 2.671 10.35 2.4 11.244 2.4 Z")
        )
    }.build()
}
