package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.TranscribeTextVoiceFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "TranscribeTextVoiceFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 7.125 C 12.0 4.847 13.847 3.0 16.125 3.0 h 12.75 C 31.153 3.0 33.0 4.847 33.0 7.125 v 12.75 C 33.0 22.153 31.153 24.0 28.875 24.0 H 23.25 v 4.875 c 0.0 2.278 -1.847 4.124 -4.125 4.124 h -12.0 C 4.847 33.0 3.0 31.153 3.0 28.874 v -12.0 c 0.0 -2.278 1.847 -4.124 4.125 -4.124 H 12.0 V 7.124 Z m 0.0 10.125 h -0.189 L 7.125 28.8 H 9.22 l 1.09 -2.74 h 5.296 l 1.106 2.74 h 2.194 L 16.931 24.0 h -0.806 c -0.51 0.0 -0.998 -0.092 -1.448 -0.261 l 0.17 0.424 h -3.795 l 1.175 -2.934 C 12.08 20.805 12.0 20.35 12.0 19.875 V 17.25 Z m 4.125 -12.0 c -1.036 0.0 -1.875 0.84 -1.875 1.875 v 12.75 c 0.0 1.035 0.84 1.875 1.875 1.875 h 12.75 c 1.035 0.0 1.875 -0.84 1.875 -1.875 V 7.125 c 0.0 -1.036 -0.84 -1.875 -1.875 -1.875 h -12.75 Z M 22.5 7.875 c 0.621 0.0 1.125 0.503 1.125 1.125 v 9.0 c 0.0 0.62 -0.504 1.125 -1.125 1.125 S 21.375 18.62 21.375 18.0 V 9.0 c 0.0 -0.622 0.504 -1.125 1.125 -1.125 Z M 27.0 9.75 c 0.621 0.0 1.125 0.503 1.125 1.124 v 5.25 c 0.0 0.622 -0.504 1.126 -1.125 1.126 s -1.125 -0.504 -1.125 -1.125 v -5.25 c 0.0 -0.622 0.504 -1.125 1.125 -1.125 Z m -7.875 1.124 c 0.0 -0.62 -0.504 -1.124 -1.125 -1.124 s -1.125 0.503 -1.125 1.124 v 5.25 c 0.0 0.622 0.504 1.126 1.125 1.126 s 1.125 -0.504 1.125 -1.125 v -5.25 Z")
        )
    }.build()
}
