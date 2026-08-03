package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AddOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AddOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 29.001 6.0 H 11.724 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 17.277 c 0.0 0.552 0.448 1.0 1.0 1.0 h 17.277 c 0.553 0.0 1.0 -0.448 1.0 -1.0 V 7.0 c 0.0 -0.552 -0.447 -1.0 -1.0 -1.0 Z M 11.724 4.0 c -1.656 0.0 -3.0 1.343 -3.0 3.0 v 17.277 c 0.0 1.657 1.344 3.0 3.0 3.0 h 17.277 c 1.657 0.0 3.0 -1.343 3.0 -3.0 V 7.0 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 H 11.724 Z M 5.0 10.45 c 0.552 0.0 1.0 0.447 1.0 1.0 v 16.552 c 0.0 1.104 0.895 2.0 2.0 2.0 h 17.484 c 0.552 0.0 1.0 0.447 1.0 1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 H 8.0 c -2.21 0.0 -4.0 -1.791 -4.0 -4.0 V 11.449 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 Z m 16.363 -0.63 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 4.82 h -4.82 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 4.833 l 0.064 4.832 c 0.008 0.552 0.461 0.994 1.014 0.987 c 0.552 -0.008 0.994 -0.461 0.986 -1.014 l -0.064 -4.805 h 4.806 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 h -4.82 V 9.82 Z")
        )
    }.build()
}
