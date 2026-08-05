package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagePersonChatFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagePersonChatFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.051 2.05 c -3.257 0.0 -5.898 2.64 -5.898 5.899 c 0.0 0.7 0.122 1.374 0.347 1.999 c 0.135 0.375 0.174 0.743 0.083 1.067 l -0.499 1.782 c -0.19 0.681 0.438 1.31 1.119 1.118 l 1.782 -0.498 c 0.324 -0.091 0.692 -0.052 1.067 0.083 c 0.591 0.212 1.225 0.334 1.885 0.346 c -0.233 -0.543 -0.362 -1.142 -0.362 -1.771 c 0.0 -2.485 2.015 -4.5 4.5 -4.5 c 0.669 0.0 1.304 0.146 1.875 0.408 V 7.949 c 0.0 -3.258 -2.641 -5.899 -5.899 -5.899 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.07 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.68 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m 1.534 -5.283 C 13.534 11.314 12.847 12.0 12.0 12.0 s -1.534 -0.687 -1.534 -1.534 c 0.0 -0.848 0.687 -1.534 1.534 -1.534 s 1.534 0.686 1.534 1.534 Z m 1.041 3.202 c -0.546 0.843 -1.496 1.4 -2.575 1.4 c -1.08 0.0 -2.029 -0.557 -2.576 -1.4 c 0.767 -0.412 1.644 -0.645 2.576 -0.645 c 0.931 0.0 1.808 0.233 2.575 0.645 Z")
        )
    }.build()
}
