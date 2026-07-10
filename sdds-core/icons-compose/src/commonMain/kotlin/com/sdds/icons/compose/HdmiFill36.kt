package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.HdmiFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "HdmiFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 27.66 23.613 c 0.264 -0.162 0.491 -0.39 0.945 -0.843 l 3.165 -3.165 c 0.454 -0.454 0.68 -0.68 0.843 -0.946 c 0.144 -0.235 0.25 -0.49 0.315 -0.758 C 33.0 17.598 33.0 17.277 33.0 16.635 V 16.2 c 0.0 -1.47 0.0 -2.205 -0.286 -2.767 c -0.252 -0.494 -0.653 -0.895 -1.147 -1.147 C 31.005 12.0 30.27 12.0 28.8 12.0 H 7.2 c -1.47 0.0 -2.205 0.0 -2.767 0.286 c -0.494 0.252 -0.895 0.653 -1.147 1.147 C 3.0 13.995 3.0 14.73 3.0 16.2 v 0.435 c 0.0 0.642 0.0 0.963 0.073 1.265 c 0.064 0.268 0.17 0.524 0.314 0.76 c 0.162 0.264 0.39 0.491 0.843 0.945 l 3.165 3.165 c 0.454 0.454 0.68 0.68 0.946 0.843 c 0.235 0.144 0.49 0.25 0.759 0.314 C 9.402 24.0 9.723 24.0 10.365 24.0 h 15.27 c 0.642 0.0 0.963 0.0 1.265 -0.073 c 0.268 -0.064 0.524 -0.17 0.76 -0.314 Z m -3.285 -4.988 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -12.75 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 12.75 Z")
        )
    }.build()
}
