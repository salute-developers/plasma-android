package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TabletVerticalFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TabletVerticalFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 25.4 3.0 c 0.613 0.0 1.133 0.0 1.558 0.034 c 0.437 0.036 0.862 0.114 1.267 0.32 c 0.61 0.312 1.108 0.81 1.42 1.42 c 0.206 0.405 0.284 0.83 0.32 1.267 c 0.035 0.425 0.034 0.946 0.034 1.56 v 20.798 c 0.0 0.614 0.0 1.134 -0.034 1.559 c -0.036 0.437 -0.114 0.862 -0.32 1.267 c -0.312 0.61 -0.81 1.108 -1.42 1.42 c -0.405 0.206 -0.83 0.284 -1.267 0.32 c -0.425 0.035 -0.945 0.034 -1.559 0.034 H 10.602 c -0.613 0.0 -1.134 0.0 -1.559 -0.034 c -0.437 -0.036 -0.862 -0.114 -1.267 -0.32 c -0.61 -0.312 -1.108 -0.81 -1.42 -1.42 c -0.206 -0.405 -0.284 -0.83 -0.32 -1.267 c -0.035 -0.425 -0.035 -0.945 -0.035 -1.559 V 7.601 c 0.0 -0.614 0.0 -1.135 0.035 -1.56 c 0.036 -0.437 0.114 -0.861 0.32 -1.267 c 0.312 -0.61 0.81 -1.108 1.42 -1.42 c 0.405 -0.206 0.83 -0.284 1.267 -0.32 C 9.468 3.0 9.989 3.0 10.603 3.0 h 14.796 Z M 14.0 7.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 8.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -8.0 Z")
        )
    }.build()
}
