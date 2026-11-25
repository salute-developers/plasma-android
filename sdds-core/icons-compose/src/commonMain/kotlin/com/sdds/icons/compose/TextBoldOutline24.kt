package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TextBoldOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TextBoldOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.778 3.6 c 1.776 0.0 3.136 0.335 4.08 1.007 c 0.96 0.672 1.44 1.713 1.44 3.12 c 0.0 2.0 -0.864 3.305 -2.592 3.913 c 1.072 0.176 1.857 0.592 2.353 1.248 c 0.495 0.64 0.743 1.511 0.743 2.615 c 0.0 0.864 -0.152 1.608 -0.456 2.232 c -0.304 0.624 -0.744 1.137 -1.32 1.537 c -0.56 0.384 -1.248 0.672 -2.064 0.864 c -0.816 0.176 -1.736 0.263 -2.76 0.263 H 5.65 V 3.6 h 7.128 Z M 8.242 18.07 h 4.224 c 1.248 0.0 2.176 -0.208 2.784 -0.624 c 0.624 -0.432 0.936 -1.112 0.936 -2.04 c 0.0 -0.928 -0.336 -1.575 -1.008 -1.943 c -0.656 -0.368 -1.544 -0.553 -2.664 -0.553 H 8.242 v 5.16 Z m 0.0 -7.2 h 4.056 c 0.992 0.0 1.808 -0.224 2.448 -0.672 c 0.64 -0.448 0.96 -1.095 0.96 -1.943 c 0.0 -0.768 -0.264 -1.345 -0.792 -1.729 c -0.528 -0.384 -1.376 -0.576 -2.544 -0.576 H 8.242 v 4.92 Z")
        )
    }.build()
}
