package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbSbOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbSbOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.4 6.575 C 2.4 3.496 4.896 1.0 7.975 1.0 s 5.575 2.496 5.575 5.575 s -2.496 5.575 -5.575 5.575 c -3.08 0.0 -5.575 -2.496 -5.575 -5.575 Z M 7.975 2.0 C 5.448 2.0 3.4 4.048 3.4 6.575 s 2.048 4.575 4.575 4.575 s 4.575 -2.048 4.575 -4.575 c 0.0 -0.268 -0.023 -0.53 -0.067 -0.786 L 9.775 7.785 L 7.333 6.253 V 4.411 l 2.442 1.531 l 2.187 -1.612 C 11.178 2.94 9.686 2.0 7.975 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.525 13.224 c 0.0 -0.235 0.244 -0.37 0.468 -0.3 c 0.626 0.195 1.292 0.3 1.982 0.3 s 1.356 -0.105 1.982 -0.3 c 0.224 -0.07 0.468 0.065 0.468 0.3 c 0.0 1.353 -1.097 2.45 -2.45 2.45 c -1.353 0.0 -2.45 -1.097 -2.45 -2.45 Z")
        )
    }.build()
}
