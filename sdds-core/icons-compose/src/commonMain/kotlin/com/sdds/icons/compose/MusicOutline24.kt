package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MusicOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MusicOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.5 14.024 V 7.257 l -9.0 2.572 v 8.934 c 0.0 1.795 -1.455 3.25 -3.25 3.25 S 3.0 20.558 3.0 18.763 s 1.455 -3.25 3.25 -3.25 c 0.644 0.0 1.245 0.187 1.75 0.51 V 6.395 C 8.0 5.39 8.666 4.507 9.632 4.231 l 7.5 -2.143 C 18.569 1.678 20.0 2.757 20.0 4.25 v 12.512 c 0.0 1.795 -1.455 3.25 -3.25 3.25 s -3.25 -1.455 -3.25 -3.25 s 1.455 -3.25 3.25 -3.25 c 0.644 0.0 1.245 0.187 1.75 0.51 Z M 17.544 3.53 c 0.48 -0.137 0.956 0.223 0.956 0.721 v 1.446 l -9.0 2.571 V 6.394 c 0.0 -0.335 0.222 -0.629 0.544 -0.72 l 7.5 -2.144 Z M 18.5 16.763 c 0.0 -0.967 -0.784 -1.75 -1.75 -1.75 S 15.0 15.796 15.0 16.763 c 0.0 0.966 0.784 1.75 1.75 1.75 s 1.75 -0.784 1.75 -1.75 Z m -10.5 2.0 c 0.0 -0.967 -0.784 -1.75 -1.75 -1.75 s -1.75 0.783 -1.75 1.75 c 0.0 0.966 0.784 1.75 1.75 1.75 S 8.0 19.729 8.0 18.763 Z")
        )
    }.build()
}
