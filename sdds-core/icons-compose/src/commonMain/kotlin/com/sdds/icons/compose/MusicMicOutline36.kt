package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicMicOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicMicOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.893 5.996 c -3.37 0.0 -6.104 2.733 -6.104 6.105 c 0.0 3.372 2.733 6.105 6.104 6.105 c 3.372 0.0 6.105 -2.733 6.105 -6.105 c 0.0 -3.372 -2.733 -6.105 -6.105 -6.105 Z m -8.104 6.105 c 0.0 -4.476 3.629 -8.105 8.104 -8.105 c 4.476 0.0 8.105 3.629 8.105 8.105 c 0.0 4.476 -3.629 8.105 -8.105 8.105 c -0.485 0.0 -0.96 -0.043 -1.422 -0.125 l -11.613 9.903 c -0.694 0.593 -1.727 0.552 -2.373 -0.094 l -0.483 -0.483 l -2.295 2.295 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 l 2.295 -2.295 l -0.485 -0.484 c -0.645 -0.646 -0.686 -1.679 -0.094 -2.373 l 9.904 -11.617 c -0.081 -0.46 -0.124 -0.933 -0.124 -1.417 Z m 0.86 3.637 c 0.782 1.555 2.05 2.823 3.604 3.606 L 9.736 28.313 L 7.68 26.257 l 8.969 -10.52 Z")
        )
    }.build()
}
