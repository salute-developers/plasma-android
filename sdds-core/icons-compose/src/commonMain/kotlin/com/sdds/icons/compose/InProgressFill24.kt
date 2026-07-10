package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.InProgressFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "InProgressFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 C 6.477 2.0 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 Z m 4.286 7.143 c -1.578 0.0 -2.857 1.279 -2.857 2.857 c 0.0 1.578 1.279 2.857 2.857 2.857 c 1.578 0.0 2.857 -1.279 2.857 -2.857 c 0.0 -1.578 -1.28 -2.857 -2.857 -2.857 Z m -10.0 1.428 c -0.79 0.0 -1.429 0.64 -1.429 1.429 s 0.64 1.429 1.429 1.429 S 7.714 12.789 7.714 12.0 s -0.64 -1.429 -1.428 -1.429 Z M 9.143 12.0 c 0.0 -0.789 0.64 -1.429 1.428 -1.429 c 0.79 0.0 1.429 0.64 1.429 1.429 s -0.64 1.429 -1.429 1.429 S 9.143 12.789 9.143 12.0 Z")
        )
    }.build()
}
