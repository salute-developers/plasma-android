package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CallCircleEndFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CallCircleEndFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z m 2.47 -5.326 c 0.739 0.136 1.73 0.172 1.73 -0.618 c 0.0 -0.63 0.0 -3.153 -4.2 -3.153 S 3.8 8.426 3.8 9.056 c 0.0 0.79 0.991 0.754 1.73 0.618 c 0.22 -0.041 0.33 -0.061 0.422 -0.113 c 0.1 -0.056 0.138 -0.09 0.204 -0.183 C 6.217 9.293 6.28 9.085 6.404 8.67 C 6.557 8.156 6.962 7.586 8.0 7.586 s 1.443 0.57 1.596 1.084 c 0.125 0.415 0.187 0.623 0.248 0.708 c 0.066 0.094 0.104 0.127 0.204 0.183 c 0.091 0.052 0.201 0.072 0.422 0.113 Z")
        )
    }.build()
}
