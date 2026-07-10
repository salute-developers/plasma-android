package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LocationPinFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LocationPinFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.0 C 4.962 1.0 2.5 3.507 2.5 6.6 c 0.0 2.112 1.17 4.07 2.353 5.52 c 1.195 1.465 2.476 2.499 2.838 2.775 c 0.183 0.14 0.435 0.14 0.618 0.0 c 0.362 -0.276 1.643 -1.31 2.838 -2.775 C 12.33 10.67 13.5 8.712 13.5 6.6 C 13.5 3.507 11.038 1.0 8.0 1.0 Z m 0.0 8.05 c 1.329 0.0 2.406 -1.097 2.406 -2.45 c 0.0 -1.353 -1.077 -2.45 -2.406 -2.45 c -1.329 0.0 -2.406 1.097 -2.406 2.45 C 5.594 7.953 6.67 9.05 8.0 9.05 Z")
        )
    }.build()
}
