package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RepeatOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RepeatOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 1.394 C 8.199 1.2 8.515 1.202 8.709 1.399 l 1.756 1.786 c 0.192 0.195 0.192 0.507 0.0 0.701 L 8.708 5.672 C 8.514 5.87 8.198 5.872 8.0 5.678 C 7.804 5.484 7.8 5.168 7.995 4.97 l 0.92 -0.935 H 5.892 C 3.75 4.036 2.0 5.803 2.0 8.0 c 0.0 0.895 0.29 1.719 0.78 2.381 c 0.164 0.223 0.117 0.536 -0.105 0.7 c -0.222 0.164 -0.535 0.117 -0.7 -0.105 C 1.364 10.146 1.0 9.115 1.0 8.0 c 0.0 -2.734 2.183 -4.964 4.892 -4.964 h 3.023 L 7.995 2.1 C 7.8 1.904 7.804 1.587 8.0 1.394 Z m 5.324 3.525 c 0.223 -0.164 0.536 -0.117 0.7 0.105 C 14.637 5.854 15.0 6.884 15.0 8.0 c 0.0 2.734 -2.182 4.964 -4.892 4.964 H 7.085 l 0.92 0.935 C 8.2 14.096 8.196 14.413 8.0 14.606 c -0.197 0.194 -0.513 0.191 -0.707 -0.005 l -1.757 -1.786 c -0.191 -0.195 -0.191 -0.507 0.0 -0.701 l 1.757 -1.786 c 0.194 -0.197 0.51 -0.2 0.707 -0.006 c 0.197 0.194 0.2 0.51 0.006 0.707 l -0.92 0.935 h 3.023 C 12.25 11.964 14.0 10.197 14.0 8.0 c 0.0 -0.895 -0.29 -1.72 -0.78 -2.382 c -0.165 -0.222 -0.118 -0.535 0.104 -0.7 Z")
        )
    }.build()
}
