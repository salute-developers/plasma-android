package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DisclosureLeftFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DisclosureLeftFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.498 11.425 c 0.177 -0.081 0.29 -0.259 0.29 -0.454 v -6.0 c 0.0 -0.195 -0.113 -0.372 -0.29 -0.454 C 9.32 4.435 9.11 4.464 8.963 4.592 l -3.5 3.0 C 5.353 7.687 5.29 7.825 5.29 7.972 c 0.0 0.145 0.063 0.284 0.174 0.379 l 3.5 3.0 c 0.148 0.127 0.357 0.156 0.535 0.074 Z")
        )
    }.build()
}
