package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LoginFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LoginFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.936 29.316 C 15.5 28.46 15.5 27.34 15.5 25.1 V 19.0 h 7.603 l -2.867 2.828 c -0.393 0.388 -0.397 1.021 -0.01 1.414 c 0.389 0.393 1.022 0.398 1.415 0.01 l 4.602 -4.54 c 0.19 -0.188 0.298 -0.445 0.298 -0.712 c 0.0 -0.268 -0.107 -0.524 -0.298 -0.712 l -4.602 -4.54 c -0.393 -0.388 -1.026 -0.384 -1.414 0.009 c -0.388 0.393 -0.384 1.026 0.01 1.414 L 23.102 17.0 H 15.5 v -6.1 c 0.0 -2.24 0.0 -3.36 0.436 -4.216 c 0.384 -0.753 0.995 -1.365 1.748 -1.748 C 18.54 4.5 19.66 4.5 21.9 4.5 h 3.2 c 2.24 0.0 3.36 0.0 4.216 0.436 c 0.753 0.383 1.365 0.995 1.748 1.748 C 31.5 7.54 31.5 8.66 31.5 10.9 v 14.2 c 0.0 2.24 0.0 3.36 -0.436 4.216 c -0.383 0.753 -0.995 1.364 -1.748 1.748 C 28.461 31.5 27.34 31.5 25.1 31.5 h -3.2 c -2.24 0.0 -3.36 0.0 -4.216 -0.436 c -0.753 -0.384 -1.364 -0.995 -1.748 -1.748 Z M 15.5 17.0 H 10.0 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 5.5 v -2.0 Z")
        )
    }.build()
}
