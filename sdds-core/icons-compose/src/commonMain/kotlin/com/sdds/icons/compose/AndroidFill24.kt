package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AndroidFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AndroidFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.868 16.913 c 0.0 0.547 -0.46 0.99 -1.028 0.99 h -1.175 v 2.807 c 0.0 0.712 -0.59 1.29 -1.318 1.29 c -0.73 0.0 -1.32 -0.578 -1.32 -1.29 v -2.807 h -2.053 v 2.807 c 0.0 0.712 -0.591 1.29 -1.32 1.29 c -0.728 0.0 -1.319 -0.578 -1.319 -1.29 v -2.807 H 7.161 c -0.567 0.0 -1.029 -0.443 -1.03 -0.99 V 9.035 h 11.737 v 7.878 Z m 2.3 -7.955 c 0.737 0.0 1.332 0.584 1.332 1.304 v 5.093 c 0.0 0.72 -0.595 1.304 -1.331 1.304 c -0.735 0.0 -1.332 -0.584 -1.332 -1.304 v -5.093 c 0.0 -0.72 0.597 -1.304 1.332 -1.304 Z M 3.833 8.96 c 0.736 0.0 1.331 0.583 1.331 1.303 v 5.091 c 0.0 0.719 -0.595 1.303 -1.331 1.303 S 2.5 16.073 2.5 15.354 v -5.091 c 0.0 -0.72 0.596 -1.303 1.332 -1.303 Z m 11.562 -6.756 c 0.149 -0.213 0.45 -0.268 0.671 -0.123 c 0.222 0.145 0.279 0.435 0.128 0.647 l -1.115 1.58 c 1.561 0.802 2.645 2.187 2.79 3.798 H 6.132 c 0.145 -1.61 1.23 -2.996 2.79 -3.798 l -1.115 -1.58 c -0.15 -0.212 -0.094 -0.502 0.128 -0.647 c 0.22 -0.145 0.521 -0.09 0.672 0.122 l 1.217 1.722 C 10.498 3.7 11.23 3.57 12.0 3.57 c 0.77 0.0 1.502 0.13 2.177 0.355 l 1.217 -1.722 Z M 9.525 5.293 c -0.359 0.0 -0.65 0.28 -0.65 0.625 s 0.292 0.626 0.65 0.626 c 0.359 0.0 0.649 -0.281 0.649 -0.626 s -0.29 -0.625 -0.649 -0.625 Z m 5.033 0.0 c -0.36 0.0 -0.65 0.28 -0.65 0.625 s 0.29 0.626 0.65 0.626 c 0.358 0.0 0.649 -0.28 0.649 -0.626 c 0.0 -0.345 -0.291 -0.625 -0.65 -0.625 Z")
        )
    }.build()
}
