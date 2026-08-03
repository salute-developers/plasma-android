package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbSbFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbSbFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.6 6.6 c 0.0 3.093 -2.507 5.6 -5.6 5.6 c -3.093 0.0 -5.6 -2.507 -5.6 -5.6 C 2.4 3.507 4.907 1.0 8.0 1.0 c 2.1 0.0 3.93 1.156 4.889 2.866 L 9.8 6.142 L 7.358 4.611 v 1.842 L 9.8 7.985 l 3.647 -2.689 C 13.547 5.715 13.6 6.151 13.6 6.6 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.55 13.425 c 0.0 -0.236 0.244 -0.371 0.468 -0.301 c 0.626 0.195 1.292 0.3 1.982 0.3 s 1.356 -0.105 1.982 -0.3 c 0.224 -0.07 0.468 0.066 0.468 0.3 c 0.0 1.354 -1.097 2.45 -2.45 2.45 c -1.353 0.0 -2.45 -1.096 -2.45 -2.45 Z")
        )
    }.build()
}
