package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TranscribeTextVoiceFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TranscribeTextVoiceFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.198 2.925 C 5.198 1.862 6.06 1.0 7.123 1.0 h 5.95 c 1.063 0.0 1.925 0.862 1.925 1.925 v 5.95 c 0.0 1.063 -0.862 1.925 -1.925 1.925 h -5.95 c -0.237 0.0 -0.464 -0.043 -0.673 -0.121 l 0.079 0.197 H 4.758 L 5.305 9.51 C 5.235 9.31 5.198 9.097 5.198 8.875 V 7.65 H 5.112 l -2.187 5.39 h 0.978 l 0.508 -1.278 h 2.472 l 0.516 1.278 h 1.024 L 7.5 10.8 h 2.949 v 2.275 C 10.45 14.138 9.588 15.0 8.525 15.0 h -5.6 C 1.862 15.0 1.0 14.138 1.0 13.075 v -5.6 C 1.0 6.412 1.862 5.55 2.925 5.55 h 2.273 V 2.925 Z M 7.123 2.05 c -0.483 0.0 -0.875 0.392 -0.875 0.875 v 5.95 c 0.0 0.483 0.392 0.875 0.875 0.875 h 5.95 c 0.483 0.0 0.875 -0.392 0.875 -0.875 v -5.95 c 0.0 -0.483 -0.392 -0.875 -0.875 -0.875 h -5.95 Z m 2.974 1.225 c 0.29 0.0 0.525 0.235 0.525 0.525 V 8.0 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 3.8 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z m 2.1 0.875 c 0.29 0.0 0.525 0.235 0.525 0.525 v 2.45 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 v -2.45 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z M 8.522 4.675 c 0.0 -0.29 -0.235 -0.525 -0.525 -0.525 c -0.29 0.0 -0.525 0.235 -0.525 0.525 v 2.45 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -2.45 Z")
        )
    }.build()
}
