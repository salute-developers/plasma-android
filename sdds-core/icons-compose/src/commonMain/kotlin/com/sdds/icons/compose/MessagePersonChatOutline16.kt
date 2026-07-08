package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagePersonChatOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagePersonChatOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.29 7.833 c 0.0 -2.692 2.184 -4.875 4.877 -4.875 c 2.633 0.0 4.78 2.088 4.872 4.7 c 0.35 0.075 0.686 0.19 1.0 0.342 c 0.002 -0.055 0.003 -0.11 0.003 -0.167 c 0.0 -3.245 -2.63 -5.875 -5.875 -5.875 c -3.246 0.0 -5.876 2.63 -5.876 5.875 c 0.0 0.7 0.122 1.371 0.347 1.994 c 0.13 0.362 0.166 0.713 0.08 1.017 L 2.226 12.61 c -0.2 0.71 0.455 1.365 1.166 1.166 l 1.764 -0.494 c 0.305 -0.085 0.656 -0.05 1.018 0.08 c 0.544 0.197 1.125 0.316 1.73 0.342 c -0.128 -0.324 -0.219 -0.667 -0.268 -1.022 c -0.39 -0.043 -0.767 -0.131 -1.123 -0.26 c -0.489 -0.176 -1.06 -0.261 -1.626 -0.103 l -1.673 0.469 l 0.469 -1.673 c 0.158 -0.566 0.073 -1.137 -0.103 -1.626 C 3.393 8.972 3.29 8.415 3.29 7.833 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 15.75 c 2.07 0.0 3.75 -1.679 3.75 -3.75 c 0.0 -2.071 -1.68 -3.75 -3.75 -3.75 c -2.071 0.0 -3.75 1.679 -3.75 3.75 c 0.0 2.071 1.679 3.75 3.75 3.75 Z m 1.534 -5.283 C 13.534 11.314 12.847 12.0 12.0 12.0 s -1.534 -0.687 -1.534 -1.534 c 0.0 -0.848 0.687 -1.534 1.534 -1.534 s 1.534 0.686 1.534 1.534 Z m 1.042 3.202 c -0.547 0.843 -1.497 1.4 -2.576 1.4 c -1.08 0.0 -2.029 -0.557 -2.576 -1.4 c 0.767 -0.412 1.644 -0.645 2.576 -0.645 c 0.931 0.0 1.809 0.233 2.576 0.645 Z")
        )
    }.build()
}
