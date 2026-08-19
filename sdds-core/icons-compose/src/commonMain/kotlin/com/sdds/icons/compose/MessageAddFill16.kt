package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageAddFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageAddFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.15 1.975 c 3.244 0.0 5.874 2.63 5.874 5.876 c 0.0 3.244 -2.63 5.874 -5.875 5.875 c -0.698 0.0 -1.37 -0.122 -1.994 -0.347 c -0.361 -0.13 -0.713 -0.166 -1.017 -0.081 l -1.765 0.494 c -0.71 0.199 -1.365 -0.456 -1.166 -1.166 l 0.494 -1.765 c 0.085 -0.304 0.05 -0.655 -0.08 -1.016 C 2.394 9.222 2.272 8.549 2.272 7.85 c 0.0 -3.245 2.632 -5.876 5.876 -5.876 Z M 8.2 4.8 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 2.0 h -2.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 2.0 v 2.0 c 0.0 0.276 0.224 0.5 0.5 0.5 s 0.5 -0.224 0.5 -0.5 v -2.0 h 2.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -2.0 v -2.0 c 0.0 -0.276 -0.224 -0.5 -0.5 -0.5 Z")
        )
    }.build()
}
