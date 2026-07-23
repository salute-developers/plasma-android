package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorLClosedOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorLClosedOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.5 14.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 15.328 11.0 14.5 11.0 S 13.0 11.672 13.0 12.5 s 0.672 1.5 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.121 2.0 C 7.726 2.0 7.385 2.0 7.104 2.023 C 6.807 2.047 6.512 2.1 6.229 2.245 C 5.805 2.461 5.46 2.805 5.245 3.23 C 5.101 3.512 5.047 3.807 5.023 4.104 C 5.0 4.384 5.0 4.726 5.0 5.12 V 18.88 c 0.0 0.395 0.0 0.736 0.023 1.017 c 0.024 0.297 0.078 0.592 0.222 0.875 c 0.216 0.424 0.56 0.768 0.984 0.984 c 0.283 0.144 0.578 0.198 0.875 0.222 C 7.384 22.0 7.726 22.0 8.12 22.0 h 7.758 c 0.395 0.0 0.736 0.0 1.017 -0.023 c 0.297 -0.024 0.592 -0.078 0.875 -0.222 c 0.424 -0.216 0.768 -0.56 0.984 -0.983 c 0.144 -0.284 0.198 -0.58 0.222 -0.876 C 19.0 19.616 19.0 19.274 19.0 18.88 V 5.12 c 0.0 -0.395 0.0 -0.736 -0.023 -1.017 c -0.024 -0.297 -0.078 -0.592 -0.222 -0.875 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 c -0.284 -0.144 -0.58 -0.198 -0.876 -0.222 C 16.616 2.0 16.274 2.0 15.88 2.0 H 8.12 Z M 6.91 3.582 c 0.037 -0.02 0.112 -0.047 0.316 -0.064 C 7.438 3.501 7.718 3.5 8.15 3.5 h 7.7 c 0.432 0.0 0.712 0.0 0.924 0.018 c 0.204 0.017 0.28 0.045 0.316 0.064 c 0.142 0.072 0.256 0.186 0.328 0.328 c 0.02 0.037 0.047 0.112 0.064 0.316 C 17.5 4.438 17.5 4.718 17.5 5.15 v 13.7 c 0.0 0.432 0.0 0.712 -0.018 0.924 c -0.017 0.204 -0.045 0.28 -0.064 0.316 c -0.072 0.142 -0.186 0.256 -0.328 0.328 c -0.037 0.02 -0.112 0.047 -0.316 0.064 C 16.562 20.5 16.282 20.5 15.85 20.5 h -7.7 c -0.432 0.0 -0.712 0.0 -0.924 -0.018 c -0.204 -0.017 -0.28 -0.045 -0.316 -0.064 c -0.142 -0.072 -0.256 -0.186 -0.328 -0.328 c -0.02 -0.037 -0.047 -0.112 -0.064 -0.316 C 6.5 19.562 6.5 19.282 6.5 18.85 V 5.15 c 0.0 -0.432 0.0 -0.712 0.018 -0.924 c 0.017 -0.204 0.045 -0.28 0.064 -0.316 c 0.072 -0.142 0.186 -0.256 0.328 -0.328 Z")
        )
    }.build()
}
