package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarFourOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarFourOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.655 4.957 c 0.805 -2.177 3.884 -2.177 4.69 0.0 l 2.81 7.594 c 0.05 0.137 0.158 0.245 0.295 0.295 l 7.594 2.81 c 2.177 0.806 2.177 3.885 0.0 4.69 l -7.594 2.81 c -0.137 0.052 -0.245 0.16 -0.295 0.296 l -2.81 7.595 c -0.806 2.175 -3.885 2.175 -4.69 0.0 l -2.81 -7.595 c -0.052 -0.137 -0.16 -0.245 -0.296 -0.295 l -7.594 -2.81 c -2.177 -0.806 -2.177 -3.885 0.0 -4.69 l 7.594 -2.81 c 0.137 -0.051 0.244 -0.16 0.295 -0.296 l 2.81 -7.594 Z m 2.813 0.693 c -0.161 -0.435 -0.776 -0.435 -0.937 0.0 l -2.81 7.596 c -0.254 0.683 -0.794 1.223 -1.477 1.476 l -7.596 2.81 c -0.435 0.162 -0.435 0.777 0.0 0.938 l 7.596 2.81 c 0.684 0.254 1.223 0.793 1.476 1.477 l 2.81 7.596 c 0.162 0.434 0.777 0.434 0.938 0.0 l 2.81 -7.596 c 0.254 -0.684 0.794 -1.223 1.477 -1.476 l 7.596 -2.81 c 0.435 -0.162 0.435 -0.777 0.0 -0.938 l -7.596 -2.81 c -0.683 -0.254 -1.223 -0.793 -1.476 -1.477 l -2.81 -7.596 Z")
        )
    }.build()
}
