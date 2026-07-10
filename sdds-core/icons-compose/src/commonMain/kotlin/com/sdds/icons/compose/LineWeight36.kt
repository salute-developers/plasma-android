package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LineWeight36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LineWeight36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.0 10.5 h 30.0 V 6.0 H 3.0 v 4.5 Z M 33.0 18.0 H 3.0 v -3.0 h 30.0 v 3.0 Z M 3.0 24.75 h 30.0 V 22.5 H 3.0 v 2.25 Z M 3.0 30.0 h 30.0 v -1.5 H 3.0 V 30.0 Z")
        )
    }.build()
}
