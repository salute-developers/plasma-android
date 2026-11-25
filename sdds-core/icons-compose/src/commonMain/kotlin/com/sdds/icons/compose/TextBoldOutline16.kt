package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TextBoldOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TextBoldOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.549 2.05 c 1.258 0.0 2.222 0.239 2.89 0.715 c 0.68 0.476 1.02 1.213 1.02 2.21 c 0.0 1.416 -0.612 2.34 -1.836 2.77 c 0.76 0.125 1.315 0.42 1.666 0.884 c 0.351 0.453 0.527 1.072 0.527 1.854 c 0.0 0.612 -0.107 1.139 -0.323 1.58 c -0.215 0.443 -0.527 0.805 -0.935 1.089 c -0.397 0.272 -0.884 0.476 -1.462 0.612 c -0.578 0.125 -1.23 0.186 -1.955 0.186 H 3.5 V 2.05 h 5.049 Z M 5.336 12.301 h 2.992 c 0.884 0.0 1.541 -0.147 1.972 -0.441 c 0.442 -0.306 0.663 -0.788 0.663 -1.446 c 0.0 -0.657 -0.238 -1.116 -0.714 -1.377 c -0.465 -0.26 -1.094 -0.39 -1.887 -0.39 H 5.336 V 12.3 Z m 0.0 -5.1 h 2.873 c 0.703 0.0 1.281 -0.158 1.734 -0.475 c 0.454 -0.317 0.68 -0.777 0.68 -1.377 c 0.0 -0.544 -0.187 -0.953 -0.56 -1.225 C 9.688 3.852 9.087 3.716 8.26 3.716 H 5.336 v 3.485 Z")
        )
    }.build()
}
