package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableLampOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableLampOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.192 3.0 c -1.012 0.0 -1.925 0.61 -2.311 1.546 L 6.076 21.023 c -0.128 0.308 -0.093 0.66 0.093 0.938 c 0.185 0.277 0.497 0.444 0.831 0.444 h 10.0 v 8.594 h -6.203 c -0.552 0.0 -1.0 0.447 -1.0 1.0 c 0.0 0.552 0.448 1.0 1.0 1.0 H 25.2 c 0.553 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.447 -1.0 -1.0 -1.0 H 19.0 v -8.595 h 10.0 c 0.333 0.0 0.645 -0.166 0.83 -0.444 c 0.186 -0.277 0.22 -0.63 0.093 -0.938 L 23.105 4.544 C 22.718 3.61 21.806 3.0 20.795 3.0 h -5.603 Z m -0.463 2.31 C 14.807 5.121 14.99 5.0 15.192 5.0 h 5.603 c 0.202 0.0 0.384 0.122 0.462 0.309 l 6.245 15.095 H 8.495 L 14.73 5.31 Z")
        )
    }.build()
}
