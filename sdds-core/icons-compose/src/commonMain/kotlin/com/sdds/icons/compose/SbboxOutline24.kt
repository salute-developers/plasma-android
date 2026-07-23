package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.249 2.984 c -0.098 -0.097 -0.256 -0.097 -0.354 0.0 l -1.591 1.591 c -0.33 0.33 -0.381 0.832 -0.154 1.216 l -3.913 3.912 c -0.505 -0.495 -0.906 -0.85 -1.345 -1.066 c -1.046 -0.516 -2.272 -0.516 -3.318 0.0 C 8.017 8.912 7.523 9.407 6.8 10.13 l -2.68 2.68 c -0.724 0.723 -1.218 1.217 -1.493 1.774 c -0.516 1.046 -0.516 2.272 0.0 3.317 c 0.275 0.558 0.77 1.052 1.493 1.775 l 0.205 0.205 c 0.723 0.723 1.217 1.218 1.774 1.493 c 1.046 0.515 2.272 0.515 3.318 0.0 c 0.557 -0.275 1.051 -0.77 1.774 -1.493 l 2.68 -2.68 c 0.723 -0.723 1.218 -1.217 1.493 -1.775 c 0.516 -1.045 0.516 -2.271 0.0 -3.317 c -0.217 -0.44 -0.57 -0.84 -1.066 -1.345 L 18.21 6.85 c 0.384 0.227 0.886 0.175 1.215 -0.154 l 1.591 -1.591 c 0.098 -0.098 0.098 -0.256 0.0 -0.354 L 19.25 2.984 Z m -6.541 8.309 c -0.866 -0.866 -1.175 -1.16 -1.48 -1.31 c -0.627 -0.31 -1.363 -0.31 -1.99 0.0 c -0.305 0.15 -0.614 0.444 -1.48 1.31 l -2.475 2.475 c -0.866 0.866 -1.16 1.174 -1.31 1.48 c -0.31 0.627 -0.31 1.362 0.0 1.99 c 0.15 0.305 0.444 0.614 1.31 1.48 c 0.866 0.865 1.175 1.16 1.48 1.31 c 0.627 0.31 1.363 0.31 1.99 0.0 c 0.305 -0.15 0.614 -0.445 1.48 -1.31 l 2.475 -2.475 c 0.866 -0.866 1.16 -1.175 1.31 -1.48 c 0.31 -0.627 0.31 -1.363 0.0 -1.99 c -0.15 -0.306 -0.444 -0.614 -1.31 -1.48 Z")
        )
    }.build()
}
