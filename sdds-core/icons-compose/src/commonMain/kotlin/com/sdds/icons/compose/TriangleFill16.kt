package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TriangleFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TriangleFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.922 1.5 c 0.193 0.0 0.372 0.103 0.469 0.27 l 6.88 11.918 c 0.097 0.167 0.097 0.374 0.0 0.541 c -0.097 0.168 -0.276 0.271 -0.47 0.271 H 1.042 c -0.193 0.0 -0.372 -0.103 -0.468 -0.27 c -0.097 -0.168 -0.097 -0.375 0.0 -0.543 l 6.88 -11.916 C 7.549 1.603 7.728 1.5 7.922 1.5 Z")
        )
    }.build()
}
