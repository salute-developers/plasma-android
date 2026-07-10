package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RuTubeAltFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RuTubeAltFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.41 12.7 c 0.937 0.0 1.699 0.1 2.308 0.28 c 0.61 0.206 1.117 0.514 1.573 0.95 c 0.431 0.462 0.735 0.975 0.913 1.565 c 0.178 0.59 0.28 1.36 0.28 2.334 v 1.283 c 0.0 1.643 -0.28 2.875 -0.838 3.645 c -0.557 0.77 -1.233 1.237 -2.739 1.463 l 4.084 5.594 h -4.744 l -3.704 -5.568 H 8.736 v 5.568 H 4.5 V 12.699 h 14.91 Z M 8.736 16.472 v 4.002 h 9.989 c 0.583 0.0 0.99 -0.076 1.193 -0.255 c 0.204 -0.18 0.33 -0.514 0.33 -1.027 v -1.437 c 0.0 -0.487 -0.127 -0.82 -0.33 -1.0 c -0.204 -0.18 -0.61 -0.283 -1.193 -0.283 H 8.736 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 28.246 6.191 c 1.797 0.0 3.254 1.457 3.254 3.254 S 30.043 12.7 28.246 12.7 s -3.255 -1.457 -3.255 -3.255 c 0.0 -1.797 1.458 -3.254 3.255 -3.254 Z")
        )
    }.build()
}
