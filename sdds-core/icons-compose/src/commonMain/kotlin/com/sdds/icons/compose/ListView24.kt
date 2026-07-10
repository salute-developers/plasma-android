package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ListView24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ListView24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.0 7.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 S 5.552 5.0 5.0 5.0 S 4.0 5.448 4.0 6.0 s 0.448 1.0 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.816 5.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 11.54 c 0.415 0.0 0.75 -0.336 0.75 -0.75 s -0.335 -0.75 -0.75 -0.75 H 8.817 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.816 11.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 h 11.54 c 0.415 0.0 0.75 -0.336 0.75 -0.75 s -0.335 -0.75 -0.75 -0.75 H 8.817 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.066 18.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 11.54 c 0.415 0.0 0.75 0.336 0.75 0.75 s -0.335 0.75 -0.75 0.75 H 8.817 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 18.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.0 13.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z")
        )
    }.build()
}
