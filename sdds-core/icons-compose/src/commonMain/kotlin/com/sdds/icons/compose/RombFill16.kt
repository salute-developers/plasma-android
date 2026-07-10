package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp

public val SddsIcons.RombFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RombFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        group {
            addPath(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd,
                pathData = addPathNodes("M 8.95 1.053 l 0.013 0.012 l 5.78 5.78 c 0.111 0.111 0.216 0.215 0.296 0.31 c 0.088 0.103 0.178 0.23 0.23 0.391 c 0.075 0.23 0.075 0.475 0.0 0.704 c -0.052 0.162 -0.142 0.288 -0.23 0.391 c -0.08 0.095 -0.184 0.2 -0.295 0.31 L 8.95 14.744 c -0.11 0.11 -0.215 0.215 -0.31 0.295 c -0.103 0.088 -0.229 0.178 -0.391 0.23 c -0.229 0.075 -0.475 0.075 -0.704 0.0 c -0.162 -0.053 -0.288 -0.142 -0.39 -0.23 c -0.095 -0.08 -0.2 -0.184 -0.31 -0.295 L 1.053 8.95 C 0.942 8.84 0.838 8.736 0.757 8.64 C 0.67 8.538 0.58 8.412 0.527 8.25 c -0.074 -0.229 -0.074 -0.475 0.0 -0.704 c 0.053 -0.162 0.143 -0.288 0.23 -0.39 c 0.08 -0.096 0.185 -0.2 0.296 -0.31 l 5.78 -5.78 c 0.004 -0.005 0.008 -0.01 0.013 -0.013 c 0.11 -0.111 0.215 -0.215 0.31 -0.296 c 0.102 -0.087 0.228 -0.177 0.39 -0.23 c 0.23 -0.074 0.475 -0.074 0.704 0.0 C 8.412 0.58 8.538 0.67 8.641 0.757 c 0.095 0.08 0.2 0.185 0.31 0.296 Z")
            )
        }
    }.build()
}
