package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ListView16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ListView16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.25 4.75 C 3.664 4.75 4.0 4.414 4.0 4.0 S 3.664 3.25 3.25 3.25 S 2.5 3.586 2.5 4.0 s 0.336 0.75 0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 3.5 C 5.724 3.5 5.5 3.724 5.5 4.0 S 5.724 4.5 6.0 4.5 h 8.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 14.276 3.5 14.0 3.5 H 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 7.5 C 5.724 7.5 5.5 7.724 5.5 8.0 S 5.724 8.5 6.0 8.5 h 8.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 14.276 7.5 14.0 7.5 H 6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.5 12.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 8.0 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 6.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.895 12.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 c -0.415 0.0 -0.75 -0.336 -0.75 -0.75 s 0.335 -0.75 0.75 -0.75 c 0.414 0.0 0.75 0.336 0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.148 8.757 c 0.415 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.415 -0.335 -0.75 -0.75 -0.75 c -0.414 0.0 -0.75 0.335 -0.75 0.75 c 0.0 0.414 0.336 0.75 0.75 0.75 Z")
        )
    }.build()
}
