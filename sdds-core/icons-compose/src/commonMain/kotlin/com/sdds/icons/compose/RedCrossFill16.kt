package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RedCrossFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RedCrossFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.684 1.669 C 5.55 1.93 5.55 2.274 5.55 2.96 v 2.59 H 2.96 c -0.686 0.0 -1.03 0.0 -1.291 0.134 C 1.439 5.8 1.25 5.988 1.134 6.219 C 1.0 6.48 1.0 6.824 1.0 7.51 v 0.98 c 0.0 0.686 0.0 1.03 0.134 1.291 c 0.117 0.23 0.304 0.418 0.535 0.535 C 1.93 10.45 2.274 10.45 2.96 10.45 h 2.59 v 2.59 c 0.0 0.686 0.0 1.03 0.134 1.291 c 0.117 0.23 0.304 0.418 0.535 0.536 C 6.48 15.0 6.824 15.0 7.51 15.0 h 0.98 c 0.686 0.0 1.03 0.0 1.291 -0.133 c 0.23 -0.118 0.418 -0.305 0.535 -0.536 c 0.134 -0.262 0.134 -0.605 0.134 -1.291 v -2.59 h 2.59 c 0.686 0.0 1.03 0.0 1.291 -0.133 c 0.23 -0.118 0.418 -0.305 0.536 -0.536 C 15.0 9.52 15.0 9.176 15.0 8.49 V 7.51 c 0.0 -0.686 0.0 -1.03 -0.133 -1.291 c -0.118 -0.23 -0.305 -0.418 -0.536 -0.535 C 14.07 5.55 13.726 5.55 13.04 5.55 h -2.59 V 2.96 c 0.0 -0.686 0.0 -1.03 -0.133 -1.291 c -0.118 -0.23 -0.305 -0.418 -0.536 -0.535 C 9.52 1.0 9.176 1.0 8.49 1.0 H 7.51 C 6.824 1.0 6.48 1.0 6.219 1.134 C 5.989 1.25 5.8 1.438 5.684 1.669 Z")
        )
    }.build()
}
