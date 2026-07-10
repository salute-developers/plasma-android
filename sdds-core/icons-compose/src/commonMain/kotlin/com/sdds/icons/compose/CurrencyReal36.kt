package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CurrencyReal36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CurrencyReal36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 23.75 11.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 1.182 c -1.306 0.421 -2.25 1.647 -2.25 3.093 V 15.5 c 0.0 1.795 1.455 3.25 3.25 3.25 c 0.69 0.0 1.25 0.56 1.25 1.25 v 0.225 c 0.0 0.69 -0.56 1.25 -1.25 1.25 H 21.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 0.75 V 24.5 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -1.182 c 1.306 -0.422 2.25 -1.647 2.25 -3.093 V 20.0 c 0.0 -1.795 -1.455 -3.25 -3.25 -3.25 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 v -0.225 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 1.75 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -0.75 V 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.5 11.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 12.0 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -4.647 h 1.399 l 2.718 5.116 c 0.259 0.488 0.864 0.673 1.352 0.414 c 0.488 -0.259 0.673 -0.864 0.414 -1.352 l -2.401 -4.52 c 1.481 -0.642 2.518 -2.117 2.518 -3.834 c 0.0 -2.307 -1.87 -4.177 -4.177 -4.177 H 11.5 Z m 2.823 6.353 H 12.5 V 13.5 h 1.823 c 1.203 0.0 2.177 0.974 2.177 2.177 c 0.0 1.201 -0.974 2.176 -2.177 2.176 Z")
        )
    }.build()
}
