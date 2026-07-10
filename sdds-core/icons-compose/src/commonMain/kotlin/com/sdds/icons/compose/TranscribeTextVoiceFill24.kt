package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TranscribeTextVoiceFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TranscribeTextVoiceFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.0 5.25 c 0.414 0.0 0.75 0.336 0.75 0.75 v 6.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 6.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 6.5 c 0.414 0.0 0.75 0.336 0.75 0.75 v 3.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -3.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 7.25 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 s -0.75 0.336 -0.75 0.75 v 3.5 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 4.75 C 8.0 3.231 9.231 2.0 10.75 2.0 h 8.5 C 20.769 2.0 22.0 3.231 22.0 4.75 v 8.5 c 0.0 1.519 -1.231 2.75 -2.75 2.75 H 15.5 v 3.25 c 0.0 1.519 -1.231 2.75 -2.75 2.75 h -8.0 C 3.231 22.0 2.0 20.769 2.0 19.25 v -8.0 C 2.0 9.731 3.231 8.5 4.75 8.5 H 8.0 V 4.75 Z m 0.0 6.75 H 7.874 L 4.75 19.2 h 1.397 l 0.726 -1.826 h 3.531 l 0.737 1.826 h 1.463 L 11.287 16.0 H 10.75 c -0.34 0.0 -0.665 -0.062 -0.966 -0.174 l 0.114 0.283 h -2.53 l 0.784 -1.956 C 8.053 13.87 8.0 13.566 8.0 13.25 V 11.5 Z m 2.75 -8.0 c -0.69 0.0 -1.25 0.56 -1.25 1.25 v 8.5 c 0.0 0.69 0.56 1.25 1.25 1.25 h 8.5 c 0.69 0.0 1.25 -0.56 1.25 -1.25 v -8.5 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 h -8.5 Z")
        )
    }.build()
}
