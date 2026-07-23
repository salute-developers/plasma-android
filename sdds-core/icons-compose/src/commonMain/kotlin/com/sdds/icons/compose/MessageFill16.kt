package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.153 7.949 c 0.0 -3.258 2.64 -5.899 5.898 -5.899 c 3.258 0.0 5.899 2.64 5.899 5.899 c 0.0 3.257 -2.641 5.898 -5.899 5.898 c -0.7 0.0 -1.374 -0.122 -1.999 -0.347 c -0.375 -0.135 -0.743 -0.174 -1.067 -0.084 l -1.782 0.5 c -0.681 0.19 -1.31 -0.438 -1.119 -1.12 l 0.5 -1.78 c 0.09 -0.325 0.051 -0.693 -0.084 -1.068 c -0.225 -0.625 -0.347 -1.299 -0.347 -2.0 Z")
        )
    }.build()
}
