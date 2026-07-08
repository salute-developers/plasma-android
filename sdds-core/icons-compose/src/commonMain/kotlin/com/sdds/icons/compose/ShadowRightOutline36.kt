package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ShadowRightOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ShadowRightOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 23.481 6.006 c 0.02 0.0 0.038 0.003 0.057 0.004 L 23.5 6.007 V 6.0 h 5.0 c 2.485 0.0 4.5 2.015 4.5 4.5 v 15.0 c 0.0 2.408 -1.89 4.374 -4.269 4.494 L 28.5 30.0 h -5.0 v -0.007 c 0.023 -0.001 0.046 -0.004 0.068 -0.006 c -0.029 0.002 -0.058 0.006 -0.087 0.007 L 23.25 30.0 H 7.5 C 5.015 30.0 3.0 27.985 3.0 25.5 v -15.0 C 3.0 8.015 5.015 6.0 7.5 6.0 h 15.75 l 0.231 0.006 Z m 4.267 19.54 c -0.011 1.135 -0.441 2.168 -1.145 2.954 h 0.277 l 4.62 -4.62 v -2.085 l -3.752 3.75 Z M 28.47 28.5 h 0.03 c 1.657 0.0 3.0 -1.343 3.0 -3.0 v -0.03 l -3.03 3.03 Z M 7.5 8.0 C 6.12 8.0 5.0 9.12 5.0 10.5 v 15.0 C 5.0 26.88 6.12 28.0 7.5 28.0 h 15.75 c 1.38 0.0 2.5 -1.12 2.5 -2.5 v -15.0 c 0.0 -1.38 -1.12 -2.5 -2.5 -2.5 H 7.5 Z m 20.25 13.045 v 2.91 l 3.75 -3.75 v -2.91 l -3.75 3.75 Z m 0.0 -4.5 v 2.91 l 3.75 -3.75 v -2.91 l -3.75 3.75 Z m 0.0 -4.5 v 2.91 l 3.75 -3.75 V 10.5 c 0.0 -0.625 -0.192 -1.205 -0.52 -1.686 l -3.23 3.23 Z m -0.642 -3.86 c 0.4 0.665 0.632 1.44 0.64 2.271 l 2.438 -2.436 C 29.704 7.692 29.126 7.5 28.5 7.5 h -0.705 l -0.687 0.686 Z")
        )
    }.build()
}
