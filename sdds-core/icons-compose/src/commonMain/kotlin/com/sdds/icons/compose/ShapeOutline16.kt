package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShapeOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShapeOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.688 10.083 h 0.511 c 0.58 0.0 1.05 0.47 1.051 1.05 v 2.066 l -0.006 0.108 c -0.05 0.494 -0.443 0.887 -0.937 0.937 l -0.108 0.006 h -2.066 l -0.108 -0.006 c -0.529 -0.054 -0.942 -0.501 -0.942 -1.045 v -0.511 H 5.917 v 0.511 l -0.006 0.108 c -0.05 0.494 -0.443 0.887 -0.937 0.937 L 4.866 14.25 H 2.8 l -0.108 -0.006 C 2.163 14.19 1.75 13.743 1.75 13.2 v -2.066 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 h 0.513 V 5.917 H 2.8 L 2.692 5.911 C 2.163 5.857 1.75 5.41 1.75 4.866 V 2.8 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 h 2.066 c 0.58 0.0 1.05 0.47 1.051 1.05 v 0.513 h 4.166 V 2.8 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 h 2.066 c 0.58 0.0 1.05 0.47 1.051 1.05 v 2.066 l -0.006 0.108 c -0.05 0.494 -0.443 0.887 -0.937 0.937 l -0.108 0.006 h -0.511 v 4.166 Z m -7.822 0.0 c 0.58 0.0 1.05 0.47 1.051 1.05 v 0.555 h 4.166 v -0.555 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 h 0.555 V 5.917 h -0.555 l -0.108 -0.006 c -0.529 -0.054 -0.942 -0.501 -0.942 -1.045 V 4.313 H 5.917 v 0.553 L 5.911 4.974 C 5.861 5.468 5.468 5.86 4.974 5.91 L 4.866 5.917 H 4.313 v 4.166 h 0.553 Z m -2.066 1.0 c -0.028 0.0 -0.05 0.022 -0.05 0.05 v 2.066 c 0.0 0.028 0.022 0.05 0.05 0.051 h 2.066 c 0.028 0.0 0.051 -0.023 0.051 -0.05 v -2.067 c 0.0 -0.027 -0.023 -0.05 -0.05 -0.05 H 2.8 Z m 8.333 0.0 c -0.027 0.0 -0.05 0.023 -0.05 0.05 v 2.066 c 0.0 0.028 0.022 0.05 0.05 0.051 h 2.066 c 0.028 0.0 0.051 -0.023 0.051 -0.05 v -2.067 c 0.0 -0.027 -0.023 -0.05 -0.05 -0.05 h -2.067 Z M 2.8 2.75 c -0.028 0.0 -0.05 0.022 -0.05 0.05 v 2.066 c 0.0 0.028 0.022 0.05 0.05 0.051 h 2.066 c 0.028 0.0 0.051 -0.023 0.051 -0.05 V 2.8 c 0.0 -0.028 -0.023 -0.05 -0.05 -0.05 H 2.8 Z m 8.333 0.0 c -0.027 0.0 -0.05 0.022 -0.05 0.05 v 2.066 c 0.0 0.028 0.022 0.05 0.05 0.051 h 2.066 c 0.028 0.0 0.051 -0.023 0.051 -0.05 V 2.8 c 0.0 -0.028 -0.023 -0.05 -0.05 -0.05 h -2.067 Z")
        )
    }.build()
}
