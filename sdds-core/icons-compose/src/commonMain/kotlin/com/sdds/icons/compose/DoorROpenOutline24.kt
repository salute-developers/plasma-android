package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorROpenOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorROpenOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 13.0 c -0.552 0.0 -1.0 -0.447 -1.0 -1.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 c 0.0 0.553 -0.448 1.0 -1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.237 1.65 C 10.117 1.326 9.0 2.166 9.0 3.331 v 0.17 H 5.75 C 4.784 3.5 4.0 4.284 4.0 5.25 v 13.5 c 0.0 0.966 0.784 1.75 1.75 1.75 H 9.0 v 0.17 c 0.0 1.164 1.117 2.004 2.237 1.68 l 7.5 -2.171 C 19.485 19.963 20.0 19.278 20.0 18.5 V 5.501 c 0.0 -0.779 -0.515 -1.464 -1.263 -1.68 l -7.5 -2.172 Z M 10.5 3.331 v 17.34 c 0.0 0.166 0.16 0.285 0.32 0.24 l 7.5 -2.172 c 0.106 -0.03 0.18 -0.129 0.18 -0.24 V 5.502 c 0.0 -0.111 -0.074 -0.209 -0.18 -0.24 l -7.5 -2.171 c -0.16 -0.046 -0.32 0.074 -0.32 0.24 Z")
        )
    }.build()
}
