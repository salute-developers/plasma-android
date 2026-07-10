package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CoinDirhamOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CoinDirhamOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.998 5.25 c -2.368 0.0 -4.694 0.624 -6.744 1.81 s -3.752 2.891 -4.936 4.944 c -1.183 2.053 -1.806 4.383 -1.806 6.753 s 0.623 4.7 1.806 6.753 c 0.276 0.479 0.887 0.643 1.366 0.367 c 0.478 -0.275 0.643 -0.887 0.367 -1.365 c -1.008 -1.75 -1.54 -3.735 -1.54 -5.755 s 0.532 -4.005 1.54 -5.754 c 1.008 -1.75 2.458 -3.202 4.204 -4.212 c 1.746 -1.01 3.727 -1.541 5.743 -1.541 c 2.016 0.0 3.996 0.532 5.742 1.541 c 1.746 1.01 3.196 2.463 4.205 4.212 c 1.008 1.75 1.539 3.734 1.539 5.754 c 0.0 2.02 -0.531 4.005 -1.54 5.755 c -0.275 0.478 -0.111 1.09 0.367 1.365 c 0.479 0.276 1.09 0.112 1.366 -0.367 c 1.184 -2.053 1.807 -4.382 1.807 -6.753 c 0.0 -2.37 -0.623 -4.7 -1.807 -6.753 c -1.183 -2.053 -2.886 -3.758 -4.936 -4.944 s -4.376 -1.81 -6.743 -1.81 Z M 4.0 28.749 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 27.999 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 4.0 Z M 19.786 13.0 c 0.552 0.0 1.0 0.448 1.0 1.0 v 4.76 H 24.5 V 14.0 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 v 12.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 v -5.24 h -3.714 V 26.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 c -0.553 0.0 -1.0 -0.448 -1.0 -1.0 V 14.0 c 0.0 -0.552 0.447 -1.0 1.0 -1.0 Z M 10.5 13.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 v 12.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 1.929 c 3.037 0.0 5.5 -2.462 5.5 -5.5 v -3.0 c 0.0 -3.038 -2.463 -5.5 -5.5 -5.5 H 10.5 Z m 1.0 12.0 V 15.0 h 0.929 c 1.933 0.0 3.5 1.567 3.5 3.5 v 3.0 c 0.0 1.933 -1.567 3.5 -3.5 3.5 H 11.5 Z")
        )
    }.build()
}
