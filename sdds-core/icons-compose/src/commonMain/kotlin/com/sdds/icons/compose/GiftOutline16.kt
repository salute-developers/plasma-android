package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.GiftOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "GiftOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.795 1.512 c -0.68 -0.683 -1.786 -0.683 -2.465 0.0 c -0.673 0.678 -0.672 1.77 0.0 2.448 l 0.555 0.558 H 2.6 c -0.47 0.0 -0.85 0.38 -0.85 0.85 v 2.46 c 0.0 0.417 0.3 0.764 0.697 0.836 v 4.081 c 0.0 1.243 1.008 2.25 2.25 2.25 h 6.61 c 1.242 0.0 2.25 -1.007 2.25 -2.25 V 8.664 c 0.396 -0.072 0.697 -0.42 0.697 -0.837 V 5.368 c 0.0 -0.47 -0.38 -0.85 -0.85 -0.85 h -2.283 l 0.554 -0.558 c 0.673 -0.677 0.673 -1.77 0.0 -2.448 c -0.68 -0.683 -1.785 -0.683 -2.464 0.0 L 8.003 2.73 L 6.795 1.512 Z M 9.71 4.518 l 1.255 -1.263 c 0.285 -0.287 0.285 -0.75 0.0 -1.038 c -0.289 -0.29 -0.758 -0.29 -1.046 0.0 L 8.503 3.644 v 0.874 H 9.71 Z m -2.208 0.0 V 3.644 L 6.085 2.217 c -0.288 -0.29 -0.757 -0.29 -1.045 0.0 c -0.286 0.287 -0.286 0.751 0.0 1.038 l 1.254 1.263 h 1.209 Z M 2.75 7.678 v -2.16 h 4.752 v 2.16 H 2.75 Z m 5.752 0.0 v -2.16 h 4.752 v 2.16 H 8.502 Z m -5.055 1.0 h 4.055 v 5.317 H 4.697 c -0.69 0.0 -1.25 -0.56 -1.25 -1.25 V 8.677 Z m 5.055 0.0 v 5.317 h 2.805 c 0.69 0.0 1.25 -0.56 1.25 -1.25 V 8.677 H 8.502 Z")
        )
    }.build()
}
