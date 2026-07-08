package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessageDraftOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessageDraftOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.92 3.017 c 1.397 -1.398 3.663 -1.398 5.06 0.0 c 1.398 1.397 1.398 3.663 0.0 5.06 L 9.13 19.928 c -0.49 0.49 -1.107 0.836 -1.782 0.997 l -4.424 1.053 c -0.254 0.06 -0.52 -0.015 -0.704 -0.2 c -0.184 -0.184 -0.26 -0.45 -0.2 -0.704 l 1.054 -4.424 c 0.16 -0.675 0.505 -1.292 0.996 -1.783 l 11.85 -11.85 Z m 4.0 1.06 c -0.812 -0.811 -2.128 -0.811 -2.94 0.0 l -0.659 0.66 c 0.646 0.285 1.239 0.689 1.745 1.195 c 0.506 0.506 0.91 1.098 1.195 1.744 l 0.659 -0.66 c 0.811 -0.81 0.811 -2.127 0.0 -2.938 Z m -1.83 4.769 c -0.195 -0.698 -0.568 -1.337 -1.085 -1.854 c -0.517 -0.517 -1.156 -0.89 -1.854 -1.086 L 5.131 15.927 c -0.295 0.294 -0.502 0.665 -0.598 1.07 l -0.066 0.278 c 1.03 0.406 1.85 1.226 2.255 2.255 L 7.0 19.464 c 0.405 -0.096 0.776 -0.303 1.07 -0.598 l 10.02 -10.02 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.531 21.5 l 2.0 -2.0 H 21.0 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 9.531 Z")
        )
    }.build()
}
