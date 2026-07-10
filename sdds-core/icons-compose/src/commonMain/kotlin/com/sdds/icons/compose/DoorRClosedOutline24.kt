package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorRClosedOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorRClosedOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.5 14.0 C 8.672 14.0 8.0 13.328 8.0 12.5 S 8.672 11.0 9.5 11.0 s 1.5 0.672 1.5 1.5 S 10.328 14.0 9.5 14.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.121 22.0 c -0.395 0.0 -0.736 0.0 -1.017 -0.023 c -0.297 -0.024 -0.592 -0.078 -0.875 -0.222 c -0.424 -0.216 -0.768 -0.56 -0.984 -0.983 c -0.144 -0.284 -0.198 -0.58 -0.222 -0.876 C 5.0 19.616 5.0 19.274 5.0 18.88 V 5.12 c 0.0 -0.395 0.0 -0.736 0.023 -1.017 C 5.047 3.807 5.1 3.512 5.245 3.229 C 5.461 2.805 5.805 2.46 6.23 2.245 c 0.283 -0.144 0.578 -0.198 0.875 -0.222 C 7.384 2.0 7.726 2.0 8.12 2.0 h 7.758 c 0.395 0.0 0.736 0.0 1.017 0.023 c 0.297 0.024 0.592 0.078 0.875 0.222 c 0.424 0.216 0.768 0.56 0.984 0.984 c 0.144 0.283 0.198 0.578 0.222 0.875 C 19.0 4.384 19.0 4.726 19.0 5.12 V 18.88 c 0.0 0.395 0.0 0.736 -0.023 1.017 c -0.024 0.297 -0.078 0.592 -0.222 0.875 c -0.216 0.424 -0.56 0.768 -0.983 0.984 c -0.284 0.144 -0.58 0.198 -0.876 0.222 C 16.616 22.0 16.274 22.0 15.88 22.0 H 8.121 Z M 6.91 20.418 c 0.037 0.02 0.112 0.047 0.316 0.064 C 7.438 20.5 7.718 20.5 8.15 20.5 h 7.7 c 0.432 0.0 0.712 0.0 0.924 -0.018 c 0.204 -0.017 0.28 -0.045 0.316 -0.064 c 0.142 -0.072 0.256 -0.186 0.328 -0.328 c 0.02 -0.037 0.047 -0.112 0.064 -0.316 c 0.017 -0.212 0.018 -0.492 0.018 -0.924 V 5.15 c 0.0 -0.432 0.0 -0.712 -0.018 -0.924 c -0.017 -0.204 -0.045 -0.28 -0.064 -0.316 c -0.072 -0.142 -0.186 -0.256 -0.328 -0.328 c -0.037 -0.02 -0.112 -0.047 -0.316 -0.064 C 16.562 3.501 16.282 3.5 15.85 3.5 h -7.7 c -0.432 0.0 -0.712 0.0 -0.924 0.018 c -0.204 0.017 -0.28 0.045 -0.316 0.064 C 6.768 3.654 6.654 3.768 6.582 3.91 c -0.02 0.037 -0.047 0.112 -0.064 0.316 C 6.5 4.438 6.5 4.718 6.5 5.15 v 13.7 c 0.0 0.432 0.0 0.712 0.018 0.924 c 0.017 0.204 0.045 0.28 0.064 0.316 c 0.072 0.142 0.186 0.256 0.328 0.328 Z")
        )
    }.build()
}
