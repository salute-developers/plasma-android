package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TvDashFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TvDashFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 29.749 4.082 c 0.39 -0.39 1.024 -0.39 1.414 0.0 c 0.39 0.39 0.39 1.024 0.0 1.414 L 5.707 30.952 c -0.39 0.39 -1.024 0.39 -1.414 0.0 c -0.39 -0.39 -0.39 -1.023 0.0 -1.414 L 6.0 27.831 v -0.33 h 0.33 l 1.79 -1.79 H 6.0 c -1.05 0.0 -1.575 0.0 -1.977 -0.204 c -0.352 -0.18 -0.64 -0.467 -0.819 -0.82 C 3.0 24.287 3.0 23.761 3.0 22.712 V 9.002 c 0.0 -1.05 0.0 -1.576 0.204 -1.977 c 0.18 -0.352 0.467 -0.64 0.82 -0.819 C 4.423 6.002 4.95 6.002 6.0 6.002 h 21.83 l 1.919 -1.92 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.0 29.502 H 9.918 l 2.0 -2.0 H 30.0 v 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 32.634 6.763 c 0.06 0.082 0.115 0.17 0.162 0.262 C 33.0 7.426 33.0 7.952 33.0 9.002 v 13.71 c 0.0 1.05 0.0 1.574 -0.204 1.975 c -0.18 0.353 -0.467 0.64 -0.82 0.82 c -0.4 0.204 -0.926 0.205 -1.976 0.205 H 13.708 L 32.516 6.904 C 32.56 6.86 32.6 6.812 32.634 6.763 Z")
        )
    }.build()
}
