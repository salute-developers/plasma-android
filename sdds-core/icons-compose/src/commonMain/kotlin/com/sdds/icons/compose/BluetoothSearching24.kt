package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothSearching24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothSearching24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.68 2.324 c 0.26 -0.125 0.568 -0.09 0.793 0.09 l 5.625 4.5 C 15.276 7.057 15.38 7.272 15.38 7.5 c 0.0 0.228 -0.104 0.443 -0.282 0.586 L 10.205 12.0 l 4.893 3.914 c 0.178 0.143 0.282 0.358 0.282 0.586 c 0.0 0.228 -0.104 0.443 -0.282 0.586 l -5.625 4.5 c -0.225 0.18 -0.533 0.215 -0.793 0.09 S 8.255 21.288 8.255 21.0 v -7.44 l -4.407 3.526 c -0.323 0.258 -0.795 0.206 -1.054 -0.117 c -0.259 -0.324 -0.206 -0.796 0.117 -1.055 L 7.804 12.0 L 2.911 8.086 C 2.588 7.826 2.535 7.355 2.794 7.03 c 0.259 -0.323 0.731 -0.375 1.054 -0.117 l 4.407 3.526 V 3.0 c 0.0 -0.288 0.165 -0.551 0.425 -0.676 Z M 9.755 13.56 l 3.674 2.94 l -3.674 2.94 v -5.88 Z m 0.0 -3.12 V 4.56 l 3.674 2.94 l -3.674 2.94 Z m 6.0 2.873 c 0.621 0.0 1.125 -0.504 1.125 -1.126 c 0.0 -0.62 -0.504 -1.124 -1.125 -1.124 s -1.125 0.503 -1.125 1.124 c 0.0 0.622 0.504 1.126 1.125 1.126 Z m 2.156 -7.134 c -0.359 -0.207 -0.817 -0.084 -1.024 0.275 c -0.207 0.359 -0.085 0.817 0.274 1.025 c 0.827 0.477 1.513 1.163 1.99 1.99 c 0.478 0.826 0.729 1.764 0.729 2.719 c 0.0 0.954 -0.251 1.892 -0.729 2.718 c -0.477 0.827 -1.163 1.513 -1.99 1.99 c -0.359 0.208 -0.482 0.666 -0.274 1.025 c 0.207 0.359 0.665 0.482 1.024 0.275 c 1.055 -0.61 1.93 -1.485 2.54 -2.54 c 0.608 -1.054 0.929 -2.25 0.929 -3.469 c 0.0 -1.217 -0.32 -2.414 -0.93 -3.468 c -0.608 -1.055 -1.484 -1.93 -2.539 -2.54 Z")
        )
    }.build()
}
