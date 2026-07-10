package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RublePlus16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RublePlus16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.574 1.75 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 1.998 c 1.15 0.0 2.084 0.933 2.084 2.084 c 0.0 1.152 -0.933 2.085 -2.084 2.085 H 3.574 v 0.76 h 1.291 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -1.29 v 0.557 c 0.0 0.276 -0.224 0.5 -0.5 0.5 c -0.277 0.0 -0.5 -0.224 -0.5 -0.5 V 7.179 H 2.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 0.574 V 5.42 H 2.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 0.574 V 1.75 Z m 1.0 2.669 h 1.498 c 0.598 0.0 1.084 -0.486 1.084 -1.085 c 0.0 -0.598 -0.486 -1.084 -1.084 -1.084 H 3.574 v 2.169 Z m 10.602 -2.314 c 0.193 0.196 0.19 0.513 -0.006 0.707 L 2.35 14.43 c -0.196 0.193 -0.513 0.19 -0.707 -0.006 c -0.193 -0.197 -0.19 -0.514 0.006 -0.708 L 13.47 2.1 c 0.197 -0.194 0.513 -0.191 0.707 0.006 Z M 11.992 9.32 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 c -0.277 0.0 -0.5 0.224 -0.5 0.5 v 1.965 H 8.983 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.008 v 1.965 c 0.0 0.276 0.223 0.5 0.5 0.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 v -1.965 h 2.006 c 0.277 0.0 0.5 -0.224 0.5 -0.5 s -0.223 -0.5 -0.5 -0.5 h -2.006 V 9.32 Z")
        )
    }.build()
}
