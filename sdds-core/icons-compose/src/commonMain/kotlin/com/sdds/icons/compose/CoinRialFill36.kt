package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRialFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRialFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.623 18.817 c 0.0 2.788 -0.845 5.38 -2.294 7.536 h -4.911 c 0.232 -0.307 0.275 -0.736 0.074 -1.093 l -2.696 -4.793 c 1.65 -0.626 2.824 -2.222 2.824 -4.092 c 0.0 -2.416 -1.959 -4.375 -4.375 -4.375 H 16.87 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 12.75 c 0.0 0.227 0.075 0.436 0.203 0.603 h -2.905 c 0.127 -0.167 0.202 -0.376 0.202 -0.603 V 13.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 12.75 c 0.0 0.227 0.075 0.436 0.203 0.603 H 6.675 c -1.45 -2.155 -2.294 -4.748 -2.294 -7.537 C 4.38 11.325 10.479 5.25 18.0 5.25 c 7.524 0.0 13.622 6.074 13.622 13.567 Z m -13.956 7.536 c 0.128 -0.167 0.203 -0.376 0.203 -0.603 v -5.0 h 1.79 l 3.088 5.49 c 0.023 0.04 0.048 0.078 0.074 0.113 h -5.154 Z m 2.558 -7.603 H 17.87 V 14.0 h 2.375 c 1.312 0.0 2.375 1.063 2.375 2.375 c 0.0 1.307 -1.055 2.367 -2.36 2.375 h -0.035 Z M 4.0 28.745 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 27.999 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 4.0 Z")
        )
    }.build()
}
