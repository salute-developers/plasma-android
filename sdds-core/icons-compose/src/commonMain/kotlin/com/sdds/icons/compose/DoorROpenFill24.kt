package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorROpenFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorROpenFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.0 3.331 c 0.0 -1.165 1.117 -2.005 2.237 -1.68 l 7.5 2.17 C 19.485 4.038 20.0 4.723 20.0 5.502 V 18.5 c 0.0 0.78 -0.515 1.464 -1.263 1.681 l -7.5 2.171 C 10.117 22.675 9.0 21.835 9.0 20.671 V 20.5 H 6.096 C 4.824 20.5 4.0 19.326 4.0 18.155 V 5.846 c 0.0 -1.17 0.824 -2.345 2.096 -2.345 H 9.0 V 3.33 Z m 0.0 1.67 H 6.096 C 5.881 5.0 5.5 5.255 5.5 5.846 v 12.31 C 5.5 18.745 5.881 19.0 6.096 19.0 H 9.0 V 5.0 Z m 4.0 8.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 s 1.0 0.447 1.0 1.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 Z")
        )
    }.build()
}
