package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneDouble16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneDouble16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 12.386 3.891 c 0.199 0.192 0.204 0.509 0.012 0.707 l -7.27 7.5 C 5.034 12.195 4.905 12.25 4.77 12.25 c -0.135 0.0 -0.265 -0.055 -0.359 -0.152 L 1.641 9.241 C 1.449 9.043 1.454 8.726 1.652 8.534 c 0.198 -0.192 0.515 -0.187 0.707 0.01 l 2.41 2.488 l 6.91 -7.13 c 0.193 -0.198 0.51 -0.203 0.707 -0.011 Z m 3.462 0.0 c 0.198 0.192 0.203 0.509 0.011 0.707 l -7.27 7.5 c -0.191 0.198 -0.508 0.203 -0.706 0.011 c -0.199 -0.192 -0.203 -0.509 -0.011 -0.707 l 7.269 -7.5 c 0.192 -0.198 0.509 -0.203 0.707 -0.011 Z")
            )
        }
    }.build()
}
