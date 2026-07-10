package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RuTubeAltFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RuTubeAltFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.652 5.531 c 0.437 0.0 0.791 0.047 1.075 0.131 c 0.283 0.096 0.52 0.24 0.732 0.442 c 0.2 0.215 0.343 0.454 0.426 0.729 c 0.082 0.275 0.13 0.633 0.13 1.087 v 0.598 c 0.0 0.764 -0.13 1.337 -0.39 1.696 c -0.26 0.358 -0.575 0.576 -1.275 0.681 L 11.25 13.5 H 9.042 l -1.725 -2.593 H 3.683 V 13.5 H 1.71 V 5.531 h 6.942 Z m -4.97 1.757 v 1.863 h 4.651 c 0.272 0.0 0.46 -0.035 0.556 -0.119 c 0.094 -0.084 0.153 -0.238 0.153 -0.477 v -0.67 c 0.0 -0.226 -0.059 -0.381 -0.153 -0.465 c -0.095 -0.084 -0.284 -0.132 -0.556 -0.132 h -4.65 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.767 2.5 c 0.836 0.0 1.514 0.679 1.514 1.516 c 0.0 0.836 -0.678 1.514 -1.514 1.514 c -0.837 0.0 -1.516 -0.678 -1.516 -1.514 c 0.0 -0.837 0.679 -1.516 1.516 -1.516 Z")
        )
    }.build()
}
