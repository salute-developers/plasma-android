package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPointOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPointOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 15.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 s -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.75 2.75 C 12.75 2.336 12.414 2.0 12.0 2.0 s -0.75 0.336 -0.75 0.75 v 1.787 c -3.543 0.352 -6.361 3.17 -6.713 6.713 H 2.75 C 2.336 11.25 2.0 11.586 2.0 12.0 s 0.336 0.75 0.75 0.75 h 1.787 c 0.352 3.543 3.17 6.361 6.713 6.713 v 1.787 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -1.787 c 3.543 -0.352 6.361 -3.17 6.713 -6.713 h 1.787 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -1.787 c -0.352 -3.543 -3.17 -6.361 -6.713 -6.713 V 2.75 Z M 6.0 12.0 c 0.0 -3.314 2.686 -6.0 6.0 -6.0 s 6.0 2.686 6.0 6.0 s -2.686 6.0 -6.0 6.0 s -6.0 -2.686 -6.0 -6.0 Z")
        )
    }.build()
}
