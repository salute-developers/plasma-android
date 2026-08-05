package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BluetoothLock36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BluetoothLock36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.065 3.6 c 0.346 -0.167 0.756 -0.122 1.057 0.117 l 8.5 6.75 C 21.86 10.657 22.0 10.945 22.0 11.25 c 0.0 0.305 -0.14 0.593 -0.378 0.783 L 14.108 18.0 l 7.514 5.967 C 21.86 24.157 22.0 24.445 22.0 24.75 c 0.0 0.305 -0.14 0.593 -0.378 0.783 l -8.5 6.75 c -0.3 0.239 -0.711 0.284 -1.057 0.117 c -0.345 -0.166 -0.565 -0.516 -0.565 -0.9 V 20.071 l -6.878 5.462 c -0.433 0.344 -1.062 0.271 -1.405 -0.161 c -0.344 -0.433 -0.271 -1.062 0.161 -1.405 L 10.892 18.0 l -7.514 -5.967 c -0.432 -0.343 -0.505 -0.972 -0.161 -1.405 c 0.343 -0.432 0.972 -0.505 1.405 -0.161 l 6.878 5.462 V 4.5 c 0.0 -0.384 0.22 -0.734 0.565 -0.9 Z M 13.5 20.07 l 5.892 4.679 l -5.892 4.679 V 20.07 Z m 0.0 -4.142 V 6.57 l 5.892 4.679 l -5.892 4.679 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 30.5 16.5 V 15.0 c 0.0 -1.656 -1.343 -3.0 -3.0 -3.0 s -3.0 1.343 -3.0 3.0 v 1.5 c -0.828 0.0 -1.5 0.672 -1.5 1.5 v 4.5 c 0.0 0.828 0.672 1.5 1.5 1.5 h 6.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 18.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 Z M 26.0 15.0 c 0.0 -0.829 0.672 -1.5 1.5 -1.5 S 29.0 14.172 29.0 15.0 v 1.5 h -3.0 V 15.0 Z")
        )
    }.build()
}
