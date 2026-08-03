package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TranscriptionVoiceTextOutline36: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TranscriptionVoiceTextOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.125 C 12.0 4.847 13.847 3.0 16.125 3.0 h 12.75 C 31.153 3.0 33.0 4.847 33.0 7.125 v 12.75 C 33.0 22.153 31.153 24.0 28.875 24.0 h -12.75 C 13.847 24.0 12.0 22.153 12.0 19.875 V 15.0 H 7.125 c -1.036 0.0 -1.875 0.84 -1.875 1.876 v 12.0 c 0.0 1.035 0.84 1.875 1.875 1.875 h 12.0 c 1.035 0.0 1.875 -0.84 1.875 -1.875 V 24.0 h 2.25 v 4.875 c 0.0 2.278 -1.847 4.124 -4.125 4.124 h -12.0 C 4.847 33.0 3.0 31.153 3.0 28.874 v -12.0 c 0.0 -2.278 1.847 -4.124 4.125 -4.124 H 12.0 V 7.124 Z m 0.0 12.75 v 7.499 c 0.0 0.621 0.504 1.125 1.125 1.125 s 1.125 -0.504 1.125 -1.125 V 23.55 C 12.914 22.868 12.0 21.478 12.0 19.875 Z M 16.125 5.25 c -1.036 0.0 -1.875 0.84 -1.875 1.875 v 12.75 c 0.0 1.035 0.84 1.875 1.875 1.875 h 12.75 c 1.035 0.0 1.875 -0.84 1.875 -1.875 V 7.125 c 0.0 -1.036 -0.84 -1.875 -1.875 -1.875 h -12.75 Z m 12.27 13.8 h -2.194 l -1.106 -2.739 H 19.8 l -1.09 2.739 h -2.095 L 21.3 7.5 h 2.343 l 4.752 11.55 Z m -4.059 -4.636 L 22.44 9.678 l -1.898 4.736 h 3.795 Z M 16.5 25.498 V 24.0 h 2.25 V 25.5 c 0.0 0.621 -0.504 1.125 -1.125 1.125 S 16.5 26.12 16.5 25.499 Z m -7.875 -6.375 c 0.621 0.0 1.125 0.504 1.125 1.125 v 5.25 c 0.0 0.621 -0.504 1.125 -1.125 1.125 S 7.5 26.12 7.5 25.499 v -5.25 c 0.0 -0.621 0.504 -1.125 1.125 -1.125 Z")
        )
    }.build()
}
