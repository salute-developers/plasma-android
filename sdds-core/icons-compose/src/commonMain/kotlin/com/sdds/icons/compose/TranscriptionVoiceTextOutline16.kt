package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TranscriptionVoiceTextOutline16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TranscriptionVoiceTextOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.198 2.925 C 5.198 1.862 6.06 1.0 7.123 1.0 h 5.95 c 1.063 0.0 1.925 0.862 1.925 1.925 v 5.95 c 0.0 1.063 -0.862 1.925 -1.925 1.925 h -5.95 c -0.315 0.0 -0.612 -0.075 -0.874 -0.21 v 1.785 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 8.943 V 8.875 V 6.6 H 2.924 C 2.442 6.6 2.05 6.992 2.05 7.475 v 5.6 c 0.0 0.483 0.392 0.875 0.875 0.875 h 5.6 c 0.483 0.0 0.875 -0.392 0.875 -0.875 V 10.8 h 1.05 v 2.275 C 10.45 14.138 9.588 15.0 8.525 15.0 h -5.6 C 1.862 15.0 1.0 14.138 1.0 13.075 v -5.6 C 1.0 6.412 1.862 5.55 2.925 5.55 h 2.273 V 2.925 Z M 7.123 2.05 c -0.483 0.0 -0.875 0.392 -0.875 0.875 v 5.95 c 0.0 0.483 0.392 0.875 0.875 0.875 h 5.95 c 0.483 0.0 0.875 -0.392 0.875 -0.875 v -5.95 c 0.0 -0.483 -0.392 -0.875 -0.875 -0.875 h -5.95 Z m 5.726 6.44 h -1.024 L 11.31 7.212 H 8.837 L 8.33 8.49 H 7.351 L 9.538 3.1 h 1.094 l 2.217 5.39 Z m -1.894 -2.164 l -0.886 -2.21 l -0.885 2.21 h 1.771 Z M 7.299 11.5 v -0.7 h 1.05 v 0.7 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 Z M 3.624 8.525 c 0.29 0.0 0.525 0.235 0.525 0.525 v 2.45 c 0.0 0.29 -0.235 0.525 -0.525 0.525 c -0.29 0.0 -0.525 -0.235 -0.525 -0.525 V 9.05 c 0.0 -0.29 0.235 -0.525 0.525 -0.525 Z")
        )
    }.build()
}
