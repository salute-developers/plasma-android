package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.InProgressFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "InProgressFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 3.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 Z m 6.429 10.714 c -2.367 0.0 -4.286 1.92 -4.286 4.286 c 0.0 2.367 1.919 4.286 4.286 4.286 c 2.367 0.0 4.285 -1.92 4.285 -4.286 c 0.0 -2.367 -1.918 -4.286 -4.285 -4.286 Z m -15.0 2.143 c -1.184 0.0 -2.143 0.96 -2.143 2.143 c 0.0 1.183 0.96 2.143 2.143 2.143 c 1.183 0.0 2.142 -0.96 2.142 -2.143 c 0.0 -1.183 -0.959 -2.143 -2.142 -2.143 Z M 13.714 18.0 c 0.0 -1.183 0.96 -2.143 2.143 -2.143 C 17.041 15.857 18.0 16.817 18.0 18.0 c 0.0 1.183 -0.96 2.143 -2.143 2.143 c -1.183 0.0 -2.143 -0.96 -2.143 -2.143 Z")
        )
    }.build()
}
