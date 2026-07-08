package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentInquirerFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentInquirerFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.071 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.679 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m 2.293 -4.525 c 0.137 -0.136 0.137 -0.358 0.0 -0.495 c -0.137 -0.136 -0.358 -0.136 -0.495 0.0 l -2.48 2.48 l -1.116 -1.116 c -0.137 -0.137 -0.358 -0.137 -0.495 0.0 s -0.137 0.358 0.0 0.495 l 1.364 1.364 c 0.065 0.065 0.154 0.102 0.247 0.102 s 0.182 -0.037 0.248 -0.102 l 2.727 -2.728 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.7 1.0 h -0.534 C 9.938 0.754 9.612 0.6 9.25 0.6 h -2.5 C 6.388 0.6 6.062 0.754 5.833 1.0 H 5.3 C 4.32 1.0 3.83 1.0 3.456 1.19 C 3.126 1.36 2.859 1.627 2.69 1.957 C 2.5 2.33 2.5 2.82 2.5 3.8 v 8.4 c 0.0 0.98 0.0 1.47 0.19 1.845 c 0.169 0.329 0.436 0.597 0.766 0.764 C 3.83 15.0 4.32 15.0 5.3 15.0 h 3.346 C 7.933 14.204 7.5 13.153 7.5 12.0 c 0.0 -2.485 2.015 -4.5 4.5 -4.5 c 0.526 0.0 1.03 0.09 1.5 0.256 V 3.8 c 0.0 -0.98 0.0 -1.47 -0.19 -1.844 c -0.168 -0.33 -0.436 -0.597 -0.766 -0.765 C 12.17 1.0 11.68 1.0 10.7 1.0 Z M 4.75 4.325 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 5.5 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -5.5 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 0.0 2.275 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 H 8.0 c 0.276 0.0 0.5 0.224 0.5 0.5 S 8.276 7.1 8.0 7.1 H 5.25 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z m 2.0 -5.1 C 6.612 1.5 6.5 1.612 6.5 1.75 S 6.612 2.0 6.75 2.0 h 2.5 C 9.388 2.0 9.5 1.888 9.5 1.75 S 9.388 1.5 9.25 1.5 h -2.5 Z")
        )
    }.build()
}
