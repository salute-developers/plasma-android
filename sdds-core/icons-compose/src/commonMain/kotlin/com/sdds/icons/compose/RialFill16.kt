package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RialFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RialFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 8.0 c 0.0 3.866 -3.134 7.0 -7.0 7.0 s -7.0 -3.134 -7.0 -7.0 s 3.134 -7.0 7.0 -7.0 s 7.0 3.134 7.0 7.0 Z M 6.97 5.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.588 c 1.139 0.0 2.062 0.923 2.062 2.062 c 0.0 0.869 -0.538 1.613 -1.3 1.916 l 1.235 2.175 c 0.136 0.24 0.052 0.546 -0.188 0.682 s -0.546 0.052 -0.682 -0.188 L 8.754 8.624 H 7.97 V 10.9 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 5.0 Z m 1.0 2.624 h 1.065 h 0.019 h 0.004 c 0.587 0.0 1.062 -0.476 1.062 -1.062 c 0.0 -0.587 -0.475 -1.062 -1.062 -1.062 H 7.97 v 2.124 Z M 5.87 5.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 S 4.87 4.724 4.87 5.0 v 5.9 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 V 5.0 Z")
        )
    }.build()
}
