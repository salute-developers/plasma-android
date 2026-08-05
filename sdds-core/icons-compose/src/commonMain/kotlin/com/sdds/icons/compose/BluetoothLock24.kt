package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothLock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothLock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.473 2.414 C 9.248 2.234 8.94 2.2 8.68 2.324 S 8.255 2.712 8.255 3.0 v 7.44 L 3.848 6.914 C 3.525 6.656 3.053 6.708 2.794 7.031 C 2.535 7.355 2.588 7.827 2.911 8.086 L 7.804 12.0 l -4.893 3.914 c -0.323 0.26 -0.376 0.731 -0.117 1.054 c 0.259 0.324 0.731 0.376 1.054 0.118 l 4.407 -3.525 V 21.0 c 0.0 0.288 0.165 0.551 0.425 0.676 s 0.568 0.09 0.793 -0.09 l 5.625 -4.5 c 0.178 -0.143 0.282 -0.358 0.282 -0.586 c 0.0 -0.228 -0.104 -0.443 -0.282 -0.586 L 10.205 12.0 l 4.893 -3.914 C 15.276 7.943 15.38 7.728 15.38 7.5 c 0.0 -0.228 -0.104 -0.443 -0.282 -0.586 l -5.625 -4.5 Z M 13.43 16.5 l -3.674 -2.94 v 5.88 l 3.674 -2.94 Z M 9.755 4.56 v 5.88 l 3.674 -2.94 l -3.674 -2.94 Z M 21.005 10.0 v 1.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 3.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 h -4.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 v -3.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 v -1.0 c 0.0 -1.105 0.896 -2.0 2.0 -2.0 s 2.0 0.896 2.0 2.0 Z m -2.0 -1.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 1.0 h 2.0 v -1.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 Z")
        )
    }.build()
}
