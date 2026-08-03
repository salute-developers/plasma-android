package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Tree24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Tree24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.172 7.75 c 0.0 1.105 0.896 2.0 2.0 2.0 h 0.854 v 7.675 c 0.0 1.284 1.041 2.325 2.325 2.325 h 2.664 C 11.138 20.736 11.98 21.5 13.0 21.5 h 6.0 c 1.104 0.0 2.0 -0.895 2.0 -2.0 v -1.75 c 0.0 -1.105 -0.896 -2.0 -2.0 -2.0 h -6.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 v 0.5 H 8.35 c -0.455 0.0 -0.825 -0.37 -0.825 -0.825 v -4.35 h 3.475 C 11.041 14.145 11.921 15.0 13.0 15.0 h 6.0 c 1.104 0.0 2.0 -0.895 2.0 -2.0 v -1.75 c 0.0 -1.105 -0.896 -2.0 -2.0 -2.0 h -6.0 c -1.105 0.0 -2.0 0.895 -2.0 2.0 v 0.325 H 7.526 V 9.75 h 0.896 c 1.105 0.0 2.0 -0.895 2.0 -2.0 v -2.5 c 0.0 -1.105 -0.895 -2.0 -2.0 -2.0 h -3.25 c -1.104 0.0 -2.0 0.895 -2.0 2.0 v 2.5 Z m 1.5 -2.5 v 2.5 c 0.0 0.276 0.224 0.5 0.5 0.5 h 3.25 c 0.277 0.0 0.5 -0.224 0.5 -0.5 v -2.5 c 0.0 -0.276 -0.223 -0.5 -0.5 -0.5 h -3.25 c -0.276 0.0 -0.5 0.224 -0.5 0.5 Z m 7.828 6.0 V 13.0 c 0.0 0.276 0.224 0.5 0.5 0.5 h 6.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -1.75 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 h -6.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 Z m 0.0 8.25 v -1.75 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 6.0 c 0.276 0.0 0.5 0.224 0.5 0.5 v 1.75 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -6.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
