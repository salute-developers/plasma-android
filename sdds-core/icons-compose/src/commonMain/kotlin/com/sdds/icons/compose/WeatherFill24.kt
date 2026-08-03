package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.WeatherFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "WeatherFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.876 19.214 c 0.23 -0.345 0.695 -0.438 1.04 -0.208 c 0.345 0.23 0.438 0.695 0.208 1.04 l -1.0 1.5 c -0.23 0.345 -0.695 0.438 -1.04 0.208 c -0.345 -0.23 -0.438 -0.696 -0.208 -1.04 l 1.0 -1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.876 19.214 c 0.23 -0.345 0.695 -0.438 1.04 -0.208 c 0.345 0.23 0.438 0.695 0.208 1.04 l -1.0 1.5 c -0.23 0.345 -0.695 0.438 -1.04 0.208 c -0.345 -0.23 -0.438 -0.696 -0.208 -1.04 l 1.0 -1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.1 9.18 c 0.9 -5.05 8.4 -5.55 9.8 -0.05 c 5.596 0.917 4.796 7.723 0.766 8.843 c -0.013 0.024 -0.026 0.05 -0.042 0.073 l -1.0 1.5 c -0.23 0.345 -0.695 0.438 -1.04 0.208 c -0.345 -0.23 -0.438 -0.696 -0.208 -1.04 l 0.39 -0.584 h -3.198 l -0.944 1.416 c -0.23 0.345 -0.695 0.438 -1.04 0.208 c -0.345 -0.23 -0.438 -0.696 -0.208 -1.04 l 0.39 -0.584 H 8.568 l -0.944 1.416 c -0.23 0.345 -0.695 0.438 -1.04 0.208 c -0.345 -0.23 -0.438 -0.696 -0.208 -1.04 l 0.441 -0.664 c -2.111 -0.389 -3.471 -2.008 -3.77 -3.795 c -0.5 -3.0 2.553 -5.575 5.053 -5.075 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.0 2.13 c 1.696 0.0 3.194 0.844 4.099 2.135 c -1.626 0.373 -3.063 1.518 -3.578 3.35 c -0.076 0.27 -0.342 0.45 -0.622 0.439 c -1.444 -0.058 -2.978 0.812 -3.859 2.129 C 2.388 9.338 2.0 8.279 2.0 7.13 c 0.0 -2.762 2.239 -5.0 5.0 -5.0 Z")
        )
    }.build()
}
