package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherNormalOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherNormalOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.356 4.02 l 0.001 0.03 H 1.75 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 0.928 v 5.545 c 0.0 0.316 0.0 0.54 0.035 0.737 c 0.165 0.929 0.892 1.655 1.821 1.82 c 0.197 0.036 0.42 0.036 0.737 0.036 h 0.05 c 0.276 0.0 0.5 -0.224 0.5 -0.5 c 0.0 -0.277 -0.224 -0.5 -0.5 -0.5 c -0.386 0.0 -0.514 -0.002 -0.612 -0.02 c -0.516 -0.091 -0.92 -0.495 -1.011 -1.011 c -0.018 -0.098 -0.02 -0.226 -0.02 -0.612 V 5.05 h 7.927 v 5.869 c 0.0 0.276 0.224 0.5 0.5 0.5 c 0.277 0.0 0.5 -0.224 0.5 -0.5 v -5.87 h 0.929 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.275 -0.224 -0.5 -0.5 -0.5 H 9.926 l 0.001 -0.03 c 0.0 -1.257 -1.027 -2.269 -2.285 -2.269 c -1.258 0.0 -2.286 1.012 -2.286 2.27 Z m 2.286 -1.27 c -0.714 0.0 -1.286 0.573 -1.286 1.27 v 0.03 h 2.572 V 4.02 c 0.0 -0.697 -0.572 -1.27 -1.286 -1.27 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.463 12.187 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 1.722 c 0.204 0.617 0.786 1.061 1.47 1.061 h 0.4 c 0.686 0.0 1.267 -0.444 1.472 -1.06 h 1.72 c 0.277 0.0 0.5 -0.225 0.5 -0.5 c 0.0 -0.277 -0.223 -0.5 -0.5 -0.5 H 7.464 Z m 3.193 1.061 c -0.09 0.0 -0.176 -0.022 -0.252 -0.06 h 0.903 c -0.075 0.038 -0.161 0.06 -0.252 0.06 h -0.4 Z")
        )
    }.build()
}
