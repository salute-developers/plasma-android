package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FocusOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FocusOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.5 1.5 c -3.314 0.0 -6.0 2.686 -6.0 6.0 s 2.686 6.0 6.0 6.0 s 6.0 -2.686 6.0 -6.0 s -2.686 -6.0 -6.0 -6.0 Z m -7.0 6.0 c 0.0 -3.866 3.134 -7.0 7.0 -7.0 s 7.0 3.134 7.0 7.0 s -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.311 7.5 c 0.0 1.552 -1.258 2.81 -2.81 2.81 c -1.553 0.0 -2.812 -1.258 -2.812 -2.81 c 0.0 -1.553 1.259 -2.811 2.811 -2.811 c 1.553 0.0 2.811 1.258 2.811 2.81 Z")
        )
    }.build()
}
