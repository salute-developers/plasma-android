package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbportalFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbportalFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 21.0 7.898 c 0.0 1.657 -1.343 3.0 -3.0 3.0 s -3.0 -1.343 -3.0 -3.0 c 0.0 -1.656 1.343 -3.0 3.0 -3.0 s 3.0 1.344 3.0 3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 12.398 c 2.485 0.0 4.5 -2.015 4.5 -4.5 c 0.0 -0.255 -0.021 -0.506 -0.062 -0.75 h 7.937 c 1.45 0.0 2.625 1.175 2.625 2.625 v 14.25 c 0.0 1.45 -1.175 2.625 -2.625 2.625 H 5.625 C 4.175 26.648 3.0 25.473 3.0 24.023 V 9.773 c 0.0 -1.45 1.175 -2.625 2.625 -2.625 h 7.937 c -0.04 0.244 -0.062 0.495 -0.062 0.75 c 0.0 2.485 2.015 4.5 4.5 4.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.0 31.148 c -2.813 0.0 -5.359 -1.148 -7.194 -3.0 h 14.388 c -1.835 1.852 -4.38 3.0 -7.194 3.0 Z")
        )
    }.build()
}
