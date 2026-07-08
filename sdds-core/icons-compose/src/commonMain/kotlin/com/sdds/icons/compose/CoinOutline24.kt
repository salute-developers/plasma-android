package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.5 4.206 C 8.868 3.416 10.42 3.0 12.0 3.0 s 3.132 0.416 4.5 1.206 c 1.368 0.79 2.504 1.926 3.294 3.294 S 21.0 10.42 21.0 12.0 s -0.416 3.132 -1.206 4.5 c -0.207 0.359 -0.666 0.482 -1.024 0.274 c -0.359 -0.207 -0.482 -0.665 -0.275 -1.024 c 0.659 -1.14 1.005 -2.434 1.005 -3.75 c 0.0 -1.316 -0.346 -2.61 -1.005 -3.75 c -0.658 -1.14 -1.605 -2.087 -2.745 -2.745 C 14.61 4.847 13.316 4.5 12.0 4.5 c -1.316 0.0 -2.61 0.347 -3.75 1.005 C 7.11 6.163 6.163 7.11 5.505 8.25 C 4.847 9.39 4.5 10.684 4.5 12.0 c 0.0 1.316 0.347 2.61 1.005 3.75 c 0.207 0.359 0.084 0.817 -0.275 1.024 c -0.358 0.208 -0.817 0.085 -1.024 -0.274 C 3.416 15.132 3.0 13.58 3.0 12.0 s 0.416 -3.132 1.206 -4.5 C 4.996 6.132 6.132 4.996 7.5 4.206 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.25 6.75 C 11.25 6.336 11.586 6.0 12.0 6.0 c 0.788 0.0 1.568 0.155 2.296 0.457 c 0.728 0.301 1.39 0.743 1.947 1.3 c 0.557 0.558 0.999 1.219 1.3 1.947 C 17.845 10.432 18.0 11.212 18.0 12.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 16.5 12.414 16.5 12.0 c 0.0 -0.59 -0.116 -1.176 -0.343 -1.722 c -0.226 -0.546 -0.557 -1.042 -0.975 -1.46 c -0.418 -0.418 -0.914 -0.75 -1.46 -0.975 C 13.176 7.616 12.591 7.5 12.0 7.5 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 2.75 18.5 C 2.336 18.5 2.0 18.836 2.0 19.25 S 2.336 20.0 2.75 20.0 h 18.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 2.75 Z")
        )
    }.build()
}
