package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Menu24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Menu24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 5.75 C 3.0 5.336 3.336 5.0 3.75 5.0 h 16.5 C 20.664 5.0 21.0 5.336 21.0 5.75 S 20.664 6.5 20.25 6.5 H 3.75 C 3.336 6.5 3.0 6.164 3.0 5.75 Z m 0.0 6.0 C 3.0 11.336 3.336 11.0 3.75 11.0 h 16.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 3.75 C 3.336 12.5 3.0 12.164 3.0 11.75 Z m 0.0 6.0 C 3.0 17.336 3.336 17.0 3.75 17.0 h 16.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 3.75 C 3.336 18.5 3.0 18.164 3.0 17.75 Z")
        )
    }.build()
}
