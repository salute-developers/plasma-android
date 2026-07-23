package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicOffFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicOffFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.0 2.0 c -1.933 0.0 -3.5 1.679 -3.5 3.75 v 6.0 c 0.0 0.497 0.09 0.972 0.254 1.406 l -1.303 1.303 c -0.37 -0.614 -0.612 -1.302 -0.707 -2.024 c -0.055 -0.41 -0.431 -0.7 -0.842 -0.645 c -0.41 0.054 -0.7 0.43 -0.646 0.841 c 0.139 1.052 0.522 2.048 1.11 2.913 L 2.47 19.44 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.294 0.767 0.294 1.06 0.0 l 3.815 -3.814 l 1.061 -1.061 l 1.17 -1.17 L 20.501 3.53 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 L 15.5 6.41 V 5.75 C 15.5 3.679 13.933 2.0 12.0 2.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.672 16.48 l -1.109 1.11 c 0.807 0.468 1.705 0.764 2.636 0.868 v 2.292 c 0.0 0.414 0.335 0.75 0.75 0.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 v -2.292 c 1.365 -0.152 2.658 -0.72 3.7 -1.633 c 1.231 -1.08 2.028 -2.57 2.242 -4.194 c 0.054 -0.41 -0.235 -0.787 -0.646 -0.841 c -0.41 -0.054 -0.787 0.235 -0.841 0.645 c -0.166 1.263 -0.786 2.422 -1.744 3.262 C 14.453 16.537 13.222 17.0 11.95 17.0 c -0.795 0.0 -1.572 -0.18 -2.277 -0.52 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 15.5 10.653 l -4.643 4.643 C 11.215 15.428 11.6 15.5 12.0 15.5 c 1.933 0.0 3.5 -1.679 3.5 -3.75 v -1.097 Z")
        )
    }.build()
}
