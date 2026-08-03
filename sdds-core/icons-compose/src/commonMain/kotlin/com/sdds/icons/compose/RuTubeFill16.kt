package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RuTubeFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RuTubeFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.483 6.24 c 0.218 0.0 0.369 0.038 0.445 0.104 c 0.075 0.066 0.123 0.189 0.123 0.368 V 7.24 c 0.0 0.189 -0.047 0.312 -0.123 0.378 S 9.7 7.713 9.483 7.713 H 5.761 V 6.239 h 3.722 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.164 1.7 c 1.732 0.0 3.136 1.404 3.136 3.136 v 6.328 c 0.0 0.46 -0.1 0.898 -0.277 1.291 c -0.241 0.532 -0.627 0.986 -1.106 1.31 c -0.5 0.338 -1.104 0.535 -1.753 0.535 H 4.835 c -1.732 0.0 -3.136 -1.404 -3.136 -3.136 V 4.836 c 0.0 -0.874 0.359 -1.666 0.936 -2.234 C 3.2 2.044 3.978 1.7 4.835 1.7 h 6.33 Z m -6.981 9.45 H 5.76 V 9.1 H 8.67 l 1.38 2.05 h 1.768 l -1.521 -2.06 c 0.56 -0.082 0.813 -0.254 1.02 -0.537 c 0.208 -0.284 0.312 -0.737 0.312 -1.342 V 6.739 c 0.0 -0.358 -0.037 -0.642 -0.104 -0.86 c -0.066 -0.216 -0.18 -0.406 -0.34 -0.575 c -0.17 -0.16 -0.36 -0.274 -0.586 -0.35 c -0.227 -0.066 -0.511 -0.103 -0.86 -0.103 H 4.182 v 6.3 Z M 8.079 2.7 c 0.083 0.518 0.228 1.015 0.429 1.483 L 9.07 4.182 h 0.668 c 0.395 0.0 0.769 0.05 1.072 0.138 c 0.317 0.106 0.617 0.295 0.859 0.524 c 0.227 0.24 0.396 0.517 0.495 0.84 c 0.091 0.3 0.133 0.654 0.133 1.055 v 0.472 c 0.0 0.154 -0.006 0.307 -0.02 0.457 c 0.33 0.112 0.671 0.197 1.023 0.253 V 4.836 c 0.0 -1.18 -0.957 -2.136 -2.136 -2.136 H 8.08 Z")
        )
    }.build()
}
