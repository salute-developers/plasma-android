package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AddFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AddFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.725 7.0 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 h 17.277 c 1.657 0.0 3.0 1.343 3.0 3.0 v 17.278 c 0.0 1.657 -1.343 3.0 -3.0 3.0 H 11.725 c -1.657 0.0 -3.0 -1.343 -3.0 -3.0 V 7.0 Z m 11.639 1.82 c 0.552 0.0 1.0 0.447 1.0 1.0 v 4.819 h 4.82 c 0.552 0.0 1.0 0.447 1.0 1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -4.807 l 0.064 4.806 c 0.008 0.552 -0.434 1.006 -0.986 1.013 c -0.552 0.007 -1.006 -0.434 -1.013 -0.987 l -0.065 -4.832 h -4.833 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 h 4.82 v -4.82 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 Z M 6.0 11.45 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 16.553 c 0.0 2.209 1.79 4.0 4.0 4.0 h 17.485 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 H 8.0 c -1.105 0.0 -2.0 -0.896 -2.0 -2.0 V 11.449 Z")
        )
    }.build()
}
