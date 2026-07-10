package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TimerFastFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TimerFastFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.7 2.0 C 8.422 2.0 8.2 2.224 8.2 2.5 S 8.422 3.0 8.7 3.0 h 0.9 v 0.9 C 7.128 4.146 5.2 6.195 5.2 8.688 c 0.0 2.658 2.193 4.812 4.9 4.812 c 2.706 0.0 4.9 -2.154 4.9 -4.812 c 0.0 -2.492 -1.93 -4.542 -4.4 -4.788 V 3.0 h 0.9 C 11.774 3.0 12.0 2.776 12.0 2.5 S 11.774 2.0 11.5 2.0 H 8.7 Z M 2.4 4.75 c -0.276 0.0 -0.5 0.225 -0.5 0.5 c 0.0 0.277 0.224 0.5 0.5 0.5 h 2.45 c 0.277 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.275 -0.223 -0.5 -0.5 -0.5 H 2.4 Z M 1.0 7.5 C 0.724 7.5 0.5 7.726 0.5 8.0 c 0.0 0.277 0.224 0.5 0.5 0.5 h 2.45 c 0.276 0.0 0.5 -0.223 0.5 -0.5 c 0.0 -0.275 -0.224 -0.5 -0.5 -0.5 H 1.0 Z m 0.2 3.25 c 0.0 -0.275 0.223 -0.5 0.5 -0.5 h 2.45 c 0.275 0.0 0.5 0.225 0.5 0.5 c 0.0 0.277 -0.225 0.5 -0.5 0.5 H 1.7 c -0.277 0.0 -0.5 -0.223 -0.5 -0.5 Z m 11.0 -3.424 c 0.197 -0.193 0.2 -0.51 0.006 -0.707 c -0.193 -0.197 -0.51 -0.2 -0.707 -0.006 L 9.75 8.332 c -0.197 0.193 -0.2 0.51 -0.006 0.707 c 0.193 0.197 0.51 0.2 0.707 0.006 l 1.75 -1.719 Z")
        )
    }.build()
}
