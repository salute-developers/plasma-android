package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PlayCircleOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PlayCircleOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.625 16.547 l 6.0 -3.465 c 0.833 -0.48 0.833 -1.683 0.0 -2.165 l -6.0 -3.464 C 9.792 6.973 8.75 7.573 8.75 8.536 v 6.928 c 0.0 0.962 1.042 1.564 1.875 1.083 Z M 10.25 8.969 L 15.5 12.0 l -5.25 3.031 V 8.97 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z M 3.5 12.0 c 0.0 -4.694 3.806 -8.5 8.5 -8.5 s 8.5 3.806 8.5 8.5 s -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 Z")
        )
    }.build()
}
