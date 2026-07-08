package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LangFlow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LangFlow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.262 8.281 h 1.873 c 0.367 0.0 0.665 0.297 0.665 0.663 v 1.104 c 0.0 0.367 -0.298 0.664 -0.665 0.664 h -1.634 c -0.176 0.0 -0.346 0.07 -0.47 0.195 l -2.804 2.798 C 9.102 13.83 8.933 13.9 8.757 13.9 h -1.35 c -0.36 0.0 -0.655 -0.287 -0.665 -0.647 l -0.029 -1.126 c -0.01 -0.373 0.292 -0.682 0.666 -0.682 h 1.16 c 0.177 0.0 0.346 -0.07 0.471 -0.194 l 2.78 -2.776 c 0.125 -0.125 0.295 -0.195 0.471 -0.195 v 0.001 Z m 1.873 -4.86 c 0.367 0.0 0.665 0.297 0.665 0.664 v 1.103 c 0.0 0.367 -0.298 0.664 -0.665 0.665 h -1.634 c -0.176 0.0 -0.346 0.07 -0.47 0.194 L 9.226 8.846 C 9.1 8.97 8.932 9.04 8.756 9.04 H 7.116 c -0.171 0.0 -0.336 0.066 -0.46 0.185 l -3.148 3.01 c -0.124 0.119 -0.289 0.185 -0.46 0.185 H 1.902 c -0.368 0.0 -0.665 -0.298 -0.665 -0.664 v -1.134 c 0.0 -0.367 0.297 -0.663 0.665 -0.663 H 3.04 c 0.177 0.0 0.346 -0.07 0.471 -0.195 l 2.99 -2.984 c 0.124 -0.124 0.293 -0.195 0.47 -0.195 h 1.567 c 0.177 0.0 0.346 -0.07 0.471 -0.194 l 2.781 -2.776 c 0.125 -0.124 0.294 -0.195 0.47 -0.195 h 1.875 Z M 8.572 2.0 C 8.94 2.0 9.238 2.297 9.238 2.664 v 1.104 c 0.0 0.366 -0.298 0.664 -0.666 0.664 H 6.938 c -0.177 0.0 -0.345 0.07 -0.47 0.194 L 3.663 7.425 C 3.54 7.549 3.37 7.62 3.193 7.62 H 1.845 c -0.36 0.0 -0.656 -0.287 -0.665 -0.647 L 1.15 5.847 C 1.14 5.473 1.442 5.165 1.817 5.165 h 1.16 c 0.176 0.0 0.346 -0.07 0.47 -0.194 l 2.78 -2.776 C 6.353 2.071 6.522 2.0 6.698 2.0 h 1.875 Z")
        )
    }.build()
}
