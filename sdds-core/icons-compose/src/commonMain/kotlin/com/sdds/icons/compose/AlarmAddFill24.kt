package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AlarmAddFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AlarmAddFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.48 1.924 c 0.293 -0.293 0.768 -0.293 1.06 0.0 l 3.536 3.535 c 0.293 0.293 0.293 0.768 0.0 1.061 c -0.293 0.293 -0.768 0.293 -1.06 0.0 L 17.48 2.984 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.52 1.924 c 0.293 0.293 0.293 0.768 0.0 1.06 L 2.984 6.52 c -0.292 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 l 3.535 -3.536 c 0.293 -0.293 0.768 -0.293 1.061 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.188 18.872 L 4.28 20.78 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 1.908 -1.908 C 3.8 16.244 3.0 14.215 3.0 12.0 c 0.0 -4.97 4.03 -9.0 9.0 -9.0 s 9.0 4.03 9.0 9.0 c 0.0 2.47 -0.995 4.707 -2.606 6.334 l 1.386 1.386 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -1.47 -1.47 C 15.773 20.375 13.96 21.0 12.0 21.0 c -2.215 0.0 -4.244 -0.8 -5.812 -2.128 Z M 12.0 7.0 c 0.414 0.0 0.75 0.336 0.75 0.75 v 3.5 h 3.5 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -3.5 v 3.5 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -3.5 h -3.5 C 7.336 12.75 7.0 12.414 7.0 12.0 s 0.336 -0.75 0.75 -0.75 h 3.5 v -3.5 C 11.25 7.336 11.586 7.0 12.0 7.0 Z")
        )
    }.build()
}
