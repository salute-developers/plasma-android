package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AlarmCircleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AlarmCircleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.476 1.92 c 0.293 -0.293 0.768 -0.293 1.06 0.0 l 3.536 3.535 c 0.293 0.293 0.293 0.768 0.0 1.061 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -3.536 -3.535 c -0.293 -0.293 -0.293 -0.768 0.0 -1.061 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.516 1.92 c 0.293 0.293 0.293 0.768 0.0 1.06 L 2.981 6.517 c -0.293 0.293 -0.768 0.293 -1.061 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 L 5.455 1.92 c 0.293 -0.293 0.768 -0.293 1.061 0.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.185 18.868 l -1.909 1.908 c -0.292 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 1.908 -1.908 c -1.327 -1.568 -2.128 -3.597 -2.128 -5.812 c 0.0 -4.97 4.03 -9.0 9.0 -9.0 s 9.0 4.03 9.0 9.0 c 0.0 2.47 -0.995 4.707 -2.606 6.334 l 1.386 1.386 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.292 0.293 -0.767 0.293 -1.06 0.0 l -1.47 -1.47 c -1.477 1.064 -3.29 1.69 -5.25 1.69 c -2.215 0.0 -4.243 -0.8 -5.811 -2.128 Z m 5.061 -11.872 c 0.414 0.0 0.75 0.336 0.75 0.75 v 4.25 h 2.75 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -3.25 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 v -4.75 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
    }.build()
}
