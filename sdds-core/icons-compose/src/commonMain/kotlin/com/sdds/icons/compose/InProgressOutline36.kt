package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.InProgressOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "InProgressOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 24.588 13.615 c 2.421 0.0 4.385 1.963 4.385 4.385 c 0.0 2.421 -1.964 4.385 -4.385 4.385 c -2.422 0.0 -4.385 -1.963 -4.385 -4.385 c 0.0 -2.422 1.963 -4.385 4.385 -4.385 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.247 15.808 c 1.21 0.0 2.192 0.981 2.193 2.192 c 0.0 1.21 -0.982 2.192 -2.193 2.192 c -1.21 0.0 -2.192 -0.981 -2.192 -2.192 c 0.0 -1.21 0.981 -2.192 2.192 -2.192 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.821 15.808 c 1.211 0.0 2.193 0.981 2.193 2.192 c 0.0 1.21 -0.982 2.192 -2.193 2.192 c -1.21 0.0 -2.192 -0.981 -2.192 -2.192 c 0.0 -1.21 0.982 -2.192 2.192 -2.192 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 c 0.0 8.284 -6.716 15.0 -15.0 15.0 c -8.284 0.0 -15.0 -6.716 -15.0 -15.0 C 3.0 9.716 9.716 3.0 18.0 3.0 Z m 0.0 2.0 C 10.82 5.0 5.0 10.82 5.0 18.0 s 5.82 13.0 13.0 13.0 s 13.0 -5.82 13.0 -13.0 S 25.18 5.0 18.0 5.0 Z")
        )
    }.build()
}
