package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Header524: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Header524",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.658 12.705 v 4.545 h 1.407 V 6.75 h -1.407 v 4.174 H 6.895 V 6.75 H 5.5 v 10.5 h 1.395 v -4.545 h 3.763 Z m 2.592 1.712 c 0.568 0.653 1.52 1.083 2.604 1.068 c 1.229 0.0 1.77 -0.741 1.77 -1.735 c 0.0 -1.112 -0.793 -1.676 -2.127 -1.676 c -0.806 0.0 -1.507 0.163 -1.996 0.356 l 0.317 -5.68 h 4.956 v 1.706 h -3.62 L 15.02 10.68 c 0.277 -0.074 0.766 -0.133 1.11 -0.133 c 2.049 0.0 3.119 1.32 3.119 3.203 c 0.0 2.27 -1.427 3.5 -3.344 3.5 c -1.321 0.0 -2.26 -0.549 -2.656 -0.95 v -1.883 Z")
        )
    }.build()
}
