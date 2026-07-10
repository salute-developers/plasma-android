package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinPoundFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinPoundFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 31.623 18.817 c 0.0 2.788 -0.845 5.38 -2.294 7.536 h -4.058 c 0.287 -0.175 0.479 -0.492 0.479 -0.853 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -4.4 v -4.24 h 3.95 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -3.95 V 14.5 h 3.95 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -4.95 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 11.85 c 0.0 0.43 0.237 0.806 0.588 1.003 h -1.766 c 0.287 -0.175 0.478 -0.492 0.478 -0.853 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -4.4 v -11.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 11.85 c 0.0 0.43 0.237 0.806 0.588 1.003 H 6.675 c -1.45 -2.155 -2.294 -4.748 -2.294 -7.537 C 4.38 11.325 10.479 5.25 18.0 5.25 c 7.524 0.0 13.622 6.074 13.622 13.567 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.0 28.745 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 27.999 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 4.0 Z")
        )
    }.build()
}
