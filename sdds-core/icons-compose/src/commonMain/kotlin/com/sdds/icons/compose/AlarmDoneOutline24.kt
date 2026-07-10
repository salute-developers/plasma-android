package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AlarmDoneOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AlarmDoneOutline24",
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
            pathData = addPathNodes("M 16.28 10.03 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -4.72 4.72 l -1.47 -1.47 c -0.292 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 2.0 2.0 c 0.293 0.293 0.768 0.293 1.06 0.0 l 5.25 -5.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 12.0 c 0.0 -4.97 4.03 -9.0 9.0 -9.0 s 9.0 4.03 9.0 9.0 c 0.0 2.47 -0.996 4.708 -2.606 6.334 l 1.386 1.386 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 l -1.47 -1.47 C 15.773 20.375 13.96 21.0 12.0 21.0 c -2.215 0.0 -4.244 -0.8 -5.812 -2.128 L 4.28 20.78 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 l 1.908 -1.908 C 3.8 16.244 3.0 14.215 3.0 12.0 Z m 9.0 -7.5 c -4.142 0.0 -7.5 3.358 -7.5 7.5 c 0.0 2.071 0.839 3.945 2.197 5.303 S 9.929 19.5 12.0 19.5 c 1.84 0.0 3.524 -0.662 4.83 -1.761 c 1.634 -1.377 2.67 -3.437 2.67 -5.739 c 0.0 -4.142 -3.358 -7.5 -7.5 -7.5 Z")
        )
    }.build()
}
