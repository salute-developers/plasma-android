package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PinFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PinFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.94 1.0 C 5.431 1.0 5.044 1.482 5.125 2.013 l 0.486 3.23 c 0.05 0.33 -0.03 0.669 -0.221 0.935 L 3.988 8.133 C 3.41 8.939 3.951 10.1 4.906 10.1 h 2.412 v 3.85 L 8.0 15.0 l 0.682 -1.05 V 10.1 h 2.412 c 0.955 0.0 1.497 -1.161 0.918 -1.967 l -1.403 -1.955 c -0.191 -0.266 -0.271 -0.605 -0.221 -0.936 l 0.486 -3.229 C 10.954 1.482 10.569 1.0 10.061 1.0 H 5.939 Z")
        )
    }.build()
}
