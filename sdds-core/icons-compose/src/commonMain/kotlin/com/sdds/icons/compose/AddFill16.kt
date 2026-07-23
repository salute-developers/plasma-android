package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AddFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AddFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.698 3.25 c 0.0 -0.966 0.783 -1.75 1.75 -1.75 h 7.303 c 0.967 0.0 1.75 0.784 1.75 1.75 v 7.238 c 0.0 0.966 -0.783 1.75 -1.75 1.75 H 5.449 c -0.967 0.0 -1.75 -0.784 -1.75 -1.75 V 3.25 Z m 5.401 0.434 c 0.276 0.0 0.5 0.223 0.5 0.5 v 2.184 h 2.2 c 0.277 0.0 0.5 0.224 0.5 0.5 s -0.223 0.5 -0.5 0.5 H 9.607 l 0.029 2.178 c 0.004 0.276 -0.217 0.503 -0.493 0.506 c -0.276 0.004 -0.503 -0.217 -0.507 -0.493 l -0.03 -2.191 H 6.399 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 H 8.6 V 4.184 c 0.0 -0.277 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.5 5.411 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 s -0.5 0.224 -0.5 0.5 v 6.84 c 0.0 1.243 1.007 2.25 2.25 2.25 h 6.893 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 3.75 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 v -6.84 Z")
        )
    }.build()
}
