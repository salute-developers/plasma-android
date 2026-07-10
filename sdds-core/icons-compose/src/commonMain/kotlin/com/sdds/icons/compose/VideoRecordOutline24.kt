package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoRecordOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoRecordOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.61 c -4.634 0.0 -8.39 3.756 -8.39 8.39 s 3.756 8.39 8.39 8.39 s 8.39 -3.756 8.39 -8.39 S 16.635 3.61 12.0 3.61 Z M 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.598 12.0 c 0.0 2.54 -2.059 4.598 -4.598 4.598 c -2.54 0.0 -4.598 -2.059 -4.598 -4.598 c 0.0 -2.54 2.059 -4.598 4.598 -4.598 c 2.54 0.0 4.598 2.059 4.598 4.598 Z")
        )
    }.build()
}
