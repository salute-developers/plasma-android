package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowBarUp36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowBarUp36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.393 4.0 c 0.274 0.007 0.534 0.126 0.718 0.33 l 7.38 8.16 c 0.371 0.41 0.34 1.043 -0.07 1.413 c -0.41 0.37 -1.042 0.339 -1.413 -0.07 L 19.37 7.596 V 25.5 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 7.423 l -6.41 6.444 c -0.39 0.391 -1.023 0.393 -1.414 0.003 c -0.392 -0.39 -0.393 -1.022 -0.004 -1.414 l 8.12 -8.161 C 17.853 4.1 18.117 3.994 18.392 4.0 Z M 5.5 31.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 23.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -23.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
    }.build()
}
