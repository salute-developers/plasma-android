package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoOffOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoOffOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.702 6.712 c 0.393 -0.388 0.398 -1.021 0.01 -1.414 S 29.69 4.9 29.298 5.288 l -6.057 5.974 C 22.557 9.919 21.16 9.0 19.55 9.0 H 7.139 C 4.852 9.0 3.0 10.853 3.0 13.138 v 9.724 C 3.0 25.147 4.852 27.0 7.138 27.0 h 0.145 l -2.985 2.944 c -0.393 0.388 -0.398 1.021 -0.01 1.414 s 1.02 0.398 1.414 0.01 l 25.0 -24.656 Z M 9.311 25.0 l 12.354 -12.185 C 21.51 11.788 20.623 11.0 19.552 11.0 H 7.138 C 5.957 11.0 5.0 11.957 5.0 13.138 v 9.724 C 5.0 24.042 5.957 25.0 7.138 25.0 H 9.31 Z m 10.24 0.0 h -4.73 l -2.0 2.0 h 6.73 c 2.286 0.0 4.138 -1.853 4.138 -4.138 v -6.73 l -2.0 2.0 v 4.73 c 0.0 1.18 -0.957 2.138 -2.137 2.138 Z m 13.45 -11.801 c 0.0 -1.273 -1.54 -1.91 -2.44 -1.01 l -4.838 4.838 c -0.543 0.543 -0.56 1.419 -0.037 1.982 l 4.838 5.215 C 31.408 25.176 33.0 24.551 33.0 23.253 V 13.199 Z")
        )
    }.build()
}
