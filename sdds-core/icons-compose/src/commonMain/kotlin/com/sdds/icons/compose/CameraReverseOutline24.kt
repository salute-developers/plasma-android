package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CameraReverseOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CameraReverseOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.28 2.22 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 L 17.94 4.0 H 7.517 c -0.813 0.0 -1.469 0.0 -2.0 0.043 c -0.546 0.045 -1.026 0.14 -1.47 0.366 c -0.706 0.36 -1.28 0.933 -1.64 1.639 c -0.226 0.444 -0.32 0.924 -0.365 1.47 C 2.0 8.05 2.0 8.706 2.0 9.519 v 6.232 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -6.2 c 0.0 -0.852 0.0 -1.447 0.038 -1.91 c 0.037 -0.453 0.107 -0.714 0.207 -0.911 c 0.216 -0.424 0.56 -0.768 0.984 -0.984 c 0.197 -0.1 0.458 -0.17 0.912 -0.207 C 6.103 5.501 6.698 5.5 7.55 5.5 h 10.39 l -0.72 0.72 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 2.0 -2.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -2.0 -2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 22.0 8.25 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 20.5 7.836 20.5 8.25 v 6.2 c 0.0 0.853 0.0 1.447 -0.038 1.91 c -0.038 0.453 -0.107 0.714 -0.207 0.912 c -0.216 0.423 -0.56 0.767 -0.983 0.983 c -0.198 0.1 -0.459 0.17 -0.913 0.207 c -0.462 0.037 -1.057 0.038 -1.909 0.038 H 6.06 l 0.72 -0.72 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -2.0 2.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 l 2.0 2.0 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 L 6.06 20.0 h 10.422 c 0.813 0.0 1.469 0.0 2.0 -0.043 c 0.546 -0.045 1.026 -0.14 1.47 -0.366 c 0.706 -0.36 1.28 -0.933 1.64 -1.639 c 0.226 -0.444 0.32 -0.924 0.365 -1.47 C 22.0 15.95 22.0 15.295 22.0 14.482 V 8.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.25 c -2.623 0.0 -4.75 2.127 -4.75 4.75 s 2.127 4.75 4.75 4.75 s 4.75 -2.127 4.75 -4.75 S 14.623 7.25 12.0 7.25 Z M 8.75 12.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 s 3.25 1.455 3.25 3.25 s -1.455 3.25 -3.25 3.25 S 8.75 13.795 8.75 12.0 Z")
        )
    }.build()
}
