package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.Mir16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Mir16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.314 6.25 h -0.02 H 1.0 v 3.5 h 1.251 V 7.686 h 0.084 L 3.032 9.75 h 0.941 l 0.698 -2.062 h 0.084 V 9.75 h 1.25 v -3.5 H 4.779 h -0.03 C 4.571 6.248 4.211 6.244 4.061 6.706 C 3.97 6.994 3.8 7.531 3.55 8.318 H 3.456 C 3.224 7.572 3.055 7.034 2.949 6.706 C 2.799 6.243 2.455 6.248 2.314 6.25 Z m 5.488 2.064 V 6.251 H 6.525 V 9.75 h 1.21 s 0.368 -0.03 0.533 -0.367 l 0.831 -1.697 h 0.1 V 9.75 h 1.277 v -3.5 h -1.21 S 8.915 6.28 8.75 6.618 L 7.902 8.314 h -0.1 Z m 5.732 0.394 c 0.619 0.0 1.178 -0.332 1.356 -0.794 h -3.91 V 9.75 h 1.214 V 8.708 h 1.34 Z M 10.917 6.25 h 2.676 c 1.03 0.0 1.527 0.798 1.383 1.446 H 12.47 c -0.757 0.0 -1.49 -0.667 -1.553 -1.446 Z")
        )
    }.build()
}
