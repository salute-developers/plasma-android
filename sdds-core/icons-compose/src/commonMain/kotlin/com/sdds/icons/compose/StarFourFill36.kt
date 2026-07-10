package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarFourFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarFourFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.655 4.957 c 0.805 -2.177 3.884 -2.177 4.69 0.0 l 2.81 7.594 c 0.05 0.137 0.158 0.245 0.295 0.295 l 7.594 2.81 c 2.177 0.806 2.177 3.885 0.0 4.69 l -7.594 2.81 c -0.137 0.052 -0.245 0.16 -0.295 0.296 l -2.81 7.595 c -0.806 2.175 -3.885 2.175 -4.69 0.0 l -2.81 -7.595 c -0.052 -0.137 -0.16 -0.245 -0.296 -0.295 l -7.594 -2.81 c -2.177 -0.806 -2.177 -3.885 0.0 -4.69 l 7.594 -2.81 c 0.137 -0.051 0.244 -0.16 0.295 -0.296 l 2.81 -7.594 Z")
        )
    }.build()
}
