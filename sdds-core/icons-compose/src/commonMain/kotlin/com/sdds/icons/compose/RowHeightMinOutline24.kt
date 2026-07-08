package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightMinOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightMinOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.0 3.75 C 4.0 3.336 4.336 3.0 4.75 3.0 h 14.5 C 19.664 3.0 20.0 3.336 20.0 3.75 S 19.664 4.5 19.25 4.5 H 4.75 C 4.336 4.5 4.0 4.164 4.0 3.75 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.0 6.0 h 14.0 c 1.105 0.0 2.0 0.895 2.0 2.0 v 1.0 c 0.0 0.473 -0.164 0.908 -0.439 1.25 C 20.836 10.592 21.0 11.027 21.0 11.5 v 1.0 c 0.0 0.473 -0.164 0.908 -0.439 1.25 C 20.836 14.092 21.0 14.527 21.0 15.0 v 1.0 c 0.0 1.105 -0.895 2.0 -2.0 2.0 H 5.0 c -1.105 0.0 -2.0 -0.895 -2.0 -2.0 v -1.0 c 0.0 -0.473 0.164 -0.908 0.439 -1.25 C 3.164 13.408 3.0 12.973 3.0 12.5 v -1.0 c 0.0 -0.473 0.164 -0.908 0.439 -1.25 C 3.164 9.908 3.0 9.473 3.0 9.0 V 8.0 c 0.0 -1.105 0.895 -2.0 2.0 -2.0 Z m 0.0 8.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 1.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 14.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -1.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 5.0 Z m -0.5 -3.0 C 4.5 11.224 4.724 11.0 5.0 11.0 h 14.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 5.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 v -1.0 Z m 0.5 -4.0 C 4.724 7.5 4.5 7.724 4.5 8.0 v 1.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 14.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 V 8.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 H 5.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 4.75 19.5 C 4.336 19.5 4.0 19.836 4.0 20.25 S 4.336 21.0 4.75 21.0 h 14.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 4.75 Z")
        )
    }.build()
}
