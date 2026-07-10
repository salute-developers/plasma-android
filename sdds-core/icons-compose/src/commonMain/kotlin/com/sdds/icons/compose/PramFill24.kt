package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PramFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PramFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 2.75 C 12.75 2.336 13.086 2.0 13.5 2.0 c 3.866 0.0 7.0 3.134 7.0 7.0 c 0.0 0.38 -0.03 0.754 -0.09 1.12 C 19.876 13.452 16.986 16.0 13.5 16.0 h -3.0 c -3.262 0.0 -6.002 -2.23 -6.78 -5.25 H 3.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 9.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -6.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.5 18.75 c 0.0 -1.243 1.007 -2.25 2.25 -2.25 S 20.0 17.507 20.0 18.75 S 18.993 21.0 17.75 21.0 s -2.25 -1.007 -2.25 -2.25 Z M 17.75 18.0 C 17.336 18.0 17.0 18.336 17.0 18.75 s 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 S 18.164 18.0 17.75 18.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.25 16.5 C 5.007 16.5 4.0 17.507 4.0 18.75 S 5.007 21.0 6.25 21.0 s 2.25 -1.007 2.25 -2.25 s -1.007 -2.25 -2.25 -2.25 Z M 5.5 18.75 C 5.5 18.336 5.836 18.0 6.25 18.0 S 7.0 18.336 7.0 18.75 S 6.664 19.5 6.25 19.5 S 5.5 19.164 5.5 18.75 Z")
        )
    }.build()
}
