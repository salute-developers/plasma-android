package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHoriz10Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHoriz10Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.0 9.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 4.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -1.108 c -0.052 0.288 -0.128 0.532 -0.24 0.753 c -0.308 0.602 -0.797 1.091 -1.4 1.398 c -0.684 0.349 -1.58 0.349 -3.372 0.349 H 7.12 c -1.792 0.0 -2.688 0.0 -3.373 -0.349 c -0.602 -0.307 -1.091 -0.796 -1.398 -1.398 C 2.0 15.068 2.0 14.173 2.0 12.38 v -0.76 c 0.0 -1.792 0.0 -2.688 0.349 -3.373 c 0.307 -0.602 0.796 -1.091 1.398 -1.398 C 4.432 6.5 5.327 6.5 7.12 6.5 h 7.76 c 1.792 0.0 2.688 0.0 3.373 0.349 c 0.602 0.307 1.091 0.796 1.398 1.398 c 0.113 0.221 0.19 0.465 0.24 0.753 H 21.0 Z M 4.5 8.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 6.0 c 0.0 0.552 0.448 1.0 1.0 1.0 H 5.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -7.0 C 5.5 8.224 5.276 8.0 5.0 8.0 H 4.5 Z")
        )
    }.build()
}
