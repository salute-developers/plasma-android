package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NotebookOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NotebookOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.251 10.953 c 0.133 0.0 0.261 0.0 0.37 -0.009 c 0.118 -0.01 0.256 -0.032 0.394 -0.103 c 0.193 -0.098 0.35 -0.255 0.448 -0.448 c 0.07 -0.138 0.094 -0.276 0.103 -0.395 c 0.009 -0.108 0.009 -0.236 0.009 -0.369 V 4.574 c 0.0 -0.133 0.0 -0.261 -0.009 -0.37 c -0.01 -0.118 -0.032 -0.256 -0.103 -0.394 c -0.098 -0.193 -0.255 -0.35 -0.448 -0.448 c -0.138 -0.07 -0.276 -0.094 -0.395 -0.103 c -0.108 -0.009 -0.236 -0.009 -0.369 -0.009 H 3.75 c -0.133 0.0 -0.261 0.0 -0.37 0.009 c -0.118 0.01 -0.256 0.032 -0.394 0.103 C 2.792 3.46 2.635 3.617 2.537 3.81 c -0.07 0.138 -0.093 0.276 -0.103 0.394 c -0.009 0.109 -0.009 0.237 -0.009 0.37 v 5.055 c 0.0 0.133 0.0 0.261 0.009 0.37 c 0.01 0.118 0.032 0.256 0.103 0.394 c 0.098 0.193 0.255 0.35 0.448 0.448 c 0.138 0.07 0.276 0.093 0.394 0.103 c 0.109 0.009 0.237 0.009 0.37 0.009 h 8.502 Z m 0.319 -1.036 l -0.003 0.028 l -0.028 0.002 c -0.062 0.006 -0.149 0.006 -0.304 0.006 h -8.47 c -0.155 0.0 -0.242 0.0 -0.304 -0.006 L 3.433 9.945 L 3.431 9.917 C 3.425 9.855 3.425 9.768 3.425 9.613 V 4.59 c 0.0 -0.155 0.0 -0.242 0.006 -0.304 l 0.002 -0.028 l 0.028 -0.003 C 3.523 4.25 3.61 4.25 3.765 4.25 h 8.47 c 0.155 0.0 0.242 0.0 0.304 0.005 l 0.028 0.003 l 0.002 0.028 c 0.006 0.062 0.006 0.149 0.006 0.304 v 5.023 c 0.0 0.155 0.0 0.242 -0.005 0.304 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 1.53 11.687 c -0.293 0.0 -0.53 0.237 -0.53 0.53 c 0.0 0.292 0.237 0.529 0.53 0.529 h 12.94 c 0.293 0.0 0.53 -0.237 0.53 -0.53 c 0.0 -0.292 -0.237 -0.529 -0.53 -0.529 H 1.53 Z")
        )
    }.build()
}
