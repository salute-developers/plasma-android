package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BallFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BallFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.716 18.0 c 0.0 -4.329 0.809 -8.193 2.068 -10.932 C 15.087 4.23 16.66 3.0 18.0 3.0 c 8.284 0.0 15.0 6.716 15.0 15.0 c 0.0 1.34 -1.23 2.913 -4.068 4.216 c -2.74 1.26 -6.604 2.068 -10.932 2.068 c -2.053 0.0 -4.002 -0.182 -5.776 -0.508 c -0.326 -1.774 -0.508 -3.723 -0.508 -5.776 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 32.16 22.962 c -0.692 0.488 -1.467 0.922 -2.288 1.3 c -3.096 1.422 -7.295 2.272 -11.872 2.272 c -1.817 0.0 -3.575 -0.134 -5.227 -0.385 c 0.289 1.019 0.629 1.953 1.01 2.783 C 15.088 31.77 16.66 33.0 18.0 33.0 c 6.545 0.0 12.111 -4.192 14.16 -10.038 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.037 32.16 c -0.487 -0.692 -0.92 -1.467 -1.298 -2.288 c -0.569 -1.238 -1.046 -2.652 -1.414 -4.197 c -1.544 -0.368 -2.959 -0.845 -4.197 -1.414 c -0.82 -0.377 -1.596 -0.811 -2.288 -1.299 c 1.505 4.293 4.905 7.693 9.197 9.198 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 18.0 c 0.0 1.34 1.23 2.913 4.068 4.216 c 0.83 0.382 1.764 0.722 2.783 1.011 C 9.6 21.575 9.466 19.817 9.466 18.0 c 0.0 -4.577 0.85 -8.775 2.273 -11.872 c 0.377 -0.82 0.811 -1.596 1.298 -2.288 C 7.192 5.89 3.0 11.455 3.0 18.0 Z")
        )
    }.build()
}
