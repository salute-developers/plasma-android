package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.KeyFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "KeyFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.5 12.824 c 0.0 4.735 -3.861 8.574 -8.625 8.574 c -1.774 0.0 -3.423 -0.533 -4.794 -1.446 c -0.263 -0.175 -0.635 0.004 -0.635 0.32 v 3.362 c 0.0 0.207 -0.169 0.374 -0.376 0.374 h -3.194 c -0.208 0.0 -0.376 0.167 -0.376 0.374 v 2.607 c 0.0 0.207 -0.169 0.374 -0.376 0.374 h -3.66 c -0.208 0.0 -0.377 0.167 -0.377 0.374 v 3.64 c 0.0 0.206 -0.168 0.373 -0.376 0.373 H 4.876 c -0.208 0.0 -0.376 -0.167 -0.376 -0.373 V 25.03 c 0.0 -0.1 0.04 -0.195 0.11 -0.265 l 9.75 -9.692 c 0.094 -0.093 0.13 -0.228 0.101 -0.356 c -0.138 -0.61 -0.21 -1.243 -0.21 -1.894 c 0.0 -4.735 3.86 -8.574 8.624 -8.574 c 4.764 0.0 8.625 3.839 8.625 8.574 Z m -6.75 0.373 c 1.243 0.0 2.25 -1.001 2.25 -2.236 c 0.0 -1.236 -1.007 -2.237 -2.25 -2.237 c -1.242 0.0 -2.25 1.001 -2.25 2.237 c 0.0 1.235 1.008 2.236 2.25 2.236 Z")
        )
    }.build()
}
