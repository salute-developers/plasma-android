package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FilterFunnelOffOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FilterFunnelOffOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.988 9.832 c -0.096 2.412 -1.21 4.676 -3.08 6.219 l -4.526 3.731 c -0.46 0.38 -0.728 0.946 -0.728 1.543 v 8.145 c 0.0 0.445 -0.294 0.837 -0.722 0.96 l -5.31 1.53 c -0.303 0.087 -0.628 0.027 -0.879 -0.162 c -0.25 -0.189 -0.398 -0.485 -0.398 -0.799 v -5.522 l 2.0 -2.0 v 6.193 l 3.31 -0.953 v -7.392 c 0.0 -0.49 0.09 -0.971 0.261 -1.42 l 3.89 -3.89 l 1.829 -1.507 c 0.64 -0.527 1.162 -1.166 1.553 -1.874 l 2.8 -2.802 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.0 4.0 c 0.339 0.0 0.639 0.17 0.82 0.429 c 0.392 -0.325 0.975 -0.304 1.343 0.064 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 31.363 c -0.39 0.39 -1.023 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.024 0.0 -1.415 l 9.72 -9.72 c -0.109 -0.166 -0.24 -0.317 -0.396 -0.446 l -4.525 -3.731 c -1.836 -1.514 -2.946 -3.723 -3.078 -6.084 L 6.0 9.493 V 5.0 l 0.005 -0.103 C 6.056 4.393 6.482 4.0 7.0 4.0 h 22.0 Z M 8.0 9.493 l 0.01 0.362 c 0.1 1.806 0.95 3.495 2.354 4.653 l 4.526 3.731 c 0.204 0.169 0.389 0.357 0.553 0.559 l 7.829 -7.827 h -4.134 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 h 5.31 c 0.23 0.0 0.443 0.079 0.612 0.21 L 28.0 6.242 V 6.0 H 8.0 v 3.493 Z")
        )
    }.build()
}
