package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CopyFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CopyFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.455 7.112 C 19.499 7.658 19.5 8.358 19.5 9.35 v 6.9 c 0.0 0.414 0.336 0.75 0.75 0.75 S 21.0 16.664 21.0 16.25 V 6.121 c 0.0 -0.395 0.0 -0.736 -0.023 -1.017 c -0.024 -0.297 -0.078 -0.592 -0.222 -0.875 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 c -0.284 -0.144 -0.58 -0.198 -0.876 -0.222 C 18.616 3.0 18.274 3.0 17.88 3.0 H 7.75 C 7.336 3.0 7.0 3.336 7.0 3.75 S 7.336 4.5 7.75 4.5 h 6.9 c 0.992 0.0 1.692 0.0 2.238 0.045 c 0.537 0.044 0.86 0.127 1.11 0.255 c 0.518 0.263 0.939 0.684 1.202 1.202 c 0.128 0.25 0.21 0.573 0.255 1.11 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.879 6.0 H 6.12 C 5.726 6.0 5.385 6.0 5.104 6.023 C 4.807 6.047 4.512 6.1 4.229 6.245 C 3.805 6.461 3.46 6.805 3.245 7.23 C 3.101 7.512 3.047 7.807 3.023 8.104 C 3.0 8.384 3.0 8.726 3.0 9.12 v 8.758 c 0.0 0.395 0.0 0.736 0.023 1.017 c 0.024 0.297 0.078 0.592 0.222 0.875 c 0.216 0.424 0.56 0.768 0.984 0.984 c 0.283 0.144 0.578 0.198 0.875 0.222 C 5.384 21.0 5.726 21.0 6.12 21.0 h 8.758 c 0.395 0.0 0.736 0.0 1.017 -0.023 c 0.297 -0.024 0.592 -0.078 0.875 -0.222 c 0.424 -0.216 0.768 -0.56 0.984 -0.983 c 0.144 -0.284 0.198 -0.58 0.222 -0.876 C 18.0 18.616 18.0 18.274 18.0 17.88 V 9.12 c 0.0 -0.395 0.0 -0.736 -0.023 -1.017 c -0.024 -0.297 -0.078 -0.592 -0.222 -0.875 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 c -0.284 -0.144 -0.58 -0.198 -0.876 -0.222 C 15.616 6.0 15.274 6.0 14.88 6.0 Z")
        )
    }.build()
}
