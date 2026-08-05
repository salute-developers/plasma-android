package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinDirhamFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinDirhamFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 31.623 18.817 c 0.0 2.788 -0.845 5.38 -2.294 7.536 h -2.893 C 26.477 26.243 26.5 26.124 26.5 26.0 V 14.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 4.76 h -3.714 V 14.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 c -0.553 0.0 -1.0 0.448 -1.0 1.0 v 12.0 c 0.0 0.124 0.022 0.244 0.064 0.353 h -3.832 c 1.732 -0.926 2.91 -2.752 2.91 -4.853 v -3.0 c 0.0 -3.038 -2.462 -5.5 -5.5 -5.5 H 10.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 12.0 c 0.0 0.124 0.023 0.244 0.064 0.353 h -2.89 c -1.448 -2.155 -2.293 -4.748 -2.293 -7.537 C 4.38 11.325 10.479 5.25 18.0 5.25 c 7.524 0.0 13.622 6.074 13.622 13.567 Z M 20.786 20.76 V 26.0 c 0.0 0.124 -0.023 0.244 -0.065 0.353 h 3.843 C 24.523 26.243 24.5 26.124 24.5 26.0 v -5.24 h -3.714 Z M 11.5 15.0 v 10.0 h 0.929 c 1.933 0.0 3.5 -1.567 3.5 -3.5 v -3.0 c 0.0 -1.933 -1.567 -3.5 -3.5 -3.5 H 11.5 Z M 4.0 28.745 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 27.999 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 4.0 Z")
        )
    }.build()
}
