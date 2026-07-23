package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ZoomMinusFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ZoomMinusFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.872 10.164 C 11.577 9.302 12.0 8.201 12.0 7.0 c 0.0 -2.761 -2.239 -5.0 -5.0 -5.0 S 2.0 4.239 2.0 7.0 s 2.239 5.0 5.0 5.0 c 1.2 0.0 2.303 -0.423 3.165 -1.129 l 3.531 3.532 c 0.196 0.196 0.512 0.196 0.707 0.0 c 0.196 -0.195 0.196 -0.511 0.0 -0.707 l -3.531 -3.532 Z M 4.199 7.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 4.6 c 0.276 0.0 0.5 0.224 0.5 0.5 S 9.575 7.5 9.3 7.5 H 4.7 C 4.423 7.5 4.2 7.276 4.2 7.0 Z")
        )
    }.build()
}
