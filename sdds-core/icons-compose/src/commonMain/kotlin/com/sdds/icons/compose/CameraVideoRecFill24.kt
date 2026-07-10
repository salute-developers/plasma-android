package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoRecFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoRecFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 8.857 C 2.0 7.28 3.28 6.0 4.857 6.0 h 8.286 C 14.72 6.0 16.0 7.28 16.0 8.857 v 6.286 C 16.0 16.72 14.72 18.0 13.143 18.0 H 4.857 C 3.28 18.0 2.0 16.72 2.0 15.143 V 8.857 Z m 7.0 5.393 c 1.243 0.0 2.25 -1.007 2.25 -2.25 S 10.243 9.75 9.0 9.75 S 6.75 10.757 6.75 12.0 S 7.757 14.25 9.0 14.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.375 8.126 C 20.975 7.526 22.0 7.95 22.0 8.799 v 6.703 c 0.0 0.866 -1.061 1.282 -1.65 0.648 l -3.226 -3.477 c -0.348 -0.376 -0.337 -0.96 0.025 -1.322 l 3.226 -3.225 Z")
        )
    }.build()
}
