package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlaskOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlaskOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.0 3.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -0.5 v 8.122 l 0.012 0.185 c 0.023 0.183 0.08 0.362 0.168 0.526 l 7.94 14.745 c 1.041 1.936 -0.285 4.271 -2.432 4.415 L 27.978 33.0 H 8.023 c -2.2 0.0 -3.626 -2.274 -2.735 -4.233 l 0.093 -0.189 l 7.94 -14.745 c 0.088 -0.164 0.145 -0.343 0.168 -0.526 l 0.011 -0.185 V 5.0 H 13.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 10.0 Z m -7.5 10.122 c 0.0 0.58 -0.143 1.15 -0.418 1.66 L 7.143 29.525 C 6.784 30.192 7.266 31.0 8.023 31.0 h 19.955 c 0.756 0.0 1.238 -0.808 0.88 -1.474 l -7.94 -14.745 c -0.274 -0.51 -0.418 -1.08 -0.418 -1.659 V 5.0 h -5.0 v 8.122 Z")
        )
    }.build()
}
