package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SortSmallBig24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SortSmallBig24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 17.25 C 3.0 17.664 3.336 18.0 3.75 18.0 h 16.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 3.75 C 3.336 16.5 3.0 16.836 3.0 17.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 12.25 C 3.0 12.664 3.336 13.0 3.75 13.0 h 10.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 3.75 C 3.336 11.5 3.0 11.836 3.0 12.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.75 8.0 C 3.336 8.0 3.0 7.664 3.0 7.25 S 3.336 6.5 3.75 6.5 h 4.5 C 8.664 6.5 9.0 6.836 9.0 7.25 S 8.664 8.0 8.25 8.0 h -4.5 Z")
        )
    }.build()
}
