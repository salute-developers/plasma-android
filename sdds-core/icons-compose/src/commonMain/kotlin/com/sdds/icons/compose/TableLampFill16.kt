package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TableLampFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TableLampFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.476 11.098 v 2.85 H 4.742 c -0.29 0.0 -0.525 0.235 -0.525 0.525 c 0.0 0.29 0.235 0.525 0.525 0.525 h 6.517 c 0.29 0.0 0.525 -0.235 0.525 -0.525 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 H 8.526 v -2.85 h -1.05 Z m -4.477 -1.0 c -0.164 -0.008 -0.316 -0.093 -0.409 -0.23 c -0.097 -0.145 -0.117 -0.329 -0.051 -0.49 l 3.075 -7.611 C 5.8 1.304 6.25 1.0 6.75 1.0 h 2.498 c 0.499 0.0 0.948 0.303 1.135 0.766 l 3.08 7.611 c 0.066 0.162 0.047 0.346 -0.05 0.49 c -0.093 0.138 -0.245 0.223 -0.41 0.231 H 3.0 Z")
        )
    }.build()
}
