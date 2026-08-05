package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowDownOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowDownOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 25.5 3.0 C 27.985 3.0 30.0 5.015 30.0 7.5 v 15.75 l -0.006 0.231 V 23.5 H 30.0 v 5.0 c 0.0 2.485 -2.015 4.5 -4.5 4.5 h -15.0 c -2.408 0.0 -4.374 -1.89 -4.494 -4.269 L 6.0 28.5 v -5.0 h 0.007 l 0.005 0.068 l -0.006 -0.087 L 6.0 23.25 V 7.5 C 6.0 5.015 8.015 3.0 10.5 3.0 h 15.0 Z m -18.0 25.5 c 0.0 1.657 1.343 3.0 3.0 3.0 h 0.03 L 7.5 28.47 v 0.03 Z m 0.0 -1.62 l 4.62 4.62 h 2.085 l -3.752 -3.752 C 9.32 27.736 8.285 27.306 7.5 26.602 v 0.278 Z m 4.545 0.87 l 3.75 3.75 h 2.91 l -3.75 -3.75 h -2.91 Z m 15.769 -0.642 c -0.665 0.4 -1.44 0.632 -2.271 0.64 l 2.438 2.438 c 0.327 -0.481 0.519 -1.06 0.519 -1.686 v -0.705 l -0.686 -0.687 Z M 10.5 5.0 C 9.12 5.0 8.0 6.12 8.0 7.5 v 15.75 c 0.0 1.38 1.12 2.5 2.5 2.5 h 15.0 c 1.38 0.0 2.5 -1.12 2.5 -2.5 V 7.5 C 28.0 6.12 26.88 5.0 25.5 5.0 h -15.0 Z m 9.795 26.5 h 2.91 l -3.75 -3.75 h -2.91 l 3.75 3.75 Z m 4.5 0.0 H 25.5 c 0.625 0.0 1.205 -0.192 1.686 -0.52 l -3.23 -3.23 h -2.911 l 3.75 3.75 Z")
        )
    }.build()
}
