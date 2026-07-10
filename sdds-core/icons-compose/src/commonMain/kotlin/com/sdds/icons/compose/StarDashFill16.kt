package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.StarDashFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "StarDashFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.232 2.354 c 0.196 -0.196 0.196 -0.512 0.0 -0.708 c -0.195 -0.195 -0.511 -0.195 -0.707 0.0 L 9.902 5.27 L 8.656 2.274 c -0.243 -0.583 -1.069 -0.583 -1.312 0.0 L 5.936 5.66 L 2.281 5.953 C 1.651 6.003 1.397 6.789 1.876 7.2 l 2.785 2.385 L 4.37 10.8 l -2.725 2.725 c -0.195 0.195 -0.195 0.512 0.0 0.707 c 0.195 0.195 0.512 0.195 0.707 0.0 l 11.88 -11.88 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.87 13.922 C 4.607 14.084 4.31 14.05 4.096 13.9 l 8.071 -8.07 l 1.553 0.124 c 0.63 0.05 0.884 0.836 0.405 1.247 l -2.785 2.385 l 0.85 3.566 c 0.147 0.615 -0.52 1.1 -1.06 0.771 L 8.0 12.011 l -3.13 1.911 Z")
        )
    }.build()
}
