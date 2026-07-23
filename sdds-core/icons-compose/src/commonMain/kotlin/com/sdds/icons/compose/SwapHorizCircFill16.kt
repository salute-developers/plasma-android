package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapHorizCircFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapHorizCircFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 15.0 c 3.866 0.0 7.0 -3.134 7.0 -7.0 s -3.134 -7.0 -7.0 -7.0 s -7.0 3.134 -7.0 7.0 s 3.134 7.0 7.0 7.0 Z M 6.096 4.479 c 0.205 0.205 0.205 0.537 0.0 0.742 L 5.592 5.725 h 6.083 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 h -7.35 c -0.212 0.0 -0.404 -0.128 -0.485 -0.324 c -0.081 -0.196 -0.036 -0.422 0.114 -0.572 l 1.4 -1.4 c 0.205 -0.205 0.537 -0.205 0.742 0.0 Z m 3.808 7.042 c -0.205 -0.205 -0.205 -0.537 0.0 -0.742 l 0.504 -0.504 H 4.325 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 h 7.35 c 0.212 0.0 0.404 0.128 0.485 0.324 c 0.081 0.196 0.036 0.422 -0.114 0.572 l -1.4 1.4 c -0.205 0.205 -0.537 0.205 -0.742 0.0 Z")
        )
    }.build()
}
