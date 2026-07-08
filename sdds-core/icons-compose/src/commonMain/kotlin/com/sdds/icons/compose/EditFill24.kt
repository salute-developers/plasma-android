package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EditFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EditFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 2.51 20.902 l 0.68 -3.397 c 0.394 0.021 0.783 0.11 1.15 0.261 c 0.424 0.176 0.81 0.434 1.135 0.76 c 0.325 0.324 0.583 0.71 0.759 1.135 c 0.151 0.366 0.24 0.755 0.26 1.15 L 3.099 21.49 c -0.35 0.07 -0.658 -0.238 -0.588 -0.588 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 8.226 19.95 c -0.091 0.092 -0.188 0.177 -0.29 0.255 c -0.061 -0.383 -0.167 -0.758 -0.317 -1.118 C 7.37 18.48 7.0 17.929 6.536 17.465 C 6.07 17.0 5.52 16.632 4.913 16.38 c -0.36 -0.15 -0.735 -0.256 -1.118 -0.317 c 0.078 -0.102 0.163 -0.199 0.254 -0.29 L 14.073 5.751 c 0.16 0.002 0.321 0.014 0.482 0.035 c 0.927 0.122 1.789 0.547 2.45 1.209 c 0.662 0.661 1.087 1.523 1.209 2.45 c 0.02 0.16 0.033 0.322 0.035 0.482 L 8.226 19.951 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 19.577 8.6 l 1.058 -1.059 c 1.153 -1.153 1.153 -3.023 0.0 -4.176 s -3.023 -1.153 -4.177 0.0 L 15.4 4.423 c 1.005 0.252 1.928 0.773 2.666 1.511 c 0.738 0.738 1.259 1.66 1.51 2.666 Z")
        )
    }.build()
}
