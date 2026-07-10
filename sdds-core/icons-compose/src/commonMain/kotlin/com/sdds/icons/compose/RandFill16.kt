package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RandFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RandFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 6.6 4.5 C 6.324 4.5 6.1 4.724 6.1 5.0 v 3.124 V 10.9 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 8.624 h 0.784 l 1.431 2.523 c 0.136 0.24 0.441 0.324 0.682 0.188 c 0.24 -0.136 0.324 -0.442 0.188 -0.682 L 8.95 8.478 C 9.712 8.175 10.25 7.43 10.25 6.562 c 0.0 -1.139 -0.923 -2.062 -2.062 -2.062 H 6.6 Z m 1.565 3.124 H 7.1 V 5.5 h 1.088 c 0.587 0.0 1.062 0.475 1.062 1.062 c 0.0 0.586 -0.475 1.062 -1.062 1.062 H 8.184 H 8.165 Z")
        )
    }.build()
}
