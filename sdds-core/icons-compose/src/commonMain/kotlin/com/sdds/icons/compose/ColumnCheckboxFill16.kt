package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ColumnCheckboxFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ColumnCheckboxFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.827 1.0 h 1.028 C 5.0 1.436 5.413 1.75 5.898 1.75 h 4.2 c 0.485 0.0 0.897 -0.314 1.043 -0.75 h 1.028 c -0.167 0.993 -1.03 1.75 -2.071 1.75 h -4.2 c -1.04 0.0 -1.904 -0.757 -2.071 -1.75 Z m 6.27 13.25 h -4.2 c -0.484 0.0 -0.896 0.314 -1.042 0.75 H 3.827 c 0.167 -0.993 1.03 -1.75 2.07 -1.75 h 4.2 c 1.041 0.0 1.905 0.757 2.072 1.75 H 11.14 c -0.146 -0.436 -0.558 -0.75 -1.043 -0.75 Z m -6.3 -8.35 c 0.0 -1.16 0.941 -2.1 2.1 -2.1 h 4.2 c 1.16 0.0 2.1 0.94 2.1 2.1 v 4.2 c 0.0 1.16 -0.94 2.1 -2.1 2.1 h -4.2 c -1.159 0.0 -2.1 -0.94 -2.1 -2.1 V 5.9 Z m 6.227 0.109 c 0.23 0.153 0.292 0.463 0.14 0.693 l -1.995 2.99 c -0.24 0.361 -0.761 0.384 -1.032 0.046 l -1.28 -1.6 C 5.684 7.92 5.719 7.606 5.935 7.433 c 0.215 -0.172 0.53 -0.137 0.703 0.078 L 7.61 8.728 l 1.721 -2.58 c 0.153 -0.23 0.464 -0.292 0.693 -0.14 Z")
        )
    }.build()
}
