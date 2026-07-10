package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowWideLeftOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowWideLeftOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.287 4.057 c 0.28 0.116 0.463 0.39 0.463 0.693 V 8.0 h 9.5 C 21.216 8.0 22.0 8.784 22.0 9.75 v 4.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -9.5 v 3.25 c 0.0 0.303 -0.183 0.577 -0.463 0.693 c -0.28 0.116 -0.603 0.052 -0.817 -0.163 l -7.25 -7.25 c -0.293 -0.292 -0.293 -0.767 0.0 -1.06 l 7.25 -7.25 c 0.214 -0.215 0.537 -0.279 0.817 -0.163 Z M 3.811 12.0 l 5.439 5.44 v -2.19 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 10.25 c 0.138 0.0 0.25 -0.112 0.25 -0.25 v -4.5 c 0.0 -0.138 -0.112 -0.25 -0.25 -0.25 H 10.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 V 6.56 L 3.81 12.0 Z")
        )
    }.build()
}
