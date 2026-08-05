package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinRubleOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinRubleOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.254 7.06 c 2.05 -1.186 4.376 -1.81 6.744 -1.81 c 2.367 0.0 4.693 0.624 6.743 1.81 c 2.05 1.186 3.753 2.891 4.936 4.944 c 1.184 2.053 1.807 4.383 1.807 6.753 s -0.623 4.7 -1.807 6.753 c -0.276 0.479 -0.887 0.643 -1.366 0.367 c -0.478 -0.275 -0.642 -0.887 -0.366 -1.365 c 1.008 -1.75 1.539 -3.735 1.539 -5.755 s -0.531 -4.005 -1.54 -5.754 c -1.008 -1.75 -2.458 -3.202 -4.204 -4.212 c -1.746 -1.01 -3.726 -1.541 -5.742 -1.541 S 14.0 7.782 12.255 8.791 c -1.746 1.01 -3.196 2.463 -4.204 4.212 c -1.008 1.75 -1.54 3.734 -1.54 5.754 c 0.0 2.02 0.532 4.005 1.54 5.755 c 0.276 0.478 0.111 1.09 -0.367 1.365 c -0.479 0.276 -1.09 0.112 -1.366 -0.367 c -1.183 -2.053 -1.806 -4.382 -1.806 -6.753 c 0.0 -2.37 0.623 -4.7 1.806 -6.753 c 1.184 -2.053 2.886 -3.758 4.936 -4.944 Z M 3.0 29.749 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 h 27.999 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 4.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 Z m 13.108 -18.435 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 5.822 h -1.27 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 1.27 v 1.79 h -1.27 c -0.552 0.0 -1.0 0.448 -1.0 1.0 c 0.0 0.553 0.448 1.0 1.0 1.0 h 1.27 v 1.275 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -1.274 h 2.784 c 0.552 0.0 1.0 -0.448 1.0 -1.0 c 0.0 -0.553 -0.448 -1.0 -1.0 -1.0 h -2.784 v -1.79 h 2.4 c 2.436 0.0 4.41 -1.976 4.41 -4.412 s -1.974 -4.41 -4.41 -4.41 h -3.4 Z m 3.4 6.822 h -2.4 v -4.822 h 2.4 c 1.331 0.0 2.41 1.08 2.41 2.411 c 0.0 1.332 -1.079 2.411 -2.41 2.411 Z")
        )
    }.build()
}
