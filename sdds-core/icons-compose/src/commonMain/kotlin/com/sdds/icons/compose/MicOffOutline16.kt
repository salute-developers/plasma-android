package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicOffOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicOffOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.29 8.296 c 0.274 0.037 0.466 0.289 0.429 0.562 c -0.152 1.123 -0.717 2.15 -1.586 2.892 c -0.742 0.634 -1.663 1.025 -2.634 1.125 v 1.6 c 0.0 0.277 -0.224 0.5 -0.5 0.5 s -0.5 -0.223 -0.5 -0.5 v -1.6 c -0.586 -0.06 -1.155 -0.227 -1.677 -0.49 l 0.755 -0.755 C 7.025 11.807 7.507 11.9 8.0 11.9 c 0.916 0.0 1.8 -0.324 2.485 -0.91 c 0.685 -0.585 1.126 -1.39 1.244 -2.265 c 0.037 -0.274 0.289 -0.466 0.562 -0.43 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.739 1.647 c 0.195 -0.196 0.511 -0.196 0.706 0.0 c 0.196 0.195 0.196 0.511 0.0 0.707 L 2.565 14.232 c -0.195 0.196 -0.511 0.196 -0.706 0.0 c -0.195 -0.195 -0.195 -0.511 0.0 -0.707 l 2.399 -2.4 C 3.734 10.474 3.392 9.692 3.28 8.858 C 3.243 8.585 3.435 8.333 3.708 8.296 C 3.982 8.259 4.234 8.45 4.271 8.725 c 0.083 0.614 0.328 1.191 0.702 1.685 l 0.806 -0.805 c -0.26 -0.408 -0.41 -0.891 -0.41 -1.41 v -4.04 c 0.0 -1.452 1.178 -2.63 2.63 -2.63 c 1.453 0.0 2.631 1.178 2.631 2.63 v 0.599 l 3.108 -3.107 Z m -5.74 0.878 c -0.9 0.0 -1.63 0.73 -1.63 1.63 v 4.04 c 0.0 0.24 0.053 0.468 0.146 0.673 L 9.63 5.754 V 4.155 c 0.0 -0.9 -0.73 -1.63 -1.63 -1.63 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.63 8.195 c 0.0 1.453 -1.178 2.631 -2.63 2.631 c -0.192 0.0 -0.38 -0.02 -0.56 -0.06 l 1.003 -1.001 C 8.987 9.61 9.415 9.183 9.569 8.639 l 1.061 -1.062 v 0.618 Z")
        )
    }.build()
}
