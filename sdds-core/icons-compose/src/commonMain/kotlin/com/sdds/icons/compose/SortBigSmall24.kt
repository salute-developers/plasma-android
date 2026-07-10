package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SortBigSmall24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SortBigSmall24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 6.75 C 3.0 6.336 3.336 6.0 3.75 6.0 h 16.5 C 20.664 6.0 21.0 6.336 21.0 6.75 S 20.664 7.5 20.25 7.5 H 3.75 C 3.336 7.5 3.0 7.164 3.0 6.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 11.75 C 3.0 11.336 3.336 11.0 3.75 11.0 h 10.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 3.75 C 3.336 12.5 3.0 12.164 3.0 11.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.75 16.0 C 3.336 16.0 3.0 16.336 3.0 16.75 s 0.336 0.75 0.75 0.75 h 4.5 C 8.664 17.5 9.0 17.164 9.0 16.75 S 8.664 16.0 8.25 16.0 h -4.5 Z")
        )
    }.build()
}
