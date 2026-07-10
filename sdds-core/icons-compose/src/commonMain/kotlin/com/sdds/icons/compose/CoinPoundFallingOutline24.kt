package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinPoundFallingOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinPoundFallingOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.75 3.75 C 16.75 3.336 16.414 3.0 16.0 3.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 15.25 6.664 15.586 7.0 16.0 7.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 2.75 C 12.75 2.336 12.414 2.0 12.0 2.0 s -0.75 0.336 -0.75 0.75 v 2.5 C 11.25 5.664 11.586 6.0 12.0 6.0 s 0.75 -0.336 0.75 -0.75 v -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.0 3.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 2.5 C 8.75 6.664 8.414 7.0 8.0 7.0 S 7.25 6.664 7.25 6.25 v -2.5 C 7.25 3.336 7.586 3.0 8.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 11.0 C 8.776 11.0 9.0 11.224 9.0 11.5 V 17.0 h 2.3 c 0.276 0.0 0.5 0.224 0.5 0.5 S 11.576 18.0 11.3 18.0 H 8.6 C 8.269 18.0 8.0 17.731 8.0 17.4 v -5.9 C 8.0 11.224 8.224 11.0 8.5 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.267 12.0 H 13.2 v 1.88 h 2.067 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 13.2 V 17.0 h 2.3 c 0.276 0.0 0.5 0.224 0.5 0.5 S 15.776 18.0 15.5 18.0 h -2.7 c -0.331 0.0 -0.6 -0.269 -0.6 -0.6 v -5.9 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 2.567 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.5 14.5 c 0.0 -4.142 -3.358 -7.5 -7.5 -7.5 c -4.142 0.0 -7.5 3.358 -7.5 7.5 c 0.0 4.142 3.358 7.5 7.5 7.5 c 4.142 0.0 7.5 -3.358 7.5 -7.5 Z m -7.5 -6.0 c 3.314 0.0 6.0 2.686 6.0 6.0 s -2.686 6.0 -6.0 6.0 s -6.0 -2.686 -6.0 -6.0 s 2.686 -6.0 6.0 -6.0 Z")
        )
    }.build()
}
