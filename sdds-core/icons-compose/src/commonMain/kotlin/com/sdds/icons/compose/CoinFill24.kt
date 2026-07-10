package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.485 17.0 C 20.442 15.57 21.0 13.85 21.0 12.0 c 0.0 -4.97 -4.03 -9.0 -9.0 -9.0 s -9.0 4.03 -9.0 9.0 c 0.0 1.85 0.558 3.57 1.516 5.0 h 14.968 Z M 11.25 6.75 C 11.25 6.336 11.586 6.0 12.0 6.0 c 0.788 0.0 1.568 0.155 2.296 0.457 c 0.728 0.301 1.39 0.743 1.947 1.3 c 0.557 0.558 0.999 1.219 1.3 1.947 C 17.845 10.432 18.0 11.212 18.0 12.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 16.5 12.414 16.5 12.0 c 0.0 -0.59 -0.116 -1.176 -0.343 -1.722 c -0.226 -0.546 -0.557 -1.042 -0.975 -1.46 c -0.418 -0.418 -0.914 -0.75 -1.46 -0.975 C 13.176 7.616 12.591 7.5 12.0 7.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
