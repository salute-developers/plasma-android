package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbSbFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbSbFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 30.0 15.0 c 0.0 6.627 -5.373 12.0 -12.0 12.0 S 6.0 21.627 6.0 15.0 S 11.373 3.0 18.0 3.0 c 4.5 0.0 8.422 2.477 10.476 6.142 l -6.618 4.877 l -5.235 -3.281 v 3.947 l 5.235 3.282 l 7.815 -5.76 C 29.887 13.103 30.0 14.038 30.0 15.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.75 29.625 c 0.0 -0.503 0.522 -0.793 1.003 -0.643 C 15.094 29.4 16.52 29.625 18.0 29.625 c 1.48 0.0 2.906 -0.225 4.247 -0.643 c 0.48 -0.15 1.003 0.14 1.003 0.643 c 0.0 2.9 -2.35 5.25 -5.25 5.25 s -5.25 -2.35 -5.25 -5.25 Z")
        )
    }.build()
}
