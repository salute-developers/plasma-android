package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraVideoAddFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraVideoAddFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.0 8.857 C 2.0 7.28 3.28 6.0 4.857 6.0 h 8.286 C 14.72 6.0 16.0 7.28 16.0 8.857 v 6.286 C 16.0 16.72 14.72 18.0 13.143 18.0 H 12.98 C 12.994 17.835 13.0 17.668 13.0 17.5 c 0.0 -3.59 -2.91 -6.5 -6.5 -6.5 c -1.747 0.0 -3.332 0.689 -4.5 1.81 V 8.857 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.375 8.126 C 20.975 7.526 22.0 7.95 22.0 8.799 v 6.703 c 0.0 0.866 -1.061 1.282 -1.65 0.648 l -3.226 -3.477 c -0.348 -0.376 -0.337 -0.96 0.025 -1.322 l 3.226 -3.225 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.5 23.0 c 3.038 0.0 5.5 -2.462 5.5 -5.5 S 9.538 12.0 6.5 12.0 S 1.0 14.462 1.0 17.5 S 3.462 23.0 6.5 23.0 Z M 7.0 14.5 C 7.0 14.224 6.776 14.0 6.5 14.0 S 6.0 14.224 6.0 14.5 V 17.0 H 3.5 C 3.224 17.0 3.0 17.224 3.0 17.5 S 3.224 18.0 3.5 18.0 H 6.0 v 2.5 C 6.0 20.776 6.224 21.0 6.5 21.0 S 7.0 20.776 7.0 20.5 V 18.0 h 2.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 9.776 17.0 9.5 17.0 H 7.0 v -2.5 Z")
        )
    }.build()
}
