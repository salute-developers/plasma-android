package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TextBoldOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TextBoldOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.992 5.398 c 2.664 0.0 4.704 0.504 6.12 1.512 c 1.44 1.008 2.16 2.569 2.16 4.68 c 0.0 3.0 -1.296 4.957 -3.888 5.869 c 1.608 0.264 2.784 0.888 3.528 1.872 c 0.744 0.96 1.116 2.268 1.116 3.924 c 0.0 1.296 -0.228 2.412 -0.684 3.348 c -0.456 0.935 -1.116 1.703 -1.98 2.303 c -0.84 0.576 -1.872 1.008 -3.095 1.296 c -1.224 0.264 -2.605 0.397 -4.141 0.397 H 8.3 v -25.2 h 10.692 Z m -6.804 21.708 h 6.336 c 1.872 0.0 3.264 -0.311 4.176 -0.935 c 0.936 -0.648 1.405 -1.669 1.405 -3.06 c 0.0 -1.393 -0.505 -2.365 -1.513 -2.917 c -0.984 -0.552 -2.316 -0.828 -3.996 -0.828 h -6.408 v 7.74 Z m 0.0 -10.8 h 6.085 c 1.487 0.0 2.711 -0.335 3.671 -1.007 c 0.96 -0.672 1.44 -1.644 1.44 -2.916 c 0.0 -1.152 -0.396 -2.016 -1.188 -2.592 c -0.792 -0.576 -2.064 -0.864 -3.816 -0.864 h -6.191 v 7.38 Z")
        )
    }.build()
}
