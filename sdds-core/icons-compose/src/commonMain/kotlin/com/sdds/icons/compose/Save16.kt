package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Save16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Save16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.917 4.028 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 4.166 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 H 5.917 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.85 1.75 c -1.16 0.0 -2.1 0.94 -2.1 2.1 v 8.3 c 0.0 1.16 0.94 2.1 2.1 2.1 h 8.3 c 1.16 0.0 2.1 -0.94 2.1 -2.1 V 5.108 c 0.0 -0.372 -0.148 -0.728 -0.41 -0.99 L 11.882 2.16 c -0.262 -0.263 -0.618 -0.41 -0.99 -0.41 H 3.85 Z m 9.4 10.4 V 5.108 c 0.0 -0.106 -0.042 -0.208 -0.117 -0.283 l -1.958 -1.958 C 11.1 2.792 10.998 2.75 10.892 2.75 H 3.85 c -0.608 0.0 -1.1 0.492 -1.1 1.1 v 8.3 c 0.0 0.607 0.492 1.1 1.1 1.1 h 0.678 V 9.744 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 h 4.844 c 0.58 0.0 1.05 0.47 1.05 1.05 v 3.506 h 0.678 c 0.607 0.0 1.1 -0.492 1.1 -1.1 Z m -2.828 -2.456 H 5.578 c -0.028 0.0 -0.05 0.023 -0.05 0.05 v 3.506 h 4.944 V 9.744 c 0.0 -0.027 -0.022 -0.05 -0.05 -0.05 Z")
        )
    }.build()
}
