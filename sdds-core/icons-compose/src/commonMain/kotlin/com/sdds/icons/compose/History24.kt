package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.History24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "History24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.5 11.999 c 0.0 -4.694 -3.806 -8.5 -8.5 -8.5 c -3.105 0.0 -5.822 1.665 -7.306 4.153 h 1.653 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 2.75 C 2.336 9.152 2.0 8.816 2.0 8.402 V 4.805 c 0.0 -0.415 0.336 -0.75 0.75 -0.75 S 3.5 4.39 3.5 4.805 v 1.924 c 1.764 -2.839 4.91 -4.73 8.5 -4.73 c 5.523 0.0 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 c -4.145 0.0 -7.699 -2.521 -9.215 -6.11 c -0.162 -0.382 0.017 -0.822 0.399 -0.984 c 0.381 -0.16 0.821 0.018 0.982 0.4 c 1.29 3.053 4.313 5.194 7.834 5.194 c 4.694 0.0 8.5 -3.806 8.5 -8.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.5 8.25 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 4.423 l 2.098 1.211 c 0.478 0.276 0.642 0.888 0.366 1.366 c -0.276 0.478 -0.888 0.642 -1.366 0.366 l -2.58 -1.49 c -0.04 -0.022 -0.08 -0.047 -0.116 -0.075 c -0.226 -0.169 -0.379 -0.432 -0.4 -0.73 c -0.002 -0.03 -0.002 -0.058 -0.002 -0.087 V 8.25 Z")
        )
    }.build()
}
