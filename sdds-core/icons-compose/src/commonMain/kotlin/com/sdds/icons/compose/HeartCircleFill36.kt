package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HeartCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HeartCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z M 9.0 15.276 c 0.0 -2.152 1.836 -4.776 4.83 -4.776 c 1.67 0.0 3.099 1.336 4.17 2.605 c 1.071 -1.269 2.5 -2.605 4.17 -2.605 c 2.993 0.0 4.83 2.624 4.83 4.776 c 0.0 4.09 -4.073 7.92 -7.587 10.655 c -0.486 0.379 -0.73 0.568 -1.02 0.647 c -0.248 0.067 -0.538 0.067 -0.785 0.0 c -0.291 -0.08 -0.535 -0.268 -1.021 -0.647 C 13.073 23.196 9.0 19.365 9.0 15.276 Z")
        )
    }.build()
}
