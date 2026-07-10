package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BoxOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BoxOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.75 6.5 C 7.06 6.5 6.5 7.06 6.5 7.75 v 4.325 h 22.999 V 7.75 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 H 7.75 Z M 4.5 7.75 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 h 20.499 c 1.795 0.0 3.25 1.455 3.25 3.25 v 4.575 c 0.0 0.887 -0.66 1.62 -1.515 1.735 v 12.689 c 0.0 2.623 -2.127 4.75 -4.75 4.75 H 10.764 c -2.623 0.0 -4.75 -2.127 -4.75 -4.75 v -12.69 C 5.16 13.946 4.5 13.213 4.5 12.326 V 7.75 Z m 3.515 6.325 V 26.75 c 0.0 1.518 1.231 2.75 2.75 2.75 h 14.468 c 1.52 0.0 2.75 -1.232 2.75 -2.75 V 14.075 H 8.015 Z m 9.363 5.06 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 6.06 c 0.553 0.0 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.447 1.0 -1.0 1.0 h -6.06 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 Z m 4.03 3.546 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 3.03 c 0.553 0.0 1.0 -0.448 1.0 -1.0 s -0.447 -1.0 -1.0 -1.0 h -3.03 Z")
        )
    }.build()
}
