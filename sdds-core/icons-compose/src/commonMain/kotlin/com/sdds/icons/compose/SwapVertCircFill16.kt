package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapVertCircFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapVertCircFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.0 8.0 c 0.0 -3.866 -3.134 -7.0 -7.0 -7.0 S 1.0 4.134 1.0 8.0 s 3.134 7.0 7.0 7.0 s 7.0 -3.134 7.0 -7.0 Z M 4.479 9.904 c 0.205 -0.205 0.537 -0.205 0.742 0.0 l 0.504 0.504 V 4.325 C 5.725 4.035 5.96 3.8 6.25 3.8 c 0.29 0.0 0.525 0.235 0.525 0.525 v 7.35 c 0.0 0.212 -0.128 0.404 -0.324 0.485 c -0.196 0.081 -0.422 0.036 -0.572 -0.114 l -1.4 -1.4 c -0.205 -0.205 -0.205 -0.537 0.0 -0.742 Z m 7.042 -3.808 c -0.205 0.205 -0.537 0.205 -0.742 0.0 l -0.504 -0.504 v 6.083 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -7.35 c 0.0 -0.212 0.128 -0.404 0.324 -0.485 c 0.196 -0.081 0.422 -0.036 0.572 0.114 l 1.4 1.4 c 0.205 0.205 0.205 0.537 0.0 0.742 Z")
        )
    }.build()
}
