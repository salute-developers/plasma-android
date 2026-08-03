package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VolumeLevel2Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VolumeLevel2Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 13.19 v -2.38 C 3.0 9.81 3.81 9.0 4.81 9.0 C 5.57 9.0 6.293 8.683 6.808 8.126 l 2.417 -2.619 c 0.864 -0.936 1.296 -1.404 1.67 -1.444 c 0.324 -0.034 0.644 0.091 0.859 0.336 C 12.0 4.682 12.0 5.32 12.0 6.592 v 10.816 c 0.0 1.273 0.0 1.91 -0.247 2.193 c -0.215 0.245 -0.535 0.37 -0.86 0.336 c -0.373 -0.04 -0.805 -0.508 -1.669 -1.444 l -2.417 -2.62 C 6.292 15.318 5.569 15.0 4.81 15.0 C 3.81 15.0 3.0 14.19 3.0 13.19 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.77 5.07 c 0.293 -0.294 0.768 -0.294 1.061 0.0 c 0.905 0.905 1.624 1.98 2.114 3.162 c 0.49 1.183 0.742 2.451 0.742 3.732 c 0.0 1.28 -0.252 2.548 -0.742 3.73 c -0.49 1.184 -1.209 2.258 -2.114 3.164 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 c 0.765 -0.767 1.373 -1.676 1.788 -2.677 c 0.414 -1.001 0.628 -2.074 0.628 -3.158 c 0.0 -1.083 -0.214 -2.156 -0.628 -3.157 c -0.415 -1.0 -1.023 -1.91 -1.789 -2.676 c -0.292 -0.293 -0.292 -0.768 0.0 -1.06 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.97 7.97 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.534 0.534 0.958 1.167 1.247 1.865 c 0.289 0.698 0.438 1.445 0.438 2.2 c 0.0 0.756 -0.15 1.503 -0.438 2.2 c -0.29 0.699 -0.713 1.332 -1.247 1.866 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 c 0.394 -0.395 0.707 -0.864 0.921 -1.38 c 0.214 -0.515 0.324 -1.067 0.324 -1.625 c 0.0 -0.559 -0.11 -1.111 -0.324 -1.627 c -0.214 -0.516 -0.527 -0.984 -0.921 -1.379 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
