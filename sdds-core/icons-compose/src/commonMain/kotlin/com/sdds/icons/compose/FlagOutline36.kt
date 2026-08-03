package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlagOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlagOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 5.686 v 13.967 c 2.314 -1.125 4.34 -1.468 6.2 -1.326 c 2.221 0.168 4.106 1.024 5.79 1.822 l 0.289 0.137 c 1.612 0.766 3.024 1.437 4.574 1.647 c 1.462 0.197 3.107 -0.016 5.147 -1.168 V 6.871 c -1.995 0.974 -3.808 1.196 -5.523 0.961 c -1.961 -0.269 -3.733 -1.137 -5.349 -1.929 l -0.286 -0.14 c -1.747 -0.853 -3.347 -1.59 -5.116 -1.737 C 11.11 3.892 9.264 4.247 7.0 5.686 Z m 23.0 -0.539 h 1.0 c 0.0 -0.367 -0.202 -0.705 -0.525 -0.88 c -0.323 -0.174 -0.716 -0.157 -1.024 0.044 c -2.254 1.48 -4.076 1.763 -5.702 1.54 c -1.633 -0.224 -3.137 -0.96 -4.833 -1.789 L 18.72 3.966 c -1.721 -0.84 -3.636 -1.75 -5.829 -1.933 c -2.242 -0.186 -4.67 0.39 -7.454 2.288 C 5.164 4.507 5.0 4.817 5.0 5.147 h 1.0 h -1.0 V 31.5 C 5.0 32.052 5.448 32.5 6.0 32.5 s 1.0 -0.448 1.0 -1.0 v -9.59 c 2.437 -1.37 4.382 -1.716 6.05 -1.59 c 1.81 0.138 3.394 0.835 5.084 1.637 c 0.116 0.055 0.234 0.11 0.351 0.167 c 1.546 0.736 3.228 1.538 5.1 1.79 c 2.081 0.282 4.328 -0.114 6.94 -1.728 c 0.296 -0.182 0.475 -0.504 0.475 -0.85 V 5.146 h -1.0 Z")
        )
    }.build()
}
