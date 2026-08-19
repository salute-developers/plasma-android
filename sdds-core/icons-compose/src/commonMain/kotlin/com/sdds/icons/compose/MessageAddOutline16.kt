package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAddOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAddOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.2 4.8 c 0.276 0.0 0.5 0.224 0.5 0.5 v 2.0 h 2.0 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 h -2.0 v 2.0 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 v -2.0 h -2.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 2.0 v -2.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.15 1.975 c 3.244 0.0 5.874 2.63 5.874 5.876 c 0.0 3.244 -2.63 5.874 -5.875 5.875 c -0.698 0.0 -1.37 -0.122 -1.994 -0.347 c -0.361 -0.13 -0.713 -0.166 -1.017 -0.081 l -1.765 0.494 c -0.71 0.199 -1.365 -0.456 -1.166 -1.166 l 0.494 -1.765 c 0.085 -0.304 0.05 -0.655 -0.08 -1.016 C 2.394 9.222 2.272 8.549 2.272 7.85 c 0.0 -3.245 2.632 -5.876 5.876 -5.876 Z m 0.0 1.0 c -2.693 0.0 -4.876 2.183 -4.877 4.876 c 0.0 0.581 0.103 1.138 0.288 1.654 c 0.177 0.488 0.261 1.06 0.103 1.626 l -0.469 1.672 l 1.673 -0.468 c 0.566 -0.158 1.138 -0.073 1.626 0.103 c 0.516 0.187 1.074 0.287 1.655 0.288 c 2.693 0.0 4.875 -2.183 4.875 -4.875 c 0.0 -2.693 -2.182 -4.876 -4.875 -4.876 Z")
        )
    }.build()
}
