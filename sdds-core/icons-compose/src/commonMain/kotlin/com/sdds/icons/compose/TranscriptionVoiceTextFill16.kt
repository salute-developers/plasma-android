package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TranscriptionVoiceTextFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TranscriptionVoiceTextFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.198 2.925 C 5.198 1.862 6.06 1.0 7.123 1.0 h 5.95 c 1.064 0.0 1.925 0.862 1.925 1.925 v 5.95 c 0.0 1.063 -0.861 1.925 -1.925 1.925 h -5.95 c -0.106 0.0 -0.211 -0.009 -0.313 -0.025 C 6.912 10.79 7.017 10.8 7.125 10.8 H 7.3 v 0.7 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -0.7 h 2.099 v 2.275 C 10.45 14.138 9.588 15.0 8.525 15.0 h -5.6 C 1.862 15.0 1.0 14.138 1.0 13.075 v -5.6 C 1.0 6.412 1.862 5.55 2.925 5.55 h 2.273 V 2.925 Z m 0.003 6.046 v 3.404 c 0.0 0.29 0.235 0.525 0.525 0.525 c 0.29 0.0 0.525 -0.235 0.525 -0.525 v -1.784 C 5.653 10.287 5.235 9.68 5.2 8.971 Z M 7.123 2.05 c -0.483 0.0 -0.875 0.392 -0.875 0.875 v 5.95 c 0.0 0.483 0.392 0.875 0.875 0.875 h 5.95 c 0.484 0.0 0.875 -0.392 0.875 -0.875 v -5.95 c 0.0 -0.483 -0.391 -0.875 -0.875 -0.875 h -5.95 Z m 5.727 6.44 h -1.024 L 11.31 7.212 H 8.838 L 8.33 8.49 H 7.352 L 9.539 3.1 h 1.093 l 2.218 5.39 Z m -1.895 -2.164 l -0.885 -2.21 l -0.886 2.21 h 1.771 Z m -7.33 2.199 c 0.29 0.0 0.526 0.235 0.526 0.525 v 2.45 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 9.05 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z")
        )
    }.build()
}
