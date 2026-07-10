package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothSignal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothSignal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.68 2.324 c 0.26 -0.125 0.568 -0.09 0.793 0.09 l 5.625 4.5 C 14.276 7.057 14.38 7.272 14.38 7.5 c 0.0 0.228 -0.104 0.443 -0.282 0.586 L 9.205 12.0 l 4.893 3.914 c 0.178 0.143 0.282 0.358 0.282 0.586 c 0.0 0.228 -0.104 0.443 -0.282 0.586 l -5.625 4.5 c -0.225 0.18 -0.533 0.215 -0.793 0.09 S 7.255 21.288 7.255 21.0 v -7.44 l -4.407 3.526 c -0.323 0.258 -0.795 0.206 -1.054 -0.117 c -0.258 -0.324 -0.206 -0.796 0.117 -1.055 L 6.804 12.0 L 1.911 8.086 C 1.588 7.826 1.536 7.355 1.794 7.03 c 0.259 -0.323 0.731 -0.375 1.054 -0.117 l 4.407 3.526 V 3.0 c 0.0 -0.288 0.165 -0.551 0.425 -0.676 Z M 8.755 13.56 l 3.674 2.94 l -3.674 2.94 v -5.88 Z m 0.0 -3.12 V 4.56 l 3.674 2.94 l -3.674 2.94 Z m 9.084 -5.334 c 0.293 -0.293 0.768 -0.293 1.06 0.0 c 0.906 0.905 1.624 1.98 2.114 3.163 c 0.49 1.183 0.742 2.45 0.742 3.73 c 0.0 1.281 -0.252 2.55 -0.742 3.732 c -0.49 1.183 -1.208 2.258 -2.114 3.163 c -0.292 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 c 0.766 -0.767 1.374 -1.676 1.788 -2.677 c 0.415 -1.0 0.628 -2.074 0.628 -3.157 c 0.0 -1.084 -0.213 -2.156 -0.628 -3.157 c -0.414 -1.001 -1.022 -1.91 -1.788 -2.677 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z M 17.07 7.934 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 c -0.294 0.293 -0.294 0.768 0.0 1.06 c 0.394 0.395 0.707 0.864 0.92 1.38 c 0.214 0.515 0.324 1.068 0.324 1.626 c 0.0 0.558 -0.11 1.11 -0.323 1.626 c -0.214 0.516 -0.527 0.984 -0.922 1.38 c -0.293 0.292 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.768 0.293 1.06 0.0 c 0.535 -0.534 0.958 -1.168 1.247 -1.866 c 0.29 -0.697 0.438 -1.445 0.438 -2.2 c 0.0 -0.755 -0.149 -1.503 -0.438 -2.2 c -0.289 -0.698 -0.712 -1.332 -1.246 -1.866 Z")
        )
    }.build()
}
