package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TabletHorizontalFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TabletHorizontalFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 10.599 C 3.0 9.986 3.0 9.465 3.035 9.04 c 0.035 -0.437 0.114 -0.862 0.32 -1.267 c 0.312 -0.61 0.809 -1.108 1.42 -1.42 c 0.405 -0.206 0.83 -0.284 1.266 -0.32 C 6.468 5.998 6.989 6.0 7.601 6.0 H 28.4 c 0.613 0.0 1.133 0.0 1.559 0.034 c 0.436 0.036 0.861 0.114 1.266 0.32 c 0.611 0.312 1.108 0.81 1.42 1.42 c 0.206 0.405 0.285 0.83 0.32 1.267 C 33.0 9.465 33.0 9.986 33.0 10.599 v 14.796 c 0.0 0.614 0.001 1.135 -0.034 1.56 c -0.035 0.437 -0.114 0.862 -0.32 1.267 c -0.312 0.61 -0.809 1.108 -1.42 1.42 c -0.405 0.206 -0.83 0.284 -1.267 0.32 c -0.425 0.035 -0.945 0.034 -1.558 0.034 H 7.6 c -0.613 0.0 -1.134 0.0 -1.56 -0.034 c -0.437 -0.036 -0.861 -0.114 -1.266 -0.32 c -0.611 -0.312 -1.108 -0.809 -1.42 -1.42 c -0.206 -0.405 -0.285 -0.83 -0.32 -1.267 C 3.0 26.53 3.0 26.01 3.0 25.395 V 10.6 Z m 4.5 11.399 c 0.0 0.552 0.448 1.0 1.0 1.0 c 0.553 0.0 1.0 -0.448 1.0 -1.0 v -8.0 c 0.0 -0.552 -0.447 -1.0 -1.0 -1.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 8.0 Z")
        )
    }.build()
}
