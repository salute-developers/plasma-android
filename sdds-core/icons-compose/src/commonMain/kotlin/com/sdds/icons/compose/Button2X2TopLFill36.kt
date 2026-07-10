package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Button2X2TopLFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Button2X2TopLFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.375 3.125 c -1.795 0.0 -3.25 1.455 -3.25 3.25 v 6.75 c 0.0 1.795 1.455 3.25 3.25 3.25 h 6.75 c 1.795 0.0 3.25 -1.455 3.25 -3.25 v -6.75 c 0.0 -1.795 -1.455 -3.25 -3.25 -3.25 h -6.75 Z m -1.25 3.25 c 0.0 -0.69 0.56 -1.25 1.25 -1.25 h 6.75 c 0.69 0.0 1.25 0.56 1.25 1.25 v 6.75 c 0.0 0.69 -0.56 1.25 -1.25 1.25 h -6.75 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 v -6.75 Z m 18.5 -1.875 C 22.175 4.5 21.0 5.675 21.0 7.125 v 5.25 C 21.0 13.825 22.175 15.0 23.625 15.0 h 5.25 c 1.45 0.0 2.625 -1.175 2.625 -2.625 v -5.25 c 0.0 -1.45 -1.175 -2.625 -2.625 -2.625 h -5.25 Z M 21.0 23.625 C 21.0 22.175 22.175 21.0 23.625 21.0 h 5.25 c 1.45 0.0 2.625 1.175 2.625 2.625 v 5.25 c 0.0 1.45 -1.175 2.625 -2.625 2.625 h -5.25 c -1.45 0.0 -2.625 -1.175 -2.625 -2.625 v -5.25 Z M 7.125 21.0 C 5.675 21.0 4.5 22.175 4.5 23.625 v 5.25 c 0.0 1.45 1.175 2.625 2.625 2.625 h 5.25 c 1.45 0.0 2.625 -1.175 2.625 -2.625 v -5.25 C 15.0 22.175 13.825 21.0 12.375 21.0 h -5.25 Z")
        )
    }.build()
}
