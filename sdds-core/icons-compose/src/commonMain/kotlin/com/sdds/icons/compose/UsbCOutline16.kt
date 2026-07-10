package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.UsbCOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "UsbCOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.753 5.25 c -1.52 0.0 -2.751 1.232 -2.751 2.75 c 0.0 1.52 1.232 2.752 2.75 2.752 h 8.496 c 1.519 0.0 2.75 -1.232 2.75 -2.751 c 0.0 -1.52 -1.231 -2.751 -2.75 -2.751 H 3.753 Z M 2.002 8.0 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 h 8.496 c 0.966 0.0 1.75 0.784 1.75 1.75 c 0.0 0.968 -0.784 1.752 -1.75 1.752 H 3.753 C 2.786 9.752 2.002 8.968 2.002 8.0 Z m 2.31 -0.499 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 7.377 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 4.312 Z")
        )
    }.build()
}
