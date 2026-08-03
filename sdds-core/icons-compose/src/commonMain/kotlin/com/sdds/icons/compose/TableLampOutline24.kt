package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableLampOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableLampOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.158 2.002 C 9.45 2.002 8.81 2.43 8.54 3.085 l -4.482 10.88 c -0.095 0.23 -0.068 0.495 0.07 0.703 C 4.269 14.875 4.503 15.0 4.753 15.0 h 6.498 v 5.5 H 7.254 c -0.414 0.0 -0.75 0.335 -0.75 0.75 c 0.0 0.414 0.336 0.75 0.75 0.75 h 9.492 c 0.414 0.0 0.75 -0.336 0.75 -0.75 c 0.0 -0.415 -0.336 -0.75 -0.75 -0.75 H 12.75 V 15.0 h 6.498 c 0.25 0.0 0.484 -0.125 0.623 -0.333 c 0.14 -0.208 0.166 -0.472 0.07 -0.703 l -4.49 -10.88 c -0.27 -0.655 -0.909 -1.082 -1.617 -1.082 h -3.676 Z m -0.23 1.655 c 0.038 -0.094 0.129 -0.155 0.23 -0.155 h 3.676 c 0.101 0.0 0.192 0.061 0.23 0.155 l 4.063 9.843 H 5.872 l 4.055 -9.843 Z")
        )
    }.build()
}
