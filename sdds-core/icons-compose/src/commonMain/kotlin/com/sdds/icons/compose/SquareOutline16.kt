package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SquareOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SquareOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 1f,
            pathData = addPathNodes("M 2.25 3.37 c 0.0 -0.392 0.0 -0.588 0.076 -0.738 C 2.393 2.5 2.5 2.393 2.632 2.326 C 2.782 2.25 2.978 2.25 3.37 2.25 h 9.26 c 0.392 0.0 0.588 0.0 0.738 0.076 c 0.131 0.067 0.239 0.174 0.306 0.306 c 0.076 0.15 0.076 0.346 0.076 0.738 v 9.26 c 0.0 0.392 0.0 0.588 -0.076 0.738 c -0.067 0.131 -0.175 0.239 -0.306 0.306 c -0.15 0.076 -0.346 0.076 -0.738 0.076 H 3.37 c -0.392 0.0 -0.588 0.0 -0.738 -0.076 c -0.132 -0.067 -0.239 -0.175 -0.306 -0.306 c -0.076 -0.15 -0.076 -0.346 -0.076 -0.738 V 3.37 Z")
        )
    }.build()
}
