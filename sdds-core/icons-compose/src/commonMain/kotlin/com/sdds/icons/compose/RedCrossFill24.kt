package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RedCrossFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RedCrossFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.69 2.956 C 8.5 3.33 8.5 3.82 8.5 4.8 v 3.7 H 4.8 c -0.98 0.0 -1.47 0.0 -1.844 0.19 C 2.626 8.86 2.359 9.127 2.19 9.457 C 2.0 9.83 2.0 10.32 2.0 11.3 v 1.4 c 0.0 0.98 0.0 1.47 0.19 1.845 c 0.169 0.329 0.436 0.597 0.766 0.764 C 3.33 15.5 3.82 15.5 4.8 15.5 h 3.7 v 3.7 c 0.0 0.98 0.0 1.47 0.19 1.845 c 0.169 0.329 0.436 0.596 0.766 0.764 C 9.83 22.0 10.32 22.0 11.3 22.0 h 1.4 c 0.98 0.0 1.47 0.0 1.845 -0.19 c 0.329 -0.168 0.597 -0.436 0.764 -0.765 C 15.5 20.67 15.5 20.18 15.5 19.2 v -3.7 h 3.7 c 0.98 0.0 1.47 0.0 1.845 -0.19 c 0.329 -0.168 0.596 -0.436 0.764 -0.766 C 22.0 14.17 22.0 13.68 22.0 12.7 v -1.4 c 0.0 -0.98 0.0 -1.47 -0.19 -1.844 c -0.168 -0.33 -0.436 -0.597 -0.765 -0.765 C 20.67 8.5 20.18 8.5 19.2 8.5 h -3.7 V 4.8 c 0.0 -0.98 0.0 -1.47 -0.19 -1.844 c -0.168 -0.33 -0.436 -0.597 -0.766 -0.765 C 14.17 2.0 13.68 2.0 12.7 2.0 h -1.4 c -0.98 0.0 -1.47 0.0 -1.844 0.19 C 9.126 2.36 8.859 2.627 8.69 2.957 Z")
        )
    }.build()
}
