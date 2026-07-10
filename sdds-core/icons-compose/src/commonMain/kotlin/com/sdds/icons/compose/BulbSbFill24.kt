package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbSbFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbSbFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.0 9.75 c 0.0 4.418 -3.582 8.0 -8.0 8.0 s -8.0 -3.582 -8.0 -8.0 s 3.582 -8.0 8.0 -8.0 c 3.0 0.0 5.614 1.651 6.984 4.095 l -4.412 3.251 l -3.49 -2.187 V 9.54 l 3.49 2.188 l 5.21 -3.84 C 19.925 8.485 20.0 9.108 20.0 9.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.5 19.5 c 0.0 -0.335 0.348 -0.529 0.668 -0.43 c 0.895 0.28 1.846 0.43 2.832 0.43 c 0.986 0.0 1.937 -0.15 2.832 -0.43 c 0.32 -0.099 0.668 0.095 0.668 0.43 c 0.0 1.933 -1.567 3.5 -3.5 3.5 s -3.5 -1.567 -3.5 -3.5 Z")
        )
    }.build()
}
