package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TranscriptionVoiceTextOutline24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TranscriptionVoiceTextOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 5.75 12.75 c 0.414 0.0 0.75 0.336 0.75 0.75 V 17.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 5.0 17.414 5.0 17.0 v -3.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.931 12.7 h -1.463 l -0.737 -1.826 H 13.2 L 12.474 12.7 h -1.397 L 14.201 5.0 h 1.562 l 3.168 7.7 Z m -2.706 -3.091 L 14.96 6.452 l -1.265 3.157 h 2.53 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 4.75 C 8.0 3.231 9.231 2.0 10.75 2.0 h 8.5 C 20.769 2.0 22.0 3.231 22.0 4.75 v 8.5 c 0.0 1.519 -1.231 2.75 -2.75 2.75 H 15.5 v 3.25 c 0.0 1.519 -1.231 2.75 -2.75 2.75 h -8.0 C 3.231 22.0 2.0 20.769 2.0 19.25 v -8.0 C 2.0 9.731 3.231 8.5 4.75 8.5 H 8.0 V 4.75 Z M 8.0 10.0 H 4.75 c -0.69 0.0 -1.25 0.56 -1.25 1.25 v 8.0 c 0.0 0.69 0.56 1.25 1.25 1.25 h 8.0 c 0.69 0.0 1.25 -0.56 1.25 -1.25 V 16.0 h -1.5 v 1.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 S 11.0 17.414 11.0 17.0 v -1.0 h -0.25 c -0.45 0.0 -0.875 -0.108 -1.25 -0.3 v 2.55 C 9.5 18.664 9.164 19.0 8.75 19.0 S 8.0 18.664 8.0 18.25 V 10.0 Z m 2.75 -6.5 c -0.69 0.0 -1.25 0.56 -1.25 1.25 v 8.5 c 0.0 0.69 0.56 1.25 1.25 1.25 h 8.5 c 0.69 0.0 1.25 -0.56 1.25 -1.25 v -8.5 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 h -8.5 Z")
        )
    }.build()
}
