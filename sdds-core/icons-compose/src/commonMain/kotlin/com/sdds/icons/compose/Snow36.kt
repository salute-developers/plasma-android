package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Snow36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Snow36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.768 3.874 c -0.346 -0.43 -0.976 -0.5 -1.406 -0.154 c -0.43 0.346 -0.5 0.976 -0.153 1.406 L 17.0 8.602 v 7.67 l -6.674 -3.837 L 8.7 8.287 C 8.498 7.774 7.917 7.522 7.402 7.723 c -0.515 0.202 -0.77 0.781 -0.568 1.295 l 1.298 3.309 l -3.527 0.535 c -0.547 0.083 -0.924 0.592 -0.842 1.137 c 0.082 0.545 0.593 0.92 1.14 0.837 l 4.42 -0.67 l 6.67 3.833 l -6.671 3.836 l -4.421 -0.67 C 4.354 21.08 3.843 21.455 3.76 22.0 c -0.082 0.545 0.295 1.054 0.842 1.137 l 3.527 0.535 l -1.298 3.31 C 6.63 27.494 6.885 28.074 7.4 28.276 c 0.515 0.201 1.096 -0.051 1.298 -0.564 l 1.627 -4.148 l 6.676 -3.838 v 7.671 l -2.792 3.476 c -0.346 0.43 -0.278 1.06 0.153 1.406 c 0.43 0.346 1.06 0.277 1.406 -0.154 L 18.0 29.346 l 2.233 2.78 c 0.346 0.43 0.976 0.5 1.406 0.154 c 0.431 -0.346 0.5 -0.976 0.154 -1.406 L 19.0 27.398 V 19.73 l 6.673 3.836 l 1.627 4.148 c 0.202 0.513 0.783 0.766 1.298 0.564 c 0.515 -0.202 0.77 -0.781 0.568 -1.294 l -1.298 -3.31 l 3.527 -0.534 c 0.547 -0.084 0.924 -0.593 0.842 -1.138 c -0.082 -0.545 -0.593 -0.92 -1.14 -0.836 l -4.421 0.67 L 20.004 18.0 l 6.673 -3.836 l 4.421 0.67 c 0.547 0.084 1.057 -0.29 1.14 -0.836 c 0.082 -0.545 -0.295 -1.054 -0.842 -1.137 l -3.527 -0.535 l 1.298 -3.31 c 0.201 -0.512 -0.053 -1.092 -0.568 -1.294 c -0.516 -0.201 -1.096 0.051 -1.298 0.564 l -1.627 4.148 L 19.0 16.27 V 8.602 l 2.793 -3.476 c 0.346 -0.43 0.277 -1.06 -0.154 -1.406 c -0.43 -0.345 -1.06 -0.277 -1.405 0.154 L 18.0 6.654 l -2.233 -2.78 Z")
        )
    }.build()
}
