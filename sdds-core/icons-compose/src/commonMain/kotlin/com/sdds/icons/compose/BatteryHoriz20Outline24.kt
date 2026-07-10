package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHoriz20Outline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHoriz20Outline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.0 9.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 4.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -1.045 c -0.044 0.524 -0.131 0.914 -0.304 1.253 c -0.307 0.602 -0.796 1.091 -1.398 1.398 C 17.568 18.0 16.673 18.0 14.88 18.0 H 7.12 c -1.792 0.0 -2.688 0.0 -3.373 -0.349 c -0.602 -0.307 -1.091 -0.796 -1.398 -1.398 C 2.0 15.568 2.0 14.673 2.0 12.88 v -1.76 c 0.0 -1.792 0.0 -2.688 0.349 -3.373 c 0.307 -0.602 0.796 -1.091 1.398 -1.398 C 4.432 6.0 5.327 6.0 7.12 6.0 h 7.76 c 1.792 0.0 2.688 0.0 3.373 0.349 c 0.602 0.307 1.091 0.796 1.398 1.398 c 0.173 0.339 0.26 0.729 0.304 1.253 H 21.0 Z m -2.5 0.5 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 h -11.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 v 5.0 c 0.0 1.105 0.895 2.0 2.0 2.0 h 11.0 c 1.105 0.0 2.0 -0.895 2.0 -2.0 v -5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.5 9.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 0.5 C 5.776 8.5 6.0 8.724 6.0 9.0 v 6.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 5.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 9.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.8 9.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 0.5 c 0.276 0.0 0.5 0.224 0.5 0.5 v 6.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 7.3 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 V 9.0 Z")
        )
    }.build()
}
