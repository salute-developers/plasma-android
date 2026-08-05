package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageGoToFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageGoToFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.47 17.89 c 0.0 -6.981 5.662 -12.64 12.646 -12.64 c 6.757 0.0 12.276 5.297 12.628 11.963 H 18.91 l 2.831 -2.83 c 0.391 -0.39 0.391 -1.024 0.0 -1.414 c -0.39 -0.39 -1.023 -0.39 -1.414 0.0 l -4.539 4.537 c -0.188 0.187 -0.293 0.442 -0.293 0.707 c 0.0 0.265 0.105 0.52 0.293 0.707 l 4.54 4.538 c 0.39 0.39 1.023 0.39 1.414 0.0 c 0.39 -0.391 0.39 -1.024 0.0 -1.415 l -2.832 -2.83 h 11.782 c -0.662 6.359 -6.04 11.317 -12.577 11.317 c -1.503 0.0 -2.946 -0.263 -4.285 -0.745 c -0.804 -0.29 -1.594 -0.373 -2.29 -0.178 l -3.819 1.069 c -1.46 0.409 -2.807 -0.937 -2.398 -2.397 l 1.07 -3.818 c 0.194 -0.695 0.111 -1.484 -0.179 -2.288 c -0.482 -1.339 -0.744 -2.781 -0.744 -4.283 Z")
        )
    }.build()
}
