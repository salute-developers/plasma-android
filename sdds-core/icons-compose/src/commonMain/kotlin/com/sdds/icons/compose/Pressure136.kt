package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Pressure136: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Pressure136",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.836 19.253 c 0.294 -0.262 0.714 -0.326 1.073 -0.165 C 20.27 19.249 20.5 19.606 20.5 20.0 v 12.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -9.774 l -2.836 2.521 c -0.413 0.367 -1.044 0.33 -1.411 -0.083 c -0.367 -0.413 -0.33 -1.044 0.083 -1.411 l 4.5 -4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.023 3.0 C 14.219 3.0 16.0 4.78 16.0 6.978 c 0.0 2.196 -1.78 3.978 -3.977 3.978 H 9.25 v 4.294 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 4.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 3.773 Z M 9.25 8.956 h 2.773 C 13.115 8.956 14.0 8.07 14.0 6.978 C 14.0 5.885 13.114 5.0 12.023 5.0 H 9.25 v 3.956 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 26.943 3.408 C 27.2 3.06 27.651 2.915 28.061 3.05 C 28.473 3.184 28.75 3.568 28.75 4.0 v 11.25 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 7.055 l -2.318 3.162 c -0.189 0.257 -0.488 0.408 -0.807 0.408 c -0.319 0.0 -0.618 -0.151 -0.807 -0.408 L 20.5 7.055 v 8.195 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 V 4.0 c 0.0 -0.432 0.278 -0.816 0.689 -0.95 c 0.41 -0.135 0.862 0.01 1.118 0.358 l 3.318 4.525 l 3.318 -4.525 Z")
        )
    }.build()
}
