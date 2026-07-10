package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageChatFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageChatFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.051 2.05 c -3.257 0.0 -5.898 2.64 -5.898 5.899 c 0.0 0.7 0.122 1.374 0.347 1.999 c 0.135 0.375 0.174 0.743 0.083 1.067 l -0.499 1.782 c -0.19 0.681 0.438 1.31 1.119 1.118 l 1.782 -0.498 c 0.324 -0.091 0.692 -0.052 1.067 0.083 c 0.625 0.225 1.298 0.347 2.0 0.347 c 3.257 0.0 5.898 -2.64 5.898 -5.898 c 0.0 -3.258 -2.641 -5.899 -5.899 -5.899 Z m 2.571 6.957 c 0.501 0.0 0.908 -0.406 0.908 -0.907 s -0.407 -0.907 -0.908 -0.907 c -0.501 0.0 -0.907 0.406 -0.907 0.907 s 0.406 0.907 0.907 0.907 Z M 8.807 8.1 c 0.0 0.501 -0.406 0.907 -0.907 0.907 c -0.502 0.0 -0.908 -0.406 -0.908 -0.907 S 7.398 7.193 7.9 7.193 c 0.5 0.0 0.907 0.406 0.907 0.907 Z m -3.63 0.907 c 0.501 0.0 0.907 -0.406 0.907 -0.907 S 5.678 7.193 5.177 7.193 S 4.269 7.598 4.269 8.1 s 0.407 0.907 0.908 0.907 Z")
        )
    }.build()
}
