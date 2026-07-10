package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.CaseDiagramFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "CaseDiagramFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.121 3.0 h 1.758 c 0.395 0.0 0.736 0.0 1.017 0.023 c 0.297 0.024 0.592 0.078 0.875 0.222 c 0.424 0.216 0.768 0.56 0.984 0.984 c 0.144 0.283 0.198 0.578 0.222 0.875 C 16.0 5.384 16.0 5.726 16.0 6.12 V 7.0 c 1.688 0.0 2.556 0.013 3.226 0.354 c 0.611 0.312 1.108 0.809 1.42 1.42 C 21.0 9.47 21.0 10.38 21.0 12.2 v 2.6 c 0.0 1.82 0.0 2.73 -0.354 3.425 c -0.312 0.612 -0.809 1.11 -1.42 1.42 C 18.53 20.0 17.62 20.0 15.8 20.0 H 8.2 c -1.82 0.0 -2.73 0.0 -3.425 -0.354 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 C 3.0 17.53 3.0 16.62 3.0 14.8 v -2.6 c 0.0 -1.82 0.0 -2.73 0.354 -3.425 c 0.312 -0.612 0.809 -1.11 1.42 -1.42 C 5.445 7.012 6.313 7.0 8.0 7.0 V 6.121 c 0.0 -0.395 0.0 -0.736 0.023 -1.017 C 8.047 4.807 8.1 4.512 8.245 4.229 C 8.461 3.805 8.805 3.46 9.23 3.245 c 0.283 -0.144 0.578 -0.198 0.875 -0.222 C 10.384 3.0 10.726 3.0 11.12 3.0 Z M 14.5 6.15 V 7.0 h -5.0 V 6.15 c 0.0 -0.432 0.0 -0.712 0.018 -0.924 c 0.017 -0.204 0.045 -0.28 0.064 -0.316 c 0.072 -0.142 0.186 -0.256 0.328 -0.328 c 0.037 -0.02 0.112 -0.047 0.316 -0.064 C 10.438 4.5 10.718 4.5 11.15 4.5 h 1.7 c 0.432 0.0 0.712 0.0 0.924 0.018 c 0.204 0.017 0.28 0.045 0.317 0.064 c 0.14 0.072 0.255 0.186 0.327 0.328 c 0.02 0.037 0.047 0.112 0.064 0.316 C 14.5 5.438 14.5 5.718 14.5 6.15 Z m 3.03 5.88 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 L 13.0 14.44 l -2.47 -2.47 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -3.0 3.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 L 10.0 13.56 l 2.47 2.47 c 0.293 0.293 0.767 0.293 1.06 0.0 l 4.0 -4.0 Z")
        )
    }.build()
}
