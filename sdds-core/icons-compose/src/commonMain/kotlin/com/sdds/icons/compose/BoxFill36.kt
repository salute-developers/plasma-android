package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BoxFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BoxFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.875 4.5 C 6.011 4.5 4.5 6.011 4.5 7.875 v 4.25 h 27.0 v -4.25 c 0.0 -1.864 -1.511 -3.375 -3.375 -3.375 H 7.875 Z M 30.3 14.125 H 5.7 c 0.097 0.037 0.197 0.066 0.3 0.088 v 12.412 c 0.0 2.692 2.183 4.875 4.875 4.875 h 14.25 c 2.692 0.0 4.875 -2.183 4.875 -4.875 V 14.213 c 0.103 -0.021 0.203 -0.05 0.3 -0.088 Z m -11.925 4.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 7.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -7.0 Z m 2.0 5.875 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 4.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -4.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z")
        )
    }.build()
}
