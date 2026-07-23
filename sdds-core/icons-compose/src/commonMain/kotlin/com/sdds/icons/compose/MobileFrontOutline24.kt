package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MobileFrontOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MobileFrontOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.75 4.5 C 10.336 4.5 10.0 4.836 10.0 5.25 S 10.336 6.0 10.75 6.0 h 2.5 C 13.664 6.0 14.0 5.664 14.0 5.25 S 13.664 4.5 13.25 4.5 h -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.879 22.0 c 0.395 0.0 0.736 0.0 1.017 -0.023 c 0.297 -0.024 0.592 -0.078 0.875 -0.222 c 0.424 -0.216 0.768 -0.56 0.984 -0.983 c 0.144 -0.284 0.198 -0.58 0.222 -0.876 C 18.0 19.616 18.0 19.274 18.0 18.88 V 5.12 c 0.0 -0.395 0.0 -0.736 -0.023 -1.017 c -0.024 -0.297 -0.078 -0.592 -0.222 -0.875 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 c -0.284 -0.144 -0.58 -0.198 -0.876 -0.222 C 15.616 2.0 15.274 2.0 14.88 2.0 H 9.121 C 8.726 2.0 8.385 2.0 8.104 2.023 C 7.807 2.047 7.512 2.1 7.229 2.245 C 6.805 2.461 6.46 2.805 6.245 3.23 C 6.101 3.512 6.047 3.807 6.023 4.104 C 6.0 4.384 6.0 4.726 6.0 5.12 V 18.88 c 0.0 0.395 0.0 0.736 0.023 1.017 c 0.024 0.297 0.078 0.592 0.222 0.875 c 0.216 0.424 0.56 0.768 0.984 0.984 c 0.283 0.144 0.578 0.198 0.875 0.222 C 8.384 22.0 8.726 22.0 9.12 22.0 h 5.758 Z m 1.211 -1.582 c -0.037 0.02 -0.112 0.047 -0.316 0.064 C 15.562 20.5 15.282 20.5 14.85 20.5 h -5.7 c -0.432 0.0 -0.712 0.0 -0.924 -0.018 c -0.204 -0.017 -0.28 -0.045 -0.316 -0.064 c -0.142 -0.072 -0.256 -0.186 -0.328 -0.328 c -0.02 -0.037 -0.047 -0.112 -0.064 -0.316 C 7.5 19.562 7.5 19.282 7.5 18.85 V 5.15 c 0.0 -0.432 0.0 -0.712 0.018 -0.924 c 0.017 -0.204 0.045 -0.28 0.064 -0.316 c 0.072 -0.142 0.186 -0.256 0.328 -0.328 c 0.037 -0.02 0.112 -0.047 0.316 -0.064 C 8.438 3.501 8.718 3.5 9.15 3.5 h 5.7 c 0.432 0.0 0.712 0.0 0.924 0.018 c 0.204 0.017 0.28 0.045 0.316 0.064 c 0.142 0.072 0.256 0.186 0.328 0.328 c 0.02 0.037 0.047 0.112 0.064 0.316 C 16.5 4.438 16.5 4.718 16.5 5.15 v 13.7 c 0.0 0.432 0.0 0.712 -0.018 0.924 c -0.017 0.204 -0.045 0.28 -0.064 0.316 c -0.072 0.142 -0.186 0.256 -0.328 0.328 Z")
        )
    }.build()
}
