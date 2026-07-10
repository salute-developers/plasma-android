package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Drag36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Drag36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.35 6.375 c 0.0 1.864 -1.511 3.375 -3.375 3.375 S 8.6 8.239 8.6 6.375 S 10.111 3.0 11.975 3.0 s 3.375 1.511 3.375 3.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.35 6.375 c 0.0 1.864 -1.511 3.375 -3.375 3.375 S 20.6 8.239 20.6 6.375 S 22.111 3.0 23.975 3.0 s 3.375 1.511 3.375 3.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.35 18.0 c 0.0 1.864 -1.511 3.375 -3.375 3.375 S 8.6 19.864 8.6 18.0 s 1.511 -3.375 3.375 -3.375 S 15.35 16.136 15.35 18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.35 18.0 c 0.0 1.864 -1.511 3.375 -3.375 3.375 S 20.6 19.864 20.6 18.0 s 1.511 -3.375 3.375 -3.375 S 27.35 16.136 27.35 18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.35 29.625 c 0.0 1.864 -1.511 3.375 -3.375 3.375 S 8.6 31.489 8.6 29.625 s 1.511 -3.375 3.375 -3.375 s 3.375 1.511 3.375 3.375 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 27.35 29.625 c 0.0 1.864 -1.511 3.375 -3.375 3.375 S 20.6 31.489 20.6 29.625 s 1.511 -3.375 3.375 -3.375 s 3.375 1.511 3.375 3.375 Z")
        )
    }.build()
}
