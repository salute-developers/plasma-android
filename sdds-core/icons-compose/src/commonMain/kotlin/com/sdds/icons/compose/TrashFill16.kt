package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TrashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TrashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.422 3.833 c 0.0 -1.15 0.923 -2.083 2.062 -2.083 h 1.032 c 1.139 0.0 2.062 0.933 2.062 2.083 v 0.521 h 2.406 c 0.285 0.0 0.516 0.233 0.516 0.521 c 0.0 0.288 -0.23 0.52 -0.516 0.52 h -0.859 v 6.133 c 0.0 0.371 0.0 0.68 -0.02 0.934 c -0.022 0.263 -0.068 0.511 -0.186 0.745 c -0.181 0.36 -0.47 0.652 -0.826 0.835 c -0.232 0.12 -0.477 0.166 -0.739 0.187 c -0.25 0.021 -0.556 0.021 -0.924 0.021 H 6.57 c -0.368 0.0 -0.674 0.0 -0.924 -0.02 c -0.262 -0.022 -0.507 -0.069 -0.739 -0.188 c -0.355 -0.183 -0.645 -0.475 -0.826 -0.835 c -0.118 -0.234 -0.164 -0.482 -0.186 -0.745 c -0.02 -0.253 -0.02 -0.563 -0.02 -0.934 V 5.396 h -0.86 C 2.732 5.396 2.5 5.163 2.5 4.875 c 0.0 -0.288 0.23 -0.52 0.516 -0.52 h 2.406 V 3.832 Z m 1.031 0.521 h 3.094 v -0.52 c 0.0 -0.576 -0.462 -1.042 -1.031 -1.042 H 7.484 c -0.57 0.0 -1.03 0.466 -1.03 1.041 v 0.521 Z m 0.172 2.952 c 0.285 0.0 0.516 0.233 0.516 0.52 v 4.167 c 0.0 0.288 -0.231 0.52 -0.516 0.52 c -0.285 0.0 -0.516 -0.232 -0.516 -0.52 V 7.826 c 0.0 -0.287 0.231 -0.52 0.516 -0.52 Z m 3.266 0.52 c 0.0 -0.287 -0.231 -0.52 -0.516 -0.52 c -0.285 0.0 -0.516 0.233 -0.516 0.52 v 4.167 c 0.0 0.288 0.231 0.52 0.516 0.52 c 0.285 0.0 0.516 -0.232 0.516 -0.52 V 7.826 Z")
        )
    }.build()
}
