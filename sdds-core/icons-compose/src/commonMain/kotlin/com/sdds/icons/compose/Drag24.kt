package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Drag24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Drag24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.72 4.25 C 5.72 3.007 6.727 2.0 7.97 2.0 s 2.25 1.007 2.25 2.25 S 9.213 6.5 7.97 6.5 S 5.72 5.493 5.72 4.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.72 12.0 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 s 2.25 1.007 2.25 2.25 s -1.007 2.25 -2.25 2.25 S 5.72 13.243 5.72 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.97 17.5 c -1.243 0.0 -2.25 1.007 -2.25 2.25 S 6.727 22.0 7.97 22.0 s 2.25 -1.007 2.25 -2.25 s -1.007 -2.25 -2.25 -2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.72 4.25 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 s 2.25 1.007 2.25 2.25 s -1.007 2.25 -2.25 2.25 s -2.25 -1.007 -2.25 -2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.97 9.75 c -1.243 0.0 -2.25 1.007 -2.25 2.25 s 1.007 2.25 2.25 2.25 s 2.25 -1.007 2.25 -2.25 s -1.007 -2.25 -2.25 -2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.72 19.75 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 s 2.25 1.007 2.25 2.25 S 17.213 22.0 15.97 22.0 s -2.25 -1.007 -2.25 -2.25 Z")
        )
    }.build()
}
