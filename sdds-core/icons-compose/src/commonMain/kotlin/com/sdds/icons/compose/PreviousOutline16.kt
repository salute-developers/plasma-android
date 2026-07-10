package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PreviousOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PreviousOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.025 9.32 c -0.99 -0.605 -0.99 -2.042 0.0 -2.646 l 6.867 -4.194 c 1.032 -0.631 2.357 0.112 2.357 1.322 v 8.389 c 0.0 1.21 -1.325 1.953 -2.357 1.322 L 5.025 9.32 Z m 0.521 -1.793 c -0.351 0.215 -0.351 0.724 0.0 0.939 l 6.867 4.194 c 0.366 0.224 0.836 -0.04 0.836 -0.47 V 3.803 c 0.0 -0.43 -0.47 -0.693 -0.836 -0.47 L 5.546 7.528 Z M 1.75 3.093 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 v 10.156 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 3.093 Z")
        )
    }.build()
}
