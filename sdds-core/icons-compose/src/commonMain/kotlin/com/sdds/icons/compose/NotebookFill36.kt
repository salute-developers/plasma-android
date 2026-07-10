package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NotebookFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NotebookFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.755 23.068 C 30.0 22.586 30.0 21.956 30.0 20.696 V 11.6 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 C 28.29 8.0 27.66 8.0 26.4 8.0 H 9.6 C 8.34 8.0 7.71 8.0 7.229 8.245 C 6.805 8.461 6.46 8.805 6.245 9.23 C 6.0 9.709 6.0 10.339 6.0 11.6 v 9.096 c 0.0 1.26 0.0 1.89 0.245 2.372 c 0.216 0.423 0.56 0.767 0.984 0.983 c 0.48 0.245 1.11 0.245 2.371 0.245 h 16.8 c 1.26 0.0 1.89 0.0 2.372 -0.245 c 0.423 -0.216 0.767 -0.56 0.983 -0.983 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.111 25.778 C 3.497 25.778 3.0 26.275 3.0 26.888 C 3.0 27.503 3.497 28.0 4.111 28.0 H 31.89 C 32.502 28.0 33.0 27.503 33.0 26.889 s -0.498 -1.111 -1.111 -1.111 H 4.11 Z")
        )
    }.build()
}
