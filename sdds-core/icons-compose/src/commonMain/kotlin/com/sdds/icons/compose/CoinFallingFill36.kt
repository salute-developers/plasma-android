package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinFallingFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinFallingFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 24.5 5.51 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 s -1.0 0.447 -1.0 1.0 v 3.765 c 0.0 0.553 0.448 1.0 1.0 1.0 s 1.0 -0.447 1.0 -1.0 V 5.51 Z m -6.0 -1.506 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 V 7.77 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 4.004 Z m -7.0 0.506 c 0.552 0.0 1.0 0.447 1.0 1.0 v 3.765 c 0.0 0.553 -0.448 1.0 -1.0 1.0 s -1.0 -0.447 -1.0 -1.0 V 5.51 c 0.0 -0.553 0.448 -1.0 1.0 -1.0 Z m 17.25 17.195 c 0.0 6.24 -5.037 11.3 -11.25 11.3 s -11.25 -5.06 -11.25 -11.3 c 0.0 -6.24 5.037 -11.299 11.25 -11.299 s 11.25 5.059 11.25 11.3 Z m -13.975 -5.65 c 0.0 -0.469 0.38 -0.85 0.85 -0.85 H 18.8 c 2.03 0.0 3.675 1.646 3.675 3.675 c 0.0 2.03 -1.645 3.675 -3.675 3.675 h -2.325 v 2.066 h 2.9 c 0.47 0.0 0.85 0.381 0.85 0.85 c 0.0 0.47 -0.38 0.85 -0.85 0.85 h -2.9 v 1.41 c 0.0 0.47 -0.38 0.85 -0.85 0.85 s -0.85 -0.38 -0.85 -0.85 v -1.41 h -1.4 c -0.47 0.0 -0.85 -0.38 -0.85 -0.85 c 0.0 -0.469 0.38 -0.85 0.85 -0.85 h 1.4 v -2.066 h -1.4 c -0.47 0.0 -0.85 -0.38 -0.85 -0.85 s 0.38 -0.85 0.85 -0.85 h 1.4 v -4.8 Z m 1.7 4.8 H 18.8 c 1.09 0.0 1.975 -0.884 1.975 -1.975 c 0.0 -1.09 -0.884 -1.974 -1.975 -1.974 h -2.325 v 3.95 Z")
        )
    }.build()
}
