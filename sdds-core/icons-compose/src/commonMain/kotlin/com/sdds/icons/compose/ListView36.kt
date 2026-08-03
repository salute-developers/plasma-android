package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ListView36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ListView36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 10.5 C 8.328 10.5 9.0 9.828 9.0 9.0 S 8.328 7.5 7.5 7.5 S 6.0 8.172 6.0 9.0 s 0.672 1.5 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.059 8.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 s 0.447 1.0 1.0 1.0 h 16.933 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 14.059 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.059 17.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 s 0.447 1.0 1.0 1.0 H 30.99 c 0.553 0.0 1.0 -0.448 1.0 -1.0 s -0.447 -1.0 -1.0 -1.0 H 14.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.059 27.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 H 30.99 c 0.553 0.0 1.0 0.448 1.0 1.0 s -0.447 1.0 -1.0 1.0 H 14.06 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 27.0 c 0.0 0.828 -0.672 1.5 -1.5 1.5 S 6.0 27.828 6.0 27.0 s 0.672 -1.5 1.5 -1.5 S 9.0 26.172 9.0 27.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 19.5 C 8.328 19.5 9.0 18.828 9.0 18.0 s -0.672 -1.5 -1.5 -1.5 S 6.0 17.172 6.0 18.0 s 0.672 1.5 1.5 1.5 Z")
        )
    }.build()
}
