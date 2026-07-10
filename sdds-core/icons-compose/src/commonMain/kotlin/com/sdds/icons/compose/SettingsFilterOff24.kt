package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SettingsFilterOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SettingsFilterOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 21.015 4.045 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.061 0.0 l -2.43 2.43 C 17.076 5.151 16.555 5.0 16.0 5.0 c -1.398 0.0 -2.572 0.956 -2.905 2.25 H 3.0 C 2.586 7.25 2.25 7.586 2.25 8.0 S 2.586 8.75 3.0 8.75 h 10.095 c 0.07 0.275 0.18 0.535 0.32 0.773 l -3.892 3.892 C 9.077 13.151 8.556 13.0 8.0 13.0 c -1.398 0.0 -2.572 0.956 -2.905 2.25 H 3.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 2.586 16.75 3.0 16.75 h 2.095 c 0.07 0.275 0.18 0.535 0.32 0.773 l -2.432 2.432 c -0.292 0.293 -0.292 0.768 0.0 1.06 c 0.293 0.293 0.768 0.293 1.061 0.0 l 16.97 -16.97 Z M 6.55 16.388 l 1.837 -1.837 C 8.264 14.518 8.134 14.5 8.0 14.5 c -0.828 0.0 -1.5 0.672 -1.5 1.5 c 0.0 0.134 0.018 0.264 0.05 0.388 Z m 8.0 -8.0 l 1.837 -1.837 C 16.264 6.518 16.134 6.5 16.0 6.5 c -0.828 0.0 -1.5 0.672 -1.5 1.5 c 0.0 0.134 0.018 0.264 0.05 0.388 Z m -2.62 6.862 l -3.745 3.744 c 1.315 -0.08 2.401 -1.008 2.72 -2.244 H 21.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -9.07 Z m 8.0 -8.0 l -3.745 3.744 c 1.315 -0.08 2.401 -1.008 2.72 -2.244 H 21.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 21.414 7.25 21.0 7.25 h -1.07 Z")
        )
    }.build()
}
