package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TranscriptionVoiceTextFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TranscriptionVoiceTextFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.0 7.125 C 13.0 4.847 14.847 3.0 17.125 3.0 h 12.75 C 32.153 3.0 34.0 4.847 34.0 7.125 v 12.75 C 34.0 22.153 32.153 24.0 29.875 24.0 H 24.25 v 4.875 c 0.0 2.278 -1.847 4.124 -4.125 4.124 h -12.0 C 5.847 33.0 4.0 31.153 4.0 28.874 v -12.0 c 0.0 -2.278 1.847 -4.124 4.125 -4.124 H 13.0 V 7.124 Z M 19.75 24.0 H 17.5 v 1.499 c 0.0 0.621 0.504 1.125 1.125 1.125 s 1.125 -0.504 1.125 -1.125 V 24.0 Z m -4.5 -0.45 C 13.914 22.867 13.0 21.478 13.0 19.875 v 7.499 c 0.0 0.621 0.504 1.125 1.125 1.125 s 1.125 -0.504 1.125 -1.125 V 23.55 Z m 1.875 -18.3 c -1.035 0.0 -1.875 0.84 -1.875 1.875 v 12.75 c 0.0 1.035 0.84 1.875 1.875 1.875 h 12.75 c 1.035 0.0 1.875 -0.84 1.875 -1.875 V 7.125 c 0.0 -1.036 -0.84 -1.875 -1.875 -1.875 h -12.75 Z m 12.27 13.8 h -2.194 l -1.106 -2.739 H 20.8 l -1.09 2.739 h -2.095 L 22.3 7.5 h 2.343 l 4.752 11.55 Z m -4.059 -4.636 L 23.44 9.678 l -1.898 4.736 h 3.795 Z m -15.711 4.71 c 0.621 0.0 1.125 0.504 1.125 1.125 v 5.25 c 0.0 0.621 -0.504 1.125 -1.125 1.125 S 8.5 26.12 8.5 25.499 v -5.25 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 Z")
        )
    }.build()
}
