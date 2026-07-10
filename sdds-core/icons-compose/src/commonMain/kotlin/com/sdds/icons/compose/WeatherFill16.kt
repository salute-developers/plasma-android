package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WeatherFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WeatherFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.839 13.11 C 6.0 12.866 6.329 12.8 6.57 12.963 c 0.243 0.163 0.308 0.493 0.147 0.737 l -0.704 1.064 c -0.162 0.244 -0.49 0.31 -0.732 0.147 s -0.308 -0.493 -0.146 -0.737 l 0.703 -1.064 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.358 13.11 c 0.162 -0.244 0.49 -0.31 0.732 -0.147 s 0.308 0.493 0.146 0.737 l -0.704 1.064 c -0.162 0.244 -0.489 0.31 -0.731 0.147 c -0.243 -0.163 -0.308 -0.493 -0.147 -0.737 l 0.704 -1.064 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.293 5.997 c 0.634 -3.58 5.912 -3.934 6.897 -0.035 c 3.94 0.65 3.375 5.479 0.536 6.27 c -0.01 0.016 -0.016 0.034 -0.027 0.05 l -0.703 1.064 c -0.162 0.244 -0.49 0.31 -0.732 0.147 c -0.243 -0.163 -0.308 -0.493 -0.147 -0.737 l 0.275 -0.414 h -2.25 l -0.665 1.004 c -0.162 0.244 -0.49 0.31 -0.732 0.147 S 7.437 13.0 7.6 12.756 l 0.274 -0.414 h -2.25 l -0.665 1.004 c -0.162 0.244 -0.489 0.31 -0.731 0.147 C 3.984 13.33 3.918 13.0 4.08 12.756 l 0.313 -0.475 c -1.487 -0.275 -2.446 -1.42 -2.656 -2.686 c -0.351 -2.127 1.797 -3.952 3.556 -3.598 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.519 1.0 c 1.193 0.0 2.248 0.599 2.884 1.514 C 6.26 2.779 5.247 3.59 4.885 4.889 c -0.054 0.19 -0.24 0.318 -0.437 0.31 c -1.017 -0.04 -2.097 0.576 -2.717 1.509 C 1.273 6.109 1.0 5.358 1.0 4.544 C 1.0 2.587 2.575 1.0 4.519 1.0 Z")
        )
    }.build()
}
