package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.126 2.013 C 5.046 1.482 5.432 1.0 5.939 1.0 h 4.122 c 0.507 0.0 0.894 0.482 0.813 1.013 L 10.384 5.0 l -5.1 5.1 H 4.907 c -0.955 0.0 -1.497 -1.161 -0.918 -1.967 l 1.403 -1.955 c 0.191 -0.266 0.271 -0.605 0.221 -0.936 L 5.126 2.013 Z m 2.192 8.876 v 3.061 L 8.0 15.0 l 0.682 -1.05 V 10.1 h 2.412 c 0.955 0.0 1.497 -1.161 0.918 -1.967 l -0.81 -1.128 l -3.884 3.884 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.445 1.646 c 0.196 0.196 0.196 0.512 0.0 0.708 L 2.566 14.233 c -0.195 0.195 -0.512 0.195 -0.707 0.0 c -0.195 -0.195 -0.195 -0.512 0.0 -0.707 l 11.88 -11.88 c 0.194 -0.195 0.511 -0.195 0.706 0.0 Z")
        )
    }.build()
}
