package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MuteFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MuteFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.896 5.135 l -0.065 -0.066 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 c -0.294 0.293 -0.294 0.768 0.0 1.06 l 0.064 0.067 l 1.061 -1.061 Z m -2.85 2.85 L 16.03 7.97 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 0.015 0.016 l 1.06 -1.06 Z m -0.2 2.32 l 1.115 -1.114 c 0.119 0.207 0.224 0.423 0.316 0.644 c 0.289 0.698 0.437 1.445 0.437 2.2 c 0.0 0.756 -0.148 1.503 -0.437 2.2 c -0.29 0.699 -0.713 1.332 -1.247 1.866 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 c 0.394 -0.395 0.707 -0.864 0.92 -1.38 c 0.214 -0.515 0.324 -1.067 0.324 -1.625 c 0.0 -0.559 -0.11 -1.111 -0.323 -1.627 c -0.014 -0.035 -0.03 -0.069 -0.045 -0.103 Z M 12.0 12.032 V 6.592 c 0.0 -1.273 0.0 -1.91 -0.248 -2.193 c -0.214 -0.245 -0.535 -0.37 -0.859 -0.336 c -0.373 0.04 -0.805 0.508 -1.669 1.444 l -2.418 2.62 C 6.292 8.682 5.57 9.0 4.811 9.0 C 3.81 9.0 3.0 9.81 3.0 10.81 v 2.38 c 0.0 1.0 0.81 1.81 1.81 1.81 c 0.759 0.0 1.482 0.317 1.996 0.874 l 0.649 0.702 L 12.0 12.031 Z M 8.473 17.68 L 12.0 14.153 v 3.255 c 0.0 1.273 0.0 1.91 -0.248 2.193 c -0.214 0.245 -0.535 0.37 -0.859 0.336 c -0.373 -0.04 -0.805 -0.508 -1.669 -1.444 l -0.75 -0.814 Z M 18.787 7.366 l 1.077 -1.078 c 0.432 0.603 0.795 1.256 1.08 1.944 c 0.49 1.183 0.743 2.451 0.743 3.732 c 0.0 1.28 -0.253 2.548 -0.742 3.73 c -0.49 1.184 -1.209 2.258 -2.114 3.164 c -0.293 0.293 -0.768 0.293 -1.06 0.0 c -0.294 -0.293 -0.294 -0.768 0.0 -1.06 c 0.765 -0.767 1.373 -1.676 1.788 -2.677 c 0.414 -1.001 0.628 -2.074 0.628 -3.158 c 0.0 -1.083 -0.214 -2.156 -0.628 -3.157 c -0.21 -0.505 -0.469 -0.988 -0.772 -1.44 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 20.5 2.47 c 0.294 0.293 0.294 0.767 0.0 1.06 L 3.53 20.5 c -0.293 0.294 -0.767 0.294 -1.06 0.0 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 L 19.44 2.47 c 0.293 -0.293 0.768 -0.293 1.06 0.0 Z")
        )
    }.build()
}
